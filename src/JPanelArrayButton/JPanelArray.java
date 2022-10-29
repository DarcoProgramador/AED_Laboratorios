/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JPanelArrayButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
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
    int altoBoton;
    int anchoBoton;
    int ejeX = 0;//---->
    int ejeY = 0;//Abajo
    int separacion = 0;
    Color color_background = new Color(18,90,173);//Color de fondo
    public JPanel [] JPaneles;//Tipo de boton
    public JLabel[] TitulosPanel;//El mas 1 es para las imagenes
    public JLabel[] IconPanel;//Icono del boton
    public boolean [] button_active;//Boton seleccionado
    //</editor-fold>
    
    /**
     * @param Panel
     * @param NumPanel
     */
    public JPanelArray(JPanel Panel, int NumPanel)
    {
        this.filas = NumPanel;
        JPaneles = new JPanel [filas];
        TitulosPanel = new JLabel [filas];
        IconPanel = new JLabel [filas];
        button_active = new boolean [filas];
        
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
            JPaneles[i] = new JPanel();
            Panel.add(JPaneles[i]);
            Set_PanelText(i);
            button_active[i] = false;
        }
    }
    
    private void Set_PanelText(int NumButton)
    {
        JPaneles[NumButton].setLayout(null);
        TitulosPanel[NumButton] = new JLabel("");
        IconPanel[NumButton] = new JLabel("");
        JPaneles[NumButton].add(TitulosPanel[NumButton]);
        JPaneles[NumButton].add(IconPanel[NumButton]);
    }
    
    public void Panel_Separacion(int separacion)
    {
        this.separacion = separacion;
        int espacio = this.ejeY;
        for(int i = 0 ; i < filas ; i++)//Setbounds Space Panel
        {
            JPaneles[i].setBounds(ejeX, espacio, this.anchoBoton, this.altoBoton);
            espacio += this.altoBoton + this.separacion;
        }
    }
    
    public void Panel_Bounds(int x, int y, int ancho, int alto)
    {
        this.ejeX = x;
        this.ejeY = y;
        this.anchoBoton = ancho;
        this.altoBoton = alto;
        int espacio = this.ejeY;
        
        for(int i = 0 ; i < filas ; i++)//Setbounds Panels
        {
            JPaneles[i].setBounds(x, espacio, this.anchoBoton, this.altoBoton);
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
    
    public void Panel_icon(ImageIcon icono, int NumButton)
    {
        IconPanel[NumButton].setIcon(icono);
    }
    
    public void Panel_icon_bounds(int x, int y, int ancho, int alto)
    {
        for(int i = 0 ; i < filas ; i++)//SetBounds Text
        {
            IconPanel[i].setBounds(x, y, ancho, alto);
        }
    }
    
    public void Panel_set_colors(Color color_fondo)
    {
        this.color_background = color_fondo;
        for(int i = 0 ; i < filas ; i++)//SetColor Background
        {
            JPaneles[i].setBackground(color_background);
        }
    }
    
    public void Panel_set_text_colors(Color color_fondo)
    {
        for(int i = 0 ; i < filas ; i++)//Color Text
        {
            this.TitulosPanel[i].setForeground(color_fondo);
        }
    }
    
    public void Panel_set_text_fonts(Font tipo_letra)
    {
        for(int i = 0 ; i < filas ; i++)//Color Text
        {
            this.TitulosPanel[i].setFont(tipo_letra);
        }
    }
}
