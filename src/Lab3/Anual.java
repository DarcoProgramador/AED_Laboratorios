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
public class Anual extends javax.swing.JPanel {
    
    public Anual() 
    {
        initComponents();
        StringBuilder MessageBuilder = new StringBuilder();
        int año = 2021;
        float ahorroPE = 400;
        float ahorroJU = 500;
        MessageBuilder.append("Año:\tCta.Pedro:\tCta.Juan:\n");
        factorial(ahorroPE, ahorroJU, año, MessageBuilder);
        txtArea_Mensaje.setText(MessageBuilder.toString());
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
        Title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Mensaje = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Incremento anual");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        txtArea_Mensaje.setBackground(new java.awt.Color(255, 255, 255));
        txtArea_Mensaje.setColumns(20);
        txtArea_Mensaje.setRows(5);
        txtArea_Mensaje.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtArea_Mensaje.setEnabled(false);
        jScrollPane1.setViewportView(txtArea_Mensaje);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 320, 290));
    }// </editor-fold>//GEN-END:initComponents

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    public static void factorial(float ahorroPE, float ahorroJU, int año, StringBuilder Mensaje){
        Mensaje.append(String.valueOf(año) +"\t  " + String.valueOf(Math.round(ahorroPE)) + "\t\t  " + String.valueOf(Math.round(ahorroJU)+"\n"));
        if(ahorroPE < ahorroJU){
            año += 1;
            ahorroPE += ahorroPE * 0.04;
            ahorroJU += ahorroJU * 0.023; 
            factorial(ahorroPE, ahorroJU, año, Mensaje);
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea_Mensaje;
    // End of variables declaration//GEN-END:variables
}