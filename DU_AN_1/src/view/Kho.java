/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import TienIch.Image_utils;
import entity.Sach;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import DAO.SachDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import TienIch.Msg;
import java.util.Vector;

/**
 *
 * @author QUAN
 */
public class Kho extends javax.swing.JFrame {

    List<Sach> listSach = new ArrayList<>();
    SachDAO sachDao;
    DefaultTableModel tbmodel;
    Msg msg;

    /**
     * Creates new form mainView_QuanLy
     */
    public Kho() {
        initComponents();
        tbmodel = (DefaultTableModel) tblSach.getModel();
        this.setLocationRelativeTo(null);
        setTitle("Mua sách online");
        setIconImage(Image_utils.getImageApp());
        sachDao = new SachDAO();
        msg = new Msg();
    }

    void LoadData(String chude) throws SQLException {
        listSach = sachDao.selectSach(chude);
        
    }

    void FillTable(String chuDe) throws SQLException {
        LoadData(chuDe);
        tbmodel.setRowCount(0);

        for (int i = 0; i < listSach.size(); i++) {
            tbmodel.addRow(new Object[]{listSach.get(i).getMaSach(),
                listSach.get(i).getTenSach(),
                listSach.get(i).getGia(),
                listSach.get(i).getChuDe(),
                listSach.get(i).getTacGia(),
                listSach.get(i).getLuotMua(),});
        }

    }

    void deleteSach() throws SQLException {

        int i = tblSach.getSelectedRow();
        String maSachDelete = tblSach.getValueAt(i, 0).toString();
        int row = sachDao.DeleteSach(maSachDelete);
        if (row == 0) {
            msg.alert(this, "Xoá thất bại!");
        } else {
            msg.alert(this, "Xoá thành công!");
            
        }
        LoadData("Tất cả");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbbTheLoai = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnHome = new javax.swing.JButton();
        btnHome1 = new javax.swing.JButton();
        btnHome2 = new javax.swing.JButton();
        btnHome3 = new javax.swing.JButton();
        btnHome4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cbbTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Truyện ngắn", "Tiểu thuyết", "Khoa học viễn tưởng", "Truyện tranh", "Chính trị - Pháp luật", "Kinh tế", "Thiếu nhi", "Giáo trình", "Ẩm thực - du lịch", "Văn hóa" }));
        cbbTheLoai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTheLoaiItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Thể Loại:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Giá", "Thể loại", "Tác giả", "Lượt mua"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 0));
        jButton2.setText("Thêm sách mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 0));
        jButton3.setText("Xóa sách");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(204, 153, 0));
        jToolBar1.setRollover(true);

        btnHome.setBackground(new java.awt.Color(102, 0, 51));
        btnHome.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon-home.png"))); // NOI18N
        btnHome.setText("Trang chủ      ");
        btnHome.setAlignmentX(5.0F);
        btnHome.setBorder(null);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome.setName(""); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome);

        btnHome1.setBackground(new java.awt.Color(102, 0, 51));
        btnHome1.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(204, 204, 255));
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon-kho.png"))); // NOI18N
        btnHome1.setText(" Kho      ");
        btnHome1.setAlignmentX(5.0F);
        btnHome1.setBorder(null);
        btnHome1.setContentAreaFilled(false);
        btnHome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome1.setFocusable(false);
        btnHome1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome1.setName(""); // NOI18N
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome1);

        btnHome2.setBackground(new java.awt.Color(102, 0, 51));
        btnHome2.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btnHome2.setForeground(new java.awt.Color(255, 255, 255));
        btnHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon-khachhang.png"))); // NOI18N
        btnHome2.setText("Khách hàng      ");
        btnHome2.setAlignmentX(5.0F);
        btnHome2.setBorder(null);
        btnHome2.setContentAreaFilled(false);
        btnHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome2.setFocusable(false);
        btnHome2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome2.setName(""); // NOI18N
        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome2);

        btnHome3.setBackground(new java.awt.Color(102, 0, 51));
        btnHome3.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btnHome3.setForeground(new java.awt.Color(255, 255, 255));
        btnHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon-thongke.png"))); // NOI18N
        btnHome3.setText("Thống kê      ");
        btnHome3.setAlignmentX(5.0F);
        btnHome3.setAutoscrolls(true);
        btnHome3.setBorder(null);
        btnHome3.setContentAreaFilled(false);
        btnHome3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome3.setFocusable(false);
        btnHome3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome3.setName(""); // NOI18N
        btnHome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome3ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome3);

        btnHome4.setBackground(new java.awt.Color(102, 0, 51));
        btnHome4.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        btnHome4.setForeground(new java.awt.Color(255, 255, 255));
        btnHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon-exit.png"))); // NOI18N
        btnHome4.setText("Thoát");
        btnHome4.setAlignmentX(5.0F);
        btnHome4.setBorder(null);
        btnHome4.setContentAreaFilled(false);
        btnHome4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome4.setFocusable(false);
        btnHome4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome4.setName(""); // NOI18N
        btnHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome4ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BackGround_Home.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Them_sach().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new mainView_QuanLy().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // TODO add your handling code here:
        new Kho().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        // TODO add your handling code here:
        new Khach_hang().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void btnHome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome3ActionPerformed
        // TODO add your handling code here:
        new Thong_ke().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHome3ActionPerformed

    private void btnHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome4ActionPerformed
        // TODO add your handling code here:

        int a = JOptionPane.showConfirmDialog(this, "Bạn muốn thoát?");
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnHome4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            FillTable("Tất cả");
        } catch (SQLException ex) {
            Logger.getLogger(Kho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void cbbTheLoaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTheLoaiItemStateChanged
        try {
            // TODO add your handling code here:
            if (cbbTheLoai.getSelectedItem().equals("Tất cả")) {
                FillTable(cbbTheLoai.getSelectedItem().toString());
            } else {
                FillTable(cbbTheLoai.getSelectedItem().toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbbTheLoaiItemStateChanged

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        int i = tblSach.getSelectedRow();
        String maSach = tblSach.getValueAt(i, 0).toString();

        Vector VectorSach = null ;
        try {
            VectorSach = sachDao.selectIDSach(maSach);
            new Sach_Information(this, VectorSach).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Kho.class.getName()).log(Level.SEVERE, null, ex);
        }

//        try {
//            Vsach.add(0, txtMasach.getText());
//            Vsach.add(1, txtTenSach.getText());
//            Vsach.add(2, Integer.parseInt(txtGia.getText()));
//            Vsach.add(3, Integer.parseInt(txtSoTrang.getText()));
//            switch (cbbTheloai.getSelectedItem().toString()) {
//                case "Truyện ngắn": {
//                    Vsach.add(4, "G1");
//                    break;
//                }
//                case "Tiểu thuyết": {
//                    Vsach.add(4, "G2");
//                    break;
//                }
//                case "Khoa học viễn tưởng": {
//                    Vsach.add(4, "G3");
//                    break;
//                }
//                case "Truyện tranh": {
//                    Vsach.add(4, "G4");
//                    break;
//                }
//                case "Chính trị - Pháp luật": {
//                    Vsach.add(4, "G5");
//                    break;
//                }
//                case "Kinh tế": {
//                    Vsach.add(4, "G6");
//                    break;
//                }
//                case "Thiếu nhi": {
//                    Vsach.add(4, "G7");
//                    break;
//                }
//                case "Giáo trình": {
//                    Vsach.add(4, "G8");
//                    break;
//                }
//                case "Ẩm thục-du lịch": {
//                    Vsach.add(4, "G9");
//                    break;
//                }
//                case "Văn hóa": {
//                    Vsach.add(4, "G10");
//                    break;
//                }
//                default: {
//                    Vsach.add(4, "G1");
//                    break;
//                }
//
//            }
//            Vsach.add(5, txtTacGia.getText());
//            Vsach.add(6, Integer.parseInt(txtSoLuong.getText()));
//            Vsach.add(7, "0");
//            Vsach.add(8, file);
//            Vsach.add(9, "");

    }//GEN-LAST:event_tblSachMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            deleteSach();
        } catch (SQLException ex) {
            Logger.getLogger(Kho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnHome2;
    private javax.swing.JButton btnHome3;
    private javax.swing.JButton btnHome4;
    private javax.swing.JComboBox<String> cbbTheLoai;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblSach;
    // End of variables declaration//GEN-END:variables
}
