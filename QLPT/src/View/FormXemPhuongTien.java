/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.SqlContext;
import Controller.SqlController;
import Model.Account;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Khổng Văn Tuyên
 */
public class FormXemPhuongTien extends javax.swing.JFrame {
     private ArrayList<Account> list;
     
    /**
     * Creates new form FormXemPhuongTien
     */
     Connection conn;
    public FormXemPhuongTien() throws SQLException {
        initComponents();
        conn = SqlContext.getConn();
   
    }

        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_dangxuat = new javax.swing.JButton();
        btn_xemOto = new javax.swing.JButton();
        btn_xemXemay = new javax.swing.JButton();
        btn_xemXetai = new javax.swing.JButton();
        javax.swing.JLabel txtName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("MỜI BẠN CHỌN CHỨC NĂNG");

        jLabel2.setText("Xin chào :");

        btn_dangxuat.setText("Đăng xuất");
        btn_dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangxuatActionPerformed(evt);
            }
        });

        btn_xemOto.setText("Xem ô tô");
        btn_xemOto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemOtoActionPerformed(evt);
            }
        });

        btn_xemXemay.setText("Xem xe máy");
        btn_xemXemay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemXemayActionPerformed(evt);
            }
        });

        btn_xemXetai.setText("Xem xe tải");
        btn_xemXetai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemXetaiActionPerformed(evt);
            }
        });

        txtName.setText("txtName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dangxuat)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_xemOto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_xemXetai)
                        .addGap(109, 109, 109)
                        .addComponent(btn_xemXemay)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(229, 229, 229))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName)
                    .addComponent(btn_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xemXemay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xemXetai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xemOto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xemXetaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemXetaiActionPerformed
        // TODO add your handling code here:
        XemXeTai xetai = new XemXeTai();
        xetai.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_xemXetaiActionPerformed

    private void btn_dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangxuatActionPerformed
        // TODO add your handling code here:
        int dx = JOptionPane.showConfirmDialog(null,"Bạn có muốn đăng xuất?", "Đăng xuất!!!",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(dx == JOptionPane.YES_OPTION){
            MenuUser mn;
            try {
                mn = new MenuUser();
                 mn.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(FormXemPhuongTien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_dangxuatActionPerformed

    private void btn_xemOtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemOtoActionPerformed
        // TODO add your handling code here:
        XemOto oto = new XemOto();
        oto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_xemOtoActionPerformed

    private void btn_xemXemayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemXemayActionPerformed
        // TODO add your handling code here:
        XemXeMay xemay = new XemXeMay();
        xemay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_xemXemayActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormXemPhuongTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         //</editor-fold>
         
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new FormXemPhuongTien().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(FormXemPhuongTien.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dangxuat;
    private javax.swing.JButton btn_xemOto;
    private javax.swing.JButton btn_xemXemay;
    private javax.swing.JButton btn_xemXetai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}