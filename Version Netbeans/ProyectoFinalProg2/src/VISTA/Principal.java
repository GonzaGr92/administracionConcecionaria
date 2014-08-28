/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 12/06/2014, 11:05:46
 */
package VISTA;

import javax.swing.GroupLayout;
import CONTROL.ControlConcecionaria;
import Excepciones.SinAutoExcep;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private ControlConcecionaria ctrl;

    public Principal() {
        super("Principal");
        initComponents();
        ctrl = new ControlConcecionaria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consCliente = new javax.swing.JButton();
        regCliente = new javax.swing.JButton();
        consVehi = new javax.swing.JButton();
        ingrVehi = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        guardar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuCC = new javax.swing.JMenuItem();
        jMenuRC = new javax.swing.JMenuItem();
        jMenuCV = new javax.swing.JMenuItem();
        jMenuRV = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion Concecionaria");
        setBounds(new java.awt.Rectangle(100, 200, 640, 480));
        setResizable(false);

        consCliente.setText("Consultar Clientes");
        consCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consClienteActionPerformed(evt);
            }
        });

        regCliente.setText("Registrar Cliente");
        regCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        regCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regClienteActionPerformed(evt);
            }
        });

        consVehi.setText("Consultar Vehiculos");
        consVehi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consVehiActionPerformed(evt);
            }
        });

        ingrVehi.setText("Ingresar Vehiculo");
        ingrVehi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingrVehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingrVehiActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jMenuBar1.setToolTipText("");

        jMenu1.setText("Archivo");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jMenu1.add(guardar);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuCC.setText("Consultar Cliente");
        jMenuCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCCActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCC);

        jMenuRC.setText("Registrar Cliente");
        jMenuRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRCActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRC);

        jMenuCV.setText("Consultar Vehiculo");
        jMenuCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCVActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCV);

        jMenuRV.setText("Registrar Vehiculo");
        jMenuRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRVActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRV);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem2.setText("Info. Concecionaria");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator1);

        jMenuItem7.setText("Acerca de...");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consVehi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ingrVehi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(consCliente)
                .addGap(18, 18, 18)
                .addComponent(regCliente)
                .addGap(18, 18, 18)
                .addComponent(consVehi)
                .addGap(18, 18, 18)
                .addComponent(ingrVehi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consClienteActionPerformed
        ConsultaCliente c = new ConsultaCliente(ctrl);
        c.setVisible(true);
    }//GEN-LAST:event_consClienteActionPerformed

    private void regClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regClienteActionPerformed
        try {
            RegistrarCliente r = new RegistrarCliente(ctrl);
            r.setVisible(true);
        } catch (SinAutoExcep ex) {
            JOptionPane.showMessageDialog(null, "No tiene autos disponibles para vender, deber registrar uno");
        }
    }//GEN-LAST:event_regClienteActionPerformed

    private void consVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consVehiActionPerformed
        ConsultarVehiculos cv = new ConsultarVehiculos(ctrl);
        cv.setVisible(true);
    }//GEN-LAST:event_consVehiActionPerformed

    private void ingrVehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingrVehiActionPerformed
        IngresarVehiculo iv = new IngresarVehiculo(ctrl);
        iv.setVisible(true);
    }//GEN-LAST:event_ingrVehiActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Salir s = new Salir(ctrl);
        s.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void jMenuCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCCActionPerformed
        ConsultaCliente c = new ConsultaCliente(ctrl);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuCCActionPerformed

    private void jMenuRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRCActionPerformed
        try {
            RegistrarCliente r = new RegistrarCliente(ctrl);
            r.setVisible(true);
        } catch (SinAutoExcep ex) {
            JOptionPane.showMessageDialog(null, "No tiene autos disponibles para vender, deber registrar uno");
        }
    }//GEN-LAST:event_jMenuRCActionPerformed

    private void jMenuCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCVActionPerformed
        ConsultarVehiculos cv = new ConsultarVehiculos(ctrl);
        cv.setVisible(true);
    }//GEN-LAST:event_jMenuCVActionPerformed

    private void jMenuRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRVActionPerformed
        IngresarVehiculo iv = new IngresarVehiculo(ctrl);
        iv.setVisible(true);
    }//GEN-LAST:event_jMenuRVActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        Salir s = new Salir(ctrl);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        ctrl.guardar();
    }//GEN-LAST:event_guardarActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        AcercaDe ac= new AcercaDe();
        ac.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        InfoConcecionaria ic = new InfoConcecionaria(ctrl);
        ic.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consCliente;
    private javax.swing.JButton consVehi;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JButton ingrVehi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCC;
    private javax.swing.JMenuItem jMenuCV;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuRC;
    private javax.swing.JMenuItem jMenuRV;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton regCliente;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}