package veterinaria.vistas;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.AccesoADatos.MascotaData;
import veterinaria.AccesoADatos.TratamientoData;
import veterinaria.AccesoADatos.VisitaData;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Visita;

public class GestionVisita extends javax.swing.JPanel {

    private ClienteData clData = new ClienteData();
    private MascotaData maData = new MascotaData();
    private TratamientoData trData = new TratamientoData();
    private VisitaData viData = new VisitaData();
    private Cliente client = new Cliente();
    private Mascota mascota = new Mascota();
    private Tratamiento tr = new Tratamiento();
    private Visita visit = new Visita();

    public GestionVisita() {
        initComponents();
        cabecera();
        llenarTratamiento();
        llenarMascota2();
        jCoincidencias.setVisible(false);
        jCoincidencias.setOpaque(true);
        jidCliente.setOpaque(true);
        jDatos.setOpaque(true);
        jimporte.setOpaque(true);
        jcontado.setSelected(true);
    }
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void llenarMascota() {
        if (!jidCliente.getText().isEmpty()) {
            int n = Integer.parseInt(jidCliente.getText());
            for (Mascota listar : maData.listarMascotasXCliente(n)) {
                jMascota1.addItem(listar);
            }
        }
        jMascota1.setSelectedIndex(-1);
    }

    private void llenarMascota2() {
        for (Mascota listar : maData.listarMascotas()) {
            jMascota2.addItem(listar);
        }
        jMascota2.setSelectedIndex(-1);
    }

    private void llenarTratamiento() {
        for (Tratamiento listar : trData.listarTratamientoActivos()) {
            jTratamiento.addItem(listar);
        }
        jTratamiento.setSelectedIndex(-1);
    }

    private void cabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Alias Mascota");
        modelo.addColumn("Peso actual");
        modelo.addColumn("Peso Promedio");
        modelo.addColumn("Tratamiento");
        modelo.addColumn("observacion");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMascota1 = new javax.swing.JComboBox<>();
        jTratamiento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jObservacion = new javax.swing.JTextArea();
        jcontado = new javax.swing.JRadioButton();
        jtarjeta = new javax.swing.JRadioButton();
        jimporte = new javax.swing.JLabel();
        jDatos = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jpeso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jMascota2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jdni = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jidCliente = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCoincidencias = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTRAR VISITA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 17, -1, 41));

        jLabel2.setText("Buscar Cliente por DNI:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 82, -1, -1));

        jLabel3.setText("Elegir Mascota:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 80, -1, -1));

        jLabel4.setText("Datos Mascota:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 151, -1, -1));

        jLabel5.setText("Tratamiento a realizar:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel6.setText("Importe:    $");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, 68, -1));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 652, -1, -1));

        jLabel8.setText("Peso Actual");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, -1, -1));

        jLabel9.setText("Fecha de visita");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 196, -1, -1));

        jLabel10.setText("Observacion:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 295, -1, -1));

        jMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMascota1ActionPerformed(evt);
            }
        });
        add(jMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 75, 200, -1));

        jTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTratamientoActionPerformed(evt);
            }
        });
        add(jTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 195, 202, -1));

        jObservacion.setColumns(20);
        jObservacion.setRows(5);
        jScrollPane1.setViewportView(jObservacion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 294, 445, 24));

        jcontado.setText("Contado");
        jcontado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontadoActionPerformed(evt);
            }
        });
        add(jcontado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 239, -1, -1));

        jtarjeta.setText("Tarjeta");
        jtarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtarjetaActionPerformed(evt);
            }
        });
        add(jtarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 239, -1, -1));

        jimporte.setBackground(java.awt.SystemColor.controlShadow);
        add(jimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 245, 49, 16));

        jDatos.setBackground(java.awt.SystemColor.controlShadow);
        jDatos.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        add(jDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 142, 782, 30));
        add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpesoActionPerformed(evt);
            }
        });
        add(jpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 192, 72, -1));

        jLabel12.setText("kg");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 190, -1, 29));

        jGuardar.setText("GUARDAR VISITA");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 258, -1, 90));

        jButton2.setText("Volver al Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 629, 125, 56));

        jLabel11.setText("MOSTRAR VISITAS POR MASCOTA");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 396, 218, 50));

        jMascota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMascota2ActionPerformed(evt);
            }
        });
        add(jMascota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 452, 196, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 496, 900, 115));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 366, 988, 12));

        jdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdniKeyReleased(evt);
            }
        });
        add(jdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 78, 131, -1));

        jBuscar.setText("buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 74, 94, -1));

        jidCliente.setBackground(java.awt.SystemColor.controlShadow);
        add(jidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 75, 90, 27));

        jLabel13.setText("Codigo:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 79, -1, 22));

        jCoincidencias.setBackground(new java.awt.Color(255, 255, 255));
        jCoincidencias.setForeground(new java.awt.Color(0, 51, 204));
        jCoincidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCoincidenciasMouseClicked(evt);
            }
        });
        add(jCoincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 131, 24));
    }// </editor-fold>//GEN-END:initComponents


    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        jCoincidencias.setVisible(false);
        jDatos.setText("");
        jMascota1.removeAllItems();
        jpeso.setText("");
        jDate.setDate(null);
        int dni = (int) Integer.parseInt(jdni.getText());
        client = clData.buscarCliente(dni);
        if (!(client == null)) {
            jidCliente.setText(Integer.toString(client.getIdCliente()));
        }
        llenarMascota();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMascota1ActionPerformed
        if (jMascota1.getSelectedIndex() == -1) {
            jDatos.setText("");
        } else {
            mascota = (Mascota) jMascota1.getSelectedItem();
            jDatos.setText(mascota.toString() + ",  " + mascota.getSexo() + "  , " + mascota.getColorPelo() + "  ,Peso Promedio:" + mascota.getPesoPromedio() + "kg  ,  Nacio el: " + mascota.getFechaNac());
        }
    }//GEN-LAST:event_jMascota1ActionPerformed

    private void jMascota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMascota2ActionPerformed
        borrarFilas();
        if (jMascota2.getSelectedIndex() == -1) {
        } else {
            mascota = new Mascota();
            mascota = (Mascota) jMascota2.getSelectedItem();
            int id = mascota.getIdMascota();

            for (Visita aux : viData.listarVisitaXMascota(id)) {
                Mascota aux2 = maData.buscarMascota(aux.getMascota().getIdMascota());
                Tratamiento aux3 = trData.buscarTratamiento(aux.getTratamiento().getIdTratamiento());
                
                modelo.addRow(new Object[]{
                    aux.getIdVisita(),
                    aux.getFechaTratamiento().toString(),
                    aux2.getAlias(),
                    aux.getPesoActual(),
                    aux2.getPesoPromedio(),
                    aux3.getTipoTratamiento(),
                    aux.getObservaciones()});
            }

        }
    }//GEN-LAST:event_jMascota2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTratamientoActionPerformed
        if (jTratamiento.getSelectedIndex() == -1) {
            jimporte.setText("");
        } else {
            Tratamiento tr = new Tratamiento();
            tr = (Tratamiento) jTratamiento.getSelectedItem();
            jimporte.setText(Double.toString(tr.getImporte()));
        }
    }//GEN-LAST:event_jTratamientoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        double peso = Double.parseDouble(jpeso.getText());
        mascota = (Mascota) jMascota1.getSelectedItem();
//        double promedio=(mascota.getPesoActual()+peso)/2;
//        mascota.setPesoPromedio(promedio);

        tr = (Tratamiento) jTratamiento.getSelectedItem();
        LocalDate fecha = (jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        String obs = jObservacion.getText();

        visit.setMascota(mascota);
        visit.setFechaTratamiento(fecha);
        visit.setPesoActual(peso);
        visit.setObservaciones(obs);
        visit.setTratamiento(tr);

        viData.guardarVisita(visit);
        JOptionPane.showMessageDialog(null, "se guardo visita");
        viData.sacarPesoPromedio(mascota);
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jtarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtarjetaActionPerformed
        jcontado.setSelected(false);
        jtarjeta.setSelected(true);
    }//GEN-LAST:event_jtarjetaActionPerformed

    private void jcontadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontadoActionPerformed
        jcontado.setSelected(true);
        jtarjeta.setSelected(false);
    }//GEN-LAST:event_jcontadoActionPerformed

    private void jpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpesoActionPerformed

    private void jdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdniKeyReleased
        jCoincidencias.setVisible(false);
        for (Cliente aux : clData.listarClientes()) {
            String n = Integer.toString(aux.getDni());
            if (n.startsWith(jdni.getText())) {
                jCoincidencias.setVisible(true);
                jCoincidencias.setText(n);
            }
        }

    }//GEN-LAST:event_jdniKeyReleased

    private void jCoincidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCoincidenciasMouseClicked
        jCoincidencias.setVisible(false);
        jdni.setText(jCoincidencias.getText());
    }//GEN-LAST:event_jCoincidenciasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jCoincidencias;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jDatos;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<Mascota> jMascota1;
    private javax.swing.JComboBox<Mascota> jMascota2;
    private javax.swing.JTextArea jObservacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Tratamiento> jTratamiento;
    private javax.swing.JRadioButton jcontado;
    private javax.swing.JTextField jdni;
    private javax.swing.JLabel jidCliente;
    private javax.swing.JLabel jimporte;
    private javax.swing.JTextField jpeso;
    private javax.swing.JRadioButton jtarjeta;
    // End of variables declaration//GEN-END:variables
}
