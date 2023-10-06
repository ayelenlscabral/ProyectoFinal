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

public class Menu extends javax.swing.JFrame {
  private boolean condicion = false;
    public Menu() {
        initComponents();
        mostrarHoraActual();
       this.setLocationRelativeTo(null);

//       this.setExtendedState(MAXIMIZED_BOTH);
//       getContentPane().setLayout(new BorderLayout(0,0));   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanelAlternativo = new javax.swing.JPanel();
        jMenuPanel = new javax.swing.JPanel();
        jAgregarCliente = new javax.swing.JButton();
        jAgregarMascota = new javax.swing.JButton();
        jHistorial = new javax.swing.JButton();
        jAgenda = new javax.swing.JButton();
        jAgregarVisita = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTratamiento = new javax.swing.JButton();
        jModo = new javax.swing.JButton();
        jReloj = new javax.swing.JLabel();
        jLogOut = new javax.swing.JButton();
        jBienvenida = new javax.swing.JPanel();
        jPanelAdmin = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFecha = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        jPanelAlternativo.setBackground(new java.awt.Color(255, 255, 51));
        jPanelAlternativo.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanelAlternativo.setLayout(new java.awt.BorderLayout());

        jMenuPanel.setBackground(new java.awt.Color(51, 153, 0));
        jMenuPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        jAgregarCliente.setBackground(new java.awt.Color(51, 255, 0));
        jAgregarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jAgregarCliente.setText("AgregarCliente");
        jAgregarCliente.setMinimumSize(new java.awt.Dimension(100, 100));
        jAgregarCliente.setPreferredSize(new java.awt.Dimension(100, 160));
        jAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarClienteActionPerformed(evt);
            }
        });

        jAgregarMascota.setBackground(new java.awt.Color(51, 204, 0));
        jAgregarMascota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAgregarMascota.setText("AgregarMascota");
        jAgregarMascota.setMinimumSize(new java.awt.Dimension(100, 100));
        jAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarMascotaActionPerformed(evt);
            }
        });

        jHistorial.setBackground(new java.awt.Color(255, 51, 51));
        jHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jHistorial.setText("HistorialMedico");
        jHistorial.setMinimumSize(new java.awt.Dimension(100, 100));
        jHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHistorialActionPerformed(evt);
            }
        });

        jAgenda.setBackground(new java.awt.Color(255, 204, 51));
        jAgenda.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jAgenda.setText("Agenda");
        jAgenda.setMinimumSize(new java.awt.Dimension(100, 100));
        jAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgendaActionPerformed(evt);
            }
        });

        jAgregarVisita.setBackground(new java.awt.Color(51, 204, 0));
        jAgregarVisita.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jAgregarVisita.setText("AGREGAR VISITA");
        jAgregarVisita.setPreferredSize(new java.awt.Dimension(20, 300));
        jAgregarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarVisitaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("REPORTE MENSUAL");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTratamiento.setBackground(new java.awt.Color(255, 204, 51));
        jTratamiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTratamiento.setText("jButton3");

        jModo.setBackground(new java.awt.Color(0, 204, 204));
        jModo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jModo.setText("MODO");
        jModo.setToolTipText("");
        jModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModoActionPerformed(evt);
            }
        });

        jReloj.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jReloj.setText("RELOJ");

        jLogOut.setBackground(new java.awt.Color(204, 0, 0));
        jLogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLogOut.setText("Logout");
        jLogOut.setToolTipText("");
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });

        jBienvenida.setBackground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout jBienvenidaLayout = new javax.swing.GroupLayout(jBienvenida);
        jBienvenida.setLayout(jBienvenidaLayout);
        jBienvenidaLayout.setHorizontalGroup(
            jBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jBienvenidaLayout.setVerticalGroup(
            jBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        jPanelAdmin.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanelAdminLayout = new javax.swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelAdminLayout);
        jPanelAdminLayout.setHorizontalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanelAdminLayout.setVerticalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("VETERINARIA !LAYOUT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nose ni que hago,");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("pero algo hago.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jFecha.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFecha.setText("FECHA");

        javax.swing.GroupLayout jMenuPanelLayout = new javax.swing.GroupLayout(jMenuPanel);
        jMenuPanel.setLayout(jMenuPanelLayout);
        jMenuPanelLayout.setHorizontalGroup(
            jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuPanelLayout.createSequentialGroup()
                        .addComponent(jBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jMenuPanelLayout.createSequentialGroup()
                                .addComponent(jAgregarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(jAgregarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuPanelLayout.createSequentialGroup()
                        .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jButton5)
                        .addGap(10, 10, 10)
                        .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jMenuPanelLayout.createSequentialGroup()
                                .addComponent(jTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jModo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jMenuPanelLayout.createSequentialGroup()
                                .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jMenuPanelLayout.setVerticalGroup(
            jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jMenuPanelLayout.createSequentialGroup()
                        .addComponent(jAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAgregarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jAgregarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuPanelLayout.createSequentialGroup()
                        .addComponent(jAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jMenuPanelLayout.createSequentialGroup()
                        .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jMenuPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jModo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jMenuPanelLayout.createSequentialGroup()
                                .addComponent(jReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAlternativo, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAlternativo, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE))
        );

        jMenuPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgendaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionVisita nuevo = new GestionVisita();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo,  BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgendaActionPerformed

    private void jAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarClienteActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionCliente nuevo = new GestionCliente();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo,  BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarClienteActionPerformed

    private void jAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarMascotaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionMascota nuevo = new GestionMascota();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo,  BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarMascotaActionPerformed

    private void jHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHistorialActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        Historial nuevo = new Historial();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo,  BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jHistorialActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
        this.removeAll();
        Login nuevo = new Login();
        nuevo.repaint();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLogOutActionPerformed

    private void jModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModoActionPerformed
        //                 jModo.addActionListener(new ActionListener() {
            //        @Override
            //        public void actionPerformed(ActionEvent e) {
                //           boolean condicion = false;
                if (condicion == true) {
                    try {
                        javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                        javax.swing.SwingUtilities.updateComponentTreeUI(Menu.this);
                        Color color = new Color(52,55,59);
                        jMenuPanel.setBackground(color);
                        this.condicion= false;
                        jModo.setText("MODO CLARO");

                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);

                    }

                }else {
                    try {
                        javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                        javax.swing.SwingUtilities.updateComponentTreeUI(Menu.this);
                        Color fondo = new Color(0,133,94);
                        jMenuPanel.setBackground(fondo);

                        this.condicion = true;
                        jModo.setText("MODO OSCURO");
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //}
            //     }
    }//GEN-LAST:event_jModoActionPerformed

    private void jAgregarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarVisitaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionVisita nuevo = new GestionVisita();
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo,  BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarVisitaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    try {
        javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
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
    private javax.swing.JButton jAgenda;
    private javax.swing.JButton jAgregarCliente;
    private javax.swing.JButton jAgregarMascota;
    private javax.swing.JButton jAgregarVisita;
    private javax.swing.JPanel jBienvenida;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jFecha;
    private javax.swing.JButton jHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLogOut;
    private javax.swing.JPanel jMenuPanel;
    private javax.swing.JButton jModo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAdmin;
    private javax.swing.JPanel jPanelAlternativo;
    private javax.swing.JLabel jReloj;
    private javax.swing.JButton jTratamiento;
    // End of variables declaration//GEN-END:variables
private void mostrarHoraActual() {

    
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            LocalDateTime now = LocalDateTime.now();
              DateTimeFormatter horario =   DateTimeFormatter.ofPattern("HH:mm");
//            DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH");
//            DateTimeFormatter minutos =   DateTimeFormatter.ofPattern("mm");  
//            DateTimeFormatter segundos =   DateTimeFormatter.ofPattern("ss");
               LocalDate fechaSinHora = LocalDate.now();
               DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMMM yyyy" ,new Locale("es", "ES"));
               String fechaFormateada = fechaSinHora.format(formato);
              jFecha.setText(fechaFormateada.toUpperCase());
//            String horaActual = now.format(hora);
//            String minutosActual = now.format(minutos);
//            String segundosActual = now.format(segundos);
              String horarioTotal = now.format(horario);
//            jHora.setText(horaActual);
//            jMinutos.setText(minutosActual); 
//            jSegundos.setText(segundosActual);
              jReloj.setText(horarioTotal);
            }
        });
       
            timer.start();
    }  

}
