/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuolmakermanager;

/**
 *
 * @author xang-
 */
public class frmPlanManager extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPlanManager
     */
    public frmPlanManager() {
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

        jPanel1 = new javax.swing.JPanel();
        txttitle = new javax.swing.JTextField();
        btupdate = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbinfo = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setAutoscrolls(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ຫົວຂໍ້ແຜ່ນການ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 0, 12))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(578, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel1.add(txttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 460, 40));

        btupdate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btupdate.setText("ອັບເດດ");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, 30));

        btadd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btadd.setText("ເພີ່ມ");
        jPanel1.add(btadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 90, 30));

        btdelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btdelete.setText("ລົບ");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tbinfo.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tbinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbinfo);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 655, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btupdateActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btupdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbinfo;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}
