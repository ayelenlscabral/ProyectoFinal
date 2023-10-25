package veterinaria.vistas;

//Fede
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import veterinaria.AccesoADatos.ClienteData;
import veterinaria.AccesoADatos.TratamientoData;
import veterinaria.AccesoADatos.TurnoData;
import veterinaria.Entidades.Cliente;
import veterinaria.Entidades.Empleado;
import veterinaria.Entidades.Turno;

public class Agenda extends javax.swing.JPanel {

    private boolean modo;
    private Empleado empleado;

     TratamientoData trataData = new TratamientoData();
     Turno turno = new Turno();
     TurnoData id = new TurnoData();
     ClienteData cliente = new ClienteData();
     Cliente cli = new Cliente();
    
    public Agenda(boolean modo, Empleado empleado) {

        initComponents();
        actualizarApariencia(modo);
        cargarCombos();
        this.modo = modo;
        this.empleado = empleado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcCalendario = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlMostrarC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcTrata = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jcCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 69, 390, 316));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agenda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 27, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 455, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 411, -1, -1));
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 403, 170, 32));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 505, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 596));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 350, -1));

        jbAgregar.setBackground(new java.awt.Color(91, 220, 107));
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/guardar.png"))); // NOI18N
        jbAgregar.setToolTipText("AGREGAR");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 130, 50));

        jbSalir.setBackground(new java.awt.Color(50, 119, 242));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jbSalir.setToolTipText("VOLVER");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 130, 50));

        jbEliminar.setBackground(new java.awt.Color(232, 62, 62));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/eliminar.png"))); // NOI18N
        jbEliminar.setToolTipText("ELIMINAR");
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 130, 50));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/limpiar.png"))); // NOI18N
        jbLimpiar.setToolTipText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 130, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 200, 35));

        jlMostrarC.setOpaque(true);
        jPanel1.add(jlMostrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 455, 300, 32));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tratamiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jcTrata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcTrata, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 200, 30));

        jbBuscar.setBackground(new java.awt.Color(0, 0, 153));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/buscar.png"))); // NOI18N
        jbBuscar.setToolTipText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 894, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();


    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        jtDni.setText("");
        

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
       
         //LocalDate fechaNac = (jdNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
         
        turno.getIdCliente();
        
        
        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        int Dni = Integer.parseInt(jtDni.getText());
        cli = cliente.buscarCliente(Dni);
        jlMostrarC.setText(cli.toString());
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void actualizarApariencia(boolean modo) {
        if (modo) {
            try {
                javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                javax.swing.SwingUtilities.updateComponentTreeUI(this);
                Color color = new Color(52, 55, 59);

                jtDni.setBackground(color);
                
                jtTabla.setBackground(color);
                jcCalendario.setBackground(color);
                
                jbAgregar.setBackground(color);
                jbEliminar.setBackground(color);
                jbLimpiar.setBackground(color);
                jbSalir.setBackground(color);
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

    
    private void cargarCombos() {
        jcTrata.removeAllItems();

        for (String categoria : trataData.listarTipoCategoria()) {
            if (!categoria.equalsIgnoreCase("TODO")) {

                jcTrata.addItem(categoria);

            }
        }
        jcTrata.setSelectedIndex(-1);

    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JCalendar jcCalendario;
    private javax.swing.JComboBox<String> jcTrata;
    private javax.swing.JLabel jlMostrarC;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
