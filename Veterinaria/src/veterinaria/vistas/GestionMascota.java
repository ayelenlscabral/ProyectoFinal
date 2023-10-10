package veterinaria.vistas;

import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.AccesoADatos.MascotaData;
import veterinaria.AccesoADatos.VisitaData;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Visita;

public class GestionMascota extends javax.swing.JPanel {

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

    public GestionMascota() {
        initComponents();
        cabecera();
        cargarClientes();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBoxH = new javax.swing.JCheckBox();
        jCheckBoxM = new javax.swing.JCheckBox();
        jBuscar = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTClienteId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 204, 255));
        setForeground(new java.awt.Color(51, 204, 255));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Sexo");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Especie");

        jTRaza.setBackground(new java.awt.Color(255, 255, 255));
        jTRaza.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Raza");

        jTidMascota.setBackground(new java.awt.Color(255, 255, 255));
        jTidMascota.setForeground(new java.awt.Color(0, 0, 0));

        jTEspecie.setBackground(new java.awt.Color(255, 255, 255));
        jTEspecie.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Id Mascota");

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Alias");

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Color de Pelo");

        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Estado");

        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Peso Actual");

        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Fecha de Nacimiento");

        jTPesoActual.setBackground(new java.awt.Color(255, 255, 255));
        jTPesoActual.setForeground(new java.awt.Color(0, 0, 0));

        jTAlias.setBackground(new java.awt.Color(255, 255, 255));
        jTAlias.setForeground(new java.awt.Color(0, 0, 0));

        jTColordePelo.setBackground(new java.awt.Color(255, 255, 255));
        jTColordePelo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Cliente");

        jRadioButton1.setBackground(new java.awt.Color(0, 153, 255));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 51));

        jCheckBoxH.setBackground(new java.awt.Color(51, 204, 255));
        buttonGroup1.add(jCheckBoxH);
        jCheckBoxH.setForeground(new java.awt.Color(0, 51, 204));
        jCheckBoxH.setText("hembra");
        jCheckBoxH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHActionPerformed(evt);
            }
        });

        jCheckBoxM.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(jCheckBoxM);
        jCheckBoxM.setForeground(new java.awt.Color(0, 51, 204));
        jCheckBoxM.setText("macho");

        jBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jComboBoxCliente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCliente.setModel(jComboBoxCliente.getModel());
        jComboBoxCliente.setSelectedItem(jComboBoxCliente);
        jComboBoxCliente.setEditor(null);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTidMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jTAlias, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTRaza, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEspecie, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTColordePelo)
                            .addComponent(jTPesoActual))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBuscar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(26, 26, 26)
                                        .addComponent(jRadioButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxM)
                                            .addComponent(jCheckBoxH)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(109, 118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTColordePelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(2, 2, 2)
                            .addComponent(jLabel1)
                            .addGap(72, 72, 72))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBoxH)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBoxM)
                            .addGap(45, 45, 45)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setForeground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText(" Seleccionar:");

        jTabla.setBackground(new java.awt.Color(153, 153, 153));
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
        jScrollPane1.setViewportView(jTabla);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 0, 0));
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("MODIFICAR");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(0, 0, 0));
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jBNuevo)
                .addGap(71, 71, 71)
                .addComponent(jBGuardar)
                .addGap(86, 86, 86)
                .addComponent(jBModificar)
                .addGap(103, 103, 103)
                .addComponent(jBEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addGap(72, 72, 72))
        );

        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("  Cliente Id:");

        jTClienteId.setBackground(new java.awt.Color(255, 255, 255));
        jTClienteId.setForeground(new java.awt.Color(0, 0, 0));
        jTClienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClienteIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jTClienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClienteIdActionPerformed

        String idClienteStr = jTClienteId.getText();

        if (idClienteStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de cliente.");
            return;
        }

        try {
            int idCliente = Integer.parseInt(idClienteStr);

            
            List<Mascota> mascotas = mascotaData.MascotasporClienteDNI(idCliente);
            if (mascotas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron mascotas para el cliente con ID: " + idCliente);
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
                        mascota.isEstado() ? "Activo" : "Inactivo"
                    };
                    model.addRow(rowData);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de cliente válido.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar las mascotas: " + e.getMessage());
        }


    }//GEN-LAST:event_jTClienteIdActionPerformed


    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        mascotaActual = new Mascota();

        jTidMascota.setText("");
        jTAlias.setText("");
        jCheckBoxH.setSelected(false);
        jCheckBoxM.setSelected(false);
        jTEspecie.setText("");
        jTRaza.setText("");
        jTColordePelo.setText("");
        jTPesoActual.setText("");
        jRadioButton1.setSelected(false);

    }//GEN-LAST:event_jBNuevoActionPerformed


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
            LocalDate fechadeNacT = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            String pesoActualT = jTPesoActual.getText();
            Cliente clienteSeleccionado = (Cliente) jComboBoxCliente.getSelectedItem();

            if (aliasT.isEmpty() || sexoT.isEmpty() || especieT.isEmpty() || razaT.isEmpty()
                    || colordePeloT.isEmpty() || pesoActualT.isEmpty() || clienteSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos.");
            } else {
                String ali = aliasT;
                String espe = especieT;
                String raza = razaT;
                String colorP = colordePeloT;
                LocalDate naci = fechadeNacT;
                Double pesoA = Double.parseDouble(pesoActualT);

                if (!ali.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(this, "El campo 'alias' solo debe contener letras y espacios.");

                } else if (!espe.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(this, "El campo 'especie' solo debe contener letras y espacios.");

                } else if (!raza.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(this, "El campo 'raza' solo debe contener letras y espacios.");

                } else if (!colorP.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(this, "El campo 'color de Pelo' solo debe contener letras y espacios.");

                } else if (!pesoA.toString().matches("^[0-9]+(\\.[0-9]+)?$")) {
                    JOptionPane.showMessageDialog(this, "El campo 'Peso Actual' solo debe contener numeros.");

                } else {

                    Mascota mascotaActual = new Mascota();
                    mascotaActual.setAlias(ali);
                    mascotaActual.setSexo(sexoT);
                    mascotaActual.setEspecie(espe);
                    mascotaActual.setRaza(raza);
                    mascotaActual.setColorPelo(colorP);
                    mascotaActual.setFechaNac(naci);
                    mascotaActual.setPesoActual(pesoA);
                    mascotaActual.setPesoPromedio(pesoA);
                    mascotaActual.setIdCliente(clienteSeleccionado);
                    mascotaActual.setEstado(jRadioButton1.isSelected());

                    mascotaData.agregarMascota(mascotaActual);

                    JOptionPane.showMessageDialog(this, "Mascota guardada con éxito");

                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa valores válidos en los campos de números");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la mascota: " + e.getMessage());
        }

    }//GEN-LAST:event_jBGuardarActionPerformed


    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        try {

            int filaSeleccionada = jTabla.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona una mascota para modificar.");
                return;
            }

            int idMascotaSeleccionada = (int) jTabla.getValueAt(filaSeleccionada, 0);

            Mascota mascotaActual = mascotaData.buscarMascota(idMascotaSeleccionada);

            jTidMascota.setText(String.valueOf(mascotaActual.getIdMascota()));
            jTAlias.setText(mascotaActual.getAlias());

            if (mascotaActual.getSexo().equals("Hembra")) {
                jCheckBoxH.setSelected(true);
                jCheckBoxM.setSelected(false);
            } else if (mascotaActual.getSexo().equals("Macho")) {
                jCheckBoxH.setSelected(false);
                jCheckBoxM.setSelected(true);
            } else {
                jCheckBoxH.setSelected(false);
                jCheckBoxM.setSelected(false);
            }

            jTEspecie.setText(mascotaActual.getEspecie());
            jTRaza.setText(mascotaActual.getRaza());
            jTColordePelo.setText(mascotaActual.getColorPelo());
            jDateChooser1.setDate(Date.from(mascotaActual.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            jTPesoActual.setText(String.valueOf(mascotaActual.getPesoActual()));
            jRadioButton1.setSelected(mascotaActual.isEstado());

            Cliente clienteSeleccionado = mascotaActual.getIdCliente();

            jComboBoxCliente.setSelectedItem(clienteSeleccionado);

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la información de la mascota: " + e.getMessage());
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
                jRadioButton1.setSelected(false);
                jComboBoxCliente.setSelectedIndex(0);
                mascotaActual = null;

            } else {
                JOptionPane.showMessageDialog(this, "No hay mascota para eliminar");
            }
        } catch (NullPointerException np) {

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, " No se permiten letras, simbolos y espacios en este campo ");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed


    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose(); // Cierra el panel actual
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
                    jRadioButton1.setSelected(mascotaActual.isEstado());
                    LocalDate fechaNacimiento = mascotaActual.getFechaNac();
                    Date fechaNacimientoDate = Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    jDateChooser1.setDate(fechaNacimientoDate);
                    if (mascotaActual.getSexo().equals("H")) {
                        jCheckBoxH.setSelected(true);
                        jCheckBoxM.setSelected(false);
                    } else if (mascotaActual.getSexo().equals("M")) {
                        jCheckBoxH.setSelected(false);
                        jCheckBoxM.setSelected(true);
                    }
                    Cliente cliente = mascotaActual.getIdCliente();
                    jTClienteId.setText("DNI: " + cliente.getDni() + ", Apellido: " + cliente.getApellido() + ", Nombre: " + cliente.getNombre());
                } else {
                    JOptionPane.showMessageDialog(this, "Mascota no encontrada");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido en el campo id Mascota.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo id Mascota no puede estar vacío.");
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    private void jCheckBoxHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHActionPerformed

    }//GEN-LAST:event_jCheckBoxHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JCheckBox jCheckBoxH;
    private javax.swing.JCheckBox jCheckBoxM;
    private javax.swing.JComboBox<Cliente> jComboBoxCliente;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAlias;
    private javax.swing.JTextField jTClienteId;
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

}
