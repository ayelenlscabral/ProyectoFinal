package veterinaria.vistas;

import java.awt.Color;
import java.util.Date;
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
import veterinaria.Entidades.Mascota;
import veterinaria.Entidades.Tratamiento;
import veterinaria.Entidades.Visita;
import veterinaria.AccesoADatos.TratamientoData;
import veterinaria.Entidades.Empleado;
import veterinaria.Entidades.Historial1;

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
        actualizarApariencia(modo);
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

        setBackground(new java.awt.Color(209, 17, 65));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 55, -1, -1));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("       HISTORIAL DE LA VETERINARIA");
        add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 20, 931, -1));
        jLTitulo.getAccessibleContext().setAccessibleName("HISTORIAL DE LA VETERINARIA");

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
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 780, 230));

        jBotonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBotonSalir.setForeground(new java.awt.Color(255, 102, 255));
        jBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });
        add(jBotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 110, -1));

        jBDesde.setBackground(new java.awt.Color(255, 255, 204));
        jBDesde.setForeground(new java.awt.Color(255, 255, 255));
        jBDesde.setText("FECHA DESDE:");
        add(jBDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 88, 26));

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setForeground(new java.awt.Color(209, 17, 65));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/limpiar.png"))); // NOI18N
        jBLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 56));

        jDateHasta.setBackground(new java.awt.Color(255, 204, 153));
        jDateHasta.setForeground(new java.awt.Color(0, 204, 51));
        add(jDateHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 163, -1));

        jDateDesde.setBackground(new java.awt.Color(255, 255, 153));
        jDateDesde.setForeground(new java.awt.Color(0, 0, 255));
        add(jDateDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 154, -1));
        jDateDesde.getAccessibleContext().setAccessibleParent(jBDesde);

        jBFiltrar.setBackground(new java.awt.Color(209, 17, 65));
        jBFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        jBFiltrar.setText("FILTRAR");
        jBFiltrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        jBFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBFiltrarMouseClicked(evt);
            }
        });
        add(jBFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 120, 29));

        jBHasta.setBackground(new java.awt.Color(255, 255, 204));
        jBHasta.setForeground(new java.awt.Color(255, 255, 255));
        jBHasta.setText("FECHA HASTA:");
        add(jBHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 88, 26));
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

        DefaultTableModel modelo = new DefaultTableModel();
        cargarTabla();
        

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

    private void actualizarApariencia(boolean modo) {
        if (modo) {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
                Color color = new Color(52, 55, 59);
                this.setBackground(color);

                jBDesde.setBackground(color);
                jBFiltrar.setBackground(color);
                jBHasta.setBackground(color);
                jBLimpiar.setBackground(color);
                jBotonSalir.setBackground(color);
                jDateDesde.setBackground(color);
                jDateHasta.setBackground(color);
                jLTitulo.setBackground(color);
                jPanel1.setBackground(color);
                jScrollPane1.setBackground(color);
                jTabla.setBackground(color);

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

    private void cargarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        
        modelo.setRowCount(0);
        
        Date fechaInicio = jDateDesde.getDate();
        System.out.println("fecha inicio " + fechaInicio);
        Date fechaFin = jDateHasta.getDate();
        
        java.sql.Date inicio = new java.sql.Date(fechaInicio.getTime());
        System.out.println(" inicio: " + inicio);
        java.sql.Date fin = new java.sql.Date(fechaFin.getTime());
        
        if (fechaFin.compareTo(fechaInicio) <= 0) {

                JOptionPane.showMessageDialog(null, "La fecha inicial debe ser menor a la fecha final");

            }
        
        for (Historial1 object : mascotaData.historial(inicio, fin)) {
            Object[] fila = {
                object.getCliente().getIdCliente(),
                object.getCliente().getDni(),
                object.getCliente().getApellido(),
                object.getCliente().getNombre(),
                object.getMascota().getIdMascota(),
                object.getMascota().getRaza(),
                object.getMascota().getEspecie(),
                object.getMascota().getPesoActual(),
                object.getVisita().getIdVisita(),
                object.getVisita().getFechaTratamiento(),
                object.getTratamiento().getIdTratamiento(),
                object.getTratamiento().getTipoTratamiento(),
                object.getTratamiento().getImporte(),};
                modelo.addRow(fila);

        }

    }
    
    
    
    
}
