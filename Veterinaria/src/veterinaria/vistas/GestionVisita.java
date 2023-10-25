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
import veterinaria.Entidades.Empleado;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Visita;

public class GestionVisita extends javax.swing.JPanel {

    private Boolean modo;
    private Empleado empleado;
    private ClienteData clData = new ClienteData();
    private MascotaData maData = new MascotaData();
    private TratamientoData trData = new TratamientoData();
    private VisitaData viData = new VisitaData();
    private Cliente client = new Cliente();
    private Mascota mascota = new Mascota();
    private Tratamiento tr = new Tratamiento();
    private Visita visit = new Visita();

    public GestionVisita(boolean modo, Empleado empleado) {
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
        this.modo = modo;
        this.empleado = empleado;
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
            jTratamiento1.addItem(listar);
        }
        jTratamiento.setSelectedIndex(-1);
        jTratamiento1.setSelectedIndex(-1);
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
        jpeso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jVolver = new javax.swing.JButton();
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
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jTratamiento1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 51, 255));
        setForeground(new java.awt.Color(0, 0, 204));
        setMinimumSize(new java.awt.Dimension(586, 586));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR VISITA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 0, -1, 41));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar\n Cliente por DNI:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mascota:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 75, -1, 14));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Datos Mascota:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tratamiento");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 178, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Importe:    $");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 228, 68, -1));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Peso Actual");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 173, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de visita");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 178, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Observacion:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 280, -1, -1));

        jMascota1.setBackground(new java.awt.Color(102, 0, 102));
        jMascota1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMascota1.setForeground(new java.awt.Color(255, 255, 255));
        jMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMascota1ActionPerformed(evt);
            }
        });
        add(jMascota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 64, 200, -1));

        jTratamiento.setBackground(new java.awt.Color(102, 0, 102));
        jTratamiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        jTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTratamientoActionPerformed(evt);
            }
        });
        add(jTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 168, 190, -1));

        jObservacion.setColumns(20);
        jObservacion.setRows(5);
        jScrollPane1.setViewportView(jObservacion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 445, 24));

        jcontado.setBackground(new java.awt.Color(102, 0, 102));
        jcontado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jcontado.setForeground(new java.awt.Color(255, 255, 255));
        jcontado.setText("Contado");
        jcontado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontadoActionPerformed(evt);
            }
        });
        add(jcontado, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 227, -1, -1));

        jtarjeta.setBackground(new java.awt.Color(102, 0, 102));
        jtarjeta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jtarjeta.setText("Tarjeta");
        jtarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtarjetaActionPerformed(evt);
            }
        });
        add(jtarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 227, -1, -1));

        jimporte.setBackground(new java.awt.Color(255, 255, 255));
        jimporte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(jimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 227, 49, 16));

        jDatos.setBackground(new java.awt.Color(153, 0, 255));
        jDatos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jDatos.setForeground(new java.awt.Color(255, 255, 255));
        jDatos.setOpaque(true);
        add(jDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 670, 30));

        jpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpesoActionPerformed(evt);
            }
        });
        add(jpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 168, 72, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("kg");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 168, -1, 29));

        jGuardar.setBackground(new java.awt.Color(102, 0, 102));
        jGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/guardar.png"))); // NOI18N
        jGuardar.setToolTipText("GUARDAR");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 228, 120, 90));

        jVolver.setBackground(new java.awt.Color(102, 0, 102));
        jVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jVolver.setForeground(new java.awt.Color(255, 255, 255));
        jVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jVolver.setToolTipText("VOLVER");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 538, 125, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MOSTRAR VISITAS POR TRATAMIENTO");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 334, 240, 50));

        jMascota2.setBackground(new java.awt.Color(102, 0, 102));
        jMascota2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMascota2.setForeground(new java.awt.Color(255, 255, 255));
        jMascota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMascota2ActionPerformed(evt);
            }
        });
        add(jMascota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 374, 196, -1));

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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 417, 780, 115));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 334, 799, 12));

        jdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdniKeyReleased(evt);
            }
        });
        add(jdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 63, 125, -1));

        jBuscar.setBackground(new java.awt.Color(102, 0, 102));
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\alberto\\Documents\\NetBeansProjects\\Repositorio g1\\ProyectoFinal\\Veterinaria\\src\\veterinaria\\Recursos\\buscar.png")); // NOI18N
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 58, 47, 40));

        jidCliente.setBackground(new java.awt.Color(102, 0, 102));
        jidCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jidCliente.setForeground(new java.awt.Color(255, 255, 255));
        jidCliente.setOpaque(true);
        add(jidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 69, 70, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Codigo:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 67, -1, 22));

        jCoincidencias.setBackground(new java.awt.Color(204, 204, 255));
        jCoincidencias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCoincidencias.setOpaque(true);
        jCoincidencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCoincidenciasMouseClicked(evt);
            }
        });
        add(jCoincidencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 84, 125, 24));

        jDate.setBackground(new java.awt.Color(102, 0, 102));
        jDate.setForeground(new java.awt.Color(255, 255, 255));
        add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 168, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MOSTRAR VISITAS POR MASCOTA");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 334, 218, 50));

        jTratamiento1.setBackground(new java.awt.Color(102, 0, 102));
        jTratamiento1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTratamiento1.setForeground(new java.awt.Color(255, 255, 255));
        jTratamiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTratamiento1ActionPerformed(evt);
            }
        });
        add(jTratamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 374, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jMascota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMascota2ActionPerformed
        borrarFilas();
      
        if (jMascota2.getSelectedIndex() == -1) {
        } else {
             jTratamiento1.setSelectedIndex(-1);
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

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_jVolverActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        try {
            double peso = Double.parseDouble(jpeso.getText());
            mascota = (Mascota) jMascota1.getSelectedItem();

            tr = (Tratamiento) jTratamiento.getSelectedItem();
            LocalDate fecha = (jDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            String obs = jObservacion.getText();

            visit.setMascota(mascota);
            visit.setFechaTratamiento(fecha);
            visit.setPesoActual(peso);
            visit.setObservaciones(obs);
            visit.setTratamiento(tr);

            viData.guardarVisita(visit);
            viData.sacarPesoPromedio(mascota);

            jdni.setText("");
            jidCliente.setText("");
            jDatos.setText("");
            jMascota1.removeAllItems();
            jpeso.setText("");
            jDate.setDate(null);
            jObservacion.setText("");
            jMascota2.setSelectedIndex(-1);
            jTratamiento1.setSelectedIndex(-1);
            jTratamiento.setSelectedIndex(-1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el peso, solo ingrese numeros sin letras ni caracteres");
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpesoActionPerformed

    private void jCoincidenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCoincidenciasMouseClicked
        jCoincidencias.setVisible(false);
        jdni.setText(jCoincidencias.getText());
    }//GEN-LAST:event_jCoincidenciasMouseClicked

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        jCoincidencias.setVisible(false);
        jDatos.setText("");
        jMascota1.removeAllItems();
        jpeso.setText("");
        jDate.setDate(null);
        try {
            int dni = (int) Integer.parseInt(jdni.getText());
            client = clData.buscarCliente(dni);
            if (!(client == null)) {
                jidCliente.setText(Integer.toString(client.getIdCliente()));
            }
            llenarMascota();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el numero del dni. Recuerde no agregar letras, caracteres ni coma ni puntos");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

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

    private void jtarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtarjetaActionPerformed
        jcontado.setSelected(false);
        jtarjeta.setSelected(true);
    }//GEN-LAST:event_jtarjetaActionPerformed

    private void jcontadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontadoActionPerformed
        jcontado.setSelected(true);
        jtarjeta.setSelected(false);
    }//GEN-LAST:event_jcontadoActionPerformed

    private void jTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTratamientoActionPerformed
        if (jTratamiento.getSelectedIndex() == -1) {
            jimporte.setText("");
        } else {
            Tratamiento tr = new Tratamiento();
            tr = (Tratamiento) jTratamiento.getSelectedItem();
            jimporte.setText(Double.toString(tr.getImporte()));
        }
    }//GEN-LAST:event_jTratamientoActionPerformed

    private void jMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMascota1ActionPerformed
        if (jMascota1.getSelectedIndex() == -1) {
            jDatos.setText("");
        } else {
            mascota = (Mascota) jMascota1.getSelectedItem();
            jDatos.setText(mascota.toString() + ",  " + mascota.getSexo() + "  , " + mascota.getColorPelo() + "  ,Peso Promedio:" + mascota.getPesoPromedio() + "kg  ,  Nacio el: " + mascota.getFechaNac());
        }
    }//GEN-LAST:event_jMascota1ActionPerformed

    private void jTratamiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTratamiento1ActionPerformed
        borrarFilas();

        if ( jTratamiento1.getSelectedIndex()== -1) {
        } else {
            jMascota2.setSelectedIndex(-1);
            tr = new Tratamiento();
            tr = (Tratamiento) jTratamiento1.getSelectedItem();
            int id = tr.getIdTratamiento();

            for (Visita aux : viData.listarVisitaXTratamiento(id)) {
                Mascota aux2 = maData.buscarMascota(aux.getMascota().getIdMascota());
                

                modelo.addRow(new Object[]{
                    aux.getIdVisita(),
                    aux.getFechaTratamiento().toString(),
                    aux2.getAlias(),
                    aux.getPesoActual(),
                    aux2.getPesoPromedio(),
                    tr.getTipoTratamiento(),
                    aux.getObservaciones()});
            }
        }
    }//GEN-LAST:event_jTratamiento1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jCoincidencias;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jDatos;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JComboBox<Tratamiento> jTratamiento1;
    private javax.swing.JButton jVolver;
    private javax.swing.JRadioButton jcontado;
    private javax.swing.JTextField jdni;
    private javax.swing.JLabel jidCliente;
    private javax.swing.JLabel jimporte;
    private javax.swing.JTextField jpeso;
    private javax.swing.JRadioButton jtarjeta;
    // End of variables declaration//GEN-END:variables
}
