/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Alumnos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class MetodoAlumno extends ArrayListAlumno{
    /**
     *
     * @param nombre
     * @param carrera
     * @param carnet
     */
    // <editor-fold defaultstate="collapsed" desc="Añadir a los atributos de ArrayListAlumno">
    //Añadiendo a el ArrayList
    public void add(String nombre, String carrera, String carnet)
    {
        Nombre.add(nombre);
        Carrera.add(carrera);
        Carnet.add(carnet);
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
            data[i][2] = String.valueOf(Carrera.get(i));
            data[i][3] = String.valueOf(Carnet.get(i));
        }
       datos.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    //</editor-fold>
}
