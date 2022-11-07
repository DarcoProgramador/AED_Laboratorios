/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6.ArbolBinario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class ArbolBinario extends javax.swing.JPanel {
    
    private AlmacenArbolBinario simulador = new AlmacenArbolBinario();
    
    public ArbolBinario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        button_Añadir = new javax.swing.JPanel();
        Lb_TextAñadir = new javax.swing.JLabel();
        textDato = new javax.swing.JTextField();
        Title1 = new javax.swing.JLabel();
        jPGrafico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrdenes = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 57, 90, 10));

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

        Lb_TextAñadir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lb_TextAñadir.setForeground(new java.awt.Color(255, 255, 255));
        Lb_TextAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_TextAñadir.setText("Añadir");
        button_Añadir.add(Lb_TextAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        add(button_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 80, 24));

        textDato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textDato.setBorder(null);
        textDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDatoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                keyTypedValidar(evt);
            }
        });
        add(textDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 80, -1));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Title1.setText("Añadir al Arbol:");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        jPGrafico.setBackground(new java.awt.Color(255, 255, 255));
        add(jPGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 350));

        tableOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Preorden", null},
                {"Inorden", null},
                {"Posorden", null}
            },
            new String [] {
                "Orden", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrdenes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 340, 70));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 730, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void button_AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseEntered
        setColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseEntered

    private void button_AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseExited
        resetColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseExited

    private void button_AñadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMousePressed
        Añadir();
    }//GEN-LAST:event_button_AñadirMousePressed
    // Añadir al presionar enter
    private void textDatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDatoKeyPressed
        
        if(evt.getKeyCode() != KeyEvent.VK_ENTER)
        {
            return;
        }
        Añadir();
    }//GEN-LAST:event_textDatoKeyPressed
    
    private void keyTypedValidar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyTypedValidar
        //Valida si solo se a digitado un caracter
        String caracter = textDato.getText();
        boolean valida = caracter.length() < 1;
        
        if(!valida)
        {
            evt.consume();
        }
    }//GEN-LAST:event_keyTypedValidar
    

    private void Añadir()
    {
        try {
            String subChar = textDato.getText();
            char dato = subChar.charAt(0);
            
            if (this.simulador.insertar(dato, this.jPGrafico)) {
                textDato.setText("");
                JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);
        }
    }
    
    public void complementos(){
        this.repintarArbol();
        this.imprimirRecorridos();
    }
    private void repintarArbol() {
        this.jPGrafico.removeAll();
        jPGrafico.setLayout(null);
        JPanel Grafico = this.simulador.getDibujo();
        Grafico.setBounds(0, 0, 750, 380);
        jPGrafico.add(Grafico);
        jPGrafico.revalidate();
        jPGrafico.repaint();
    }
    private void imprimirRecorridos(){
        String recorrido = null;
        
        recorrido = this.simulador.preOrden();
        tableOrdenes.setValueAt(recorrido, 0, 1);
        
        recorrido = this.simulador.inOrden();
        tableOrdenes.setValueAt(recorrido, 1, 1);
        
        recorrido = this.simulador.postOrden();
        tableOrdenes.setValueAt(recorrido, 2, 1);
    }
    

    //colores
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_TextAñadir;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button_Añadir;
    private javax.swing.JPanel jPGrafico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tableOrdenes;
    private javax.swing.JTextField textDato;
    // End of variables declaration//GEN-END:variables
}
