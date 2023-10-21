package veterinaria.vistas;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
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

public class Balance extends javax.swing.JPanel {

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

    public Balance(boolean modo, Empleado empleado) {
        initComponents();
        cabecera();
        this.modo = modo;
        this.empleado = empleado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JLabel2 = new javax.swing.JLabel();
        jDia = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        jImporte1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        JLabel5 = new javax.swing.JLabel();
        jDia2 = new javax.swing.JLabel();
        JLabel6 = new javax.swing.JLabel();
        JLabel7 = new javax.swing.JLabel();
        jImporte2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        JLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 134, 45));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Balance diario/mensual ");

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
        jScrollPane1.setViewportView(jTable1);

        JLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JLabel2.setText("INGRESO DIARIO");

        jDia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jDia.setForeground(new java.awt.Color(255, 255, 255));

        JLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JLabel3.setText("Dia:");

        JLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JLabel4.setText("Facturacion: $");

        jImporte1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jImporte1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        JLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JLabel5.setText("INGRESO MENSUAL");

        jDia2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jDia2.setForeground(new java.awt.Color(255, 255, 255));

        JLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel6.setForeground(new java.awt.Color(255, 255, 255));
        JLabel6.setText("Mes:");

        JLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabel7.setForeground(new java.awt.Color(255, 255, 255));
        JLabel7.setText("Facturacion: $");

        jImporte2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jImporte2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(JLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(JLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(JLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDateChooser1.setBackground(new java.awt.Color(255, 51, 0));
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        JLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel8.setForeground(new java.awt.Color(255, 255, 255));
        JLabel8.setText("INGRESE FECHA:");

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver al Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(362, 362, 362)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(JLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(431, 431, 431)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private DefaultTableModel modelo2 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private void cabecera() {
        modelo.addColumn("Fecha");
        modelo.addColumn("Cliente");
        modelo.addColumn("ID Mascota");
        modelo.addColumn("Tratamiento");
        modelo.addColumn("importe");
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Cliente");
        modelo2.addColumn("ID Mascota");
        modelo2.addColumn("Tratamiento");
        modelo2.addColumn("importe");
        jTable2.setModel(modelo2);
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
        int i = jTable2.getRowCount() - 1;
        for (; i >= 0; i--) {
            modelo2.removeRow(i);
        }
    }

    public void llenarTabla1(LocalDate fecha) {

        jDia.setText(fecha.toString());
        jImporte1.setText(Double.toString(viData.importeTotalDiario(fecha)));
        for (Visita aux : viData.balanceDiario(fecha)) {
            Mascota aux2 = maData.buscarMascota(aux.getMascota().getIdMascota());
            Cliente aux3=null;
            for(Cliente ax:clData.listarClientes()){
                if(ax.getIdCliente()==aux2.getIdCliente().getIdCliente()){
               aux3 = ax;}
            }
            Tratamiento aux4 = trData.buscarTratamiento(aux.getTratamiento().getIdTratamiento());
            modelo.addRow(new Object[]{
                aux.getFechaTratamiento(),
                aux3.getDni(),
                "Cod:"+aux2.getIdMascota()+" '"+aux2.getAlias()+"'",
                aux4.getTipoTratamiento(),
                aux4.getImporte(),});
        }

    }

    public void llenarTabla2(LocalDate fecha) {

        int mes = fecha.getMonthValue();
        int año = fecha.getYear();

        jDia2.setText(fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + año);

        jImporte2.setText(Double.toString(viData.importeTotalMensual(mes, año)));

        for (Visita aux : viData.balanceMensual(mes, año)) {
            Mascota aux2 = maData.buscarMascota(aux.getMascota().getIdMascota());
            Cliente aux3 = clData.buscarClienteId(aux2.getIdCliente().getIdCliente());
            Tratamiento aux4 = trData.buscarTratamiento(aux.getTratamiento().getIdTratamiento());
            modelo2.addRow(new Object[]{
                aux.getFechaTratamiento(),
                aux3.getApellido(),
                aux2.getAlias(),
                aux4.getTipoTratamiento(),
                aux4.getImporte(),});
        }
    }

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        if ("date".equals(evt.getPropertyName())) {
            LocalDate fecha = (jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            borrarFilas();
            llenarTabla1(fecha);
            llenarTabla2(fecha);
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JLabel JLabel8;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jDia;
    private javax.swing.JLabel jDia2;
    private javax.swing.JLabel jImporte1;
    private javax.swing.JLabel jImporte2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
