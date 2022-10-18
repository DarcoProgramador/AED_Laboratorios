/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Cola;

import Lab4.*;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonio
 */
public class Cola extends javax.swing.JPanel {

    ColaCircular estaciones;
    
    public Cola() {
        initComponents();
        estaciones = new ColaCircular(10);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        button_Añadir = new javax.swing.JPanel();
        Lb_TextAñadir = new javax.swing.JLabel();
        button_Eliminar = new javax.swing.JPanel();
        Lb_TextAñadir1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablePila = new javax.swing.JTable();
        textCola = new javax.swing.JTextField();
        Title1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Cola");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 10, 350));

        button_Añadir.setBackground(new java.awt.Color(18, 90, 173));
        button_Añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_Añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_AñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_AñadirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_AñadirMousePressed(evt);
            }
        });
        button_Añadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lb_TextAñadir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lb_TextAñadir.setForeground(new java.awt.Color(255, 255, 255));
        Lb_TextAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_TextAñadir.setText("Añadir");
        button_Añadir.add(Lb_TextAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        add(button_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 260, 50));

        button_Eliminar.setBackground(new java.awt.Color(18, 90, 173));
        button_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_EliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_EliminarMousePressed(evt);
            }
        });
        button_Eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lb_TextAñadir1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lb_TextAñadir1.setForeground(new java.awt.Color(255, 255, 255));
        Lb_TextAñadir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_TextAñadir1.setText("Eliminar");
        button_Eliminar.add(Lb_TextAñadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        add(button_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 260, 50));

        JtablePila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JtablePila);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 360));

        textCola.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textCola.setBorder(null);
        add(textCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 234, -1));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Añadir  a la Cola:");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button_AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseEntered
        setColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseEntered

    private void button_AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseExited
        resetColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseExited
    // Añadir a la cola
    private void button_AñadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMousePressed
        String nombre = textCola.getText();
        if(estaciones.llena() || nombre.isEmpty())
        {
            return;
        }
        estaciones.insertar(nombre);
        mostrarMatriz();
        textCola.setText("");
        
    }//GEN-LAST:event_button_AñadirMousePressed

    private void button_EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EliminarMouseEntered
        setColor(button_Eliminar);
    }//GEN-LAST:event_button_EliminarMouseEntered

    private void button_EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EliminarMouseExited
        resetColor(button_Eliminar);
    }//GEN-LAST:event_button_EliminarMouseExited
    //Eliminar de la cola
    private void button_EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EliminarMousePressed
        if(!estaciones.vacia()){
            estaciones.extraer();
            mostrarMatriz();
        }     
    }//GEN-LAST:event_button_EliminarMousePressed
    //colores
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    } 
    //Muestra la matriz
    public void mostrarMatriz()
    {
        String nombreColumnas [] = {"Posicion", "Nombre"};
        String data [][] = new String[estaciones.size()][2];
        estaciones.mostrar(data);
       JtablePila.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtablePila;
    private javax.swing.JLabel Lb_TextAñadir;
    private javax.swing.JLabel Lb_TextAñadir1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button_Añadir;
    private javax.swing.JPanel button_Eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField textCola;
    // End of variables declaration//GEN-END:variables
}
