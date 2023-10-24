package veterinaria.vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.AccesoADatos.Conexion;
import veterinaria.AccesoADatos.MascotaData;
import veterinaria.AccesoADatos.VisitaData;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Visita;
import veterinaria.AccesoADatos.TratamientoData;
import veterinaria.Entidades.Empleado;

public class Historial extends javax.swing.JPanel {

    private boolean modo;
    private Empleado empleado;
    private final MascotaData mascotaData = new MascotaData();
    private final Mascota mascota = new Mascota();
    private final Cliente cliente = new Cliente();
    private final ClienteData clienteData = new ClienteData();
    private final Tratamiento tratamiento = new Tratamiento();
    private final TratamientoData tratamientoData = new TratamientoData();
    private final Visita visita = new Visita();
    private final VisitaData visitaData = new VisitaData();

    public Historial(boolean modo, Empleado empleado) {
        initComponents();
        cabecera();
        this.modo = modo;
        this.empleado = empleado;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBotonSalir = new javax.swing.JButton();
        jBDesde = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jDateHasta = new com.toedter.calendar.JDateChooser();
        jDateDesde = new com.toedter.calendar.JDateChooser();
        jBFiltrar = new javax.swing.JButton();
        jBHasta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 0, 255));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("       HISTORIAL DE LA VETERINARIA");

        jTabla.setBackground(new java.awt.Color(255, 255, 255));
        jTabla.setForeground(new java.awt.Color(51, 153, 255));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id Cliente", "dni Cliente", "Apellido Ciente", "Nombre Cliente", "id Mascota", "Raza", "Especie", "Ultimo Peso", "id Visita", "Fecha de Visita", "Id Tratamiento", "Tipo de Tratamiento", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla.setGridColor(new java.awt.Color(51, 204, 255));
        jScrollPane1.setViewportView(jTabla);

        jBotonSalir.setBackground(new java.awt.Color(51, 51, 255));
        jBotonSalir.setForeground(new java.awt.Color(0, 255, 204));
        jBotonSalir.setText("SALIR");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        jBDesde.setBackground(new java.awt.Color(255, 255, 204));
        jBDesde.setForeground(new java.awt.Color(153, 153, 153));
        jBDesde.setText("FECHA DESDE:");

        jBLimpiar.setBackground(new java.awt.Color(255, 51, 255));
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("LIMPIAR TABLA");
        jBLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jDateHasta.setBackground(new java.awt.Color(255, 255, 255));
        jDateHasta.setForeground(new java.awt.Color(255, 255, 255));

        jDateDesde.setBackground(new java.awt.Color(255, 255, 255));
        jDateDesde.setForeground(new java.awt.Color(255, 255, 255));

        jBFiltrar.setBackground(new java.awt.Color(255, 51, 255));
        jBFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        jBFiltrar.setText("FILTRAR");
        jBFiltrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        jBFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBFiltrarMouseClicked(evt);
            }
        });

        jBHasta.setBackground(new java.awt.Color(255, 255, 204));
        jBHasta.setForeground(new java.awt.Color(153, 153, 153));
        jBHasta.setText("FECHA HASTA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jDateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)
                                .addComponent(jLTitulo)
                                .addGap(198, 198, 198)
                                .addComponent(jBotonSalir)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLTitulo)
                            .addComponent(jBotonSalir))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jBFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(787, 787, 787))
        );

        jLTitulo.getAccessibleContext().setAccessibleName("HISTORIAL DE LA VETERINARIA");
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed

        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();

    }//GEN-LAST:event_jBotonSalirActionPerformed


    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        modelo.setRowCount(0);

    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBFiltrarMouseClicked

        Connection connection = Conexion.getConexion();

        Date fechaInicio = jDateDesde.getDate();
        Date fechaFin = jDateHasta.getDate();
        
        String sql = "SELECT c.idCliente, c.dni, c.apellido, c.nombre, m.idMascota,m.especie, m.raza, m.pesoActual, v.idVisita, v.fechaVisita, t.idTratamiento, t.tipoTratamiento, t.importe "
                + "FROM cliente c "
                + "JOIN mascota m ON c.idCliente = m.idCliente "
                + "JOIN visita v ON v.idMascota = m.idMascota "
                + "JOIN tratamiento t ON t.idTratamiento = v.idTratamiento "
                + "WHERE v.fechaVisita BETWEEN ? AND ? " 
                + "ORDER BY v.fechaVisita";

        PreparedStatement ps;

        try {

            ps = connection.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            
            ResultSet rs = ps.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();

            modelo.setRowCount(0);

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("idCliente"),
                    rs.getString("dni"),
                    rs.getString("apellido"),
                    rs.getString("nombre"),
                    rs.getInt("idMascota"),
                    rs.getString("especie"),
                    rs.getString("raza"),
                    rs.getDouble("pesoActual"),
                    rs.getInt("idVisita"),
                    rs.getDate("fechaVisita"),
                    rs.getInt("idTratamiento"),
                    rs.getString("tipoTratamiento"),
                    rs.getDouble("importe"),};
                modelo.addRow(fila);
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error" + ex);
        }
    }//GEN-LAST:event_jBFiltrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBDesde;
    private javax.swing.JButton jBFiltrar;
    private javax.swing.JLabel jBHasta;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBotonSalir;
    private com.toedter.calendar.JDateChooser jDateDesde;
    private com.toedter.calendar.JDateChooser jDateHasta;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel cabecera() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id Cliente");
        modelo.addColumn("dni Cliente");
        modelo.addColumn("Apellido Cliente");
        modelo.addColumn("Nombre Cliente");
        modelo.addColumn("id Mascota");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Ultimo Peso");
        modelo.addColumn("id Visita");
        modelo.addColumn("Fecha de Visita");
        modelo.addColumn("id Tratamiento");
        modelo.addColumn("Tipo de Tratamiento");
        modelo.addColumn("Importe");

        return modelo;

    }

}
