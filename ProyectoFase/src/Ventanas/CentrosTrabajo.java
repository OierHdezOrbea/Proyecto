/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Controladora.Controladora;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CentrosTrabajo extends javax.swing.JFrame {

    public void VaciarControles(){
    
        JTNumCentro.setText("");
        JTNombre.setText("");
        JTCalle.setText("");
        JTTelefono.setText("");
        JTCP.setText("");
        JTCiudad.setText("");
        JTProvincia.setText("");
    }
    
    public boolean Validar(){
      
     
     boolean flag = true;   
     Pattern pat = Pattern.compile("[09]{6}");
     Matcher mat = pat.matcher(JTNumCentro.getText());
     if (!mat.matches())
     {
         flag = false;
         JTNumCentro.setBackground(Color.pink);
     }
     
    
     if (JTNombre.getText().length()<=3 && JTNombre.getText().length()>=20)
     {
         flag = false;
         JTNombre.setBackground(Color.pink);
     }
     
     if (JTCalle.getText().length()<=3 && JTCalle.getText().length()>=20)
     {
         flag = false;
         JTCalle.setBackground(Color.pink);
     }
     
     pat = Pattern.compile("^[9|6][0-9]{8}$");
     mat = pat.matcher(JTTelefono.getText());
     if (!mat.matches())
     {
         flag = false;
         JTTelefono.setBackground(Color.pink);
     }
     
     
     pat = Pattern.compile("[0-9]{5}");
     mat = pat.matcher(JTCP.getText());
     if (!mat.matches())
     {
         flag = false;
         JTCP.setBackground(Color.pink);
     }
     
     if (JTCiudad.getText().length()<=3 && JTCiudad.getText().length()>=20)
     {
         flag = false;
         JTCiudad.setBackground(Color.pink);
     }
     
      if (JTProvincia.getText().length()<=3 && JTProvincia.getText().length()>=20)
     {
         flag = false;
         JTProvincia.setBackground(Color.pink);
     }
     
     
     return flag;
    
        
    }
    public CentrosTrabajo() {
        initComponents();
        JBConsultar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTNumCentro = new javax.swing.JTextField();
        JTCalle = new javax.swing.JTextField();
        JTNombre = new javax.swing.JTextField();
        JTTelefono = new javax.swing.JTextField();
        JTCP = new javax.swing.JTextField();
        JTCiudad = new javax.swing.JTextField();
        JTProvincia = new javax.swing.JTextField();
        JBConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de Centro");

        jLabel2.setText("Nombre");

        jLabel3.setText("Calle");

        jLabel4.setText("Telefono");

        jLabel5.setText("Cod. Postal");

        jLabel6.setText("Ciudad");

        jLabel7.setText("Provincia");

        JTCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCalleActionPerformed(evt);
            }
        });

        JTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTelefonoActionPerformed(evt);
            }
        });

        JBConsultar.setText("Consultar");
        JBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTNumCentro)
                                    .addComponent(JTNombre)
                                    .addComponent(JTCalle)
                                    .addComponent(JTTelefono)
                                    .addComponent(JTCP)
                                    .addComponent(JTCiudad)
                                    .addComponent(JTProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTNumCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JTCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(JTProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(Validar())
       {
            try{                   
                Controladora.altaCentroTrabajo(
                                            Integer.parseInt(JTNumCentro.getText()),
                                            JTNombre.getText(),
                                            JTCalle.getText(),
                                            JTTelefono.getText(),
                                            JTCP.getText(),
                                            JTCiudad.getText(),
                                            JTProvincia.getText());                               
                             
                javax.swing.JOptionPane.showMessageDialog(this,"Alta realizada");            
                VaciarControles();
                }
            catch(Exception e)
            {
                javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el alta " + e.getMessage());
            }
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsultarActionPerformed
        try{
            
            String mensaje = "";
            if((JTNumCentro.getText().isEmpty()) && (JTNombre.getText().isEmpty()) )
            {
              JOptionPane.showMessageDialog(this, "Para realizar una busqueda es necesario al menos, o bien el Número de centro o el Nombre del centro");
            }
            else
            {
                if(!JTNumCentro.getText().isEmpty())
                {
                    Controladora.consultarPorCentroNum(Integer.parseInt(JTNumCentro.getText()));
                }
                else
                {
                    if(!JTNombre.getText().isEmpty())
                    {
                        Controladora.consutlarPorCentroNombre(JTNombre.getText());
                    }
                }
            }
            javax.swing.JOptionPane.showMessageDialog(this,mensaje);
            VaciarControles();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la consulta " + e.getMessage());
        }        
    }//GEN-LAST:event_JBConsultarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          if (Validar())
          {
              try{
           
                    String mensaje = "";
                    if(!JTNumCentro.getText().isEmpty() &&
                       !JTNombre.getText().isEmpty()    &&
                       !JTCalle.getText().isEmpty()     &&    
                       !JTTelefono.getText().isEmpty()  &&
                       !JTCP.getText().isEmpty()        &&
                       !JTCiudad.getText().isEmpty()    &&
                       !JTProvincia.getText().isEmpty() )
                    {
                        Controladora.modificarCentroTrabajo(Integer.parseInt(JTNumCentro.getText()),
                                                    JTNombre.getText(),
                                                    JTCalle.getText(),
                                                    JTTelefono.getText(),
                                                    JTCP.getText(),
                                                    JTCiudad.getText(),
                                                    JTProvincia.getText());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Para realizar una modificacion es necesario contar con todos los datos");
                    }                
                    VaciarControles();
                }
                catch(Exception e)
            {
                javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la consulta " + e.getMessage());
            } 
          }             
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            
            if(!JTNumCentro.getText().isEmpty())
            {
                int n= JOptionPane.showConfirmDialog(this, "El borrado es una operacion irreversible, y solo podrá llevarse a cabo si no hay ningun trabajador asignado a este centro de trabajo"
                        + "(\n ¿ Esta seguro de que desea realizar el borrado?)");
                if(n==0)
                {   
                    Controladora.bajaCentroTrabajo(Integer.parseInt(JTNumCentro.getText()));
                    }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Para realizar un borrado es necesario contar con el numero de centro, si no lo tienes, prueba a hacer primero una consulta");
            }                
            VaciarControles();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas con la consulta " + e.getMessage());
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCalleActionPerformed

    private void JTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(CentrosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentrosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentrosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentrosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentrosTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBConsultar;
    private javax.swing.JTextField JTCP;
    private javax.swing.JTextField JTCalle;
    private javax.swing.JTextField JTCiudad;
    private javax.swing.JTextField JTNombre;
    private javax.swing.JTextField JTNumCentro;
    private javax.swing.JTextField JTProvincia;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
