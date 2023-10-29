package veterinaria.vistas;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.SwingUtilities;
import veterinaria.Entidades.Empleado;

public class About extends javax.swing.JPanel {

    private boolean modo;
    private Empleado empleado;

    public About(boolean modo, Empleado empleado) {
        initComponents();
        this.modo = modo;
        this.empleado = empleado;
        jLabelTitulo.setText("<html><u>PROGRAMADORES</u></html>");

        jEnlace.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    URI uri = new URI("https://github.com/Calgaro89/ProyectoFinal.git");
                    Desktop.getDesktop().browse(uri);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }

            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jVolver = new javax.swing.JButton();
        jLabelSanLuis = new javax.swing.JLabel();
        jLabelLaPunta = new javax.swing.JLabel();
        jLabelperrito = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jEnlace = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/volver.png"))); // NOI18N
        jVolver.setToolTipText("VOLVER");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });
        add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 487, 198, 79));

        jLabelSanLuis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/san luis.png"))); // NOI18N
        add(jLabelSanLuis, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 150, 97));

        jLabelLaPunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/la punta.png"))); // NOI18N
        add(jLabelLaPunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 295, 139));

        jLabelperrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/veterinaria.png"))); // NOI18N
        add(jLabelperrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 38, 418, 302));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cristian Calgaro");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 243, 35));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alberto Teran");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 163, 243, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Federico Santamaria");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 216, 243, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Maximiliano Sastre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 269, 243, 35));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("PROGRAMADORES");
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 38, 243, 38));

        jEnlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Recursos/github.png"))); // NOI18N
        add(jEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 50, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        Menu menu = new Menu(modo, empleado);
        menu.setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_jVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jEnlace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLaPunta;
    private javax.swing.JLabel jLabelSanLuis;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelperrito;
    private javax.swing.JButton jVolver;
    // End of variables declaration//GEN-END:variables
}
