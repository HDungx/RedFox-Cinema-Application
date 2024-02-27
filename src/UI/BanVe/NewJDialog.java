package UI.BanVe;

import Controller.DBConnection;
import DAO.BanVeDAO;
import Model.GheNgoi;
import Model.NhanVien;
import static UI.BanVe.DialogChonVe.lblThanhTien;
//import static UI.BanVe.DialogChonVe.selectedGheNgoiMap;
import static UI.BanVePanel.tblDSPhim;
import static UI.BanVePanel.tblDSSuatChieu;
import UI.LoginFrame;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJDialog extends javax.swing.JDialog {

    Map<String, GheNgoi> selectedGheNgoiMap = new HashMap<>();

    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public NewJDialog(java.awt.Frame parent, boolean modal, Map<String, GheNgoi> selectedGheNgoiMap) {
        this(parent, modal);
        this.selectedGheNgoiMap = selectedGheNgoiMap;
        setLocationRelativeTo(this);
        //initComponents();
        setDataToTable();
        setThongTin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMaSuat = new javax.swing.JLabel();
        lblTenPhim = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblNgayChieu = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblGioChieu = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblDinhDang = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblPhongChieu = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongTinGhe = new javax.swing.JTable();
        btnInve = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(805, 612));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tickets.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 67, 148));
        jLabel2.setText("Thông tin vé bán");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 72, 165));
        jLabel3.setText("Vui lòng kiểm tra thông tin trước khi xuất vé");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 72, 165));
        jLabel4.setText("Thông tin suất");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Mã suất:");

        lblMaSuat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMaSuat.setText("S001");
        lblMaSuat.setPreferredSize(new java.awt.Dimension(140, 20));

        lblTenPhim.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTenPhim.setText("S001");
        lblTenPhim.setPreferredSize(new java.awt.Dimension(140, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Tên phim:");

        lblNgayChieu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNgayChieu.setText("S001");
        lblNgayChieu.setPreferredSize(new java.awt.Dimension(140, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Ngày chiếu:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Giờ chiếu:");

        lblGioChieu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblGioChieu.setText("S001");
        lblGioChieu.setPreferredSize(new java.awt.Dimension(140, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Định dạng:");

        lblDinhDang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDinhDang.setText("S001");
        lblDinhDang.setPreferredSize(new java.awt.Dimension(140, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Phòng:");

        lblPhongChieu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPhongChieu.setText("S001");
        lblPhongChieu.setPreferredSize(new java.awt.Dimension(140, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(55, 72, 165));
        jLabel17.setText("Thông tin ghế");

        tblThongTinGhe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblThongTinGhe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ghế", "Số ghế", "Loại", "Phụ thu", "Giá vé", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tblThongTinGhe);

        btnInve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInve.setText("In vé");
        btnInve.setPreferredSize(new java.awt.Dimension(120, 35));
        btnInve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInveActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setPreferredSize(new java.awt.Dimension(120, 35));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Tổng tiền:");

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 51, 51));
        lblTongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongTien.setPreferredSize(new java.awt.Dimension(170, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("VNĐ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhongChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDinhDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaSuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGioChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblMaSuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblNgayChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblGioChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblDinhDang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblPhongChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInveActionPerformed
        // TODO add your handling code here:
        thanhtoan();
    }//GEN-LAST:event_btnInveActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnHuy;
    public static javax.swing.JButton btnInve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDinhDang;
    private javax.swing.JLabel lblGioChieu;
    private javax.swing.JLabel lblMaSuat;
    private javax.swing.JLabel lblNgayChieu;
    private javax.swing.JLabel lblPhongChieu;
    private javax.swing.JLabel lblTenPhim;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JTable tblThongTinGhe;
    // End of variables declaration//GEN-END:variables
 Connection con;
    Statement st;
    ResultSet rs;
    BanVeDAO bvDao = new BanVeDAO();

    void decorateTable() {
        tblThongTinGhe.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        tblThongTinGhe.getTableHeader().setBackground(new Color(23, 70, 162));
        tblThongTinGhe.getTableHeader().setForeground(Color.DARK_GRAY);
        tblThongTinGhe.setRowHeight(30);

        //  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        // centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        //tblThongTinGhe.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
    }

    void setDataToTable() {
        DefaultTableModel model = (DefaultTableModel) tblThongTinGhe.getModel();
        for (Map.Entry<String, GheNgoi> entry : selectedGheNgoiMap.entrySet()) {
            String viTriGhe = entry.getKey();
            GheNgoi gheNgoi = entry.getValue();

            model.addRow(new Object[]{
                gheNgoi.getId_ghe(), viTriGhe, gheNgoi.getLoaighe(), getphuThu(gheNgoi.getLoaighe()), (bvDao.getGiaVe((String) DialogChonVe.cboLoaiVe.getSelectedItem())) + (bvDao.getPhuThuDinhDangPhim((String) tblDSSuatChieu.getValueAt(tblDSSuatChieu.getSelectedRow(), 0))),
                (getphuThu(gheNgoi.getLoaighe()) + bvDao.getGiaVe((String) DialogChonVe.cboLoaiVe.getSelectedItem())) + (bvDao.getPhuThuDinhDangPhim((String) tblDSSuatChieu.getValueAt(tblDSSuatChieu.getSelectedRow(), 0)))
            });

        }
    }

    void setThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String ngaychieu = sdf.format(tblDSSuatChieu.getValueAt(tblDSSuatChieu.getSelectedRow(), 1));
        String phongchieu = tblDSSuatChieu.getValueAt(tblDSSuatChieu.getSelectedRow(), 5).toString();
        lblMaSuat.setText((String) tblDSSuatChieu.getValueAt(tblDSSuatChieu.getSelectedRow(), 0));
        lblTenPhim.setText((String) tblDSPhim.getValueAt(tblDSPhim.getSelectedRow(), 1));
        lblNgayChieu.setText(ngaychieu);
        lblGioChieu.setText((String) tblDSSuatChieu.getValueAt(tblDSSuatChieu.getSelectedRow(), 2));
        lblDinhDang.setText((String) tblDSSuatChieu.getValueAt(tblDSSuatChieu.getSelectedRow(), 3));
        lblPhongChieu.setText(phongchieu);
        lblTongTien.setText(lblThanhTien.getText());
    }

    int getphuThu(String id_loaighe) {
        int phuthu = 0;
        try {
            con = DBConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from loaighe where id_loaighe='" + id_loaighe + "'");
            if (rs.next()) {
                phuthu = rs.getInt("phuthu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DialogThongTinVeBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return phuthu;
    }

    void thanhtoan() {
        //
        try {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String ngayban = sdf.format(date);
            //
            int tongtien = 0;
            //
            String id_suatchieu = lblMaSuat.getText();
            //
            String id_giave = bvDao.getId_giave((String) DialogChonVe.cboLoaiVe.getSelectedItem());
            //
            int id_ghe;
            //
            String idnv = "";
            for (NhanVien nv : LoginFrame.list) {
                idnv = nv.getMaNV();
            }
            //
            String id_kh = "";
            id_kh = bvDao.getID_KH(DialogChonVe.txtSDTKH.getText());
            //
            for (int i = 0; i < tblThongTinGhe.getRowCount(); i++) {
                id_ghe = (int) tblThongTinGhe.getValueAt(i, 0);
                tongtien = (int) tblThongTinGhe.getValueAt(i, 5);
                // System.out.println(ngayban+":"+tongtien+":"+id_suatchieu+":"+id_giave+":"+id_ghe+":"+idnv+":"+);
                bvDao.insertVe(ngayban, tongtien, id_suatchieu, id_giave, id_ghe, idnv, id_kh);
            }
            JOptionPane.showMessageDialog(null, "Đã thanh toán thành công");
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thanh toán thất bại");
        }
    }
}
