
import MyFrames.AddCash;
import MyFrames.PerPro;
import MyFrames.PerDay;
import MyFrames.Transaction;
import MyFrames.UpdateStock;
import MyFrames.ViewCashier;
import MyFrames.ViewStock;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SAMEER
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        Cashview = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quick Bill");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 1350, 710));

        Cashview.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        Cashview.setForeground(new java.awt.Color(0, 0, 102));
        Cashview.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAMEER\\Desktop\\1575_-_Cashier-32.png")); 
        Cashview.setText("Cashier");
        Cashview.setBorder(null);
        Cashview.setContentAreaFilled(false);
        Cashview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashviewActionPerformed(evt);
            }
        });
        getContentPane().add(Cashview, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 10, 130, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tran.png"))); 
        jButton3.setText("Transaction");
        jButton3.setContentAreaFilled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock.png"))); 
        jButton4.setText("Stock");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 40));

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sale.png"))); 
        jButton5.setText("Sales");
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); 
        jButton6.setText("Exit");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1221, 10, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageedit_1_7245834402.jpg"))); 
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bk.jpg"))); 
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CashviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashviewActionPerformed
       
        // TODO add your handling code here:
        AddCash ac=new AddCash();
        this.desktop.add(ac);
        
        ac.setVisible(true);
    }//GEN-LAST:event_CashviewActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      UpdateStock us=new UpdateStock();
        this.desktop.add(us);
        
        us.setVisible(true);  // stock add  TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cashview;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
