/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6.ArbolBinario;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Toloza XD
 */

public class ArbolBB {

    private Nodo raiz;
    int num_nodos;
    int alt;

    public ArbolBB() {
        raiz = null;
    }
    
    public boolean agregar(char dato) {
        if (raiz != null)
        {
            return false;
        }
        Nodo pivote = new Nodo(dato, null, null);
        raiz = pivote;
        insertar(pivote);
        return true;
    }
    
    //Metodo para insertar datos en el arbol
    public void insertar(Nodo pivote) {
        if(pivote == null)
        {
            return;
        }
        Nodo nuevo;
        int seleccion = JOptionPane.showConfirmDialog(null, "Quiere añadir un hijo a la izquierda de "+ pivote.getDato() +"?",
                "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if(seleccion == 0)
        {
            String nuevoDato = JOptionPane.showInputDialog("Ingrese el nuevo hijo de "+ pivote.getDato() +":");
            nuevo = new Nodo(nuevoDato.charAt(0), null, null);
            pivote.setIzq(nuevo);
            insertar(pivote.getIzq());
        }
        
        seleccion = JOptionPane.showConfirmDialog(null, "Quiere añadir un hijo a la derecha de "+ pivote.getDato() +"?",
                "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if(seleccion == 0)
        {
            String nuevoDato = JOptionPane.showInputDialog("Ingrese el nuevo hijo de "+ pivote.getDato() +":");
            nuevo = new Nodo(nuevoDato.charAt(0), null, null);
            pivote.setDer(nuevo);
            insertar(pivote.getDer());
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

    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(char dato) {
        Nodo aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getDer();
            } else {
                aux = aux.getIzq();
            }
        }
        return false;
    }

    private void altura(Nodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            alt = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }
    
     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
