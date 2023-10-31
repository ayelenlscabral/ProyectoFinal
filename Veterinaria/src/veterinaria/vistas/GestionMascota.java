package veterinaria.vistas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.AccesoADatos.MascotaData;
import veterinaria.AccesoADatos.VisitaData;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Empleado;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Visita;

public class GestionMascota extends javax.swing.JPanel {

    private boolean modo;
    private Empleado empleado;
    private ClienteData CliData = new ClienteData();
    private MascotaData mascotaData = new MascotaData();
    private VisitaData VisData = new VisitaData();
    private Mascota mascotaActual = new Mascota();
    private Cliente cliente = new Cliente();
    private Visita visita = new Visita();

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 100) {
                return true;
            } else {
                return false;
            }
        }
    };

    public GestionMascota(boolean modo, Empleado empleado) {
        initComponents();
        cabecera();
        actualizarApariencia(modo);
        cargarClientes();
        this.modo = modo;
        this.empleado = empleado;
        jDateFechaNac.getDateEditor().setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTRaza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTidMascota = new javax.swing.JTextField();
        jTEspecie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTPesoActual = new javax.swing.JTextField();
        jTAlias = new javax.swing.JTextField();
        jTColordePelo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioBEstado = new javax.swing.JRadioButton();
        jCheckBoxH = new javax.swing.JCheckBox();
        jCheckBoxM = new javax.swing.JCheckBox();
        jBuscar = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jDateFechaNac = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTClienteDNI = new javax.swing.JTextField();
        jBotonOk = new javax.swing.JButton();

        setBackground(new java.awt.Color(57, 230, 100));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 230, 100));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sexo :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 60, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Especie :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTRaza.setBackground(new java.awt.Color(57, 150, 100));
        jTRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTRaza.setForeground(new java.awt.Color(255, 255, 255));
        jTRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRazaActionPerformed(evt);
            }
        });
        jPanel1.add(jTRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Raza :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jTidMascota.setBackground(new java.awt.Color(57, 150, 100));
        jTidMascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTidMascota.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTidMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 13, 205, 30));

        jTEspecie.setBackground(new java.awt.Color(57, 150, 100));
        jTEspecie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTEspecie.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Id mascota :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Alias :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Color de pelo :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Estado :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Peso actual :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de nacimiento : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, 40));

        jTPesoActual.setBackground(new java.awt.Color(57, 150, 100));
        jTPesoActual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTPesoActual.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 210, 30));

        jTAlias.setBackground(new java.awt.Color(57, 150, 100));
        jTAlias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTAlias.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 210, 30));

        jTColordePelo.setBackground(new java.awt.Color(57, 150, 100));
        jTColordePelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTColordePelo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTColordePelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Seleccione cliente : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        jRadioBEstado.setBackground(new java.awt.Color(0, 153, 255));
        jRadioBEstado.setForeground(new java.awt.Color(255, 255, 51));
        jRadioBEstado.setOpaque(false);
        jPanel1.add(jRadioBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        jCheckBoxH.setBackground(new java.awt.Color(57, 230, 100));
        buttonGroup1.add(jCheckBoxH);
        jCheckBoxH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBoxH.setText("Hembra");
        jPanel1.add(jCheckBoxH, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        jCheckBoxM.setBackground(new java.awt.Color(57, 230, 100));
        buttonGroup1.add(jCheckBoxM);
        jCheckBoxM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBoxM.setText("Macho");
        jCheckBoxM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxM, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, 20));

        jBuscar.setBackground(new java.awt.Color(0, 153, 0));
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/buscar.png"))); // NOI18N
        jBuscar.setToolTipText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 80, 40));

        jComboBoxCliente.setBackground(new java.awt.Color(57, 150, 100));
        jComboBoxCliente.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxCliente.setModel(jComboBoxCliente.getModel());
        jComboBoxCliente.setSelectedItem(jComboBoxCliente);
        jComboBoxCliente.setEditor(null);
        jPanel1.add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 620, 30));

        jDateFechaNac.setBackground(new java.awt.Color(57, 150, 100));
        jDateFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jDateFechaNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jDateFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 201, 41));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 360));

        jTabla.setBackground(new java.awt.Color(57, 150, 100));
        jTabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabla.setForeground(new java.awt.Color(255, 255, 255));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Mascota", "Alias", "Sexo", "Especie", "Raza", "Color de Pelo", "Fecha de Nac.", "Peso Promedio", "Peso Actual", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla.setGridColor(new java.awt.Color(255, 255, 255));
        jTabla.setSelectionBackground(new java.awt.Color(51, 255, 0));
        jTabla.getTableHeader().setReorderingAllowed(false);
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 800, 110));

        jPanel2.setBackground(new java.awt.Color(57, 230, 100));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/limpiar.png"))); // NOI18N
        jBLimpiar.setToolTipText("LIMPIAR");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(91, 220, 107));
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/guardar.png"))); // NOI18N
        jBGuardar.setToolTipText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(232, 62, 62));
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/eliminar.png"))); // NOI18N
        jBEliminar.setToolTipText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(50, 119, 242));
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jBSalir.setToolTipText("VOLVER");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 0, 153));
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/modificar.png"))); // NOI18N
        jBModificar.setToolTipText("MODIFICAR");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBEliminar)
                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBSalir))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 800, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Busqueda de mascota por DNI de Cliente:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 270, 20));

        jTClienteDNI.setBackground(new java.awt.Color(57, 150, 100));
        jTClienteDNI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTClienteDNI.setForeground(new java.awt.Color(255, 255, 255));
        jTClienteDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClienteDNIActionPerformed(evt);
            }
        });
        add(jTClienteDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 148, -1));

        jBotonOk.setBackground(new java.awt.Color(57, 150, 100));
        jBotonOk.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jBotonOk.setForeground(new java.awt.Color(255, 255, 255));
        jBotonOk.setText("OK");
        jBotonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotonOkMouseClicked(evt);
            }
        });
        add(jBotonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 80, 22));
    }// </editor-fold>//GEN-END:initComponents


    private void jTClienteDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClienteDNIActionPerformed

        String dniCliente = jTClienteDNI.getText();

        if (dniCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de cliente.");
            return;
        }

        try {
            int dniClienteint = Integer.parseInt(dniCliente);

            List<Mascota> mascotas = mascotaData.MascotasporClienteDNI(dniClienteint);
            if (mascotas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron mascotas para el cliente con DNI: " + dniClienteint);
            } else {
                DefaultTableModel model = (DefaultTableModel) jTabla.getModel();
                model.setRowCount(0);

                for (Mascota mascota : mascotas) {
                    Object[] rowData = {
                        mascota.getIdMascota(),
                        mascota.getAlias(),
                        mascota.getSexo(),
                        mascota.getEspecie(),
                        mascota.getRaza(),
                        mascota.getColorPelo(),
                        mascota.getFechaNac(),
                        mascota.getPesoPromedio(),
                        mascota.getPesoActual(),
                        mascota.isEstado(),};
                    model.addRow(rowData);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de cliente válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar las mascotas: ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jTClienteDNIActionPerformed


    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jComboBoxCliente.setSelectedIndex(-1);
        jTidMascota.setText("");
        jTAlias.setText("");
        jTEspecie.setText("");
        jTRaza.setText("");
        jTColordePelo.setText("");
        jTPesoActual.setText("");
        jRadioBEstado.setSelected(false);
        jDateFechaNac.setDate(null);
        buttonGroup1.clearSelection();
        jTClienteDNI.setText("");
        limpiarTabla();

    }//GEN-LAST:event_jBLimpiarActionPerformed


    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            String aliasT = jTAlias.getText();
            String sexoT = "";

            if (jCheckBoxH.isSelected()) {
                sexoT = "Hembra";
            } else if (jCheckBoxM.isSelected()) {
                sexoT = "Macho";
            }

            String especieT = jTEspecie.getText();
            String razaT = jTRaza.getText();
            String colordePeloT = jTColordePelo.getText();
            LocalDate fechaNac = jDateFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String pesoActualT = (jTPesoActual.getText());
            Cliente clienteSeleccionado = (Cliente) jComboBoxCliente.getSelectedItem();

            if (aliasT.isEmpty() || sexoT.isEmpty() || especieT.isEmpty() || razaT.isEmpty()
                    || colordePeloT.isEmpty() || pesoActualT.isEmpty() || fechaNac == null || clienteSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos.");

            } else {
                Double pesoA = Double.parseDouble(pesoActualT);

                if (fechaNac.isBefore(LocalDate.now()) || fechaNac.equals(LocalDate.now())) {

                    if (aliasT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {

                        if (especieT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {

                            if (razaT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {

                                if (colordePeloT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {

                                    if (pesoA.toString().matches("^[0-9]+(\\.[0-9]+)?$")) {

                                        if (pesoA <= 300) {

                                            Mascota mascotaActual = new Mascota();

                                            mascotaActual.setIdCliente(clienteSeleccionado);

                                            mascotaActual.setAlias(aliasT);

                                            mascotaActual.setSexo(sexoT);

                                            mascotaActual.setEspecie(especieT);

                                            mascotaActual.setRaza(razaT);

                                            mascotaActual.setColorPelo(colordePeloT);

                                            mascotaActual.setFechaNac(fechaNac);

                                            mascotaActual.setPesoActual(pesoA);

                                            mascotaActual.setPesoPromedio(pesoA);

                                            mascotaActual.setEstado(jRadioBEstado.isSelected());

                                            if (!validacion()) {
                                                mascotaData.agregarMascota(mascotaActual);
                                                JOptionPane.showMessageDialog(this, "Mascota guardada con éxito");
                                            } else {
                                                JOptionPane.showMessageDialog(this, "La mascota ya existe");
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(this, "El campo 'Peso Actual' tiene un limite de 300 Kg.");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(this, "El campo 'Peso Actual' solo debe contener numeros.");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(this, "El campo 'color de Pelo' solo debe contener letras y espacios.");
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "El campo 'raza' solo debe contener letras y espacios.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "El campo 'especie' solo debe contener letras y espacios.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El campo 'alias' solo debe contener letras y espacios.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La fecha es incorrecta");
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa valores válidos en los campos de números", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la mascota: ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBGuardarActionPerformed


    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        try {

            if (mascotaActual != null) {
                String idmascota = jTidMascota.getText();
                String alias = jTAlias.getText();
                String colorPelo = jTColordePelo.getText();
                String especie = jTEspecie.getText();
                String raza = jTRaza.getText();
                String pesoActual = jTPesoActual.getText();
                LocalDate fechaNac = jDateFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                String sexo = "";
                if (jCheckBoxH.isSelected()) {
                    sexo = "Hembra";
                } else if (jCheckBoxM.isSelected()) {
                    sexo = "Macho";
                }
                boolean estado = jRadioBEstado.isSelected();

                Cliente clienteSeleccionado = (Cliente) jComboBoxCliente.getSelectedItem();

                if (alias.isEmpty() || colorPelo.isEmpty() || especie.isEmpty()
                        || raza.isEmpty() || pesoActual.isEmpty()
                        || fechaNac == null || sexo.isEmpty() || clienteSeleccionado == null) {
                    JOptionPane.showMessageDialog(this, "Ningun campo puede estar vacio");

                } else {
                    int mas = Integer.parseInt(idmascota);
                    String ali = alias;
                    String col = colorPelo;
                    String esp = especie;
                    String raz = raza;
                    double pes = Double.parseDouble(pesoActual);
                    LocalDate fec = fechaNac;
                    String sex = sexo;
                    boolean est = estado;

                    if (!ali.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'alias' solo debe contener letras y espacios.");

                    } else if (!col.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'color de Pelo' solo debe contener letras y espacios.");

                    } else if (!esp.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'especie' solo debe contener letras y espacios.");

                    } else if (!raz.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'raza' solo debe contener letras y espacios.");
                    } else if (pes > 300) {
                        JOptionPane.showMessageDialog(this, "El campo 'Peso Actual' tiene un limite de 300 Kg.");

                    } else {

                        mascotaActual.setIdMascota(mas);

                        mascotaActual.setAlias(ali);
                        mascotaActual.setColorPelo(col);
                        mascotaActual.setEspecie(esp);
                        mascotaActual.setRaza(raz);
                        mascotaActual.setPesoActual(pes);
                        mascotaActual.setFechaNac(fec);
                        mascotaActual.setSexo(sex);
                        mascotaActual.setEstado(jRadioBEstado.isSelected());
                        mascotaActual.setIdCliente(clienteSeleccionado);

                        mascotaData.modificarMascota(mascotaActual);
                        JOptionPane.showMessageDialog(this, "mascota modificada exitosamente");

                    }

                }

            } else {

                JOptionPane.showMessageDialog(this, "No hay mascota para modificar");
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Ingrese numeros validos", "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(this, "Debe completar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jBModificarActionPerformed


    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try {
            if (mascotaActual != null) {
                int idMascotas = mascotaActual.getIdMascota();
                mascotaData.eliminarMascota(idMascotas);

                jTidMascota.setText("");
                jTAlias.setText("");
                jCheckBoxH.setSelected(false);
                jCheckBoxM.setSelected(false);
                jTEspecie.setText("");
                jTRaza.setText("");
                jTColordePelo.setText("");
                jTPesoActual.setText("");
                jRadioBEstado.setSelected(false);
                jComboBoxCliente.setSelectedIndex(-1);
                mascotaActual = null;

            } else {
                JOptionPane.showMessageDialog(this, "No hay mascota para eliminar");
            }
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, " No se permiten letras, simbolos y espacios en este campo ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed


    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();


    }//GEN-LAST:event_jBSalirActionPerformed


    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

        String codigoText = jTidMascota.getText();

        if (!codigoText.isEmpty()) {
            try {
                int codigo = Integer.parseInt(codigoText);
                mascotaActual = mascotaData.buscarMascota(codigo);

                if (mascotaActual != null) {
                    jTAlias.setText(mascotaActual.getAlias());
                    jTColordePelo.setText(mascotaActual.getColorPelo());
                    jTEspecie.setText(mascotaActual.getEspecie());
                    jTRaza.setText(mascotaActual.getRaza());
                    jTPesoActual.setText(Double.toString(mascotaActual.getPesoActual()));
                    LocalDate fechaNacimiento = mascotaActual.getFechaNac();
                    Date fechaNacimientoDate = Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDateFechaNac.setDate(fechaNacimientoDate);
                    jRadioBEstado.setSelected(mascotaActual.isEstado());
                    String sex = mascotaActual.getSexo();
                    if (sex.equalsIgnoreCase("Hembra")) {
                        jCheckBoxH.setSelected(true);
                        jCheckBoxM.setSelected(false);
                    } else if (sex.equalsIgnoreCase("Macho")) {
                        jCheckBoxH.setSelected(false);
                        jCheckBoxM.setSelected(true);
                    } else {
                        jCheckBoxH.setSelected(false);
                        jCheckBoxM.setSelected(false);
                    }

                    Cliente cliente = mascotaActual.getIdCliente();
                    for (Cliente cliente2 : CliData.listarClientes2()) {
                        if (cliente.getIdCliente() == cliente2.getIdCliente()) {
                            cliente = cliente2;
                            break;
                        }
                    }
                    for (int i = 0; i < jComboBoxCliente.getItemCount(); i++) {
                        Cliente cliente3 = jComboBoxCliente.getItemAt(i);
                        if (cliente.getIdCliente() == cliente3.getIdCliente()) {
                            jComboBoxCliente.setSelectedIndex(i);
                            break;
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Mascota no encontrada");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido en el campo id Mascota.", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo id Mascota no puede estar vacío.");
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    private void jCheckBoxHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHActionPerformed

        if (jCheckBoxH.isSelected()) {
            jCheckBoxM.setSelected(false);
        }

    }//GEN-LAST:event_jCheckBoxHActionPerformed


    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        try {

            Mascota mascotaActual = new Mascota();

            jTidMascota.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 0)));
            jTAlias.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 1)));

            String sex = String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 2));

            if (sex.equalsIgnoreCase("Hembra")) {
                jCheckBoxH.setSelected(true);
                jCheckBoxM.setSelected(false);
            } else if (sex.equalsIgnoreCase("Macho")) {
                jCheckBoxH.setSelected(false);
                jCheckBoxM.setSelected(true);
            } else {
                jCheckBoxH.setSelected(false);
                jCheckBoxM.setSelected(false);
            }

            jTEspecie.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 3)));
            jTRaza.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 4)));
            jTColordePelo.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 5)));
            String fecha = String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 6));
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

            try {
                jDateFechaNac.setDate(formatoFecha.parse(fecha));

            } catch (ParseException ex) {
                Logger.getLogger(GestionMascota.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            jTPesoActual.setText(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 8)));

            boolean est = (boolean) modelo.getValueAt(jTabla.getSelectedRow(), 9);
            jRadioBEstado.setSelected(est);

            Cliente clienteSeleccionado = mascotaActual.getIdCliente();

            jComboBoxCliente.setSelectedItem(clienteSeleccionado);

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la información de la mascota ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTablaMouseClicked

    private void jBotonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonOkMouseClicked
        String dniCliente = jTClienteDNI.getText();

        if (dniCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI de un cliente.");
            return;
        } else {
            limpiarTabla();
            cargarTabla();

        }

        try {
            int dniClienteint = Integer.parseInt(dniCliente);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de cliente válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar las mascotas: ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBotonOkMouseClicked

    private void jCheckBoxMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMActionPerformed

        if (jCheckBoxM.isSelected()) {
            jCheckBoxH.setSelected(false);
        }

    }//GEN-LAST:event_jCheckBoxMActionPerformed

    private void jTRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRazaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBotonOk;
    private javax.swing.JButton jBuscar;
    private javax.swing.JCheckBox jCheckBoxH;
    private javax.swing.JCheckBox jCheckBoxM;
    private javax.swing.JComboBox<Cliente> jComboBoxCliente;
    private com.toedter.calendar.JDateChooser jDateFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAlias;
    private javax.swing.JTextField jTClienteDNI;
    private javax.swing.JTextField jTColordePelo;
    private javax.swing.JTextField jTEspecie;
    private javax.swing.JTextField jTPesoActual;
    private javax.swing.JTextField jTRaza;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTidMascota;
    // End of variables declaration//GEN-END:variables

    private void cargarClientes() {

        for (Cliente cliente : CliData.listarClientes()) {
            jComboBoxCliente.addItem(cliente);
        }

        jComboBoxCliente.setSelectedIndex(-1);

    }

    private void cabecera() {

        modelo.addColumn("Id Mascota");
        modelo.addColumn("Alias");
        modelo.addColumn("Sexo");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Color de Pelo");
        modelo.addColumn("Fecha de Nac.");
        modelo.addColumn("Peso Promedio");
        modelo.addColumn("Peso Actual");
        modelo.addColumn("Estado");
        jTabla.setModel(modelo);
    }

    private void cargarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTabla.getModel();
        model.setRowCount(0);
        int mascotaDni = Integer.parseInt(jTClienteDNI.getText());
        for (Mascota mascota : mascotaData.MascotasporClienteDNI(mascotaDni)) {
            Object[] rowData = {
                mascota.getIdMascota(),
                mascota.getAlias(),
                mascota.getSexo(),
                mascota.getEspecie(),
                mascota.getRaza(),
                mascota.getColorPelo(),
                mascota.getFechaNac(),
                mascota.getPesoPromedio(),
                mascota.getPesoActual(),
                mascota.isEstado(),};
            model.addRow(rowData);

        }

    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        int filas = jTabla.getRowCount();
        for (int a = 0; filas > a; a++) {
            modelo.removeRow(0);
        }
    }

    private void actualizarApariencia(boolean modo) {
        if (modo) {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
                Color color = new Color(52, 55, 59);
                this.setBackground(color);

                jTidMascota.setBackground(color);
                jBuscar.setBackground(color);
                jTAlias.setBackground(color);
                jTColordePelo.setBackground(color);
                jTEspecie.setBackground(color);
                jTRaza.setBackground(color);
                jTPesoActual.setBackground(color);
                jDateFechaNac.setBackground(color);
                jRadioBEstado.setBackground(color);
                jCheckBoxH.setBackground(color);
                jCheckBoxM.setBackground(color);
                jComboBoxCliente.setBackground(color);
                jTabla.setBackground(color);
                jTClienteDNI.setBackground(color);
                jBotonOk.setBackground(color);
                jBLimpiar.setBackground(color);
                jBGuardar.setBackground(color);
                jBModificar.setBackground(color);
                jBEliminar.setBackground(color);
                jBSalir.setBackground(color);
                jPanel1.setBackground(color);
                jPanel2.setBackground(color);
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

    private boolean validacion() {

        double pesoActual = Double.parseDouble(jTPesoActual.getText());
        String sexo = null;
        if (jCheckBoxM.isSelected()) {
            sexo = "Macho";
        } else if (jCheckBoxH.isSelected()) {
            sexo = "Hembra";
        }
        LocalDate fechaNacimiento = mascotaActual.getFechaNac();
        for (Mascota mascota : mascotaData.listarMascotas()) {
            if (mascota.getAlias().equalsIgnoreCase(jTAlias.getText())) {
                if (mascota.getColorPelo().equalsIgnoreCase(jTColordePelo.getText())) {
                    if (mascota.getEspecie().equalsIgnoreCase(jTEspecie.getText())) {
                        if (mascota.getRaza().equalsIgnoreCase(jTRaza.getText())) {
                            if (mascota.getPesoActual() == pesoActual) {
                                if (mascota.getFechaNac().isEqual(fechaNacimiento)) {
                                    if (mascota.isEstado() == jRadioBEstado.isSelected()) {
                                        if (mascota.getSexo().equalsIgnoreCase(sexo)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
