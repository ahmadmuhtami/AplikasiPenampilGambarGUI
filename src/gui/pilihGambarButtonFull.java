/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Lenovo
 */
public class pilihGambarButtonFull extends javax.swing.JFrame {

    /**
     * Creates new form pilihGambarButtonFull
     */
    public pilihGambarButtonFull() {
        initComponents();
    }

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
        imagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        uniskaBT = new javax.swing.JButton();
        PutihBT = new javax.swing.JButton();
        hitamBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/logo-uniska.png"))); // NOI18N
        imagePanel.add(jLabel1, "0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/WhatsApp Image 2022-11-27 at 20.12.51.jpeg"))); // NOI18N
        imagePanel.add(jLabel2, "1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/WhatsApp Image 2022-11-27 at 20.12.52.jpeg"))); // NOI18N
        imagePanel.add(jLabel3, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        uniskaBT.setText("Foto Uniska");
        uniskaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniskaBTActionPerformed(evt);
            }
        });
        jPanel2.add(uniskaBT);

        PutihBT.setText("Foto Java Putih");
        PutihBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PutihBTActionPerformed(evt);
            }
        });
        jPanel2.add(PutihBT);

        hitamBT.setText("Foto Java Hitam");
        hitamBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitamBTActionPerformed(evt);
            }
        });
        jPanel2.add(hitamBT);

        exitBT.setText("exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        jPanel2.add(exitBT);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uniskaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniskaBTActionPerformed
        // TODO add your handling code here:
         CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel, "0");
    }//GEN-LAST:event_uniskaBTActionPerformed

    private void PutihBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PutihBTActionPerformed
        // TODO add your handling code here:
         CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel, "1");
    }//GEN-LAST:event_PutihBTActionPerformed

    private void hitamBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitamBTActionPerformed
        // TODO add your handling code here:
         CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel, "2");
    }//GEN-LAST:event_hitamBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

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
            java.util.logging.Logger.getLogger(pilihGambarButtonFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pilihGambarButtonFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pilihGambarButtonFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pilihGambarButtonFull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pilihGambarButtonFull fullFrame = new pilihGambarButtonFull();                
                GraphicsDevice  device=
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PutihBT;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton hitamBT;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton uniskaBT;
    // End of variables declaration//GEN-END:variables
}
