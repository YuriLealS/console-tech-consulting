/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.local.app;

import com.mycompany.local.app.amostraDados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Timer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.springframework.jdbc.core.BeanPropertyRowMapper;



/**
 *
 * @author FP594HT
 */
public class TeladeLogin extends javax.swing.JFrame {

    /**
     * Creates new form TeladeLogin
     */
    public TeladeLogin() {
        initComponents();
    }
//    Integer IdMaquinaInteger;
    
    amostraDados Hpage = new amostraDados();
    String idMaquina;
    Log log = new Log();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        emailUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        senhaUsuario = new javax.swing.JPasswordField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IdMaquinaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("72", 0, 18)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(13, 33, 161));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n\nConsole Tech \nConsulting");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 800, 320));

        emailUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        emailUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emailUsuarioMouseReleased(evt);
            }
        });
        getContentPane().add(emailUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 400, 210, 40));

        jButton1.setText("Login");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 550, 90, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Email:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 370, 70, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 450, 60, 34));

        senhaUsuario.setText("jPasswordField1");
        senhaUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        senhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(senhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, 210, 40));

        jScrollPane3.setBorder(null);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(13, 33, 161));
        jTextArea3.setRows(5);
        jTextArea3.setText("Acesse e acompanhe os dados de suas\nmáquinas em tempo real");
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setBorder(null);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 520, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image5.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, 200, 190));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 33, 161));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 690, 1290, 20));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 33, 161));
        jLabel5.setText("__________________________________________________________________________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 1130, -1));

        IdMaquinaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdMaquinaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(IdMaquinaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 490, 90, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("ID Maquina:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 450, 100, 34));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaUsuarioActionPerformed

    private void emailUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailUsuarioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emailUsuarioMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        
        try {
                 ConexaoAzure conexaoAzure = new ConexaoAzure();
            conexaoAzure.conectarAzure();
           
                    String username = emailUsuario.getText();
                    String passwd = senhaUsuario.getText();
                    idMaquina = IdMaquinaField.getText();
                    String login = "SELECT * FROM Funcionario WHERE email = '"+username+"' and senha = '"+passwd+"'";
                    
                    List<validacaoLogin> emailSenha = conexaoAzure.getConnectionAzure().query("SELECT * FROM Funcionario WHERE email = '"+username+"' and senha = '"+passwd+"'", new BeanPropertyRowMapper(validacaoLogin.class));
                    
                    
                    if (!emailSenha.isEmpty()) {
                dispose();
                //Seria a home com hardwares listados e dados;
                Hpage.show();
                log.gerarLog(username, Integer.valueOf(idMaquina));
                TesteSistema iniciarDados = new TesteSistema(Integer.valueOf(idMaquina));
                iniciarDados.exec();
                
                
                
            } else {
                        JOptionPane.showMessageDialog(this, "Email ou senha inválido");
                        emailUsuario.setText("");                        
                        senhaUsuario.setText("");
                        IdMaquinaField.setText("");
                    }
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    
      
 

    private void IdMaquinaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdMaquinaFieldActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_IdMaquinaFieldActionPerformed

 

   

   

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
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdMaquinaField;
    private javax.swing.JTextField emailUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JPasswordField senhaUsuario;
    // End of variables declaration//GEN-END:variables
}
