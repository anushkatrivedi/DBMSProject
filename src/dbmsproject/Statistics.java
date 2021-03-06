/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anushkatrivedi
 */
public class Statistics extends javax.swing.JFrame {

    /**
     * Creates new form Statistics
     */
    public Statistics() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            String username="root";
            String password="abcd1234";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"employerid", "name", "numberofemployees"}, 0);
            String query = "select employer.id as employerid,name,count(*) as numberofemployees from employer,employee where employer.id=employee.id GROUP by employee.id;";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("employerid");
                String b = rs.getString("name");
                String c = rs.getString("numberofemployees");
                model.addRow(new Object[]{a,b,c});
            }
            DataTable1.setModel(model);
            model = new DefaultTableModel(new String[]{"cname", "numberofbranches"}, 0);
            query = "select cname,count(*) as numberofbranches from company,branch where branch.cid=company.cid group by company.cid";
            rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("cname");
                String b = rs.getString("numberofbranches");
                model.addRow(new Object[]{a,b});
            }
            DataTable2.setModel(model);
            model = new DefaultTableModel(new String[]{"bname", "numberofemployers"}, 0);
            query = "select bname,count(*) as numberofemployers from branch,employer where branch.branchno=employer.branchno group by branch.bname";
            rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("bname");
                String b = rs.getString("numberofemployers");
                model.addRow(new Object[]{a,b});
            }
            DataTable3.setModel(model);
        }   
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        DataTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DataTable4 = new javax.swing.JTable();
        CIDText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DataTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(DataTable1);

        DataTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(DataTable2);

        DataTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(DataTable3);

        jLabel1.setText("Number of employees under an employer");

        jLabel2.setText("Number of branches per company");

        jLabel3.setText("Number of employers per branch");

        DataTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(DataTable4);

        CIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Company ID");

        jLabel6.setText("Number of employers");

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(CIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SubmitBtn)
                                .addGap(74, 74, 74))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(136, 136, 136)
                .addComponent(jLabel2)
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SubmitBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIDTextActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        String a = CIDText.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            String username="root";
            String password="abcd1234";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"ename"}, 0);
            String query = "select ename from employer,employee,company where employer.id=employee.id and employer.cid=company.cid and company.cid='"+a+"'";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String b = rs.getString("ename");
                model.addRow(new Object[]{b});
            }
            DataTable4.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePageForm hpgf = new HomePageForm();
        setVisible(false);
        hpgf.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CIDText;
    private javax.swing.JTable DataTable1;
    private javax.swing.JTable DataTable2;
    private javax.swing.JTable DataTable3;
    private javax.swing.JTable DataTable4;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
