package veterinaria.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;
import jdk.nashorn.internal.codegen.CompilerConstants;
import veterinaria.Entidades.Empleado;

public class Menu extends javax.swing.JFrame {
    private Empleado empleado;
    private static Menu menu;
    public boolean condicion = false;

    public Menu() {
        initComponents();
        mostrarHoraActual();
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuPanel = new javax.swing.JPanel();
        jPanelHorario = new javax.swing.JPanel();
        jReloj = new javax.swing.JLabel();
        jFecha = new javax.swing.JLabel();
        jAgregarCliente = new javax.swing.JButton();
        jAgregarMascota = new javax.swing.JButton();
        jHistorial = new javax.swing.JButton();
        jAgenda = new javax.swing.JButton();
        jAgregarVisita = new javax.swing.JButton();
        jModo = new javax.swing.JButton();
        jGestionTratamiento = new javax.swing.JButton();
        jBalance = new javax.swing.JButton();
        jAbout = new javax.swing.JButton();
        jLogOut = new javax.swing.JButton();
        jBienvenida = new javax.swing.JPanel();
        jPanelAdmin = new javax.swing.JPanel();
        jPublicidad = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        wsp = new javax.swing.JLabel();
        insta = new javax.swing.JLabel();
        fb = new javax.swing.JLabel();
        jPanelAlternativo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jMenuPanel.setBackground(new java.awt.Color(51, 153, 0));
        jMenuPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        jMenuPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
        jMenuPanel.setLayout(new java.awt.GridBagLayout());

        jPanelHorario.setBackground(new java.awt.Color(120, 168, 255));
        jPanelHorario.setLayout(new java.awt.BorderLayout());

        jReloj.setBackground(new java.awt.Color(255, 255, 255));
        jReloj.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jReloj.setText("RELOJ");
        jReloj.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanelHorario.add(jReloj, java.awt.BorderLayout.CENTER);

        jFecha.setBackground(new java.awt.Color(255, 255, 255));
        jFecha.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFecha.setText("FECHA");
        jFecha.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanelHorario.add(jFecha, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        jMenuPanel.add(jPanelHorario, gridBagConstraints);

        jAgregarCliente.setBackground(new java.awt.Color(0, 120, 215));
        jAgregarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/addCliente.png"))); // NOI18N
        jAgregarCliente.setToolTipText("AGREGAR CLIENTE");
        jAgregarCliente.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgregarCliente.setPreferredSize(new java.awt.Dimension(100, 160));
        jAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 345;
        gridBagConstraints.ipady = 109;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jAgregarCliente, gridBagConstraints);

        jAgregarMascota.setBackground(new java.awt.Color(57, 230, 100));
        jAgregarMascota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAgregarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/addMascota.png"))); // NOI18N
        jAgregarMascota.setToolTipText("AGREGAR MASCOTA");
        jAgregarMascota.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarMascotaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        jMenuPanel.add(jAgregarMascota, gridBagConstraints);

        jHistorial.setBackground(new java.awt.Color(209, 17, 65));
        jHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/historial.png"))); // NOI18N
        jHistorial.setToolTipText("HISTORIAL MEDICO");
        jHistorial.setMinimumSize(new java.awt.Dimension(10, 10));
        jHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHistorialActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 0);
        jMenuPanel.add(jHistorial, gridBagConstraints);

        jAgenda.setBackground(new java.awt.Color(136, 223, 153));
        jAgenda.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/agenda.png"))); // NOI18N
        jAgenda.setToolTipText("AGENDA");
        jAgenda.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgendaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.ipady = 105;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jAgenda, gridBagConstraints);

        jAgregarVisita.setBackground(new java.awt.Color(125, 60, 152));
        jAgregarVisita.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jAgregarVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/visita.png"))); // NOI18N
        jAgregarVisita.setToolTipText("REGISTRAR VISITA");
        jAgregarVisita.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgregarVisita.setPreferredSize(new java.awt.Dimension(20, 300));
        jAgregarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarVisitaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.ipady = 179;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jAgregarVisita, gridBagConstraints);

        jModo.setBackground(new java.awt.Color(85, 85, 85));
        jModo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jModo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/modoOscuro.png"))); // NOI18N
        jModo.setToolTipText("MODO OSCURO/CLARO");
        jModo.setMinimumSize(new java.awt.Dimension(10, 10));
        jModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 118;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jMenuPanel.add(jModo, gridBagConstraints);

        jGestionTratamiento.setBackground(new java.awt.Color(255, 105, 180));
        jGestionTratamiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jGestionTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/addTratamiento.png"))); // NOI18N
        jGestionTratamiento.setToolTipText("AGREGAR TRATAMIENTO");
        jGestionTratamiento.setMinimumSize(new java.awt.Dimension(10, 10));
        jGestionTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionTratamientoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 336;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
        jMenuPanel.add(jGestionTratamiento, gridBagConstraints);

        jBalance.setBackground(new java.awt.Color(240, 150, 50));
        jBalance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/balance.png"))); // NOI18N
        jBalance.setToolTipText("BALANCE MENSUAL");
        jBalance.setMinimumSize(new java.awt.Dimension(10, 10));
        jBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalanceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 238;
        gridBagConstraints.ipady = 124;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jBalance, gridBagConstraints);

        jAbout.setBackground(new java.awt.Color(22, 141, 79));
        jAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/About.png"))); // NOI18N
        jAbout.setToolTipText("ABOUT");
        jAbout.setMinimumSize(new java.awt.Dimension(10, 10));
        jAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jAbout, gridBagConstraints);

        jLogOut.setBackground(new java.awt.Color(128, 0, 32));
        jLogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/cerrarSesion.png"))); // NOI18N
        jLogOut.setToolTipText("CERRAR SESION");
        jLogOut.setMinimumSize(new java.awt.Dimension(10, 10));
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 162;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jLogOut, gridBagConstraints);

        jBienvenida.setBackground(new java.awt.Color(0, 99, 177));

        javax.swing.GroupLayout jBienvenidaLayout = new javax.swing.GroupLayout(jBienvenida);
        jBienvenida.setLayout(jBienvenidaLayout);
        jBienvenidaLayout.setHorizontalGroup(
            jBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        jBienvenidaLayout.setVerticalGroup(
            jBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 214;
        gridBagConstraints.ipady = 235;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jBienvenida, gridBagConstraints);

        jPanelAdmin.setBackground(new java.awt.Color(240, 150, 50));

        javax.swing.GroupLayout jPanelAdminLayout = new javax.swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelAdminLayout);
        jPanelAdminLayout.setHorizontalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        jPanelAdminLayout.setVerticalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 210;
        gridBagConstraints.ipady = 155;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jPanelAdmin, gridBagConstraints);

        jPublicidad.setBackground(new java.awt.Color(179, 158, 181));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("VETERINARIA !LAYOUT");

        wsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/wsp.png"))); // NOI18N

        insta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/instagram.png"))); // NOI18N

        fb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/facebook.png"))); // NOI18N

        javax.swing.GroupLayout jPublicidadLayout = new javax.swing.GroupLayout(jPublicidad);
        jPublicidad.setLayout(jPublicidadLayout);
        jPublicidadLayout.setHorizontalGroup(
            jPublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPublicidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1469, Short.MAX_VALUE)
                .addGap(672, 672, 672)
                .addComponent(fb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(insta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(wsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPublicidadLayout.setVerticalGroup(
            jPublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPublicidadLayout.createSequentialGroup()
                .addGroup(jPublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addGroup(jPublicidadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fb, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(wsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 147;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jMenuPanel.add(jPublicidad, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1359;
        gridBagConstraints.ipady = 757;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jMenuPanel, gridBagConstraints);
        jMenuPanel.getAccessibleContext().setAccessibleDescription("");

        jPanelAlternativo.setBackground(new java.awt.Color(255, 255, 51));
        jPanelAlternativo.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanelAlternativo.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1000;
        gridBagConstraints.ipady = 700;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanelAlternativo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgendaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionVisita nuevo = new GestionVisita();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgendaActionPerformed

    private void jAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarClienteActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionCliente nuevo = new GestionCliente();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarClienteActionPerformed

    private void jHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHistorialActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        Historial nuevo = new Historial();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jHistorialActionPerformed

    private void jGestionTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionTratamientoActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionTratamiento nuevo = new GestionTratamiento();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jGestionTratamientoActionPerformed

    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
        Login login = new Login(menu);
        login.repaint();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLogOutActionPerformed

    private void jAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutActionPerformed
                
    }//GEN-LAST:event_jAboutActionPerformed

    private void jAgregarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarVisitaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionVisita nuevo = new GestionVisita();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarVisitaActionPerformed

    private void jAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarMascotaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionMascota nuevo = new GestionMascota();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarMascotaActionPerformed

    private void jModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModoActionPerformed
       condicion = !condicion;
                if (condicion) {
                    try {
                        javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                        javax.swing.SwingUtilities.updateComponentTreeUI(Menu.this);
                        Color color = new Color(52, 55, 59);
                          jMenuPanel.setBackground(color);
                          jAgenda.setBackground(color);
                          jAbout.setBackground(color);        
                          jAgregarCliente.setBackground(color);
                          jAgregarMascota.setBackground(color);
                          jAgregarVisita.setBackground(color);
                          jBalance.setBackground(color);
                          jBienvenida.setBackground(color);
                          jFecha.setBackground(color);
                          jGestionTratamiento.setBackground(color);
                          jHistorial.setBackground(color);
                          jLogOut.setBackground(color);
                          jModo.setBackground(color);
                          jPanelAdmin.setBackground(color);
                          jPanelAlternativo.setBackground(color);
                          jPanelHorario.setBackground(color);
                          jReloj.setBackground(color);
                          jPublicidad.setBackground(color);
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);

                    }

                } else {
                    try {
                        javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                        javax.swing.SwingUtilities.updateComponentTreeUI(Menu.this);
                        Color fondo = new Color(0, 133, 94);
                        jMenuPanel.setBackground(fondo);
                        Color fondoAgenda = new Color(136,223,153);
                        jAgenda.setBackground(fondoAgenda);
                        Color fondoAbout = new Color(22,141,79);
                        jAbout.setBackground(fondoAbout);  
                        Color fondoCliente = new Color(0,120,215);
                        jAgregarCliente.setBackground(fondoCliente);
                        Color fondoMascota = new Color(57,230,100);
                        jAgregarMascota.setBackground(fondoMascota);
                        Color fondoVisita = new Color(125,60,152);
                        jAgregarVisita.setBackground(fondoVisita);
                        Color fondoBalance = new Color(240,150,50);
                         jBalance.setBackground(fondoBalance);
                        Color fondoBienvenida = new Color(0,99,177);
                        jBienvenida.setBackground(fondoBienvenida);
                        Color fondoTratamiento = new Color(255,105,180);
                        jGestionTratamiento.setBackground(fondoTratamiento);
                        Color fondoHistorial = new Color(209,17,65);
                        jHistorial.setBackground(fondoHistorial);
                        Color fondoLogout = new Color(128,0,32);
                        jLogOut.setBackground(fondoLogout);
                        Color fondoModo = new Color(85,85,85);
                        jModo.setBackground(fondoModo);
                        Color fondoAdmin = new Color(240,150,50);
                        jPanelAdmin.setBackground(fondoAdmin);
                        Color fondoAlternativo = new Color(255,255,51);
                        jPanelAlternativo.setBackground(fondoAlternativo);
                        Color fondoHorario = new Color(120,168,255);
                        jPanelHorario.setBackground(fondoHorario);
                        Color fondoPublicidad = new Color(179,158,181);
                        jPublicidad.setBackground(fondoPublicidad);
                       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
    }//GEN-LAST:event_jModoActionPerformed

    private void jBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalanceActionPerformed
        
    }//GEN-LAST:event_jBalanceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Menu().setVisible(true);
                    //DECOMENTAR AL FINAL PARA QUE FUNCIONE EL LOGIN
//                Login login = new Login(Menu.getInstancia());
//               login.setVisible(true);
            }
        });

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fb;
    private javax.swing.JLabel insta;
    private javax.swing.JButton jAbout;
    private javax.swing.JButton jAgenda;
    private javax.swing.JButton jAgregarCliente;
    private javax.swing.JButton jAgregarMascota;
    private javax.swing.JButton jAgregarVisita;
    private javax.swing.JButton jBalance;
    private javax.swing.JPanel jBienvenida;
    private javax.swing.JLabel jFecha;
    private javax.swing.JButton jGestionTratamiento;
    private javax.swing.JButton jHistorial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogOut;
    private javax.swing.JPanel jMenuPanel;
    private javax.swing.JButton jModo;
    private javax.swing.JPanel jPanelAdmin;
    private javax.swing.JPanel jPanelAlternativo;
    private javax.swing.JPanel jPanelHorario;
    private javax.swing.JPanel jPublicidad;
    private javax.swing.JLabel jReloj;
    private javax.swing.JLabel wsp;
    // End of variables declaration//GEN-END:variables
private void mostrarHoraActual() {

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter horario = DateTimeFormatter.ofPattern("HH:mm");
                LocalDate fechaSinHora = LocalDate.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("es", "ES"));
                String fechaFormateada = fechaSinHora.format(formato);
                jFecha.setText(fechaFormateada.toUpperCase());
                String horarioTotal = now.format(horario);
                jReloj.setText(horarioTotal);
            }
        });

        timer.start();
    }
public static Menu getInstancia() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    public void getUsuario(Empleado empleado2){ 
       this.empleado = empleado2;
    }  


}
