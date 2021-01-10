package hospital.managment.system;


import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Edit_Appointment extends javax.swing.JFrame {

    /**
     * Creates new form f_viewap
     */
    public Edit_Appointment() {
        initComponents();
        setLocation(700,250);
        ImageIcon img = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Hospital Managment System\\src\\Images\\close.jpg");
        Image myimg = img.getImage();
        Image newimg = myimg.getScaledInstance(lbl_close.getWidth(),lbl_close.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ic =new ImageIcon(newimg);
        lbl_close.setIcon(ic);
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
        lbl_close = new javax.swing.JLabel();
        txtappid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AppointmentId = new javax.swing.JLabel();
        dateapp = new com.toedter.calendar.JDateChooser();
        AppointmentId1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtdeleteappid = new javax.swing.JTextField();
        AppointmentId2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 148, 88), 2));

        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });

        txtappid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Edit Appointment");

        AppointmentId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AppointmentId.setText("Appointment ID");

        dateapp.setBackground(new java.awt.Color(8, 146, 97));
        dateapp.setDateFormatString("yyyy-MM-dd");
        dateapp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AppointmentId1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AppointmentId1.setText("New Date");

        jButton1.setBackground(new java.awt.Color(15, 151, 92));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Delete Appointment");

        txtdeleteappid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        AppointmentId2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AppointmentId2.setText("Appointment ID");

        jButton2.setBackground(new java.awt.Color(15, 151, 92));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(AppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtappid, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(AppointmentId1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateapp, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AppointmentId2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(txtdeleteappid, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateapp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtappid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AppointmentId1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdeleteappid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppointmentId2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        int res;
        res=JOptionPane.showConfirmDialog(null, "Do you want to close?","CONFIRM",JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/hospital_managment_system";
        try{
            Connection con=DriverManager.getConnection(path,"root","root");
            Statement st=con.createStatement();
            String selectdate=((JTextField)dateapp.getDateEditor().getUiComponent()).getText();
            String query="update appointments set date='"+selectdate+"' where appointmentid="+Integer.parseInt(txtappid.getText());
            st.executeUpdate(query);
            int res;
            res=JOptionPane.showConfirmDialog(null, "Data added succesfully.Do you want to close?","CONFIRM",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION)
            {
                dispose();
            }
            
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String path="jdbc:mysql://localhost:3306/hospital_managment_system";
        try{
            Connection con=DriverManager.getConnection(path,"root","root");
            Statement st=con.createStatement();
            
            String query="delete from appointments where appointmentid="+Integer.parseInt(txtdeleteappid.getText());
            st.executeUpdate(query);
            int res;
            res=JOptionPane.showConfirmDialog(null, "Data added succesfully.Do you want to close?","CONFIRM",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION)
            {
                dispose();
            }
            
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppointmentId;
    private javax.swing.JLabel AppointmentId1;
    private javax.swing.JLabel AppointmentId2;
    private com.toedter.calendar.JDateChooser dateapp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JTextField txtappid;
    private javax.swing.JTextField txtdeleteappid;
    // End of variables declaration//GEN-END:variables
}