package Lab2;
import Formularios.Lab2.Laboratorio2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {
    //Creando variables de control
    private boolean activar = false;
    //Creando objetos globales
    Arreglo_Desordenado arreglo = new Arreglo_Desordenado();
    //Ubicacion de la ventana
    int xMouse;
    int yMouse;
    int unico = 0;
    /**
     * Creates new form Dashboard
     */
    //Iniciando componentes y cargando el menu principal
    
    
    public Dashboard() {
        initComponents();
        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_Burbuja = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Baraja = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_Directa = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_Arreglo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Sacudida = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_Shell = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(21, 101, 192));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab2/images/home-outline.png"))); // NOI18N
        btn_prin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 50));

        btn_Burbuja.setBackground(new java.awt.Color(153, 153, 153));
        btn_Burbuja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Burbuja.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_Burbuja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BurbujaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BurbujaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_BurbujaMousePressed(evt);
            }
        });
        btn_Burbuja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab2/images/calendar-multiple-check.png"))); // NOI18N
        btn_Burbuja.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Burbuja");
        btn_Burbuja.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_Burbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        btn_Baraja.setBackground(new java.awt.Color(153, 153, 153));
        btn_Baraja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Baraja.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_Baraja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_BarajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_BarajaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_BarajaMousePressed(evt);
            }
        });
        btn_Baraja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab2/images/calendar-multiple-check.png"))); // NOI18N
        btn_Baraja.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Baraja");
        btn_Baraja.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_Baraja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn_Directa.setBackground(new java.awt.Color(153, 153, 153));
        btn_Directa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Directa.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_Directa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DirectaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DirectaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_DirectaMousePressed(evt);
            }
        });
        btn_Directa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab2/images/calendar-multiple-check.png"))); // NOI18N
        btn_Directa.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Directa");
        btn_Directa.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_Directa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        btn_Arreglo.setBackground(new java.awt.Color(18, 90, 173));
        btn_Arreglo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Arreglo.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_Arreglo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ArregloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ArregloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ArregloMousePressed(evt);
            }
        });
        btn_Arreglo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab2/images/calendar-plus.png"))); // NOI18N
        btn_Arreglo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Añadir Arreglo");
        btn_Arreglo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_Arreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("Lab 2 java");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 20));

        btn_Sacudida.setBackground(new java.awt.Color(153, 153, 153));
        btn_Sacudida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Sacudida.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_Sacudida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SacudidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SacudidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SacudidaMousePressed(evt);
            }
        });
        btn_Sacudida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab2/images/calendar-multiple-check.png"))); // NOI18N
        btn_Sacudida.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sacudida");
        btn_Sacudida.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_Sacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        btn_Shell.setBackground(new java.awt.Color(153, 153, 153));
        btn_Shell.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Shell.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_Shell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ShellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ShellMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ShellMousePressed(evt);
            }
        });
        btn_Shell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lab2/images/calendar-multiple-check.png"))); // NOI18N
        btn_Shell.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Shell");
        btn_Shell.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_Shell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

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
        jLabel2.setText("Metodos de Ordenacion y Busqueda Binaria");

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated
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

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed
        setColor(btn_prin);
        resetColor(btn_Arreglo);
        if(unico > 0)
        {
            resetColor(btn_Burbuja);
            resetColor(btn_Baraja);
            resetColor(btn_Directa);
            resetColor(btn_Shell);
            resetColor(btn_Sacudida);
        }
        // Abrir sección
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_ArregloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ArregloMousePressed
        
        resetColor(btn_prin);
        setColor(btn_Arreglo);
        if(unico > 0)
        {
            resetColor(btn_Burbuja);
            resetColor(btn_Baraja);
            resetColor(btn_Directa);
            resetColor(btn_Shell);
            resetColor(btn_Sacudida);
        }
        
        //Arreglo en global;
        arreglo.setSize(750, 430);
        arreglo.setLocation(0,0);
        content.removeAll();
        content.add(arreglo, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_ArregloMousePressed

    private void btn_BurbujaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BurbujaMousePressed

       if(activar)
       {
            resetColor(btn_prin);
            resetColor(btn_Arreglo);
            setColor(btn_Burbuja);
            resetColor(btn_Baraja);
            resetColor(btn_Directa);
            resetColor(btn_Shell);
            resetColor(btn_Sacudida);
            // Abrir sección
            Burbuja p1 = new Burbuja(arreglo);
            p1.setSize(750, 430);
            p1.setLocation(0,0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
       }
    }//GEN-LAST:event_btn_BurbujaMousePressed

    private void btn_BarajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BarajaMousePressed

       if(activar)
       {
            resetColor(btn_prin);
            resetColor(btn_Arreglo);
            resetColor(btn_Burbuja);
            setColor(btn_Baraja);
            resetColor(btn_Directa);
            resetColor(btn_Shell);
            resetColor(btn_Sacudida);
            // Abrir sección
            Baraja p1 = new Baraja(arreglo);
            p1.setSize(750, 430);
            p1.setLocation(0,0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
       }
    }//GEN-LAST:event_btn_BarajaMousePressed

    private void btn_DirectaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DirectaMousePressed

       if(activar)
       {
            resetColor(btn_prin);
            resetColor(btn_Arreglo);
            resetColor(btn_Burbuja);
            resetColor(btn_Baraja);
            setColor(btn_Directa);
            resetColor(btn_Shell);
            resetColor(btn_Sacudida);
            // Abrir sección
            Directa p1 = new Directa(arreglo);
            p1.setSize(750, 430);
            p1.setLocation(0,0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
       }
    }//GEN-LAST:event_btn_DirectaMousePressed

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

//Aniamcion de Botones para estilizarlos
    private void btn_ArregloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ArregloMouseEntered
        if(btn_Arreglo.getBackground().getRGB() == -15574355)
            setColor(btn_Arreglo);
    }//GEN-LAST:event_btn_ArregloMouseEntered

    private void btn_ArregloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ArregloMouseExited
        if(btn_prin.getBackground().getRGB() == -15374912 || 
           btn_Burbuja.getBackground().getRGB() == -15374912 || btn_Baraja.getBackground().getRGB() == -15374912
           || btn_Directa.getBackground().getRGB() == -15374912 || btn_Sacudida.getBackground().getRGB() == -15374912
           || btn_Shell.getBackground().getRGB() == -15374912 )
            {
                resetColor(btn_Arreglo);
            }
    }//GEN-LAST:event_btn_ArregloMouseExited

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        if(btn_prin.getBackground().getRGB() == -15574355)
            setColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        if(btn_Arreglo.getBackground().getRGB() == -15374912
           || btn_Burbuja.getBackground().getRGB() == -15374912 || btn_Baraja.getBackground().getRGB() == -15374912
           || btn_Directa.getBackground().getRGB() == -15374912 || btn_Sacudida.getBackground().getRGB() == -15374912
           || btn_Shell.getBackground().getRGB() == -15374912)
            {
                resetColor(btn_prin);
            }
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_BurbujaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BurbujaMouseEntered
        if(btn_Burbuja.getBackground().getRGB() == -15574355)
            setColor(btn_Burbuja);
    }//GEN-LAST:event_btn_BurbujaMouseEntered

    private void btn_BurbujaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BurbujaMouseExited
        if((btn_prin.getBackground().getRGB() == -15374912 || btn_Arreglo.getBackground().getRGB() == -15374912
           || btn_Baraja.getBackground().getRGB() == -15374912
           || btn_Directa.getBackground().getRGB() == -15374912 || btn_Sacudida.getBackground().getRGB() == -15374912
           || btn_Shell.getBackground().getRGB() == -15374912) && btn_Burbuja.getBackground().getRGB() != -6710887)
            {
                resetColor(btn_Burbuja);
            }
    }//GEN-LAST:event_btn_BurbujaMouseExited

    private void btn_BarajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BarajaMouseEntered
        if(btn_Baraja.getBackground().getRGB() == -15574355)
            setColor(btn_Baraja);
    }//GEN-LAST:event_btn_BarajaMouseEntered

    private void btn_BarajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BarajaMouseExited
        if((btn_prin.getBackground().getRGB() == -15374912 || btn_Arreglo.getBackground().getRGB() == -15374912
           || btn_Burbuja.getBackground().getRGB() == -15374912
           || btn_Directa.getBackground().getRGB() == -15374912 || btn_Sacudida.getBackground().getRGB() == -15374912
           || btn_Shell.getBackground().getRGB() == -15374912) && btn_Burbuja.getBackground().getRGB() != -6710887)
           {
            resetColor(btn_Baraja);
           }
    }//GEN-LAST:event_btn_BarajaMouseExited

    private void btn_DirectaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DirectaMouseEntered
        if(btn_Directa.getBackground().getRGB() == -15574355)
            setColor(btn_Directa);
    }//GEN-LAST:event_btn_DirectaMouseEntered

    private void btn_DirectaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DirectaMouseExited
        if((btn_prin.getBackground().getRGB() == -15374912 || btn_Arreglo.getBackground().getRGB() == -15374912
           || btn_Burbuja.getBackground().getRGB() == -15374912 || btn_Baraja.getBackground().getRGB() == -15374912
           || btn_Sacudida.getBackground().getRGB() == -15374912
           || btn_Shell.getBackground().getRGB() == -15374912) && btn_Burbuja.getBackground().getRGB() != -6710887)
           {
            resetColor(btn_Directa);
           }
    }//GEN-LAST:event_btn_DirectaMouseExited

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

    private void btn_SacudidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SacudidaMouseEntered
        if(btn_Sacudida.getBackground().getRGB() == -15574355)
            setColor(btn_Sacudida);
    }//GEN-LAST:event_btn_SacudidaMouseEntered

    private void btn_SacudidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SacudidaMouseExited
        if((btn_prin.getBackground().getRGB() == -15374912 || btn_Arreglo.getBackground().getRGB() == -15374912
           || btn_Burbuja.getBackground().getRGB() == -15374912 || btn_Baraja.getBackground().getRGB() == -15374912
           || btn_Directa.getBackground().getRGB() == -15374912 
           || btn_Shell.getBackground().getRGB() == -15374912) && btn_Burbuja.getBackground().getRGB() != -6710887)
           {
                resetColor(btn_Sacudida);
           }
    }//GEN-LAST:event_btn_SacudidaMouseExited
//Funcion de el boton sacudida
    private void btn_SacudidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SacudidaMousePressed

       if(activar)
       {
            resetColor(btn_prin);
            resetColor(btn_Arreglo);
            resetColor(btn_Burbuja);
            resetColor(btn_Baraja);
            resetColor(btn_Directa);
            setColor(btn_Sacudida);
            resetColor(btn_Shell);
            
            // Abrir sección
            Sacudida p1 = new Sacudida(arreglo);
            p1.setSize(750, 430);
            p1.setLocation(0,0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
       }  
    }//GEN-LAST:event_btn_SacudidaMousePressed

    private void btn_ShellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ShellMouseEntered
        if(btn_Shell.getBackground().getRGB() == -15574355)
            setColor(btn_Shell);
    }//GEN-LAST:event_btn_ShellMouseEntered

    private void btn_ShellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ShellMouseExited
        if((btn_prin.getBackground().getRGB() == -15374912 || btn_Arreglo.getBackground().getRGB() == -15374912
           || btn_Burbuja.getBackground().getRGB() == -15374912 || btn_Baraja.getBackground().getRGB() == -15374912
           || btn_Directa.getBackground().getRGB() == -15374912 || btn_Sacudida.getBackground().getRGB() == -15374912)
           && btn_Burbuja.getBackground().getRGB() != -6710887)
        {
            resetColor(btn_Shell);
        }
            
    }//GEN-LAST:event_btn_ShellMouseExited
//Funcion del boton baraja
    private void btn_ShellMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ShellMousePressed
       if(activar)
       {
            resetColor(btn_prin);
            resetColor(btn_Arreglo);
            resetColor(btn_Burbuja);
            resetColor(btn_Baraja);
            resetColor(btn_Directa);
            resetColor(btn_Sacudida);
            setColor(btn_Shell);
            
            // Abrir sección
            Shell p1 = new Shell(arreglo);
            p1.setSize(750, 430);
            p1.setLocation(0,0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
       }
    }//GEN-LAST:event_btn_ShellMousePressed

    private void Activar_color(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Activar_color
        activar = arreglo.activar();
        if(activar == true && unico == 0)
        {
            resetColor(btn_Burbuja);
            resetColor(btn_Baraja);
            resetColor(btn_Directa);
            resetColor(btn_Shell);
            resetColor(btn_Sacudida);
            unico++;
        }
    }//GEN-LAST:event_Activar_color

    private void btn_RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarMouseEntered
        setColor(btn_Regresar);
    }//GEN-LAST:event_btn_RegresarMouseEntered

    private void btn_RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarMouseExited
        resetColor(btn_Regresar);
    }//GEN-LAST:event_btn_RegresarMouseExited

    private void btn_RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegresarMousePressed
        dispose();
        new Laboratorio2().setVisible(true);
    }//GEN-LAST:event_btn_RegresarMousePressed

//Funciones para volver a Poner y quitar el color de los botones
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_Arreglo;
    private javax.swing.JPanel btn_Baraja;
    private javax.swing.JPanel btn_Burbuja;
    private javax.swing.JPanel btn_Directa;
    private javax.swing.JPanel btn_Regresar;
    private javax.swing.JPanel btn_Sacudida;
    private javax.swing.JPanel btn_Shell;
    private javax.swing.JPanel btn_prin;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel red_squr;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}