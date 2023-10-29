package veterinaria.vistas;

//FEDE
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Empleado;

public class GestionCliente extends javax.swing.JPanel {

    ClienteData cliente = new ClienteData();
    Cliente cli = new Cliente();
    private boolean modo;
    private Empleado empleado;

    public GestionCliente(boolean modo, Empleado empleado) {
        initComponents();
        actualizarApariencia(modo);
        this.modo = modo;
        this.empleado = empleado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtIdCliente = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtDni2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtTel = new javax.swing.JTextField();
        jtPersonaAlt = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 120, 200));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Cliente:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 120, 43));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 381, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direccion");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Persona alternativa :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        jtIdCliente.setEditable(false);
        jtIdCliente.setBackground(new java.awt.Color(0, 120, 150));
        jtIdCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtIdCliente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 170, 40));

        jbBuscar.setBackground(new java.awt.Color(0, 0, 153));
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/buscar.png"))); // NOI18N
        jbBuscar.setToolTipText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 93, 40));

        jtDni2.setBackground(new java.awt.Color(0, 120, 150));
        jtDni2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtDni2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtDni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DNI");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buscar cliente existente:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 167, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nuevo cliente:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, 130, 37));

        jtDni.setBackground(new java.awt.Color(0, 120, 150));
        jtDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtDni.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 270, 40));

        jtApellido.setBackground(new java.awt.Color(0, 120, 150));
        jtApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 270, 40));

        jtNombre.setBackground(new java.awt.Color(0, 120, 150));
        jtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 270, 40));

        jtDireccion.setBackground(new java.awt.Color(0, 120, 150));
        jtDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 270, 40));

        jtTel.setBackground(new java.awt.Color(0, 120, 150));
        jtTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtTel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 270, 40));

        jtPersonaAlt.setBackground(new java.awt.Color(0, 120, 150));
        jtPersonaAlt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtPersonaAlt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jtPersonaAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 270, 40));

        jrEstado.setBackground(new java.awt.Color(0, 102, 0));
        jrEstado.setOpaque(false);
        jPanel4.add(jrEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        jbGuardar.setBackground(new java.awt.Color(91, 220, 107));
        jbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/guardar.png"))); // NOI18N
        jbGuardar.setToolTipText("GUARDAR / MODIFICAR");
        jbGuardar.setPreferredSize(new java.awt.Dimension(71, 49));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 210, 60));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        jbLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/limpiar.png"))); // NOI18N
        jbLimpiar.setToolTipText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, 60));

        jbEliminar.setBackground(new java.awt.Color(232, 62, 62));
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/eliminar.png"))); // NOI18N
        jbEliminar.setToolTipText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 140, 60));

        jbSalir.setBackground(new java.awt.Color(50, 119, 242));
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jbSalir.setToolTipText("VOLVER");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel4.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 170, 61));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {

            int dni = Integer.parseInt(jtDni2.getText());
            Cliente cliente2 = cliente.buscarCliente(dni);

            if (!laValidacionEnBuscar()) {
                jtIdCliente.setText(Integer.toString(cliente2.getIdCliente()));
                jtDni.setText(Integer.toString(cliente2.getDni()));
                jtDni2.setText(Integer.toString(cliente2.getDni()));
                jtApellido.setText(cliente2.getApellido());
                jtNombre.setText(cliente2.getNombre());
                jtDireccion.setText(cliente2.getDireccion());
                jtTel.setText(Integer.toString((int) cliente2.getTelefono()));
                jrEstado.setSelected(cliente2.isEstado());
                jtPersonaAlt.setText(cliente2.getPersonaAlternativa());

            } else {
                JOptionPane.showMessageDialog(null, " No existe el Cliente en la Base de Datos");
            }

        } catch (NumberFormatException nf) {

            JOptionPane.showMessageDialog(null, " No se permiten letras, simbolos y espacios en este campo ");
        } catch (NullPointerException np) {

        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private boolean laValidacionEnPersona() {

        boolean validar = true;
        int dni = Integer.parseInt(jtDni.getText());

        for (Cliente cliente : cliente.listarClientes()) {
            if (dni == cliente.getDni()) {
                validar = false;
            }
        }
        return validar;
    }

    private boolean laValidacionEnBuscar() {

        boolean validar = true;
        int dni2 = Integer.parseInt(jtDni2.getText());

        for (Cliente cliente : cliente.listarClientes2()) {
            if (dni2 == cliente.getDni()) {
                validar = false;
            }
        }
        return validar;
    }

    private int obtenerId() {

        String textDni = (jtDni.getText());
        int dni = Integer.parseInt(textDni);
        int id = 0;

        for (Cliente nomb : cliente.listarClientes()) {

            if (nomb.getDni() == dni) {

                id = nomb.getIdCliente();

            }
        }

        return id;
    }

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {

            String textDni = (jtDni.getText());
            String textApellido = (jtApellido.getText());
            String textNombre = (jtNombre.getText());
            String textDireccion = (jtDireccion.getText());
            String textTel = (jtTel.getText());
            String textPersonaAlt = (jtPersonaAlt.getText());

            if (!textDni.isEmpty()) {
                if (laValidacionEnPersona()) {
                    if (!textApellido.isEmpty() && !textNombre.isEmpty()) {
                        if (!textDireccion.isEmpty() && !textTel.isEmpty()) {
                            if (!textPersonaAlt.isEmpty()) {

                                int dni = Integer.parseInt(textDni);
                                String apellido = textApellido;
                                String nombre = textNombre;
                                String direccion = textDireccion;
                                long tel = Long.parseLong(textTel);
                                String personaAlt = textPersonaAlt;

                                cli.setDni(dni);
                                cli.setApellido(apellido);
                                cli.setNombre(nombre);
                                cli.setDireccion(direccion);
                                cli.setTelefono(tel);
                                cli.setEstado(jrEstado.isSelected());
                                cli.setPersonaAlternativa(personaAlt);

                                if (apellido.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                                    if (nombre.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                                        if (personaAlt.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                                            if (textDni.length() <= 9) {
                                                cliente.guardarCliente(cli);

                                                jtIdCliente.setText("");
                                                jtDni.setText("");
                                                jtDni2.setText("");
                                                jtApellido.setText("");
                                                jtNombre.setText("");
                                                jtDireccion.setText("");
                                                jtTel.setText("");
                                                jrEstado.setSelected(false);
                                                jtPersonaAlt.setText("");

                                            } else {
                                                JOptionPane.showMessageDialog(null, " Maxima cantidad de numeros superada en dni ");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, " Solo letras en nombre de persona alternativa ");

                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, " Solo letras en nombre ");

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, " solo letras en apellido ");

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, " Falta una persona alternativa ");

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, " Direccion y Telefono deben estar completos ");

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, " Nombre y Apellido deben estar completos ");

                    }

                } else {

                    if (!laValidacionEnPersona()) {
                        if (!textApellido.isEmpty() && !textNombre.isEmpty()) {
                            if (!textDireccion.isEmpty() && !textTel.isEmpty()) {
                                if (!textPersonaAlt.isEmpty()) {
                                    int dni = Integer.parseInt(textDni);
                                    String apellido = textApellido;
                                    String nombre = textNombre;
                                    String direccion = textDireccion;
                                    long tel = Long.parseLong(textTel);
                                    String personaAlt = textPersonaAlt;

                                    cli.setIdCliente(obtenerId());
                                    cli.setDni(dni);
                                    cli.setApellido(apellido);
                                    cli.setNombre(nombre);
                                    cli.setDireccion(direccion);
                                    cli.setTelefono(tel);
                                    cli.setEstado(jrEstado.isSelected());
                                    cli.setPersonaAlternativa(personaAlt);
                                    if (apellido.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                                        if (nombre.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                                            if (personaAlt.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                                                if (textDni.length() <= 9) {
                                                    cliente.modificarCliente(cli);

                                                    jtIdCliente.setText("");
                                                    jtDni.setText("");
                                                    jtDni2.setText("");
                                                    jtApellido.setText("");
                                                    jtNombre.setText("");
                                                    jtDireccion.setText("");
                                                    jtTel.setText("");
                                                    jrEstado.setSelected(false);
                                                    jtPersonaAlt.setText("");

                                                } else {
                                                    JOptionPane.showMessageDialog(null, " Maxima cantidad de numeros superada en dni ");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, " Solo letras en nombre de persona alternativa ");

                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, " Solo letras en nombre ");

                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, " solo letras en apellido ");

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, " Falta una persona alternativa ");

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, " Direccion y Telefono deben estar completos ");

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, " Nombre y Apellido deben estar completos ");

                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, " Falta dni ");

            }

        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Falta completar algun campo ");

        } catch (NumberFormatException nf) {

            JOptionPane.showMessageDialog(null, " Verificar solo poner numeros y letras en los campos que corresponda ");

        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        // Cierra el panel 
        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        jtIdCliente.setText("");
        jtDni.setText("");
        jtDni2.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtDireccion.setText("");
        jtTel.setText("");
        jrEstado.setSelected(false);
        jtPersonaAlt.setText("");

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        try {

            String textDni = (jtDni2.getText());

            if (!textDni.isEmpty()) {

                int dni = Integer.parseInt(textDni);

                cliente.borrarCliente(dni);

                jtIdCliente.setText("");
                jtDni.setText("");
                jtDni2.setText("");
                jtApellido.setText("");
                jtNombre.setText("");
                jtDireccion.setText("");
                jtTel.setText("");
                jrEstado.setSelected(false);
                jtPersonaAlt.setText("");
            }

        } catch (NullPointerException | NumberFormatException np) {

        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void actualizarApariencia(boolean modo) {
        if (modo) {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
                Color color = new Color(52, 55, 59);

                jtIdCliente.setBackground(color);
                jtDni.setBackground(color);
                jtDni2.setBackground(color);
                jtApellido.setBackground(color);
                jtNombre.setBackground(color);
                jtDireccion.setBackground(color);
                jtTel.setBackground(color);
                jrEstado.setBackground(color);
                jtPersonaAlt.setBackground(color);
                jbGuardar.setBackground(color);
                jbEliminar.setBackground(color);
                jbLimpiar.setBackground(color);
                jbSalir.setBackground(color);
                jbBuscar.setBackground(color);
                jPanel4.setBackground(color);
                jPanel5.setBackground(color);

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDni2;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPersonaAlt;
    private javax.swing.JTextField jtTel;
    // End of variables declaration//GEN-END:variables
}
