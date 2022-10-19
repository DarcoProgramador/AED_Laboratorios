/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.ListNegativoPositivo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Stack;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public class Numeros extends javax.swing.JPanel {
    
//iniciando Arrays PN
    ListaNegPos NumerosPN = new ListaNegPos();
    public Numeros() {
        initComponents();
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
        Lb_TextMostrarPN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtablePila = new javax.swing.JTable();
        textPila = new javax.swing.JTextField();
        Title1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPN = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Numeros");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 260, 10));

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

        add(button_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 260, 50));

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

        Lb_TextMostrarPN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lb_TextMostrarPN.setForeground(new java.awt.Color(255, 255, 255));
        Lb_TextMostrarPN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_TextMostrarPN.setText("Imprimir P N");
        button_Eliminar.add(Lb_TextMostrarPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        add(button_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 260, 50));

        JtablePila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JtablePila);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 360));

        textPila.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textPila.setBorder(null);
        textPila.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterSelect(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValidarNumero(evt);
            }
        });
        add(textPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 234, -1));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Añadir  Numeros:");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 200, -1));

        jTextAreaPN.setColumns(20);
        jTextAreaPN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextAreaPN.setRows(5);
        jTextAreaPN.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaPN);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 370, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void button_AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseEntered
        setColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseEntered

    private void button_AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseExited
        resetColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseExited
    // Añadir a la pila
    private void button_AñadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMousePressed
        Añadir();
    }//GEN-LAST:event_button_AñadirMousePressed
    
    private void button_EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EliminarMouseEntered
        setColor(button_Eliminar);
    }//GEN-LAST:event_button_EliminarMouseEntered

    private void button_EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EliminarMouseExited
        resetColor(button_Eliminar);
    }//GEN-LAST:event_button_EliminarMouseExited
    //Eliminar de la pila
    private void button_EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EliminarMousePressed
        jTextAreaPN.setText(NumerosPN.mostrarPN().toString());
    }//GEN-LAST:event_button_EliminarMousePressed

    private void ValidarNumero(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValidarNumero
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57 || key == 45;

        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_ValidarNumero

    private void EnterSelect(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterSelect
        if(evt.getKeyCode() != KeyEvent.VK_ENTER)
        {
            return;
        }
        Añadir();
    }//GEN-LAST:event_EnterSelect
    
    // <editor-fold defaultstate="collapsed" desc="Funciones para añadir">   
    //Funcion Añadir
    private void Añadir()
    {
        String numeros = textPila.getText();
        if(numeros.isEmpty())
        {
            return;
        }
        if(!isNumeric(numeros))
        {
            textPila.setText("");
            return;
        }
        NumerosPN.add(Integer.parseInt(numeros));
        NumerosPN.mostrarNumeros(JtablePila);
        textPila.setText("");
    }
    
    public boolean isNumeric(String str)
    {
      try
      {
          Integer.parseInt(str);
      }
      catch(NumberFormatException ex)
      {
          return false;
      }
      return true;
    }
    //</editor-fold>
    
    //colores
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtablePila;
    private javax.swing.JLabel Lb_TextAñadir;
    private javax.swing.JLabel Lb_TextMostrarPN;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button_Añadir;
    private javax.swing.JPanel button_Eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextAreaPN;
    private javax.swing.JTextField textPila;
    // End of variables declaration//GEN-END:variables
}
