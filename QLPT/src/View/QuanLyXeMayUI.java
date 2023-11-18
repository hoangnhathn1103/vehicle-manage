/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.SqlContext;
import Model.Vehicle;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.SqlController;
/**
 *
 * @author hoang
 */
public final class QuanLyXeMayUI extends javax.swing.JFrame {
    private ArrayList<Vehicle> list;
    DefaultTableModel model;
    
    /**
     * Creates new form QuanLyXeMayUI
     */
    SqlController sqlController;
    Connection conn;
    public QuanLyXeMayUI() throws SQLException {
        initComponents();
        conn = SqlContext.getConn();
        sqlController = new SqlController();
        this.setLocationRelativeTo(null);
        list = showXeMay();
        model = (DefaultTableModel) tbl_XeMay.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã phương tiện","Tên phương tiện","Hãng sản xuất","Loại phương tiện","Năm sản xuất","giá","Màu","Công suất"
        });
        showTableXeMay();
    }
    public ArrayList<Vehicle>showXeMay(){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        String sql = "select * from VEHICLE where VehType = 'xe máy'";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getString("Year"),rs.getString("Price"),rs.getString("Color"),
                        rs.getString("SeatNum"),rs.getString("EngineType"),rs.getString("Watt"),rs.getString("Tonn"));
                vehicleList.add(st);
            }
        } catch(SQLException e){
        }
        return vehicleList;
    }
    public void showTableXeMay(){
        for(Vehicle v:list){
            model.addRow(new Object[]{
                v.getVehicleId(),v.getVehicleName(),v.getMaker(),v.getVehType(),v.getYear(),v.getUnitPrice(),v.getColor(),v.getWattage()
            });
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_MaPT = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_TroLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_XeMay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 625));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ XE MÁY");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nhập mã phương tiện :");

        txt_MaPT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_Them.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_TimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_TroLai.setText("Trở lại");
        btn_TroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TroLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_MaPT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btn_TroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_MaPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btn_TroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        tbl_XeMay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phương tiện", "Tên phương tiện", "Hãng sản xuất", "Loại phương tiện", "Năm sản xuất", "Giá", "Màu", "Công suất"
            }
        ));
        jScrollPane1.setViewportView(tbl_XeMay);
        if (tbl_XeMay.getColumnModel().getColumnCount() > 0) {
            tbl_XeMay.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbl_XeMay.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbl_XeMay.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_XeMay.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbl_XeMay.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        ThemXeMayUI txm = new ThemXeMayUI();
        txm.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btn_ThemActionPerformed

    
    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        SuaXeMayUI sxm = new SuaXeMayUI();
        sxm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"Bạn có chắc muốn xóa?", "Xóa!!!",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            try{
                if(deleteVehicle(txt_MaPT.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
                    this.setLocationRelativeTo(null);
                    list = showXeMay();
                    model = (DefaultTableModel) tbl_XeMay.getModel();
                    model.getDataVector().removeAllElements();
                    model.setColumnIdentifiers(new Object[]{
                        "Mã phương tiện","Tên phương tiện","Hãng sản xuất","Loại phương tiện","Năm sản xuất","giá","Màu","Công suất"
                });
                    showTableXeMay();
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Xóa thất bại!");
                }
            }catch(HeadlessException e){
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed
    
    public boolean deleteVehicle(String VehID){
        String sql="delete from VEHICLE where VehID=?";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, VehID);
            return ps.executeUpdate()>0;
        } catch(SQLException e){
        }
        return false;
    }
    
    
    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        if(txt_MaPT.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ma phuong tien khong duoc de trong!");
            return;
        }
        
        try{
            Vehicle v = findXeMayById(txt_MaPT.getText());
            List<Vehicle> listVehicle = new ArrayList<>();
            listVehicle.add(v);
            showData(listVehicle);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Phuong tien khong tim thay!");
        }
    }//GEN-LAST:event_btn_TimKiemActionPerformed

     public Vehicle findXeMayById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ? and VehType='xe máy'";
        try{
            if(conn!=null) {
                System.out.println("Ket noi thanh cong!");
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getString("Year"));
                v.setUnitPrice(rs.getString("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getString("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getString("Watt"));
                v.setTonnage(rs.getString("Tonn"));
                return v;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    private void btn_TroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TroLaiActionPerformed
        FormQuanLyPT ql;
        try {
            ql = new FormQuanLyPT();
             ql.setVisible(true);
        this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyXeMayUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_TroLaiActionPerformed
    
    int i = 1;

    public void showResult() {
        Vehicle v = list.get(list.size() - 1);
        model.addRow(new Object[]{
            v.getVehicleId(),v.getVehicleName(),v.getMaker(),v.getVehType(),v.getYear(),v.getUnitPrice(),v.getColor(),v.getWattage()
        });
    }
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
            java.util.logging.Logger.getLogger(QuanLyXeMayUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new QuanLyXeMayUI().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyXeMayUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    public void showData(List<Vehicle> v){
        List<Vehicle> listVehicle = new ArrayList<>();
        listVehicle = v;
        DefaultTableModel tableModel;
        tbl_XeMay.getModel();
        tableModel=(DefaultTableModel)tbl_XeMay.getModel();
        tableModel.setRowCount(0);
        listVehicle.forEach((vehicle)->{
            tableModel.addRow(new Object[]{
                vehicle.getVehicleId(),vehicle.getVehicleName(),vehicle.getMaker(),vehicle.getVehType(),vehicle.getYear(),vehicle.getUnitPrice(),vehicle.getColor(),vehicle.getWattage()
            });
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_TroLai;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_XeMay;
    private javax.swing.JTextField txt_MaPT;
    // End of variables declaration//GEN-END:variables
}
