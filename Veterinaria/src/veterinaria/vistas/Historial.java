package veterinaria.vistas;

import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.AccesoADatos.MascotaData;
import veterinaria.AccesoADatos.VisitaData;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Visita;
import veterinaria.AccesoADatos.TratamientoData;

public class Historial extends javax.swing.JPanel {

    private MascotaData mascotaData = new MascotaData();
    private Mascota mascota = new Mascota();
    private Cliente cliente = new Cliente();
    private ClienteData clienteData = new ClienteData();
    private Tratamiento tratamiento = new Tratamiento();
    private TratamientoData tratamientoData = new TratamientoData();
    private Visita visita = new Visita();
    private VisitaData visitaData = new VisitaData();

    public Historial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBusquedaMascota = new javax.swing.JLabel();
        jBotonBusquedaMascota = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMascota = new javax.swing.JTable();
        jBotonSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jBusquedaMascota.setBackground(new java.awt.Color(255, 0, 0));
        jBusquedaMascota.setForeground(new java.awt.Color(255, 255, 255));
        jBusquedaMascota.setText("BUSQUEDA POR CLIENTES");

        jBotonBusquedaMascota.setBackground(new java.awt.Color(51, 153, 255));
        jBotonBusquedaMascota.setForeground(new java.awt.Color(255, 255, 255));
        jBotonBusquedaMascota.setText("OK");
        jBotonBusquedaMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        jBotonBusquedaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBusquedaMascotaActionPerformed(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 0, 0));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("       HISTORIAL DE LA VETERINARIA");

        jTablaMascota.setBackground(new java.awt.Color(255, 255, 255));
        jTablaMascota.setForeground(new java.awt.Color(51, 153, 255));
        jTablaMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id Cliente", "dni Cliente", "Nombre", "Apellido", "Alias de la Mascota", "Title 6", "Title 7", "null", "Title 9", "Title 10", "Title 11"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaMascota.setGridColor(new java.awt.Color(51, 204, 255));
        jScrollPane1.setViewportView(jTablaMascota);

        jBotonSalir.setBackground(new java.awt.Color(51, 51, 255));
        jBotonSalir.setForeground(new java.awt.Color(204, 255, 255));
        jBotonSalir.setText("SALIR");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jBusquedaMascota)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonBusquedaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)
                                .addComponent(jLTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotonSalir)
                                .addGap(13, 13, 13)))))
                .addContainerGap(33, Short.MAX_VALUE))
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBusquedaMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonBusquedaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(644, 644, 644))
        );

        jLTitulo.getAccessibleContext().setAccessibleName("HISTORIAL DE LA VETERINARIA");
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonBusquedaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBusquedaMascotaActionPerformed

        List<Mascota> mascotas = mascotaData.listarMascotas();

        DefaultTableModel modelo = (DefaultTableModel) jTablaMascota.getModel();
        modelo.setRowCount(0);

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
                modelo.addRow(rowData);
        }
    
    }//GEN-LAST:event_jBotonBusquedaMascotaActionPerformed

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_jBotonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonBusquedaMascota;
    private javax.swing.JButton jBotonSalir;
    private javax.swing.JLabel jBusquedaMascota;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMascota;
    // End of variables declaration//GEN-END:variables

}
