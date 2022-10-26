/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JPanelArrayButton;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class JPanelArray {
    // <editor-fold defaultstate="collapsed" desc="Variables de los botones">
    //Variables globales botones
    int filas = 6;
    int largoBoton = 0;
    int anchoBoton = 0;
    int ejeX = 0;//---->
    int ejeY = 0;//Abajo
    Color colorReSet = new Color(18,90,173);//Color predefinido
    Color colorSet = new Color(21,101,192);//Cambio de color
    public JPanel [] JPaneles = new JPanel [filas];//Tipo de boton
    boolean [] boton = new boolean [filas];//Boton seleccionado
    public JLabel[] TitulosPanel = new JLabel [filas];//El mas 1 es para las imagenes
    public JLabel[] ImagenesPanel = new JLabel [filas];
    //</editor-fold>
}
