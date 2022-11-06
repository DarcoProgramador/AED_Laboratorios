/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonio
 */
public class Burbuja extends javax.swing.JPanel {
    Arreglo_Desordenado Inicio = new Arreglo_Desordenado();
    int burbuja[] = new int [100];
    
    public Burbuja(Arreglo_Desordenado A) 
    {
        initComponents();
        Inicio = A;

        System.arraycopy(Inicio.arreglo, 0, burbuja, 0, Inicio.n+1);
        metodoBurbuja();
        mostrarDesordenado(Inicio.arreglo, Inicio.n);
        mostrarOrdenado(burbuja, Inicio.n);
        
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
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ordenado = new javax.swing.JTable();
        Title1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Desorden = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setText("Burbuja");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(0, 0, 0));
        Text1.setText("Buscar:");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 75, 50));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 10, 300));

        button.setBackground(new java.awt.Color(0, 75, 50));
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
        jLabel1.setText("Buscar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 110, 30));

        Ordenado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Ordenado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 290, 270));

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(0, 0, 0));
        Title1.setText("Desordenado");
        add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 180, 20));

        Desorden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Desorden);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 290, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        
    }//GEN-LAST:event_txtBuscarMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    // DEVOLVER
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        //jLabel1.setText(String.valueOf(arreglo.tamaño_arreglo()));
        int valor =  Integer.parseInt(txtBuscar.getText());
        
        if(!(txtBuscar.getText().equals("")))
            mostrarBusqueda(burbuja, Inicio.n, valor);
    }//GEN-LAST:event_buttonMousePressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57 || key == 45;

        if (!numeros)
        {
            evt.consume();
        }
        if (txtBuscar.getText().trim().length() == 4) {
            evt.consume();
        }
        if(txtBuscar.getText().equals(""))
            mostrarOrdenado(burbuja, Inicio.n);
    }//GEN-LAST:event_txtBuscarKeyTyped

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    public void mostrarDesordenado(int array[], int n)
    {
        String nombreColumnas [] = {"Posicion", "Numero"};
        String data [][] = new String[n+1][2];
        for (int i = 0 ; i < n+1 ; i++)
        {
            data[i][0] = String.valueOf(i); 
            data[i][1] = String.valueOf(array[i]);
        }
        Desorden.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    
    public void mostrarOrdenado(int array[], int n)
    {
        String nombreColumnas [] = {"Posicion", "Numero"};
        String data [][] = new String[n+1][2];
        for (int i = 0 ; i < n+1 ; i++)
        {
            data[i][0] = String.valueOf(i); 
            data[i][1] = String.valueOf(array[i]);
        }
        Ordenado.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    
    public void mostrarBusqueda(int array[], int n, int valor)
    {
        //Valores para la impresion
        int i = 0;
        String data [][] = new String[n+1][2]; 
        //Busqueda binaria
        int inicio = 0;
        int fin = n+1;
        int pos;
        boolean band = false;
        
        while (inicio <= fin && band == false) 
        {
            pos = (inicio+fin) / 2;
            if ( array[pos] == valor )
            {
                data[i][0] = String.valueOf(pos); 
                data[i][1] = String.valueOf(array[pos]);
                band = true;
            }
            else if ( valor < array[pos]  ) 
            {
                fin --;
            } 
            else 
            {
                inicio ++;
            }
        }
        //Impresion
        String nombreColumnas [] = {"Posicion", "Numero"};  
        Ordenado.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    
    //Metodo de la burbuja
    public void metodoBurbuja()
    {  
        int i, j, aux;
        for (i = 0; i < Inicio.n; i++) 
        {
            for (j = 0; j < Inicio.n; j++) 
            {
                if (burbuja[j + 1] < burbuja[j]) 
                {
                    aux = burbuja[j + 1];
                    burbuja[j + 1] = burbuja[j];
                    burbuja[j] = aux;
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Desorden;
    private javax.swing.JTable Ordenado;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
