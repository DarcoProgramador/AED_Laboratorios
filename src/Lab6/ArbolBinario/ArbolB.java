/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6.ArbolBinario;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ArbolB {

    private Nodo raiz;

    public ArbolB() {
        raiz = null;
    }
    
    public boolean agregar(char dato, JPanel Grafico) {
        if (raiz != null)
        {
            return false;
        }
        Nodo pivote = new Nodo(dato, null, null);
        raiz = pivote;
        insertar(pivote, Grafico);
        return true;
    }
    
    //Metodo para insertar datos en el arbol
    public void insertar(Nodo pivote, JPanel Grafico) {
        String[] opc = {"Sí", "No"};
        
        if(pivote == null)
        {
            return;
        }
        repintarArbol(Grafico);
        Nodo nuevo;
        int seleccion = JOptionPane.showOptionDialog(null, "¿Quiere añadir un hijo a la izquierda de "+ pivote.getDato() +"?",
                "Añadir a la izquierda", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        if(seleccion == 0)
        {
            String nuevoDato = JOptionPane.showInputDialog("Ingrese el nuevo hijo de "+ pivote.getDato() +":");
            nuevo = new Nodo(nuevoDato.charAt(0), null, null);
            pivote.setIzq(nuevo);
            insertar(pivote.getIzq(), Grafico);
        }
        
        seleccion = JOptionPane.showOptionDialog(null, "¿Quiere añadir un hijo a la derecha de "+ pivote.getDato() +"?",
                "Añadir a la derecha", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        if(seleccion == 0)
        {
            String nuevoDato = JOptionPane.showInputDialog("Ingrese el nuevo hijo de "+ pivote.getDato() +":");
            nuevo = new Nodo(nuevoDato.charAt(0), null, null);
            pivote.setDer(nuevo);
            insertar(pivote.getDer(), Grafico);
        }
    }
    
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }
    
    public void preorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getIzq(), recorrido);
            preorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }
    
    public void inorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzq(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }
    public void postorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getIzq(), recorrido);
            postorden(aux.getDer(), recorrido);
            recorrido.add(aux.getDato());
        }
    }
    
    private void repintarArbol(JPanel jPGrafico) {
        jPGrafico.removeAll();
        jPGrafico.setLayout(null);
        JPanel Grafico = this.getdibujo();
        Grafico.setBounds(0, 0, 750, 380);
        jPGrafico.add(Grafico);
        jPGrafico.revalidate();
        jPGrafico.repaint();
    }

     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
