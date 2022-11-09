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
public class MetodoAlumnos extends ArrayListAlumno{
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
    
    /**
     *
     * @param JTable datos: JTable donde se imprimen los datos
     * Este metodo imprime los datos que se almacenan en ArrayListAlumno en un JTable
     */
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
    
    /**
     *
     * @param datos: JTable donde se imprimen los datos
     * @param item: string de la carrera en un combobox
     * Este metodo imprime los datos filtrados por carrera que se almacenan en ArrayListAlumno en un JTable
     */
    public void mostrarFiltrado(JTable datos, String item)
    {
        String nombreColumnas [] = {"index", "Nombre", "Carrera", "Carnet"};
        String data [][] = new String[Nombre.size()][4];
        int count = 0;
        for (int i = 0 ; i < Nombre.size() ; i++)
        {
            if(!item.equalsIgnoreCase(Carrera.get(i)))
                continue;

            data[count][0] = String.valueOf(i); 
            data[count][1] = String.valueOf(Nombre.get(i));
            data[count][2] = String.valueOf(Carrera.get(i));
            data[count][3] = String.valueOf(Carnet.get(i));
            count++;
        }
       datos.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    //</editor-fold>
}
