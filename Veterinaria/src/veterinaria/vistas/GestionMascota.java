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
        cargarClientes();
        this.modo = modo;
        this.empleado = empleado;
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
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTClienteDNI = new javax.swing.JTextField();
        jBotonOk = new javax.swing.JButton();

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

        jRadioBEstado.setBackground(new java.awt.Color(0, 153, 255));
        jRadioBEstado.setForeground(new java.awt.Color(255, 255, 51));

        jCheckBoxH.setBackground(new java.awt.Color(51, 204, 255));
        buttonGroup1.add(jCheckBoxH);
        jCheckBoxH.setForeground(new java.awt.Color(0, 51, 204));
        jCheckBoxH.setText("hembra");

        jCheckBoxM.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(jCheckBoxM);
        jCheckBoxM.setForeground(new java.awt.Color(0, 51, 204));
        jCheckBoxM.setText("macho");
        jCheckBoxM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMActionPerformed(evt);
            }
        });

        jBuscar.setBackground(new java.awt.Color(0, 0, 153));
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jComboBoxCliente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCliente.setForeground(new java.awt.Color(0, 0, 153));
        jComboBoxCliente.setModel(jComboBoxCliente.getModel());
        jComboBoxCliente.setSelectedItem(jComboBoxCliente);
        jComboBoxCliente.setEditor(null);

        jDateFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        jDateFechaNac.setForeground(new java.awt.Color(255, 255, 255));

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
                                .addComponent(jDateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(26, 26, 26)
                                        .addComponent(jRadioBEstado))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jDateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioBEstado))
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

        jTabla.setBackground(new java.awt.Color(255, 255, 255));
        jTabla.setForeground(new java.awt.Color(255, 0, 51));
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
        jTabla.setGridColor(new java.awt.Color(0, 0, 153));
        jTabla.setSelectionBackground(new java.awt.Color(0, 0, 153));
        jTabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jBNuevo.setBackground(new java.awt.Color(0, 0, 153));
        jBNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(0, 0, 153));
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(0, 0, 153));
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(0, 0, 153));
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(0, 0, 153));
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("MODIFICAR");
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
                .addGap(39, 39, 39)
                .addComponent(jBNuevo)
                .addGap(71, 71, 71)
                .addComponent(jBGuardar)
                .addGap(83, 83, 83)
                .addComponent(jBModificar)
                .addGap(106, 106, 106)
                .addComponent(jBEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir)
                    .addComponent(jBModificar))
                .addGap(32, 32, 32))
        );

        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Busqueda de mascota por DNI de Cliente:");

        jTClienteDNI.setBackground(new java.awt.Color(255, 255, 255));
        jTClienteDNI.setForeground(new java.awt.Color(0, 0, 0));

        jBotonOk.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jBotonOk.setText("OK");
        jBotonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotonOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
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


    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        mascotaActual = new Mascota();

        jTidMascota.setText("");
        jTAlias.setText("");
        jTEspecie.setText("");
        jTRaza.setText("");
        jTColordePelo.setText("");
        jTPesoActual.setText("");
        jRadioBEstado.setSelected(false);
        jDateFechaNac.setDate(null);
        buttonGroup1.clearSelection();
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
            LocalDate fechaNac = jDateFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            String pesoActualT = (jTPesoActual.getText());
            Cliente clienteSeleccionado = (Cliente) jComboBoxCliente.getSelectedItem();

            if (aliasT.isEmpty() || sexoT.isEmpty() || especieT.isEmpty() || razaT.isEmpty()
                    || colordePeloT.isEmpty() || pesoActualT.isEmpty() || fechaNac == null || clienteSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos.");

            } else {
                Double pesoA = Double.parseDouble(pesoActualT);
                if (fechaNac.isBefore(LocalDate.now()) || fechaNac.isEqual(LocalDate.now())) {

                    if (!aliasT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'alias' solo debe contener letras y espacios.");

                    } else if (!especieT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'especie' solo debe contener letras y espacios.");

                    } else if (!razaT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'raza' solo debe contener letras y espacios.");

                    } else if (!colordePeloT.matches("^[a-zA-Z][a-zA-Z\\s]+$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'color de Pelo' solo debe contener letras y espacios.");

                    } else if (!pesoA.toString().matches("^[0-9]+(\\.[0-9]+)?$")) {
                        JOptionPane.showMessageDialog(this, "El campo 'Peso Actual' solo debe contener numeros.");
                    } else if (pesoA > 300) {
                        JOptionPane.showMessageDialog(this, "El campo 'Peso Actual' tiene un limite de 300 Kg.");
                
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

                    mascotaData.agregarMascota(mascotaActual);
                    JOptionPane.showMessageDialog(this, "Mascota guardada con éxito");     
                   
                } else {
                        JOptionPane.showMessageDialog(this, "La fecha es incorrecta");
                }
                }        
            }
                   


        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa valores válidos en los campos de números", "ERROR", JOptionPane.ERROR_MESSAGE);
        }catch (Exception e) {
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
                    sexo = "hembra";
                } else if (jCheckBoxM.isSelected()) {
                    sexo = "macho";
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

        limpiarTabla();
        cargarTabla();

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
                jComboBoxCliente.setSelectedIndex(0);
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
                    jTClienteDNI.setText("DNI: " + cliente.getDni() + ", Apellido: " + cliente.getApellido() + ", Nombre: " + cliente.getNombre());
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

            if (sex.equalsIgnoreCase("hembra")) {
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
            System.out.println(est);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
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
                jBNuevo.setBackground(color);
                jBGuardar.setBackground(color);
                jBModificar.setBackground(color);
                jBEliminar.setBackground(color);
                jBSalir.setBackground(color);
                jPanel1.setBackground(color);

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

}
