/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.MayorMenor;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ListaMayMen {
    ArrayList<Integer> Numeros =new ArrayList<>();
    ArrayList<Integer> Mayor =new ArrayList<>(); 
    ArrayList<Integer> Menor =new ArrayList<>();
    int Num;
    
    
    ListaMayMen()
    {
        Num = 0;
    }
    
    ListaMayMen(int Limite)
    {
        Num = Limite;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Agregando a los ArrayList">
    //agregando segun si es Mayor o Menor que 10
    public void add(int numero)
    {
        Numeros.add(numero);
        if(numero < 10)
        {
            Menor.add(numero);
        }
        else if(numero > 10)
        {
            Mayor.add(numero);
        }
        else
        {
            Menor.add(numero);
            Mayor.add(numero);
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
    
    // <editor-fold defaultstate="collapsed" desc="Mostrar en StringBuilder El ArrayList Mayor o Menor">
    //Imprimiendo en StringBuilder
    public StringBuilder mostrarPN()
    {
        StringBuilder MessageBuilder = new StringBuilder();
        MessageBuilder.append("Numeros Mayores a ").append(Num).append(":\n");
        for(int i = 0; i < Mayor.size() ; i++)
        {
            MessageBuilder.append(String.valueOf(Mayor.get(i))).append("  ");
        }
        MessageBuilder.append("\nNumeros Menores a ").append(Num).append(":\n");
        for(int i = 0; i < Menor.size() ; i++)
        {
            MessageBuilder.append(String.valueOf(Menor.get(i))).append("  ");
        }
        
        return MessageBuilder;
    }
    //</editor-fold>
    
}
