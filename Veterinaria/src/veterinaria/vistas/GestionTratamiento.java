package veterinaria.vistas;

import java.awt.Color;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.DefaultTableModel;
import veterinaria.AccesoADatos.TratamientoData;
import veterinaria.AccesoADatos.VisitaData;
import veterinaria.Entidades.Empleado;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Visita;

public class GestionTratamiento extends javax.swing.JPanel {

    private boolean modo;
    private Empleado empleado;
    VisitaData visitaData = new VisitaData();
    TratamientoData trataData = new TratamientoData();
    Tratamiento trata = new Tratamiento();
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

    public GestionTratamiento(boolean modo, Empleado empleado) {
        UIManager.put("ComboBox.background", new ColorUIResource(Color.BLACK));
        initComponents();
        actualizarApariencia(modo);
        cabecera();
        cargarTabla();
        cargarCombos();
        jTipo.setSelectedIndex(-1);
        jFiltroTipo.setSelectedIndex(-1);
        this.modo = modo;
        this.empleado = empleado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jDescripcion = new javax.swing.JTextField();
        jImporte = new javax.swing.JTextField();
        jEstado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTipo = new javax.swing.JComboBox<>();
        jFiltroTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jId = new javax.swing.JLabel();
        jCategoria = new javax.swing.JButton();
        jEliminarCate = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 51));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 229));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 229));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 100));

        jTabla.setBackground(new java.awt.Color(255, 128, 171));
        jTabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTabla.setMinimumSize(new java.awt.Dimension(100, 100));
        jTabla.setOpaque(false);
        jTabla.getTableHeader().setReorderingAllowed(false);
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 780, 140));

        jGuardar.setBackground(new java.awt.Color(91, 220, 107));
        jGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/guardar.png"))); // NOI18N
        jGuardar.setToolTipText("GUARDAR");
        jGuardar.setMaximumSize(new java.awt.Dimension(500, 500));
        jGuardar.setMinimumSize(new java.awt.Dimension(10, 10));
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 516, 251, 53));

        jSalir.setBackground(new java.awt.Color(50, 119, 242));
        jSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jSalir.setToolTipText("VOLVER");
        jSalir.setMinimumSize(new java.awt.Dimension(10, 10));
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 516, 148, 53));

        jEliminar.setBackground(new java.awt.Color(232, 62, 62));
        jEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/eliminar.png"))); // NOI18N
        jEliminar.setToolTipText("ELIMINAR");
        jEliminar.setMaximumSize(new java.awt.Dimension(320000, 320000));
        jEliminar.setMinimumSize(new java.awt.Dimension(10, 10));
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 516, 113, 53));

        jDescripcion.setBackground(new java.awt.Color(255, 128, 171));
        jDescripcion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jDescripcion.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 339, 290, 75));

        jImporte.setBackground(new java.awt.Color(255, 128, 171));
        jImporte.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jImporte.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 420, 290, 45));

        jEstado.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jEstado.setMaximumSize(new java.awt.Dimension(32000, 32000));
        jEstado.setMinimumSize(new java.awt.Dimension(10, 10));
        jEstado.setOpaque(false);
        jPanel1.add(jEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 483, 253, 23));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tipo de tratamiento:");
        jLabel1.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, 218, 75));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Descripcion: ");
        jLabel2.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 341, 218, 73));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Importe:");
        jLabel3.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 218, 45));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Estado:");
        jLabel4.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 493, 218, 13));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Filtrar por tipo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 160, 33));

        jTipo.setBackground(new java.awt.Color(255, 128, 171));
        jTipo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTipo.setSelectedItem(-1);
        jPanel1.add(jTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 262, 290, 75));

        jFiltroTipo.setBackground(new java.awt.Color(255, 128, 171));
        jFiltroTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFiltroTipo.setToolTipText("");
        jFiltroTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFiltroTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jFiltroTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 180, 23));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 218, 19));

        jId.setBackground(new java.awt.Color(255, 128, 171));
        jId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jId.setOpaque(true);
        jPanel1.add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 214, 290, 30));

        jCategoria.setBackground(new java.awt.Color(97, 209, 120));
        jCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/agregarCategoria.png"))); // NOI18N
        jCategoria.setToolTipText("NUEVA CATEGORIA");
        jCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 277, 50, 60));

        jEliminarCate.setBackground(new java.awt.Color(206, 61, 61));
        jEliminarCate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/deleteCategoria.png"))); // NOI18N
        jEliminarCate.setToolTipText("ELIMINAR CATEGORIA");
        jEliminarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarCateActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 355, 50, 59));

        jLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        jLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/limpiar.png"))); // NOI18N
        jLimpiar.setToolTipText("LIMPIAR");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 516, 208, 53));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 578));
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose(); // Cierra el panel actual
    }//GEN-LAST:event_jSalirActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed

        if (jId.getText().isEmpty() || !comprobar()) {
            try {
                trata.setTipoTratamiento(jTipo.getSelectedItem().toString());
                trata.setDescripcion(jDescripcion.getText());
                double importe = Double.parseDouble(jImporte.getText());
                trata.setImporte(importe);
                trata.setEstado(jEstado.isSelected());
                if (trata.getDescripcion().length() <= 250 && trata.getImporte() <= Double.MAX_VALUE) {
                    trataData.guardarNuevoTratamiento(trata);
                    cargarTabla();
                    jTipo.setSelectedIndex(-1);
                    jFiltroTipo.setSelectedIndex(-1);
                    jDescripcion.setText("");
                    jImporte.setText("");
                    jEstado.setSelected(false);
                    jId.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El campo descripcion solo acepta hasta 300 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo debes ingresar numeros en el campo Importe.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un tipo de tratamiento", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (comprobar()) {
                try {
                    trata.setTipoTratamiento(jTipo.getSelectedItem().toString());
                    int id = Integer.parseInt(jId.getText());
                    trata.setIdTratamiento(id);
                    trata.setDescripcion(jDescripcion.getText());
                    double importe = Double.parseDouble(jImporte.getText());
                    trata.setImporte(importe);
                    trata.setEstado(jEstado.isSelected());
                    if (trata.getDescripcion().length() <= 250 && trata.getImporte() <= Double.MAX_VALUE) {
                        trataData.modificarTratamiento(trata);
                        cargarTabla();
                        jTipo.setSelectedIndex(-1);
                        jFiltroTipo.setSelectedIndex(-1);
                        jDescripcion.setText("");
                        jImporte.setText("");
                        jEstado.setSelected(false);
                        jId.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "El campo descripcion solo acepta hasta 300 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo debes ingresar numeros en el campo Importe.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar un tipo de tratamiento", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }

    }//GEN-LAST:event_jGuardarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        jId.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 0)));
        jTipo.setSelectedItem(modelo.getValueAt(jTabla.getSelectedRow(), 1));
        jDescripcion.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 2)));
        jImporte.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 3)));
        String estado = String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 4));
        if (estado.equals("Activado")) {
            jEstado.setSelected(true);
        } else {
            jEstado.setSelected(false);
        }
    }//GEN-LAST:event_jTablaMouseClicked

    private void jFiltroTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFiltroTipoActionPerformed
        LimpiarTabla();
        cargarTabla();
        jTipo.setSelectedIndex(-1);
        jFiltroTipo.setSelectedIndex(-1);
        jDescripcion.setText("");
        jImporte.setText("");
        jEstado.setSelected(false);
        jId.setText("");
    }//GEN-LAST:event_jFiltroTipoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        boolean comprobador = false;
        int id = Integer.parseInt(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 0)));
        for (Visita visita : visitaData.listarVisita()) {
            if (visita.getTratamiento().getIdTratamiento() == id) {
                comprobador = true;
            }
        }
        if (!comprobador) {
            trataData.borrarTratamiento(id);
        } else {
            JOptionPane.showMessageDialog(null, "No puedes eliminar el tratamiento ya que se encuentran visitas vinculadas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        LimpiarTabla();
        cargarTabla();
        jTipo.setSelectedIndex(-1);
        jFiltroTipo.setSelectedIndex(-1);
        jCategoria.setText("");
        jId.setText("");
        jDescripcion.setText("");
        jImporte.setText("");
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCategoriaActionPerformed
        boolean comprobar = false;
        DefaultComboBoxModel<String> comboModel = (DefaultComboBoxModel<String>) jTipo.getModel();
        DefaultComboBoxModel<String> comboModelFiltro = (DefaultComboBoxModel<String>) jFiltroTipo.getModel();
        String categoria = JOptionPane.showInputDialog(null, "Nueva Categoria: ", "Categoria", JOptionPane.PLAIN_MESSAGE);
        if (categoria != null) {
            if (categoria.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                if (categoria.length() < 30) {
                    for (String cate : trataData.listarTipoCategoria()) {
                        if (cate.equalsIgnoreCase(categoria)) {
                            comprobar = true;
                            break;
                        }
                    }
                    if (!comprobar) {
                        trataData.guardarTipoCategoria(categoria.toUpperCase());
                        cargarCombos();
                        jTipo.setSelectedIndex(-1);
                        jFiltroTipo.setSelectedIndex(-1);
                        jCategoria.setText("");
                        jId.setText("");
                        jDescripcion.setText("");
                        jImporte.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "La categoria ya existe");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe tener 30 caracters como maximo!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Solo puedes agregar letras y espacios");
            }
        } else {
//            JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacio, vuelva a intentarlo1");
        }

    }//GEN-LAST:event_jCategoriaActionPerformed

    private void jEliminarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarCateActionPerformed
        boolean comprobar = false;
        boolean comprobar2 = false;
        DefaultComboBoxModel<String> comboModel = (DefaultComboBoxModel<String>) jTipo.getModel();
        DefaultComboBoxModel<String> comboModelFiltro = (DefaultComboBoxModel<String>) jFiltroTipo.getModel();
        String categoria = JOptionPane.showInputDialog(null, "Que categoria desea eliminar? : ", "Eliminar Categoria", JOptionPane.PLAIN_MESSAGE);
        if (categoria != null) {
            if (categoria.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                if (categoria.length() <= 30) {
                    for (String cate : trataData.listarTipoCategoria()) {
                        if (cate.equalsIgnoreCase(categoria)) {
                            comprobar2 = true;
                            for (Tratamiento trata : trataData.listarTratamientos()) {
                                if (trata.getTipoTratamiento().equalsIgnoreCase(categoria)) {
                                    comprobar = true;
                                    JOptionPane.showMessageDialog(null, "No puedes eliminar la categoria por que existen tratamientos agregados");
                                    break;
                                }
                            }
                        }
                    }
                    if (!comprobar2) {
                        JOptionPane.showMessageDialog(null, "No existe la categoria");
                    } else if (!comprobar) {
                        trataData.eliminarCategoria(categoria);
                        cargarCombos();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe tener 30 caracters como maximo!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Solo puedes agregar letras y espacios");
            }
        }
    }//GEN-LAST:event_jEliminarCateActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        LimpiarTabla();
        cargarTabla();
        jTipo.setSelectedIndex(-1);
        jFiltroTipo.setSelectedIndex(-1);
        jDescripcion.setText("");
        jImporte.setText("");
        jEstado.setSelected(false);
        jId.setText("");
    }//GEN-LAST:event_jLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCategoria;
    private javax.swing.JTextField jDescripcion;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jEliminarCate;
    private javax.swing.JCheckBox jEstado;
    private javax.swing.JComboBox<String> jFiltroTipo;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jId;
    private javax.swing.JTextField jImporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JComboBox<String> jTipo;
    // End of variables declaration//GEN-END:variables
private void cabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("TIPO DE TRATAMIENTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("IMPORTE");
        modelo.addColumn("ESTADO");
        jTabla.setModel(modelo);
    }

    private void cargarTabla() {
        for (Tratamiento tratamiento : trataData.listarTratamientos()) {

            if (jFiltroTipo.getSelectedIndex() != -1) {
                if (!jFiltroTipo.getSelectedItem().toString().equalsIgnoreCase("Todo")) {
                    if (jFiltroTipo.getSelectedItem().equals(tratamiento.getTipoTratamiento())) {
                        modelo.addRow(new Object[]{
                            tratamiento.getIdTratamiento(),
                            tratamiento.getTipoTratamiento(),
                            tratamiento.getDescripcion(),
                            tratamiento.getImporte(),
                            tratamiento.isEstado() ? "Activado" : "Desactivado"
                        });
                    }
                } else {
                    modelo.addRow(new Object[]{
                        tratamiento.getIdTratamiento(),
                        tratamiento.getTipoTratamiento(),
                        tratamiento.getDescripcion(),
                        tratamiento.getImporte(),
                        tratamiento.isEstado() ? "Activado" : "Desactivado"
                    });
                }

            } else {
                modelo.addRow(new Object[]{
                    tratamiento.getIdTratamiento(),
                    tratamiento.getTipoTratamiento(),
                    tratamiento.getDescripcion(),
                    tratamiento.getImporte(),
                    tratamiento.isEstado() ? "Activado" : "Desactivado"
                });
            }
        }
    }

    private void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        int filas = jTabla.getRowCount();
        for (int a = 0; filas > a; a++) {
            modelo.removeRow(0);
        }
    }

    private void cargarCombos() {
        jTipo.removeAllItems();
        jFiltroTipo.removeAllItems();
        for (String categoria : trataData.listarTipoCategoria()) {
            if (categoria.equalsIgnoreCase("TODO")) {
                jFiltroTipo.addItem(categoria);
            } else {
                jTipo.addItem(categoria);
                jFiltroTipo.addItem(categoria);
            }

        }
        jTipo.setSelectedIndex(-1);
        jFiltroTipo.setSelectedIndex(-1);
    }

    public boolean comprobar() {
        boolean validador = false;
        int id = Integer.parseInt(jId.getText());
        for (Tratamiento trata : trataData.listarTratamientos()) {
            if (id == trata.getIdTratamiento()) {
                validador = true;
            }
        }
        return validador;
    }

    private void actualizarApariencia(boolean modo) {
        if (modo) {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
                Color color = new Color(52, 55, 59);
                jPanel1.setBackground(color);
                jCategoria.setBackground(color);
                jDescripcion.setBackground(color);
                jEliminar.setBackground(color);
                jEliminarCate.setBackground(color);
                jEstado.setBackground(color);
                jGuardar.setBackground(color);
                jImporte.setBackground(color);
                jSalir.setBackground(color);
                jScrollPane1.setBackground(color);
                jTabla.setBackground(color);
                jFiltroTipo.setBackground(color);
                jTipo.setBackground(color);
                jId.setBackground(color);
                jLimpiar.setBackground(color);
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

    public class Custom extends JComboBox<String> {

        public Custom() {
            setUI(new BasicComboBoxUI() {
                public ListCellRenderer<? super String> getRenderer() {
                    return new DefaultListCellRenderer() {
                        @Override
                        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                            Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                            if (isSelected) {
                                component.setBackground(Color.RED); // Cambia el color de fondo de los elementos seleccionados
                            }
                            return component;
                        }
                    };
                }
            });
        }
    }

}
