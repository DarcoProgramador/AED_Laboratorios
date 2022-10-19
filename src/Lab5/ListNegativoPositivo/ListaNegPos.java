/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.ListNegativoPositivo;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ListaNegPos {
    ArrayList<Integer> Numeros =new ArrayList<>();
    ArrayList<Integer> Negativo =new ArrayList<>(); 
    ArrayList<Integer> Positivo =new ArrayList<>();
    
    // <editor-fold defaultstate="collapsed" desc="Agregando a los ArrayList">
    //agregando segun si es Negativo o Positivo
    public void add(int numero)
    {
        Numeros.add(numero);
        if(numero > 0)
        {
            Positivo.add(numero);
        }
        else if(numero < 0)
        {
            Negativo.add(numero);
        }
        else
        {
            Positivo.add(numero);
            Negativo.add(numero);
        }
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Mostrar en JTable El ArrayList Numeros">
    //Mostrando en JTable
    public void mostrarNumeros(JTable datos)
    {
        String nombreColumnas [] = {"Numeros"};
        String data [][] = new String[Numeros.size()][1];
        for (int i = 0 ; i < Numeros.size() ; i++)
        {
            data[i][0] = String.valueOf(Numeros.get(i));
        }
       datos.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Mostrar en StringBuilder El ArrayList Negativo y Positivo">
    //Imprimiendo en StringBuilder
    public StringBuilder mostrarPN()
    {
        StringBuilder MessageBuilder = new StringBuilder();
        MessageBuilder.append("Numeros Positivos de la Lista:\n");
        for(int i = 0; i < Positivo.size() ; i++)
        {
            MessageBuilder.append(String.valueOf(Positivo.get(i))).append("  ");
        }
        MessageBuilder.append("\nNumeros Negativos de la Lista:\n");
        for(int i = 0; i < Negativo.size() ; i++)
        {
            MessageBuilder.append(String.valueOf(Negativo.get(i))).append("  ");
        }
        
        return MessageBuilder;
    }
    //</editor-fold>
    
}
