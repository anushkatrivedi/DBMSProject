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
public class DisplayForm extends javax.swing.JFrame {
    public DisplayForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        Employee = new javax.swing.JButton();
        Employer = new javax.swing.JButton();
        Company = new javax.swing.JButton();
        Branch = new javax.swing.JButton();
        Salary = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(DataTable);

        Employee.setText("Employee");
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });

        Employer.setText("Employer");
        Employer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployerActionPerformed(evt);
            }
        });

        Company.setText("Company");
        Company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyActionPerformed(evt);
            }
        });

        Branch.setText("Branch");
        Branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchActionPerformed(evt);
            }
        });

        Salary.setText("Salary");
        Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Employer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Company, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Branch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Salary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BackBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BackBtn)
                .addGap(52, 52, 52)
                .addComponent(Employee)
                .addGap(18, 18, 18)
                .addComponent(Employer)
                .addGap(18, 18, 18)
                .addComponent(Company)
                .addGap(18, 18, 18)
                .addComponent(Branch)
                .addGap(18, 18, 18)
                .addComponent(Salary)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            String username="root";
            String password="abcd1234";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"id", "eid", "ename","edesignation","phone_no"}, 0);
            String query = "select * from employee";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("id");
                String b = rs.getString("eid");
                String c = rs.getString("ename");
                String d = rs.getString("edesignation");
                String e = Long.toString(rs.getLong("phone_no"));
                model.addRow(new Object[]{a,b,c,d,e});
            }
            DataTable.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_EmployeeActionPerformed

    private void CompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            String username="root";
            String password="abcd1234";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"cid","cname"}, 0);
            String query = "select * from company";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("cid");
                String b = rs.getString("cname");
                model.addRow(new Object[]{a,b});
            }
            DataTable.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_CompanyActionPerformed

    private void EmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployerActionPerformed
       try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            String username="root";
            String password="abcd1234";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"id", "name", "designation","cid","branchno","phoneno"}, 0);
            String query = "select * from employer";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("id");
                String b = rs.getString("name");
                String c = rs.getString("designation");
                String d = rs.getString("cid");
                String e = rs.getString("branchno");
                String f = Long.toString(rs.getLong("phone_no"));
                model.addRow(new Object[]{a,b,c,d,e,f});
            }
            DataTable.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_EmployerActionPerformed

    private void BranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            String username="root";
            String password="abcd1234";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"cid", "branchno", "bname"}, 0);
            String query = "select * from branch";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("cid");
                String b = rs.getString("branchno");
                String c = rs.getString("bname");
                model.addRow(new Object[]{a,b,c});
            }
            DataTable.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_BranchActionPerformed

    private void SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryActionPerformed
       try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mysql";
            String username="root";
            String password="abcd1234";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            DefaultTableModel model = new DefaultTableModel(new String[]{"id", "eid", "medical_allowance","basic","incentive"}, 0);
            String query = "select * from salary";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String a = rs.getString("id");
                String b = rs.getString("eid");
                String c = Double.toString(rs.getDouble("medical_allowance"));
                String d = Double.toString(rs.getDouble("basic"));
                String e = Double.toString(rs.getDouble("incentive"));
                model.addRow(new Object[]{a,b,c,d,e});
            }
            DataTable.setModel(model);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_SalaryActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        HomePageForm hpgf = new HomePageForm();
        setVisible(false);
        hpgf.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Branch;
    private javax.swing.JButton Company;
    private javax.swing.JTable DataTable;
    private javax.swing.JButton Employee;
    private javax.swing.JButton Employer;
    private javax.swing.JButton Salary;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
