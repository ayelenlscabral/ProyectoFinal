package veterinaria.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;
import veterinaria.Entidades.Empleado;

public class Menu extends javax.swing.JFrame {
    ImageIcon hombre = new ImageIcon((getClass().getResource("/veterinaria/Recursos/hombre.png")));
    ImageIcon mujer = new ImageIcon((getClass().getResource("/veterinaria/Recursos/mujer.png")));
    ImageIcon administrador = new ImageIcon((getClass().getResource("/veterinaria/Recursos/administrador.png")));
    private Empleado empleado;
    private static Menu menu;
    public boolean modo;

    public Menu(boolean modo, Empleado empleado) {
        initComponents();
        mostrarHoraActual();
        this.setLocationRelativeTo(null);
        this.modo = modo;
        this.empleado = empleado;
        getUsuario(empleado);
        actualizarApariencia(modo);
        setIconImage(new ImageIcon(getClass().getResource("/veterinaria/Recursos/icono.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jBienvenido = new javax.swing.JLabel();
        jUsuario = new javax.swing.JLabel();
        jLogo = new javax.swing.JLabel();
        jAdministracion = new javax.swing.JButton();
        jPanelAlternativo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Veterinaria 4.0");
        setBackground(new java.awt.Color(51, 255, 51));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuPanel.setBackground(new java.awt.Color(0, 255, 0));
        jMenuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuPanel.setAutoscrolls(true);
        jMenuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        jMenuPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        jMenuPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        jMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHorario.setBackground(new java.awt.Color(120, 168, 255));
        jPanelHorario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jReloj.setBackground(new java.awt.Color(255, 255, 255));
        jReloj.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jReloj.setText("RELOJ");
        jReloj.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jReloj.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanelHorario.add(jReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 90));

        jFecha.setBackground(new java.awt.Color(255, 255, 255));
        jFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFecha.setText("FECHA");
        jFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFecha.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanelHorario.add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        jMenuPanel.add(jPanelHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 280, 140));

        jAgregarCliente.setBackground(new java.awt.Color(0, 120, 215));
        jAgregarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/addCliente.png"))); // NOI18N
        jAgregarCliente.setToolTipText("AGREGAR CLIENTE");
        jAgregarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jAgregarCliente.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgregarCliente.setPreferredSize(new java.awt.Dimension(100, 160));
        jAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarClienteActionPerformed(evt);
            }
        });
        jMenuPanel.add(jAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 410, 160));

        jAgregarMascota.setBackground(new java.awt.Color(57, 230, 100));
        jAgregarMascota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAgregarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/addMascota.png"))); // NOI18N
        jAgregarMascota.setToolTipText("AGREGAR MASCOTA");
        jAgregarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jAgregarMascota.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarMascotaActionPerformed(evt);
            }
        });
        jMenuPanel.add(jAgregarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, 110));

        jHistorial.setBackground(new java.awt.Color(209, 17, 65));
        jHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/historial.png"))); // NOI18N
        jHistorial.setToolTipText("HISTORIAL MEDICO");
        jHistorial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jHistorial.setMinimumSize(new java.awt.Dimension(10, 10));
        jHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHistorialActionPerformed(evt);
            }
        });
        jMenuPanel.add(jHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 200, 110));

        jAgenda.setBackground(new java.awt.Color(136, 223, 153));
        jAgenda.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/agenda.png"))); // NOI18N
        jAgenda.setToolTipText("AGENDA");
        jAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jAgenda.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgendaActionPerformed(evt);
            }
        });
        jMenuPanel.add(jAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 170));

        jAgregarVisita.setBackground(new java.awt.Color(125, 60, 152));
        jAgregarVisita.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jAgregarVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/visita.png"))); // NOI18N
        jAgregarVisita.setToolTipText("REGISTRAR VISITA");
        jAgregarVisita.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jAgregarVisita.setMinimumSize(new java.awt.Dimension(10, 10));
        jAgregarVisita.setPreferredSize(new java.awt.Dimension(20, 300));
        jAgregarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarVisitaActionPerformed(evt);
            }
        });
        jMenuPanel.add(jAgregarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 240, 220));

        jModo.setBackground(new java.awt.Color(85, 85, 85));
        jModo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jModo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/modoOscuro.png"))); // NOI18N
        jModo.setToolTipText("MODO OSCURO/CLARO");
        jModo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jModo.setMinimumSize(new java.awt.Dimension(0, 0));
        jModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModoActionPerformed(evt);
            }
        });
        jMenuPanel.add(jModo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 240, 123));

        jGestionTratamiento.setBackground(new java.awt.Color(255, 105, 180));
        jGestionTratamiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jGestionTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/addTratamiento.png"))); // NOI18N
        jGestionTratamiento.setToolTipText("AGREGAR TRATAMIENTO");
        jGestionTratamiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jGestionTratamiento.setMinimumSize(new java.awt.Dimension(0, 0));
        jGestionTratamiento.setOpaque(false);
        jGestionTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionTratamientoActionPerformed(evt);
            }
        });
        jMenuPanel.add(jGestionTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 210, 330));

        jBalance.setBackground(new java.awt.Color(240, 150, 50));
        jBalance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/balance.png"))); // NOI18N
        jBalance.setToolTipText("BALANCE");
        jBalance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBalance.setMinimumSize(new java.awt.Dimension(0, 0));
        jBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalanceActionPerformed(evt);
            }
        });
        jMenuPanel.add(jBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 200, 190));

        jAbout.setBackground(new java.awt.Color(22, 141, 79));
        jAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/About.png"))); // NOI18N
        jAbout.setToolTipText("ABOUT");
        jAbout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jAbout.setMinimumSize(new java.awt.Dimension(0, 0));
        jAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutActionPerformed(evt);
            }
        });
        jMenuPanel.add(jAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 240, 120));

        jLogOut.setBackground(new java.awt.Color(128, 0, 32));
        jLogOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/cerrarSesion.png"))); // NOI18N
        jLogOut.setToolTipText("CERRAR SESION");
        jLogOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLogOut.setMinimumSize(new java.awt.Dimension(0, 0));
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });
        jMenuPanel.add(jLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 160, 140));

        jBienvenida.setBackground(new java.awt.Color(0, 99, 177));
        jBienvenida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBienvenida.setPreferredSize(new java.awt.Dimension(400, 500));
        jBienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBienvenido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBienvenida.add(jBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBienvenida.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 50));

        jLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBienvenida.add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 120));

        jMenuPanel.add(jBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 270));

        jAdministracion.setBackground(new java.awt.Color(255, 204, 102));
        jAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/administracion.png"))); // NOI18N
        jAdministracion.setToolTipText("Administracion");
        jAdministracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jAdministracion.setOpaque(false);
        jAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdministracionActionPerformed(evt);
            }
        });
        jMenuPanel.add(jAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 150, 160));

        getContentPane().add(jMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));
        jMenuPanel.getAccessibleContext().setAccessibleDescription("");

        jPanelAlternativo.setBackground(new java.awt.Color(255, 255, 51));
        jPanelAlternativo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelAlternativo.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanelAlternativo.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanelAlternativo.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanelAlternativo.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelAlternativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgendaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        Agenda nuevo = new Agenda(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgendaActionPerformed

    private void jAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarClienteActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionCliente nuevo = new GestionCliente(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarClienteActionPerformed

    private void jHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHistorialActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        Historial nuevo = new Historial(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jHistorialActionPerformed

    private void jGestionTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionTratamientoActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionTratamiento nuevo = new GestionTratamiento(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jGestionTratamientoActionPerformed

    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
        Login login = new Login();
        login.repaint();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLogOutActionPerformed

    private void jAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        About nuevo = new About(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAboutActionPerformed

    private void jAgregarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarVisitaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionVisita nuevo = new GestionVisita(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarVisitaActionPerformed

    private void jAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarMascotaActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        GestionMascota nuevo = new GestionMascota(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAgregarMascotaActionPerformed

    private void jModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModoActionPerformed
        modo = !modo;
        actualizarApariencia(modo);
    }//GEN-LAST:event_jModoActionPerformed

    private void jBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalanceActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        Balance nuevo = new Balance(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jBalanceActionPerformed

    private void jAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdministracionActionPerformed
        jPanelAlternativo.removeAll();
        jPanelAlternativo.repaint();
        Administracion nuevo = new Administracion(modo, empleado);
        jMenuPanel.setVisible(false);
        jPanelAlternativo.add(nuevo, BorderLayout.CENTER);
        nuevo.setVisible(true);
        jPanelAlternativo.setVisible(true);
    }//GEN-LAST:event_jAdministracionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
//                    Empleado nuevo = new Empleado("Anonimo", "Contraseña", "Masculino", 1);
//                    new Menu(false, nuevo).setVisible(true);
                    //DECOMENTAR AL FINAL PARA QUE FUNCIONE EL LOGIN
                Login login = new Login();
               login.setVisible(true);
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
    private javax.swing.JButton jAbout;
    private javax.swing.JButton jAdministracion;
    private javax.swing.JButton jAgenda;
    private javax.swing.JButton jAgregarCliente;
    private javax.swing.JButton jAgregarMascota;
    private javax.swing.JButton jAgregarVisita;
    private javax.swing.JButton jBalance;
    private javax.swing.JPanel jBienvenida;
    private javax.swing.JLabel jBienvenido;
    private javax.swing.JLabel jFecha;
    private javax.swing.JButton jGestionTratamiento;
    private javax.swing.JButton jHistorial;
    private javax.swing.JButton jLogOut;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jMenuPanel;
    private javax.swing.JButton jModo;
    private javax.swing.JPanel jPanelAlternativo;
    private javax.swing.JPanel jPanelHorario;
    private javax.swing.JLabel jReloj;
    private javax.swing.JLabel jUsuario;
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

    public void getUsuario(Empleado empleado2) {
        this.empleado = empleado2;
        if (empleado != null) {
            if (empleado.getAcceso() == 1) {
                if (empleado.getSexo().equalsIgnoreCase("Masculino")) {
                    jBienvenido.setText("BIENVENIDO");
                    jUsuario.setText(empleado.getUsuario());
                    jLogo.setIcon(administrador);
                } else {
                    jBienvenido.setText("BIENVENIDA");
                    jUsuario.setText(empleado.getUsuario());
                    jLogo.setIcon(administrador);
                }

            } else {
                if (empleado2.getSexo().equalsIgnoreCase("Masculino")) {
                    jBienvenido.setText("BIENVENIDO");
                    jUsuario.setText(empleado.getUsuario());
                    jLogo.setIcon(hombre);
                    jAdministracion.setEnabled(false);

                } else {
                    jBienvenido.setText("BIENVENIDA");
                    jUsuario.setText(empleado.getUsuario());
                    jLogo.setIcon(mujer);
                    jAdministracion.setEnabled(false);

                }
            }
        } else {
            System.out.println("Empleado null");
        }
    }

    public void actualizarApariencia(boolean modoOscuro) {
        if (modo) {
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
                jAdministracion.setBackground(color);
                jPanelAlternativo.setBackground(color);
                jPanelHorario.setBackground(color);
                jReloj.setBackground(color);
//                jPublicidad.setBackground(color);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(Menu.this);
                Color fondo = new Color(0, 133, 94);
                jMenuPanel.setBackground(fondo);
                jMenuPanel.setBackground(fondo);
                Color fondoAgenda = new Color(136, 223, 153);
                jAgenda.setBackground(fondoAgenda);
                Color fondoAbout = new Color(22, 141, 79);
                jAbout.setBackground(fondoAbout);
                Color fondoCliente = new Color(0, 120, 215);
                jAgregarCliente.setBackground(fondoCliente);
                Color fondoMascota = new Color(57, 230, 100);
                jAgregarMascota.setBackground(fondoMascota);
                Color fondoVisita = new Color(125, 60, 152);
                jAgregarVisita.setBackground(fondoVisita);
                Color fondoBalance = new Color(240, 150, 50);
                jBalance.setBackground(fondoBalance);
                Color fondoBienvenida = new Color(0, 99, 177);
                jBienvenida.setBackground(fondoBienvenida);
                Color fondoTratamiento = new Color(255, 105, 180);
                jGestionTratamiento.setBackground(fondoTratamiento);
                Color fondoHistorial = new Color(209, 17, 65);
                jHistorial.setBackground(fondoHistorial);
                Color fondoLogout = new Color(128, 0, 32);
                jLogOut.setBackground(fondoLogout);
                Color fondoModo = new Color(85, 85, 85);
                jModo.setBackground(fondoModo);
                Color fondoAdmin = new Color(255,204,102);
                jAdministracion.setBackground(fondoAdmin);
                Color fondoAlternativo = new Color(255, 255, 51);
                jPanelAlternativo.setBackground(fondoAlternativo);
                Color fondoHorario = new Color(120, 168, 255);
                jPanelHorario.setBackground(fondoHorario);
                Color fondoPublicidad = new Color(179, 158, 181);
//                jPublicidad.setBackground(fondoPublicidad);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
