package Lab6;
import JPanelArrayButton.JPanelArray;
import Lab6.ArbolBinario.Pilas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Dashboard extends javax.swing.JFrame {
    //Creando variables de control
    //Ubicacion de la ventana
    int xMouse;
    int yMouse;
    
    //PanelArray
    JPanelArray PanelArray;

    //Iniciando componentes y cargando el menu principal
    
    
    public Dashboard() {
        initComponents();
        
        // <editor-fold defaultstate="collapsed" desc="Cargando la fecha actual">
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Cargando el Panel Principal">
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        setLocationRelativeTo(null);
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Cargando Botones">
        //cargando botones----------------------------------------------------------------------------------------------
        //iniciando parametros del boton
        PanelArray = new JPanelArray(Botones,filas);//Numero de botones y el panel donde va a estar
        PanelArray.Panel_Bounds(ejeX , ejeY, anchoBoton, altoBoton);
        PanelArray.Panel_set_colors(colorReSet);
        //Iniciando boton seleccionado
        PanelArray.button_active[0] = true; 
        PanelArray.JPaneles[0].setBackground(colorSet);//color del seleccionado
        //Iniciando los Texto, Colores y fuente de Texto
        iniciando_titulos();
        //añadiendo el MouseListener
        setMouseListener(PanelArray.JPaneles);
        //</editor-fold>
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables de los botones">
    //Variables globales botones
    int filas = 2;
    int colum = 1;
    int separacion = 0;
    int anchoBoton = 270;
    int altoBoton = 50;
    int ejeX = 0;//---->
    int ejeY = 0;//Abajo
    Font Estilo = new Font("Segoe UI", Font.BOLD, 14);
    Color color_texto = new Color(255,255,255);
    Color colorReSet = new Color(18,90,173);//Color predefinido
    Color colorSet = new Color(21,101,192);//Cambio de color
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodo para cargar los titulos de los botones">
    private void iniciando_titulos()
    {

        //Imagenes De botones
        //*************ImageIcon calendarioPlus = new ImageIcon("src/Lab4/images/calendar-plus.png");*******************
        ImageIcon calendarioMultiple = new ImageIcon("src/Imagenes/calendar-multiple-check.png");
        ImageIcon home = new ImageIcon("src/Imagenes/home-outline.png");
        
        //configurando la posicion de los textos e iconos
        PanelArray.Panel_text_bounds(55, 10, 100, 30);
        PanelArray.Panel_icon_bounds(10, 10, 60, 30);
        
        // <editor-fold defaultstate="collapsed" desc="Texto de los botones">
        //Texto para cada Label
        PanelArray.Panel_text("Principal", 0);
        PanelArray.Panel_text("Ejercicio Arbol", 1);
        //</editor-fold>
        
        //Iconos en los Jpanel
        PanelArray.Panel_icon(home, 0);
        PanelArray.Panel_icon(calendarioMultiple, 1);
        
        //Color y Estilo del texto
        PanelArray.Panel_set_text_colors(color_texto);
        PanelArray.Panel_set_text_fonts(Estilo); 
        
    }
    //</editor-fold>
    
    //Setear botones en falso
    private void setBoton(boolean [] button)
    {
        for(int i = 0 ; i < filas ; i++)
        {
            button[i] = false;
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="MauseListener para cada Boton">
    //Metiendo un MouseListener a cada boton
    private void setMouseListener(JPanel [] Botones)
    {
        for(int i = 0 ; i < filas ; i++)//inicializando botones
        {
           
            AccionBotones accion = new AccionBotones();
            Botones[i].addMouseListener(accion);

        }
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Acciones del MouseListener">
    //Acciones de los botones
    public class AccionBotones implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent event) {
            
        }
        //Animacion y accion al realizar al precionar
        @Override
        public void mousePressed(MouseEvent event) {
            for(int i = 0 ; i < filas ; i++)//inicializando botones
            {
                if(!event.getComponent().equals(PanelArray.JPaneles[i]))
                {
                    continue;
                }
                setBoton(PanelArray.button_active);//Configurando todos los botones en falso
                PanelArray.button_active[i] = true;//boton seleccionado en true
                PanelArray.Panel_set_colors(colorReSet);//Color normal para todos los botones
                PanelArray.JPaneles[i].setBackground(colorSet);//Color diferente para el seleccionado
                boton_selec_Action(i);
            }
        }
        
        @Override
        public void mouseReleased(MouseEvent e) {
            
        }
        //Animacion de entrada
        @Override
        public void mouseEntered(MouseEvent event) {
            for(int i = 0 ; i < filas ; i++)//inicializando botones
            {
                if(event.getComponent().equals(PanelArray.JPaneles[i]))
                {
                   PanelArray.JPaneles[i].setBackground(colorSet);
                }
            }
        }
        //Animacion de salida
        @Override
        public void mouseExited(MouseEvent event) {
            for(int i = 0 ; i < filas ; i++)//inicializando botones
            {
                if(!event.getComponent().equals(PanelArray.JPaneles[i]))
                {
                    continue;
                }
                if(!PanelArray.button_active[i]){
                    PanelArray.JPaneles[i].setBackground(colorReSet);
                }   
                
            }
        }
    
    }
    //Accion a realizar segun el boton que se selecciono
    private void boton_selec_Action(int i)
    {
        switch(i) {
            case 0 -> {
                // Abrir sección
                Principal p1 = new Principal();
                p1.setSize(750, 430);
                p1.setLocation(0,0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
            
            case 1 -> {
                //Registro en global;
                Pilas p2 = new Pilas();
                p2.setSize(750, 430);
                p2.setLocation(0,0);

                content.removeAll();
                content.add(p2, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
            
        }
    }
    //</editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*    @SuppressWarnings("unchecked")*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Botones = new javax.swing.JPanel();
        btn_Regresar = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("Lab 6 java");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 20));

        Botones.setBackground(new java.awt.Color(13, 71, 161));

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        Menu.add(Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 460));

        btn_Regresar.setBackground(new java.awt.Color(13, 71, 161));
        btn_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Regresar.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RegresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_RegresarMousePressed(evt);
            }
        });
        btn_Regresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Regresar");
        btn_Regresar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 30));

        Menu.add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(25, 118, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Arbol Binario");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Sábado 28 de Abril de 2018");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fecha))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 750, 150));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 984, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(red_squr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        slogan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        slogan.setText("Facultad de Electrotecnia y Computación (F.E.C)");
        Background.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 300, 30));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Activar_color(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// <editor-fold defaultstate="collapsed" desc="Animaciones y Acciones del Menu">
//Arrastrar ventana
    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed


// Funciones de los Botones
    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void Activar_color(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activar_color

    }//GEN-LAST:event_Activar_color
    //Animacion de color regresar
    private void btn_RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarMouseEntered
        btn_Regresar.setBackground(new Color(21,101,192));
    }//GEN-LAST:event_btn_RegresarMouseEntered
    
    private void btn_RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarMouseExited
        btn_Regresar.setBackground(new Color(13,71,161));
    }//GEN-LAST:event_btn_RegresarMouseExited
    //Accion de el boton regresar
    private void btn_RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarMousePressed
        
    }//GEN-LAST:event_btn_RegresarMousePressed
//</editor-fold>
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_Regresar;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel red_squr;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
