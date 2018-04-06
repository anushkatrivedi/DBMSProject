/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproject;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author anushkatrivedi
 */
public class HomePageForm extends javax.swing.JFrame {
    public HomePageForm() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(174, 198, 207));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UpdateDataButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DisplayBtn = new javax.swing.JButton();
        StatisticsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InsertBtn.setText("Insert Data");
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Employee Payroll");

        UpdateDataButton.setText("Update Data");
        UpdateDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDataButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Management System");

        DisplayBtn.setText("Display Data");
        DisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBtnActionPerformed(evt);
            }
        });

        StatisticsBtn.setText("Statistics");
        StatisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpdateDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InsertBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisplayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(StatisticsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(InsertBtn)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateDataButton)
                        .addGap(18, 18, 18)
                        .addComponent(DisplayBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StatisticsBtn)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtnActionPerformed
        InsertForm obj = new InsertForm();
        setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_InsertBtnActionPerformed

    private void UpdateDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDataButtonActionPerformed
        UpdateForm uf = new UpdateForm();
        setVisible(false);
        uf.setVisible(true);
    }//GEN-LAST:event_UpdateDataButtonActionPerformed

    private void DisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBtnActionPerformed
       DisplayForm df = new DisplayForm();
       setVisible(false);
       df.setVisible(true);
    }//GEN-LAST:event_DisplayBtnActionPerformed

    private void StatisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsBtnActionPerformed
        Statistics s = new Statistics();
        setVisible(false);
        s.setVisible(true);
    }//GEN-LAST:event_StatisticsBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayBtn;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JButton StatisticsBtn;
    private javax.swing.JButton UpdateDataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
