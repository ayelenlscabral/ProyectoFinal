package veterinaria.vistas;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.AccesoADatos.EmpleadoData;
import veterinaria.Entidades.Empleado;

public class Administracion extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 100) {
                return true;
            } else {
                return false;
            }
        }
    };

    public class PasswordCellRenderer extends DefaultTableCellRenderer {

        @Override
        protected void setValue(Object value) {
            if (value != null) {
                String password = value.toString();
                StringBuilder maskedPassword = new StringBuilder(password.length());
                for (int i = 0; i < password.length(); i++) {
                    maskedPassword.append('*');
                }
                value = maskedPassword.toString();
            }
            super.setValue(value);
        }
    }
    private boolean modo;
    private EmpleadoData empData = new EmpleadoData();
    private Empleado empleado;

    public Administracion(boolean modo, Empleado empleado) {
        initComponents();
        actualizarApariencia(modo);
        cabecera();
        cargarTabla();
        this.modo = modo;
        this.empleado = empleado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupSexo = new javax.swing.ButtonGroup();
        GroupAcceso = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jPanelCrear = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jFemenino = new javax.swing.JCheckBox();
        jLSexo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMasculino = new javax.swing.JCheckBox();
        jContraseña = new javax.swing.JPasswordField();
        jLContraseña = new javax.swing.JLabel();
        jLAcceso = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jEmpleado = new javax.swing.JCheckBox();
        jAdministrador = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jVolver = new javax.swing.JButton();
        jPanelAcceso = new javax.swing.JPanel();
        jPanelFiltro = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFiltro = new javax.swing.JTextField();
        jLUsuario = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabla.setBackground(new java.awt.Color(255, 166, 35));
        jTabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Contraseña", "Sexo", "Acceso"
            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 770, 120));

        jPanelCrear.setBackground(new java.awt.Color(255, 204, 102));
        jPanelCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FEMENINO");
        jPanelCrear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 90, 30));

        GroupSexo.add(jFemenino);
        jFemenino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFemenino.setOpaque(false);
        jPanelCrear.add(jFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 30, 30));

        jLSexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLSexo.setText("SEXO :");
        jPanelCrear.add(jLSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("MASCULINO");
        jPanelCrear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 30));

        GroupSexo.add(jMasculino);
        jMasculino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMasculino.setOpaque(false);
        jPanelCrear.add(jMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 30));

        jContraseña.setBackground(new java.awt.Color(255, 166, 35));
        jContraseña.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanelCrear.add(jContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 240, 40));

        jLContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLContraseña.setText("CONTRASEÑA :");
        jPanelCrear.add(jLContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, 50));

        jLAcceso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLAcceso.setText("ACCESO :");
        jPanelCrear.add(jLAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 106));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("EMPLEADO");
        jPanelCrear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 90, 40));

        GroupAcceso.add(jEmpleado);
        jEmpleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jEmpleado.setOpaque(false);
        jPanelCrear.add(jEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 20, 20));

        GroupAcceso.add(jAdministrador);
        jAdministrador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jAdministrador.setOpaque(false);
        jPanelCrear.add(jAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 20, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ADMINISTRADOR");
        jPanelCrear.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, 60));

        jLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        jLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/limpiar.png"))); // NOI18N
        jLimpiar.setToolTipText("LIMPIAR");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });
        jPanelCrear.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 60));

        jGuardar.setBackground(new java.awt.Color(91, 220, 107));
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/guardar.png"))); // NOI18N
        jGuardar.setToolTipText("GUARDAR");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanelCrear.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 60));

        jEliminar.setBackground(new java.awt.Color(232, 62, 62));
        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/eliminar.png"))); // NOI18N
        jEliminar.setToolTipText("ELIMINAR");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanelCrear.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 120, 60));

        jVolver.setBackground(new java.awt.Color(50, 119, 242));
        jVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jVolver.setToolTipText("VOLVER");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        jPanelCrear.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 190, 60));

        add(jPanelCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 259, 780, 735));

        jPanelAcceso.setBackground(new java.awt.Color(255, 204, 102));
        jPanelAcceso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 482, 660, 512));

        jPanelFiltro.setBackground(new java.awt.Color(255, 204, 102));
        jPanelFiltro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanelFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 259, 660, 203));

        jTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTitulo.setText("CREAR EMPLEADO");
        add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FILTRO POR USUARIO : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 200, 70));

        jFiltro.setBackground(new java.awt.Color(255, 166, 35));
        jFiltro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFiltroKeyReleased(evt);
            }
        });
        add(jFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 200, 30));

        jLUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLUsuario.setText("USUARIO :");
        add(jLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 50));

        jUsuario.setBackground(new java.awt.Color(255, 166, 35));
        jUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 240, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose(); // Cierra el panel actual
    }//GEN-LAST:event_jVolverActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        String usuario = jUsuario.getText();
        String contraseña = jContraseña.getText();
        Empleado nuevo = new Empleado();
        int acceso;
        String sexo;
        if (usuario.isEmpty() || !comprobar()) {
            if (!usuario.equalsIgnoreCase("")) {
                if (!contraseña.isEmpty()) {
                    if (GroupSexo.getSelection() != null) {
                        if (GroupAcceso.getSelection() != null) {
                            nuevo.setUsuario(usuario);
                            nuevo.setContrasenia(contraseña);
                            if (jMasculino.isSelected()) {
                                nuevo.setSexo("Masculino");
                            } else {
                                nuevo.setSexo("Femenino");
                            }
                            if (jAdministrador.isSelected()) {
                                nuevo.setAcceso(1);
                            } else {
                                nuevo.setAcceso(0);
                            }
                            if (usuario.length() <= 30) {
                                if (contraseña.length() <= 30) {
                                    empData.agregarEmpleado(nuevo);
                                    jUsuario.setText("");
                                    jContraseña.setText("");
                                    GroupSexo.clearSelection();
                                    GroupAcceso.clearSelection();
                                    LimpiarTabla();
                                    cargarTabla();
                                } else {
                                    JOptionPane.showMessageDialog(this, "La contraseña no puede tener mas de 30 caracteres");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "El usuario no puede tener mas de 30 caracteres");
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Debes seleccionar el nivel de acceso");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Debes seleccionar el sexo");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Debes agregar una contraseña");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debes agregar un nombre de usuario");
            }
        } else {
            if (comprobar()) {
                if (!contraseña.isEmpty()) {
                    if (GroupSexo.getSelection() != null) {
                        if (GroupAcceso.getSelection() != null) {
                            nuevo.setUsuario(usuario);
                            nuevo.setContrasenia(contraseña);
                            if (jMasculino.isSelected()) {
                                nuevo.setSexo("Masculino");
                            } else {
                                nuevo.setSexo("Femenino");
                            }
                            if (jAdministrador.isSelected()) {
                                nuevo.setAcceso(1);
                            } else {
                                nuevo.setAcceso(0);
                            }
                            if (usuario.length() <= 30) {
                                if (contraseña.length() <= 30) {
                                    empData.modificarEmpleado(nuevo);
                                    jUsuario.setText("");
                                    jContraseña.setText("");
                                    GroupSexo.clearSelection();
                                    GroupAcceso.clearSelection();
                                    LimpiarTabla();
                                    cargarTabla();
                                } else {
                                    JOptionPane.showMessageDialog(this, "La contraseña no puede tener mas de 30 caracteres");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "El usuario no puede tener mas de 30 caracteres");
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Debes seleccionar el nivel de acceso");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Debes seleccionar el sexo");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Debes agregar una contraseña");
                }
            }
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFiltroKeyReleased
        LimpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_jFiltroKeyReleased

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        if (comprobar()) {
       empData.eliminarEmpleado(jUsuario.getText());
        jUsuario.setText("");
        jContraseña.setText("");
        GroupSexo.clearSelection();
        GroupAcceso.clearSelection();
        LimpiarTabla();
        cargarTabla();
        }else{
        JOptionPane.showMessageDialog(this, "El usuario no existe en la base de datos");
        }

    }//GEN-LAST:event_jEliminarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        jUsuario.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 0)));
        jContraseña.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 1)));
        if (String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 2)).equalsIgnoreCase("Masculino")) {
            jMasculino.setSelected(true);
        } else {
            jFemenino.setSelected(true);
        }
        if (String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 3)).equalsIgnoreCase("Administrador")) {
            jAdministrador.setSelected(true);
        } else {
            jEmpleado.setSelected(true);
        }

    }//GEN-LAST:event_jTablaMouseClicked

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        jUsuario.setText("");
        jContraseña.setText("");
        GroupSexo.clearSelection();
        GroupAcceso.clearSelection();
        LimpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed

    }//GEN-LAST:event_jUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupAcceso;
    private javax.swing.ButtonGroup GroupSexo;
    private javax.swing.JCheckBox jAdministrador;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JButton jEliminar;
    private javax.swing.JCheckBox jEmpleado;
    private javax.swing.JCheckBox jFemenino;
    private javax.swing.JTextField jFiltro;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLAcceso;
    private javax.swing.JLabel jLContraseña;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JCheckBox jMasculino;
    private javax.swing.JPanel jPanelAcceso;
    private javax.swing.JPanel jPanelCrear;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JTextField jUsuario;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
private void cabecera() {
        modelo.addColumn("USUARIO");
        modelo.addColumn("CONTRASEÑA");
        modelo.addColumn("SEXO");
        modelo.addColumn("ACCESO");
        jTabla.setModel(modelo);
    }

    private void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        int filas = jTabla.getRowCount();
        for (int a = 0; filas > a; a++) {
            modelo.removeRow(0);
        }
    }

    private void cargarTabla() {
        jTabla.getColumnModel().getColumn(1).setCellRenderer(new PasswordCellRenderer());
        for (Empleado empleado2 : empData.listarEmpleados()) {
            if (empleado2 != null) {
                if (empleado2.getUsuario().toLowerCase().startsWith(jFiltro.getText().toLowerCase())) {
                    String accesoText = (empleado2.getAcceso() == 0) ? "Empleado" : "Administrador";
                    modelo.addRow(new Object[]{
                        empleado2.getUsuario(),
                        empleado2.getContrasenia(),
                        empleado2.getSexo(),
                        //                        empleado2.getAcceso(),
                        accesoText
                    });

                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay empleados");
                break;
            }
        }
    }

    private void actualizarApariencia(boolean modo) {
        if (modo) {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
                Color color = new Color(52, 55, 59);
                this.setBackground(color);
                jPanelAcceso.setBackground(color);
                jPanelCrear.setBackground(color);
                jPanelFiltro.setBackground(color);
                jGuardar.setBackground(color);
                jEliminar.setBackground(color);
                jVolver.setBackground(color);
                jLimpiar.setBackground(color);
                jTabla.setBackground(color);
                jScrollPane1.setBackground(color);
                jTabla.setBackground(color);
                jUsuario.setBackground(color);
                jContraseña.setBackground(color);
                jFiltro.setBackground(color);

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

    public boolean comprobar() {
        boolean validador = false;
        for (Empleado trata : empData.listarEmpleados()) {
            if (trata.getUsuario().equalsIgnoreCase(jUsuario.getText())) {
                validador = true;
            }
        }
        return validador;
    }
}
