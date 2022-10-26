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
    int filas = 0;
    int altoBoton = 0;
    int anchoBoton = 0;
    int ejeX = 0;//---->
    int ejeY = 0;//Abajo
    int separacion = 0;
    Color colorReSet = new Color(18,90,173);//Color predefinido
    Color colorSet = new Color(21,101,192);//Cambio de color
    public JPanel [] JPaneles;//Tipo de boton
    public JLabel[] TitulosPanel;//El mas 1 es para las imagenes
    public JLabel[] ImagenesPanel;//Icono del boton
    boolean [] boton_active;//Boton seleccionado
    //</editor-fold>
    
    /**
     * @param NumPanel
     */
    JPanelArray(JPanel Panel, int NumPanel)
    {
        this.filas = NumPanel;
        JPaneles = new JPanel [filas];
        TitulosPanel = new JLabel [filas];
        ImagenesPanel = new JLabel [filas];
        boton_active = new boolean [filas];
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
            JPaneles[i] = new JPanel();
            Set_PanelText(i);
            Panel.add(JPaneles[i]);
            boton_active[i] = false;
        }
    }
    
    private void Set_PanelText(int NumButton)
    {
        JPaneles[NumButton].setLayout(null);
        TitulosPanel[NumButton] = new JLabel("");
        ImagenesPanel[NumButton] = new JLabel("");
        JPaneles[NumButton].add(TitulosPanel[NumButton]);
        JPaneles[NumButton].add(ImagenesPanel[NumButton]);
    }
    
    public void Panel_Separacion(int separacion)
    {
        this.separacion = separacion;
        int espacio = this.altoBoton;
        for(int i = 0 ; i < filas ; i++)//Setbounds Space Panel
        {
            JPaneles[i].setBounds(ejeX, ejeY, this.anchoBoton, this.altoBoton);
            espacio += this.altoBoton + this.separacion;
        }
    }
    
    public void Panel_Bounds(int x, int y, int ancho, int alto)
    {
        this.ejeX = x;
        this.ejeY = y;
        this.anchoBoton = ancho;
        this.altoBoton = alto;
        int espacio = this.altoBoton;
        
        for(int i = 0 ; i < filas ; i++)//Setbounds Panels
        {
            JPaneles[i].setBounds(x, y, this.anchoBoton, this.altoBoton);
            espacio += this.altoBoton + this.separacion;
        }
    }
    
    public void Panel_text(String text, int NumButton)
    {
        TitulosPanel[NumButton].setText(text);
    }
    
    public void Panel_text_bounds(int x, int y, int ancho, int alto)
    {
        for(int i = 0 ; i < filas ; i++)//SetBounds Text
        {
            TitulosPanel[i].setBounds(x, y, ancho, alto);
        }
    }
}
