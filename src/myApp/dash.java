/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myApp;

import internalpages.dashpage;
import internalpages.reportpage;
import internalpages.settings;
import internalpages.userpage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Hariell
 */
public class dash extends javax.swing.JFrame {

    /**
     * Creates new form dash
     */
    public dash() {
        initComponents();
    Toolkit  toolkit  = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }
    
    Color navcolor = new Color(0,153,255);
    Color bodycolor = new Color(0,255,102);
    Color headercolor = new Color(255, 102, 0);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        UserPage = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        d3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        UserPage1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        d6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Accounting = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        d4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dashBoard = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        d5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        report = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        d7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        UserPage3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        d8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mainDesktopPane = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(759, 574));
        jPanel2.setLayout(null);

        nav.setBackground(new java.awt.Color(0, 153, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserPage.setBackground(new java.awt.Color(0, 153, 255));
        UserPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserPageMouseExited(evt);
            }
        });
        UserPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("USERPAGE");
        UserPage.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        d3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d3MouseExited(evt);
            }
        });
        d3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DASH");
        d3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        UserPage.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        UserPage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserPage1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserPage1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserPage1MouseExited(evt);
            }
        });
        UserPage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("USERPAGE");
        UserPage1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        d6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d6MouseExited(evt);
            }
        });
        d6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("DASH");
        d6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        UserPage1.add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        UserPage.add(UserPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 40));

        nav.add(UserPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 40));

        Accounting.setBackground(new java.awt.Color(0, 153, 255));
        Accounting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountingMouseExited(evt);
            }
        });
        Accounting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ACCOUNTING");
        Accounting.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        d4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d4MouseExited(evt);
            }
        });
        d4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DASH");
        d4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        Accounting.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        nav.add(Accounting, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, 40));

        dashBoard.setBackground(new java.awt.Color(0, 153, 255));
        dashBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashBoardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashBoardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashBoardMouseExited(evt);
            }
        });
        dashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DASHBOARD");
        dashBoard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        d5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d5MouseExited(evt);
            }
        });
        d5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DASH");
        d5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        dashBoard.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        nav.add(dashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 40));

        report.setBackground(new java.awt.Color(0, 153, 255));
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
        });
        report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("REPORT");
        report.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        d7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d7MouseExited(evt);
            }
        });
        d7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("DASH");
        d7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        report.add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        UserPage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserPage3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserPage3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserPage3MouseExited(evt);
            }
        });
        UserPage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("USERPAGE");
        UserPage3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        d8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d8MouseExited(evt);
            }
        });
        d8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("DASH");
        d8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 130, 18));

        UserPage3.add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        report.add(UserPage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 40));

        nav.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ct.jpg"))); // NOI18N
        nav.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 710));

        jPanel2.add(nav);
        nav.setBounds(0, 0, 190, 710);

        header.setBackground(new java.awt.Color(255, 102, 0));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Familymart-Malaysia.jpg"))); // NOI18N
        header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 70));

        jPanel2.add(header);
        header.setBounds(190, 0, 560, 70);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fam.jpg"))); // NOI18N

        mainDesktopPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE)
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 640, Short.MAX_VALUE)
        );

        jPanel2.add(mainDesktopPane);
        mainDesktopPane.setBounds(190, 70, 560, 640);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 750, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void d3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_d3MouseEntered

    private void d3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_d3MouseExited

    private void UserPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPageMouseEntered
       UserPage.setBackground(bodycolor);
    }//GEN-LAST:event_UserPageMouseEntered

    private void UserPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPageMouseExited
       UserPage.setBackground(navcolor);
    }//GEN-LAST:event_UserPageMouseExited

    private void d4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_d4MouseEntered

    private void d4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_d4MouseExited

    private void AccountingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountingMouseEntered
        Accounting.setBackground(bodycolor);
    }//GEN-LAST:event_AccountingMouseEntered

    private void AccountingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountingMouseExited
       Accounting.setBackground(navcolor);
    }//GEN-LAST:event_AccountingMouseExited

    private void d5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_d5MouseEntered

    private void d5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_d5MouseExited

    private void dashBoardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashBoardMouseEntered
        dashBoard.setBackground(bodycolor);
    }//GEN-LAST:event_dashBoardMouseEntered

    private void dashBoardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashBoardMouseExited
        dashBoard.setBackground(navcolor);
    }//GEN-LAST:event_dashBoardMouseExited

    private void dashBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashBoardMouseClicked
        dashpage up = new dashpage();
        mainDesktopPane.add(up).setVisible(true);
    }//GEN-LAST:event_dashBoardMouseClicked

    private void UserPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPageMouseClicked
        userpage up = new userpage();
        mainDesktopPane.add(up).setVisible(true);
    }//GEN-LAST:event_UserPageMouseClicked

    private void AccountingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountingMouseClicked
        settings sp = new settings();
        mainDesktopPane.add(sp).setVisible(true);
    }//GEN-LAST:event_AccountingMouseClicked

    private void d6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_d6MouseEntered

    private void d6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_d6MouseExited

    private void UserPage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPage1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPage1MouseClicked

    private void UserPage1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPage1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPage1MouseEntered

    private void UserPage1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPage1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPage1MouseExited

    private void d7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_d7MouseEntered

    private void d7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_d7MouseExited

    private void d8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_d8MouseEntered

    private void d8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_d8MouseExited

    private void UserPage3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPage3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPage3MouseClicked

    private void UserPage3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPage3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPage3MouseEntered

    private void UserPage3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserPage3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPage3MouseExited

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
         reportpage sp = new reportpage();
        mainDesktopPane.add(sp).setVisible(true);
    }//GEN-LAST:event_reportMouseClicked

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
       report.setBackground(bodycolor);
    }//GEN-LAST:event_reportMouseEntered

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setBackground(navcolor);
    }//GEN-LAST:event_reportMouseExited

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
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Accounting;
    private javax.swing.JPanel UserPage;
    private javax.swing.JPanel UserPage1;
    private javax.swing.JPanel UserPage3;
    private javax.swing.JPanel d3;
    private javax.swing.JPanel d4;
    private javax.swing.JPanel d5;
    private javax.swing.JPanel d6;
    private javax.swing.JPanel d7;
    private javax.swing.JPanel d8;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDesktopPane mainDesktopPane;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel report;
    // End of variables declaration//GEN-END:variables
}
