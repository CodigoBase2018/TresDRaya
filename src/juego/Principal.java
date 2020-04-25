/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.ImageIcon;

/**
 * Interfaz grafica de la calculadora
 * @title Interfaz grafica calculadora
 * @author Carlos Aguirre Vozmediano
 * @version 05/04/2018
 */
public class Principal extends javax.swing.JFrame {
    
    private final String AUTOR = "Carlos Aguirre Vozmediano";
    private final String VERSION = "28/05/2018";
    
    private String nombreJugador1;
    private String nombreJugador2;
    private byte numeroRondas;
    private int numeroTema;
    
    /**
     * Constructor de la clase principal. Pone los valores a un estado correcto.
     */
    public Principal()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarTema();
    }
    
    /**
     * Hace visible la ventana principal.
     */
    public void mostrar()
    {
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        panel1 = new javax.swing.JPanel();
        tresRaya = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tresRaya3D = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTutorial = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnTutorial1 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbNombreJ2 = new javax.swing.JLabel();
        nombreJ1 = new javax.swing.JTextField();
        nombreJ2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbNombreJ3 = new javax.swing.JLabel();
        rondas = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lbNombreJ4 = new javax.swing.JLabel();
        tema = new javax.swing.JComboBox<>();
        lb_iconoO = new javax.swing.JLabel();
        lb_iconoX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3D Raya");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panel1.setBackground(new java.awt.Color(254, 254, 254));

        tresRaya.setBackground(new java.awt.Color(254, 254, 254));
        tresRaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/normal.png"))); // NOI18N
        tresRaya.setToolTipText("Jugar a tres en raya normal.");
        tresRaya.setBorder(null);
        tresRaya.setBorderPainted(false);
        tresRaya.setContentAreaFilled(false);
        tresRaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tresRaya.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/normalSeleccionado.png"))); // NOI18N
        tresRaya.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ok.png"))); // NOI18N
        tresRaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresRayaActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/titulo.png"))); // NOI18N

        tresRaya3D.setBackground(new java.awt.Color(254, 254, 254));
        tresRaya3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tridimensional.png"))); // NOI18N
        tresRaya3D.setToolTipText("Jugar a tres en raya en tres dimensiones.");
        tresRaya3D.setBorder(null);
        tresRaya3D.setBorderPainted(false);
        tresRaya3D.setContentAreaFilled(false);
        tresRaya3D.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tresRaya3D.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tridimensionalSeleccionado.png"))); // NOI18N
        tresRaya3D.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ok.png"))); // NOI18N
        tresRaya3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresRaya3DActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Selecciona el tipo de juego:");

        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tres en raya 3D");

        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tres en raya");

        btnTutorial.setBackground(new java.awt.Color(254, 254, 254));
        btnTutorial.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnTutorial.setForeground(new java.awt.Color(1, 1, 1));
        btnTutorial.setText("Instrucciones");
        btnTutorial.setToolTipText("Muestra las instrucciones de como jugar a los dos juegos.");
        btnTutorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 153, 209), 2));
        btnTutorial.setContentAreaFilled(false);
        btnTutorial.setRolloverEnabled(false);
        btnTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialActionPerformed(evt);
            }
        });

        btnInformacion.setBackground(new java.awt.Color(254, 254, 254));
        btnInformacion.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(1, 1, 1));
        btnInformacion.setText("?");
        btnInformacion.setToolTipText("Acerca del programador.");
        btnInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 153, 209), 2));
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setRolloverEnabled(false);
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        btnTutorial1.setBackground(new java.awt.Color(254, 254, 254));
        btnTutorial1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnTutorial1.setForeground(new java.awt.Color(1, 1, 1));
        btnTutorial1.setText("Salir");
        btnTutorial1.setToolTipText("Sale de la aplicación.");
        btnTutorial1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 153, 209), 2));
        btnTutorial1.setContentAreaFilled(false);
        btnTutorial1.setRolloverEnabled(false);
        btnTutorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorial1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tresRaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tresRaya3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 120, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTutorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tresRaya)
                    .addComponent(tresRaya3D))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnTutorial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTutorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tresRaya.getAccessibleContext().setAccessibleName("Tres en raya normal.");
        jLabel6.getAccessibleContext().setAccessibleName("3 de raya");
        jLabel6.getAccessibleContext().setAccessibleDescription("Este es el título del juego.");
        tresRaya3D.getAccessibleContext().setAccessibleName("Tres en raya en tres dimensiones.");
        jLabel2.getAccessibleContext().setAccessibleName("Selecciona el tipo de juego");
        jLabel2.getAccessibleContext().setAccessibleDescription("");
        jLabel5.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleName("");
        btnTutorial.getAccessibleContext().setAccessibleDescription("");
        btnInformacion.getAccessibleContext().setAccessibleName("Acerca de.");
        btnTutorial1.getAccessibleContext().setAccessibleDescription("Sale del juego.");

        jTabbedPane2.addTab("Juego", panel1);
        panel1.getAccessibleContext().setAccessibleName("Juego");
        panel1.getAccessibleContext().setAccessibleDescription("Aquí se puede seleccionar entre dos juegos tres en raya normal y tres en raya en tres dimensiones.");

        panel2.setBackground(new java.awt.Color(254, 254, 254));

        jPanel4.setBackground(new java.awt.Color(254, 241, 230));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 255), 2));
        jPanel4.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Nombre jugador 1:");

        lbNombreJ2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNombreJ2.setForeground(new java.awt.Color(1, 1, 1));
        lbNombreJ2.setText("Nombre jugador 2:");

        nombreJ1.setText("J1");
        nombreJ1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        nombreJ2.setText("J2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbNombreJ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreJ2)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreJ2)
                    .addComponent(nombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");
        lbNombreJ2.getAccessibleContext().setAccessibleName("");
        nombreJ1.getAccessibleContext().setAccessibleName("Nombre del jugador uno.");
        nombreJ2.getAccessibleContext().setAccessibleName("Nombre del jugador dos.");

        jPanel1.setBackground(new java.awt.Color(254, 241, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 255), 2));

        lbNombreJ3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNombreJ3.setForeground(new java.awt.Color(1, 1, 1));
        lbNombreJ3.setText("Número de rondas:");

        rondas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "3", "5" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNombreJ3)
                .addGap(18, 18, 18)
                .addComponent(rondas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreJ3)
                    .addComponent(rondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lbNombreJ3.getAccessibleContext().setAccessibleName("");
        rondas.getAccessibleContext().setAccessibleName("Número de rondas.");
        rondas.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBackground(new java.awt.Color(254, 241, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 255), 2));

        lbNombreJ4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbNombreJ4.setForeground(new java.awt.Color(1, 1, 1));
        lbNombreJ4.setText("Tema:");

        tema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clásico", "Sol y Luna", "Mar", "Flanes" }));
        tema.setToolTipText("Aquí se puede escoger un tema para las fichas usadas en el tablero.");
        tema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNombreJ4)
                        .addGap(18, 18, 18)
                        .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_iconoX, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_iconoO, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreJ4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_iconoO, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_iconoX, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tema.getAccessibleContext().setAccessibleName("Tema.");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Opciones", panel2);
        panel2.getAccessibleContext().setAccessibleName("Opciones");
        panel2.getAccessibleContext().setAccessibleDescription("Aqui se pueden cambiar opciones como el nombre del jugador uno, el del jugador dos, establecer el número de rondas y un tema para las fichas.");

        getContentPane().add(jTabbedPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorialActionPerformed
        Instrucciones vInstrucciones = new Instrucciones(this, true);
        vInstrucciones.setVisible(true);
    }//GEN-LAST:event_btnTutorialActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        Informacion ventanaInformacion = new Informacion(new javax.swing.JFrame(), true, this.AUTOR, this.VERSION);
        ventanaInformacion.setVisible(true);
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void tresRaya3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresRaya3DActionPerformed
        setValores();
        InterfazTresDRaya juego1 = new InterfazTresDRaya(this.nombreJugador1, this.nombreJugador2, this.numeroRondas, this, this.numeroTema);
        juego1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tresRaya3DActionPerformed

    private void tresRayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresRayaActionPerformed
        setValores();
        InterfazTresEnRaya juego1 = new InterfazTresEnRaya(this.nombreJugador1, this.nombreJugador2, this.numeroRondas, this, this.numeroTema);
        juego1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tresRayaActionPerformed

    private void btnTutorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorial1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTutorial1ActionPerformed

    private void temaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaActionPerformed
        int tema = this.tema.getSelectedIndex();
        this.numeroTema = tema;
        this.mostrarTema();
    }//GEN-LAST:event_temaActionPerformed

    // Permite mostrar las imagenes del tema escogido para las fichas.
    private void mostrarTema()
    {
        switch (this.numeroTema) {
            case 0:
                this.lb_iconoO.setIcon(new ImageIcon(getClass().getResource("/recursos/o.png")));
                this.lb_iconoX.setIcon(new ImageIcon(getClass().getResource("/recursos/x.png")));
                break;
            case 1:
                this.lb_iconoO.setIcon(new ImageIcon(getClass().getResource("/recursos/o1.png")));
                this.lb_iconoX.setIcon(new ImageIcon(getClass().getResource("/recursos/x1.png")));
                break;
            case 2:
                this.lb_iconoO.setIcon(new ImageIcon(getClass().getResource("/recursos/o2.png")));
                this.lb_iconoX.setIcon(new ImageIcon(getClass().getResource("/recursos/x2.png")));
                break;
            default:
                this.lb_iconoO.setIcon(new ImageIcon(getClass().getResource("/recursos/o3.png")));
                this.lb_iconoX.setIcon(new ImageIcon(getClass().getResource("/recursos/x3.png")));
                break;
        }
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Define todos los valores de las las opciones establecidas en las opciones del juego.
    private void setValores()
    {
        String j1 = this.nombreJ1.getText().trim();
        String j2 = this.nombreJ2.getText().trim();
        if(this.nombreJ1.getText().length() > 8){this.nombreJugador1 = j1.substring(0, 8);}
        else{this.nombreJugador1 = j1;}
        if(this.nombreJ2.getText().length() > 8){this.nombreJugador2 = j2.substring(0, 8);}
        else{this.nombreJugador2 = j2;}
        
        int valor = this.rondas.getSelectedIndex();
        if(valor == 0){this.numeroRondas = (byte)0;}
        else if(valor == 1){this.numeroRondas = (byte)3;}
        else{this.numeroRondas = (byte)5;}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnTutorial;
    private javax.swing.JButton btnTutorial1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbNombreJ2;
    private javax.swing.JLabel lbNombreJ3;
    private javax.swing.JLabel lbNombreJ4;
    private javax.swing.JLabel lb_iconoO;
    private javax.swing.JLabel lb_iconoX;
    private javax.swing.JTextField nombreJ1;
    private javax.swing.JTextField nombreJ2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JComboBox<String> rondas;
    private javax.swing.JComboBox<String> tema;
    private javax.swing.JButton tresRaya;
    private javax.swing.JButton tresRaya3D;
    // End of variables declaration//GEN-END:variables
}
