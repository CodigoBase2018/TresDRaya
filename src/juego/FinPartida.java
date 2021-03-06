package juego;

/**
 * Muestra la ventana de fin del juego.
 * @author Carlos Aguirre V.
 */
public class FinPartida extends java.awt.Dialog {

    private String mensaje;
    
    /**
     * Creates new form FinPartida
     */
    public FinPartida(java.awt.Frame parent, boolean modal, String cadena, String j1, String j2, int pj1, int pj2) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.mensaje = cadena;
        this.etiquetaGanador.setText(cadena);
        this.etiquetaJ1.setText(j1 + (pj1 == 0 ? " no ha ganado ninguna vez." : " ha ganado " + Integer.toString(pj1) + " veces."));
        this.etiquetaJ2.setText(j2 + (pj2 == 0 ? " no ha ganado ninguna vez." : " ha ganado " + Integer.toString(pj2) + " veces."));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanelInferior = new javax.swing.JPanel();
        etiquetaJ1 = new javax.swing.JLabel();
        etiquetaJ2 = new javax.swing.JLabel();
        jPanelInferior1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        etiquetaGanador = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        panel.setBackground(new java.awt.Color(254, 254, 254));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 190, 190)));
        panel.setForeground(new java.awt.Color(254, 254, 254));

        jPanelInferior.setBackground(new java.awt.Color(230, 140, 2));
        jPanelInferior.setForeground(new java.awt.Color(203, 203, 203));

        etiquetaJ1.setForeground(new java.awt.Color(254, 254, 254));
        etiquetaJ1.setText("...");

        etiquetaJ2.setForeground(new java.awt.Color(254, 254, 254));
        etiquetaJ2.setText("...");

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaJ1)
                    .addComponent(etiquetaJ2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaJ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaJ2)
                .addContainerGap())
        );

        etiquetaJ1.getAccessibleContext().setAccessibleName("Jugadas ganadas por jugador 1.");
        etiquetaJ2.getAccessibleContext().setAccessibleName("Jugadas ganadas por jugador 2.");

        jPanelInferior1.setBackground(new java.awt.Color(70, 150, 250));
        jPanelInferior1.setForeground(new java.awt.Color(203, 203, 203));

        btnAceptar.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInferior1Layout = new javax.swing.GroupLayout(jPanelInferior1);
        jPanelInferior1.setLayout(jPanelInferior1Layout);
        jPanelInferior1Layout.setHorizontalGroup(
            jPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferior1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanelInferior1Layout.setVerticalGroup(
            jPanelInferior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferior1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.getAccessibleContext().setAccessibleName("Aceptar.");
        btnAceptar.getAccessibleContext().setAccessibleDescription("Cierra esta ventana.");

        etiquetaGanador.setBackground(new java.awt.Color(254, 254, 254));
        etiquetaGanador.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        etiquetaGanador.setForeground(new java.awt.Color(1, 1, 1));
        etiquetaGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaGanador.setText("...");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelInferior1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaGanador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jPanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaGanador)
                .addGap(18, 18, 18)
                .addComponent(jPanelInferior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        etiquetaGanador.getAccessibleContext().setAccessibleName("Ganador.");
        etiquetaGanador.getAccessibleContext().setAccessibleDescription("Muestra el ganador.");

        add(panel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel etiquetaGanador;
    private javax.swing.JLabel etiquetaJ1;
    private javax.swing.JLabel etiquetaJ2;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInferior1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
