/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuolmakermanager;

import DBC.DBCon;
import com.mysql.jdbc.MySQLConnection;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.naming.ldap.Control;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import org.codehaus.groovy.control.messages.Message;

/**
 *
 * @author xang-
 */
public final class frmMemberManager extends javax.swing.JInternalFrame {

    private DefaultTableModel modelmember;

    /**
     * Creates new form frmMemberManager
     */
    public frmMemberManager() {
        initComponents();
modelmember = (DefaultTableModel)tbshow.getModel();
Showdata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtpassword = new javax.swing.JTextField();
        txtstdid = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        combostatus = new javax.swing.JComboBox<String>();
        txtclass = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtgen = new javax.swing.JTextField();
        comborole = new javax.swing.JComboBox<String>();
        combolevel = new javax.swing.JComboBox<String>();
        txtdatein = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtmemid = new javax.swing.JTextField();
        btclear = new javax.swing.JButton();
        btclear1 = new javax.swing.JButton();
        btfind = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtfind = new javax.swing.JTextField();
        btupdate = new javax.swing.JButton();
        lbpic = new javax.swing.JLabel();
        btupdate1 = new javax.swing.JButton();
        txtpath = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbshow = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1200, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(557, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ຂໍ້ມູນສະມາຊິກ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpassword.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 200, 30));

        txtstdid.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtstdid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstdidActionPerformed(evt);
            }
        });
        jPanel3.add(txtstdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 30));

        txtusername.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 200, 30));

        combostatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        combostatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(combostatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 200, -1));

        txtclass.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, 30));

        txttel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 200, 30));

        txtname.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 150, 30));

        txtlastname.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 140, 30));

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setText("ນາມສະກຸນ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 70, 30));

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setText("ລະຫັດນັກສືກສາ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 80, 30));

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setText("ລະຫັດຜ່ານ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 70, 20));

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setText("ໜ້າທີ່");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 40, 20));

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setText("ຊື່ຜູ້ໃຊ້");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 50, 20));

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel6.setText("ຫ້ອງ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 30, 20));

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel7.setText("ເບີໂທລະສັບ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 70, 20));

        jLabel8.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel8.setText("ຊື່");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 30, 20));

        jLabel9.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel9.setText("ວັນເຂົ້າ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, 20));

        jLabel10.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel10.setText("ສະຖານະ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 50, 30));

        jLabel11.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel11.setText("ລະດັບຜູ້ໃຊ້");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 70, 20));

        jLabel12.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel12.setText("ລຸ້ນ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 30, 20));

        txtgen.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 90, 30));

        comborole.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        comborole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(comborole, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, -1));

        combolevel.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        combolevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(combolevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, -1));

        txtdatein.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtdatein, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 180, 30));

        jLabel13.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel13.setText("ລະຫັດສະມາຊິກ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        txtmemid.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtmemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmemidActionPerformed(evt);
            }
        });
        jPanel3.add(txtmemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 30));

        btclear.setFont(new java.awt.Font("Saysettha OT", 0, 11)); // NOI18N
        btclear.setText("ລ້າງ");
        btclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btclearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btclearMouseExited(evt);
            }
        });
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });
        jPanel3.add(btclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        btclear1.setFont(new java.awt.Font("Saysettha OT", 0, 11)); // NOI18N
        btclear1.setText("Refresh");
        btclear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btclear1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btclear1MouseExited(evt);
            }
        });
        btclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclear1ActionPerformed(evt);
            }
        });
        jPanel3.add(btclear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 830, 280));

        btfind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btfind.setText("ຄົ້ນຫາ");
        btfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfindActionPerformed(evt);
            }
        });
        jPanel1.add(btfind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 260, 70, -1));

        btadd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btadd.setText("ເພີ່ມ");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        jPanel1.add(btadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 110, 50));

        btdelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btdelete.setText("ລົບ");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 110, 50));

        jTextField10.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTextField10.setText("jTextField10");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 230, 30));

        jButton4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton4.setText("jButton4");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 310, -1, 30));

        txtfind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel1.add(txtfind, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 230, 30));

        btupdate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btupdate.setText("ເພີ່ມຮູບ");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 170, 110, 50));

        lbpic.setBackground(new java.awt.Color(51, 51, 255));
        lbpic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 160, 200));

        btupdate1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btupdate1.setText("ອັບເດດ");
        btupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btupdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 120, 110, 50));
        jPanel1.add(txtpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 180, -1));

        jLabel14.setText("Path:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tbshow.setBackground(new java.awt.Color(255, 255, 204));
        tbshow.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tbshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MemberID", "StuentID", "Name", "Lname", "Duty", "Username", "Password", "Class", "Phone", "Gen", "DateIn", "Level", "Status", "Path", "Pic"
            }
        ));
        tbshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbshowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbshow);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
FileInputStream fis;
    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        try {
            Connection c = DBCon.getConnection();
            String sqladd = "INSERT INTO member(Mid, Stdid, name, lname, duty, user, passwd, class, phone, no, datecome, status, permission, path, pic) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = c.prepareStatement(sqladd);
            pre.setString(1, txtmemid.getText());
            pre.setString(2, txtstdid.getText());
            pre.setString(3, txtname.getText());
            pre.setString(4, txtlastname.getText());
            pre.setString(5, comborole.getSelectedItem().toString());
            pre.setString(6, txtusername.getText());
            pre.setString(7, txtpassword.getText());
            pre.setString(8, txtclass.getText());
            pre.setString(9, txttel.getText());
            pre.setString(10, txtgen.getText());
            pre.setString(11, txtdatein.getText());
            pre.setString(12, combostatus.getSelectedItem().toString());
            pre.setString(13, combolevel.getSelectedItem().toString());
            pre.setString(14, txtpath.getText());
            File file = new File(fullpath);
            fileinput = new FileInputStream(file);
            pre.setBinaryStream(15, fileinput, (int) file.length());
            if (pre.executeUpdate() != 1 - 1) {
                JOptionPane.showMessageDialog(null, "Data Saved!");
            }
Showdata();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void txtstdidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstdidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstdidActionPerformed

    private void txtmemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmemidActionPerformed
    String fullpath;
    FileInputStream fileinput;
    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // TODO add your handling code here:
        JFileChooser filechoose = new JFileChooser();
        filechoose.showOpenDialog(this);
        fullpath = filechoose.getSelectedFile().getAbsolutePath();
        ImageIcon ico = new ImageIcon(fullpath);
        txtpath.setText(fullpath);
        lbpic.setIcon(ico);
    }//GEN-LAST:event_btupdateActionPerformed

    private void btupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdate1ActionPerformed
        int idx=tbshow.getSelectedRow();     
        s=tbshow.getValueAt(idx, 0).toString();
        try{
        Connection c=DBCon.getConnection();    
        String sqlupdate="UPDATE member SET Stdid=?, name=?, lname=?, duty=?, user=?, passwd=?, class=?, phone=?, no=?, datecome=?, status=?, permission=?, path=?, pic=? WHERE Mid=' "+s+ " ' ";
           PreparedStatement pre = c.prepareStatement(sqlupdate);
         // pre.setString(1, txtmemid.getText());
            pre.setString(1, txtstdid.getText());
            pre.setString(2, txtname.getText());
            pre.setString(3, txtlastname.getText());
            pre.setString(4, comborole.getSelectedItem().toString());
            pre.setString(5, txtusername.getText());
            pre.setString(6, txtpassword.getText());
            pre.setString(7, txtclass.getText());
            pre.setString(8, txttel.getText());
            pre.setString(9, txtgen.getText());
            pre.setString(10, txtdatein.getText());
            pre.setString(11, combostatus.getSelectedItem().toString());
            pre.setString(12, combolevel.getSelectedItem().toString());
            pre.setString(13, txtpath.getText());
            File file = new File(fullpath);
            fileinput = new FileInputStream(file);
            pre.setBinaryStream(14, fileinput, (int) file.length());
            if (pre.executeUpdate() != 1 - 1) {
                JOptionPane.showMessageDialog(null, "Data Saved!");
            }
Showdata();
            Clear();
        }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_btupdate1ActionPerformed
String s;
    private void tbshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbshowMouseClicked
                       int idx=tbshow.getSelectedRow();     
        s=tbshow.getValueAt(idx, 0).toString();
        txtmemid.setText(s);
        txtstdid.setText(tbshow.getValueAt(idx, 1).toString());
        txtname.setText(tbshow.getValueAt(idx, 2).toString());
        txtlastname.setText(tbshow.getValueAt(idx, 3).toString());
        comborole.setSelectedItem(tbshow.getValueAt(idx, 4).toString());
        txtusername.setText(tbshow.getValueAt(idx, 5).toString());
        txtpassword.setText(tbshow.getValueAt(idx, 6).toString());
        txtclass.setText(tbshow.getValueAt(idx, 7).toString());
        txttel.setText(tbshow.getValueAt(idx, 8).toString());
        txtgen.setText(tbshow.getValueAt(idx, 9).toString());
        txtdatein.setText(tbshow.getValueAt(idx, 10).toString());
        combolevel.setSelectedItem(tbshow.getValueAt(idx, 11).toString());
        combostatus.setSelectedItem(tbshow.getValueAt(idx, 12).toString());
     //   txtpath.setText(tbshow.getValueAt(idx, 13).toString());
        
  
        
       fullpath=tbshow.getValueAt(idx, 13).toString();
          ImageIcon ico=new ImageIcon(tbshow.getValueAt(idx, 13).toString());
        lbpic.setIcon(ico);
       txtpath.setText(tbshow.getValueAt(idx, 13).toString());
                
        
    }//GEN-LAST:event_tbshowMouseClicked

    private void btclearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btclearMouseEntered
        // TODO add your handling code here:
     btclear.setBackground(Color.red);
    }//GEN-LAST:event_btclearMouseEntered

    private void btclearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btclearMouseExited
        // TODO add your handling code here:
           btclear.setBackground(Color.WHITE);
    }//GEN-LAST:event_btclearMouseExited

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
                try{
            
            int index=tbshow.getSelectedRow();
            String id=tbshow.getValueAt(index, 0).toString();
            String sqlDel="DELETE FROM member WHERE Mid='"+id+"' ";
            int x;
            x=JOptionPane.showConfirmDialog(null, "Do you really want to Delete ID: "+id,"Confirm",JOptionPane.YES_NO_OPTION); //  YES=0
            if(x==0)
            {
           DBCon.getConnection().createStatement().executeUpdate(sqlDel);
            }
            Showdata();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        Clear();

        
    }//GEN-LAST:event_btclearActionPerformed
String text;

    private void btfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfindActionPerformed
      text=txtfind.getText();
       try {
            int totalRow = tbshow.getRowCount() - 1;
            while (totalRow > -1) 
            {
                modelmember.removeRow(totalRow--);
            }
            Connection c=DBCon.getConnection();
            String findid="SELECT Mid, Stdid, name, lname, duty, user, passwd, class, phone, no, datecome, status, permission, path, pic FROM member WHERE Mid LIKE('%" + text + "%')"
                + " OR Stdid LIKE('%" + text + "%')"
                + " OR name LIKE('%" + text + "%')"
                + " OR lname LIKE('%" + text + "%')"
                    + "OR duty LIKE('%" + text +"%')";
               ResultSet res=c.createStatement().executeQuery(findid);
            while(res.next())
            {
                Vector row=new Vector();
        
                row.add(res.getString("Mid"));
                row.add(res.getString("Stdid"));
                row.add(res.getString("name"));
                row.add(res.getString("lname"));
                row.add(res.getString("duty"));
                row.add(res.getString("user"));
                row.add(res.getString("passwd"));
                row.add(res.getString("class"));
                row.add(res.getString("phone"));
                row.add(res.getString("no"));
                row.add(res.getString("Datecome"));
                row.add(res.getString("status"));
                row.add(res.getString("permission"));
                row.add(res.getString("Path"));
                row.add(res.getString("pic"));         
                
                
                modelmember.addRow(row);
            }
                tbshow.setModel(modelmember);
              
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_btfindActionPerformed

    private void btclear1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btclear1MouseEntered
        // TODO add your handling code here:
        btclear1.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_btclear1MouseEntered

    private void btclear1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btclear1MouseExited
        // TODO add your handling code here:
         btclear1.setBackground(Color.WHITE);
    }//GEN-LAST:event_btclear1MouseExited

    private void btclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclear1ActionPerformed
Showdata();        // TODO add your handling code here:
    }//GEN-LAST:event_btclear1ActionPerformed
    public void Showdata() {
        try {
            int totalRow = tbshow.getRowCount() - 1;
            while (totalRow > -1) 
            {
                modelmember.removeRow(totalRow--);
            }
            Connection c=DBCon.getConnection();
         //   String sqlshow="SELECT Mid, Stdid, name, lname, duty, user, passwd, class, phone, no, datecome, status, permission, path, pic FROM member";
            String sqlshow="Select * from member";
            ResultSet res=c.createStatement().executeQuery(sqlshow);
            while(res.next())
            {
                Vector row=new Vector();
        
                row.add(res.getString("Mid"));
                row.add(res.getString("Stdid"));
                row.add(res.getString("name"));
                row.add(res.getString("lname"));
                row.add(res.getString("duty"));
                row.add(res.getString("user"));
                row.add(res.getString("passwd"));
                row.add(res.getString("class"));
                row.add(res.getString("phone"));
                row.add(res.getString("no"));
                row.add(res.getString("Datecome"));
                row.add(res.getString("status"));
                row.add(res.getString("permission"));
                row.add(res.getString("Path"));
                row.add(res.getString("pic"));         
                
                
                modelmember.addRow(row);
            }
                tbshow.setModel(modelmember);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Clear()
    {
                txtmemid.setText("");
        txtstdid.setText("");
        txtname.setText("");
        txtlastname.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        txtclass.setText("");
        txttel.setText("");
        txtpath.setText("");
        txtgen.setText("");
        txtdatein.setText("");
        txtfind.setText("");
        combolevel.setSelectedItem(null);
        comborole.setSelectedItem(null);
        combostatus.setSelectedItem(null);
        lbpic.setIcon(null);
    
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btclear;
    private javax.swing.JButton btclear1;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btfind;
    private javax.swing.JButton btupdate;
    private javax.swing.JButton btupdate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combolevel;
    private javax.swing.JComboBox<String> comborole;
    private javax.swing.JComboBox<String> combostatus;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel lbpic;
    private javax.swing.JTable tbshow;
    private javax.swing.JTextField txtclass;
    private javax.swing.JTextField txtdatein;
    private javax.swing.JTextField txtfind;
    private javax.swing.JTextField txtgen;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmemid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtpath;
    private javax.swing.JTextField txtstdid;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
