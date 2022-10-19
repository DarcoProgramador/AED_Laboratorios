/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Empresa;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class MetodoEmpresa extends ArrayListEmpresa{
    /**
     *
     * @param nombre
     * @param nempresa
     * @param salario
     */
    // <editor-fold defaultstate="collapsed" desc="Añadir a los atributos de ArrayListEmpresa">
    //Añadiendo a el ArrayList
    public void add(String nombre, int nempresa, float salario)
    {
        Nombre.add(nombre);
        nEmpresa.add(nempresa);
        Salario.add(salario);
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Mostrar en JTable El ArrayList">
    //Mostrando en JTable
    public void mostrar(JTable datos)
    {
        String nombreColumnas [] = {"index", "Nombre", "Carrera", "Carnet"};
        String data [][] = new String[Nombre.size()][4];
        for (int i = 0 ; i < Nombre.size() ; i++)
        {
            data[i][0] = String.valueOf(i); 
            data[i][1] = String.valueOf(Nombre.get(i));
            data[i][2] = String.valueOf(nEmpresa.get(i));
            data[i][3] = String.valueOf(Salario.get(i));
        }
       datos.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    //</editor-fold>
}
