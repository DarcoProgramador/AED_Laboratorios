/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Antonio
 */
public class palabra extends javax.swing.JPanel {
    
    public palabra() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Text1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPalabraInversa = new javax.swing.JTextField();
        Text2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Palabra Inversa:");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 10, 300));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Invertir");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, 30));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Palabras Invertidas");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        txtPalabra.setForeground(new java.awt.Color(102, 102, 102));
        txtPalabra.setBorder(null);
        txtPalabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPalabraMousePressed(evt);
            }
        });
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        txtPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabraKeyTyped(evt);
            }
        });
        add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 180, 10));

        txtPalabraInversa.setForeground(new java.awt.Color(102, 102, 102));
        txtPalabraInversa.setBorder(null);
        txtPalabraInversa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPalabraInversa.setEnabled(false);
        txtPalabraInversa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPalabraInversaMousePressed(evt);
            }
        });
        txtPalabraInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraInversaActionPerformed(evt);
            }
        });
        txtPalabraInversa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabraInversaKeyTyped(evt);
            }
        });
        add(txtPalabraInversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 180, 20));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Palabra:");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void txtPalabraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPalabraMousePressed
        
    }//GEN-LAST:event_txtPalabraMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    // DEVOLVER
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        //jLabel1.setText(String.valueOf(arreglo.tamaño_arreglo()));
        String valor =  txtPalabra.getText();
        
        if(!(valor.equals("")))
            txtPalabraInversa.setText(palabra(valor,valor.length()-1));
    }//GEN-LAST:event_buttonMousePressed

    private void txtPalabraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalabraKeyTyped
        
    }//GEN-LAST:event_txtPalabraKeyTyped

    private void txtPalabraInversaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPalabraInversaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraInversaMousePressed

    private void txtPalabraInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraInversaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraInversaActionPerformed

    private void txtPalabraInversaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalabraInversaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraInversaKeyTyped

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    public static String palabra(String pa, int longitud)
    { 
        if(longitud == 0)
        {
            return pa.charAt(longitud)+"";
        }
        else
        {
            return pa.charAt(longitud)+ (palabra(pa,longitud-1));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtPalabra;
    private javax.swing.JTextField txtPalabraInversa;
    // End of variables declaration//GEN-END:variables
}
