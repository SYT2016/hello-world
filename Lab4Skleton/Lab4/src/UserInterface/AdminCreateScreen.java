/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author AEDSpring2019
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;
    
    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }
    private boolean checkusername(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(txtUser.getText());
        boolean b=m.matches();
        System.out.println(b+"name");
        return b;
    
    }
    private boolean checkpassword(){//>=6 >=1 upper case letter >=1 lower case letter one digit and one special character $, *, # or &.
        
        //Pattern p0=Pattern.compile("^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{6,}$");
        Pattern p0=Pattern.compile("^(?![A-Za-z0-9]+$)(?![a-z0-9$*#&]+$)(?![A-Za-z$*#&]+$)(?![A-Z0-9$*#&]+$)[a-zA-Z0-9$*#&]{6,}$");
        Matcher m0=p0.matcher(txtPword.getText());
        boolean b0=m0.matches();
        System.out.println(b0);
         if(!b0){
              jLabel2.setForeground(Color.red);
              JOptionPane.showMessageDialog(null,"The password format is incorrect!","warning",JOptionPane.WARNING_MESSAGE);
            
            return false;
        }
       
       
        return true;
        
        
    
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
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 1350));

        btnCreate.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N

        txtPword.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N

        txtRePword.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        jLabel1.setText("username:");

        jLabel2.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        jLabel2.setText("password:");

        jLabel3.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        jLabel3.setText(" re-enter password:");

        buttonGroup1.add(radioCustomer);
        radioCustomer.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        radioCustomer.setText("Customer");
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioSupplier);
        radioSupplier.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        radioSupplier.setText("Supplier");

        btnBack.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(txtRePword)
                            .addComponent(txtPword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioSupplier)
                            .addComponent(radioCustomer)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnBack)
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addGap(75, 75, 75)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(!(txtRePword.getText().equals(txtPword.getText()))){
            jLabel2.setForeground(Color.red);
            jLabel3.setForeground(Color.red);
            
        
                JOptionPane.showMessageDialog(null,"The two passwords are different !","warning",JOptionPane.WARNING_MESSAGE);
            
        }
        else if( !checkusername()){
            jLabel2.setForeground(Color.black);
            jLabel3.setForeground(Color.black);
            
             jLabel1.setForeground(Color.red);
             JOptionPane.showMessageDialog(null,"The username format is incorrect","warning",JOptionPane.WARNING_MESSAGE);
             
        
        }
        else if(!checkpassword()){
           jLabel1.setForeground(Color.black); jLabel3.setForeground(Color.black);
           jLabel2.setForeground(Color.red);
        }
        else{
            jLabel1.setForeground(Color.black);
            jLabel2.setForeground(Color.black);
            jLabel3.setForeground(Color.black);
        if(radioCustomer.isSelected()){
            Customer newcustomer=new Customer(txtPword.getText(),txtUser.getText());
            admin.custDir.getCustomerList().add(newcustomer);
            Calendar calendar=Calendar.getInstance();
            SimpleDateFormat dateformat=new SimpleDateFormat("E MM dd hh:mm:ss z yyyy");
            
            newcustomer.setDatetime(dateformat.format(calendar.getTime()));
            
            CardLayout layout = (CardLayout)panelRight.getLayout();
            panelRight.add(new SuccessScreen( newcustomer));
            layout.next(panelRight);
        
        }
        else if(radioSupplier.isSelected()){
            Supplier newsupplier=new Supplier(txtPword.getText(),txtUser.getText());
            admin.suppDir.getSupplierList().add(newsupplier);
              CardLayout layout = (CardLayout)panelRight.getLayout();
                    panelRight.add(new SuccessScreen( newsupplier));
                    layout.next(panelRight);
        
        }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
MainFrame.amd.populate();
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
