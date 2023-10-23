package veterinaria.vistas;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        cargarTabla();
        this.modo = modo;
        this.empleado = empleado;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBusquedaMascota = new javax.swing.JLabel();
        jBotonBusquedaMascota = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBotonSalir = new javax.swing.JButton();
        jBusquedaMascota1 = new javax.swing.JLabel();
        jBotonBusquedaFecha = new javax.swing.JButton();
        jBusquedaMascota2 = new javax.swing.JLabel();
        jBotonBusquedaCliente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jBusquedaMascota.setBackground(new java.awt.Color(255, 0, 0));
        jBusquedaMascota.setForeground(new java.awt.Color(255, 255, 255));
        jBusquedaMascota.setText("FILTRO POR ID DE MASCOTA:");

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

        jTabla.setBackground(new java.awt.Color(255, 255, 255));
        jTabla.setForeground(new java.awt.Color(51, 153, 255));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id Cliente", "dni Cliente", "Apellido Ciente", "Nombre Cliente", "Mascota", "raza", "Ultimo peso ", "Peso promedio Masc", "Fecha de visita", "Tratamiento", "Importe", "Id Mascota", "Title 13", "Title 14"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, false, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla.setGridColor(new java.awt.Color(51, 204, 255));
        jScrollPane1.setViewportView(jTabla);

        jBotonSalir.setBackground(new java.awt.Color(51, 51, 255));
        jBotonSalir.setForeground(new java.awt.Color(204, 255, 255));
        jBotonSalir.setText("SALIR");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        jBusquedaMascota1.setBackground(new java.awt.Color(255, 0, 0));
        jBusquedaMascota1.setForeground(new java.awt.Color(255, 255, 255));
        jBusquedaMascota1.setText("FILTRO POR FECHA:");

        jBotonBusquedaFecha.setBackground(new java.awt.Color(51, 153, 255));
        jBotonBusquedaFecha.setForeground(new java.awt.Color(255, 255, 255));
        jBotonBusquedaFecha.setText("OK");
        jBotonBusquedaFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        jBotonBusquedaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBusquedaFechaActionPerformed(evt);
            }
        });

        jBusquedaMascota2.setBackground(new java.awt.Color(255, 0, 0));
        jBusquedaMascota2.setForeground(new java.awt.Color(255, 255, 255));
        jBusquedaMascota2.setText("FILTRO POR ID DE CLIENTE");

        jBotonBusquedaCliente.setBackground(new java.awt.Color(51, 153, 255));
        jBotonBusquedaCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBotonBusquedaCliente.setText("OK");
        jBotonBusquedaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        jBotonBusquedaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBusquedaClienteActionPerformed(evt);
            }
        });

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
                        .addGap(163, 163, 163)
                        .addComponent(jBusquedaMascota2)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jBusquedaMascota)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonBusquedaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jBusquedaMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBotonBusquedaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(jLTitulo)
                        .addGap(198, 198, 198)
                        .addComponent(jBotonSalir)))
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBusquedaMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonBusquedaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBusquedaMascota1)
                    .addComponent(jBotonBusquedaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBusquedaMascota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
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

    private void jBotonBusquedaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBusquedaFechaActionPerformed

        Date fechaDate = visita.getFechaTratamiento();


    }//GEN-LAST:event_jBotonBusquedaFechaActionPerformed

    private void jBotonBusquedaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBusquedaMascotaActionPerformed


    }//GEN-LAST:event_jBotonBusquedaMascotaActionPerformed


    private void jBotonBusquedaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBusquedaClienteActionPerformed


    }//GEN-LAST:event_jBotonBusquedaClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonBusquedaCliente;
    private javax.swing.JButton jBotonBusquedaFecha;
    private javax.swing.JButton jBotonBusquedaMascota;
    private javax.swing.JButton jBotonSalir;
    private javax.swing.JLabel jBusquedaMascota;
    private javax.swing.JLabel jBusquedaMascota1;
    private javax.swing.JLabel jBusquedaMascota2;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel cabecera() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("idCliente");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("idMascota");
        modelo.addColumn("Alias");
        modelo.addColumn("Especie");
        modelo.addColumn("Peso Promedio");
        modelo.addColumn("Peso Actual");
        modelo.addColumn("idVisita");
        modelo.addColumn("Fecha de Visita");
        modelo.addColumn("idTratamiento");
        modelo.addColumn("Tipo de Tratamiento");
        modelo.addColumn("Importe");

        return modelo;

    }

    private void obtenerClientes() {
        DefaultTableModel modelo = new DefaultTableModel();
        ClienteData clienteData = new ClienteData();
        ArrayList<Cliente> listaClientes = clienteData.listarClientes();
        for (Cliente cliente : listaClientes) {
            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getDni(),
                cliente.getApellido(),
                cliente.getNombre(),});
        }
    }

     private void actualizarApariencia(boolean modo) {
        if (modo) {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
                Color color = new Color(52, 55, 59);
                this.setBackground(color);
    
                 
                jPanel1.setBackground(color);
                jTabla.setBackground(color);
                jBotonBusquedaCliente.setBackground(color);
                jBotonBusquedaFecha.setBackground(color);
                jBotonBusquedaMascota.setBackground(color);
                jBotonSalir.setBackground(color);
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

        DefaultTableModel modelo = cabecera();

        List<Cliente> clientes = clienteData.listarClientes();
        List<Mascota> mascotas = mascotaData.listarMascotasParaHistorial();
        List<Visita> visitas = visitaData.listarVisita();
        List<Tratamiento> tratamientos = tratamientoData.listarTratamientos();

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            Mascota mascota = mascotas.get(i);
            Visita visita = visitas.get(i);
            Tratamiento tratamiento = tratamientos.get(i);

            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getDni(),
                cliente.getApellido(),
                cliente.getNombre(),
                mascota.getIdMascota(),
                mascota.getAlias(),
                mascota.getEspecie(),
                mascota.getPesoPromedio(),
                mascota.getPesoActual(),
                visita.getIdVisita(),
                visita.getFechaTratamiento(),
                tratamiento.getIdTratamiento(),
                tratamiento.getTipoTratamiento(),
                tratamiento.getImporte(),});
        }
        jTabla.setModel(modelo);
    }

    
    
}
