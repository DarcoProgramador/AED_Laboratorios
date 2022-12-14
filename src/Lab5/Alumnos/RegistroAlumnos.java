/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.Alumnos;
import Lab5.Alumnos.MetodoAlumnos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;



public class RegistroAlumnos extends javax.swing.JPanel{
   
    MetodoAlumnos Alumno = new MetodoAlumnos();
    
    public RegistroAlumnos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableRegistro = new javax.swing.JTable();
        textNombre = new javax.swing.JTextField();
        Title1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        textCarrera = new javax.swing.JTextField();
        textCarnet = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbCarnet = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbCarrera = new javax.swing.JLabel();
        jCmbCarreras = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setText("Registro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 75, 50));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 200, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 10, 350));

        button_Añadir.setBackground(new java.awt.Color(0, 75, 50));
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

        add(button_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 260, 50));

        JtableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JtableRegistro);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 380, 360));

        textNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textNombre.setBorder(null);
        textNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterSelect(evt);
            }
        });
        add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 180, -1));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(0, 0, 0));
        Title1.setText("Añadir  al Registro:");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 200, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 75, 50));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 200, 10));

        textCarrera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textCarrera.setBorder(null);
        textCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterSelect(evt);
            }
        });
        add(textCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 180, -1));

        textCarnet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textCarnet.setBorder(null);
        textCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterSelect(evt);
            }
        });
        add(textCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 180, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 75, 50));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 200, 10));

        lbCarnet.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbCarnet.setForeground(new java.awt.Color(0, 0, 0));
        lbCarnet.setText("Carnet:");
        add(lbCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        lbNombre.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(0, 0, 0));
        lbNombre.setText("Nombre:");
        add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        lbCarrera.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbCarrera.setForeground(new java.awt.Color(0, 0, 0));
        lbCarrera.setText("Carrera:");
        add(lbCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jCmbCarreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jCmbCarreras.setEnabled(false);
        jCmbCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbCarrerasActionPerformed(evt);
            }
        });
        add(jCmbCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button_AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseEntered
        setColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseEntered

    private void button_AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMouseExited
        resetColor(button_Añadir);
    }//GEN-LAST:event_button_AñadirMouseExited
    
    // <editor-fold defaultstate="collapsed" desc="Funciones para insertar en el JTable Registro">
    // Añadir a registro Alumnos
    private void button_AñadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AñadirMousePressed
        Añadir();
    }//GEN-LAST:event_button_AñadirMousePressed

    private void EnterSelect(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterSelect
        if(evt.getKeyCode() != KeyEvent.VK_ENTER)
        {
            return;
        }
        Añadir();
    }//GEN-LAST:event_EnterSelect

    private void jCmbCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbCarrerasActionPerformed
        // Mostrar carreras cada vez que cambia
        if("Todos".equals((String) jCmbCarreras.getSelectedItem()))//comprueba que el item seleccionado sea todos
        {
            Alumno.mostrar(JtableRegistro);
        }
        else
        {
            Alumno.mostrarFiltrado(JtableRegistro, (String)jCmbCarreras.getSelectedItem());
        }
    }//GEN-LAST:event_jCmbCarrerasActionPerformed
    
    //Funcion Añadir
    private void Añadir()
    {
        String nombre = textNombre.getText();
        String carrera = textCarrera.getText();
        String carnet = textCarnet.getText();
        if(nombre.isEmpty() || carrera.isEmpty() || carnet.isEmpty())
        {
            return;
        }
        Alumno.add(nombre, carrera.toUpperCase(), carnet);
        
        textNombre.setText("");
        textCarrera.setText("");
        textCarnet.setText("");
        jCmbCarreras.setEnabled(true);
        boolean elements = true;
        
        if("Todos".equals((String) jCmbCarreras.getSelectedItem()))//comprueba que el item seleccionado sea todos
        {
            Alumno.mostrar(JtableRegistro);
        }
        else
        {
            Alumno.mostrarFiltrado(JtableRegistro, (String)jCmbCarreras.getSelectedItem());
        }
        for(int i = 0; i < jCmbCarreras.getItemCount(); i++)
        {
            if(carrera.equalsIgnoreCase(jCmbCarreras.getItemAt(i)))
            {
                elements = false;
                break;
            }
            
        }
        if(elements)
        {
            jCmbCarreras.addItem(carrera.toUpperCase());
        }
        
    }
    //</editor-fold>
    
   //colores
    void setColor(JPanel panel){
        panel.setBackground(new Color(0,51,0));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0,75,50));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableRegistro;
    private javax.swing.JLabel Lb_TextAñadir;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button_Añadir;
    private javax.swing.JComboBox<String> jCmbCarreras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbCarnet;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTextField textCarnet;
    private javax.swing.JTextField textCarrera;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
