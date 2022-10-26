/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JPanelArrayButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class JPanelMetod {

    /**
     * @param Panel
     * @param Botones
     * @param filas
     * @param posicion_x
     * @param posicion_y
     * @param largo
     * @param ancho
     * @param separacion
     */
   //Iniciando arreglo de botones y sobrecargando el metodo
    public static void JpanelArray(JPanel Panel, JPanel [][] Botones,int filas, int fila, int largo, int ancho, int posicion_x, int posicion_y, int separacion)
    {
        int x = posicion_x;
        int y = posicion_y;
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
            for (int j = 0 ; j < fila ; j++)
            {
                Botones[i][j] = new JPanel();//Modoficar en caso de cambiar
                Botones[i][j].setBounds(x, y, largo, ancho);
                Panel.add(Botones[i][j]);
                x += largo+separacion;
            }
            x = posicion_x;
            y += ancho+separacion;
        }
    }
    
    public static void JpanelArray(JPanel Panel, JPanel [][] Botones,int filas, int colum, int largo, int ancho, int posicion_x, int posicion_y)
    {
        int x = posicion_x;
        int y = posicion_y;
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
            for (int j = 0 ; j < colum ; j++)
            {
                Botones[i][j] = new JPanel();//Modoficar en caso de cambiar
                Botones[i][j].setBounds(x, y, largo, ancho);
                Panel.add(Botones[i][j]);
                x += largo+0;
            }
            x = posicion_x;
            y += ancho+0;
        }
    }
    
    public static void JpanelArray(JPanel Panel, JPanel [][] Botones,int filas, int colum, int largo, int ancho, int posicion_x)
    {
        int x = posicion_x;
        int y = 0;
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
            for (int j = 0 ; j < colum ; j++)
            {
                Botones[i][j] = new JPanel();//Modoficar en caso de cambiar
                Botones[i][j].setBounds(x, y, largo, ancho);
                Panel.add(Botones[i][j]);
                x += largo+0;
            }
            x = posicion_x;
            y += ancho+0;
        }
    }
    
    public static void JpanelArray(JPanel Panel, JPanel [][] Botones,int filas, int colum, int largo, int ancho)
    {
        int x = 0;
        int y = 0;
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
            for (int j = 0 ; j < colum ; j++)
            {
                Botones[i][j] = new JPanel();//Modoficar en caso de cambiar
                Botones[i][j].setBounds(x, y, largo, ancho);
                Panel.add(Botones[i][j]);
                x += largo+0;
            }
            x = 0;
            y += ancho+0;
        }
    }
    
    
    //Configurando color de todos los botones
    public static void setColorJPanelArray(JPanel [][] Botones,int filas,int colum,Color color)
    {
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
            for (int j = 0 ; j < colum ; j++)
            {
                Botones[i][j].setBackground(color);
            }
        }
    }
    
    public static void setColorJPanelArray(JPanel Botones, Color color)
    {
        Botones.setBackground(color);  
    }
    
    //Configura el Texto de boton a boton
    public static void setLabelJPanelArray(JPanel [][] Botones, JLabel texto, int x, int y)
    {
        Botones[x][y].setLayout(null);
        texto.setBounds(50, 10, 100, 30);
        Botones[x][y].add(texto);
    }
    //Configurando iconos de Jpanel
    public static void setLabelIconJPanelArray(JPanel [][] Botones, JLabel texto, int x, int y)
    {
        Botones[x][y].setLayout(null);
        texto.setBounds(0, 10, 60, 30);
        Botones[x][y].add(texto);
    }
    
    
}
