/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AEDSpring2019
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    List<User> list;
    JPanel panelRight;
    String whichone;
    public LoginScreen(JPanel panelRight, List<User> list,String whichone) {
        initComponents();
        this.list = list;
        this.panelRight = panelRight;
        this.whichone=whichone;
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 1350));

        txtPword.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        txtPword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwordActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        btnSubmit.setText("Login");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        comboUser.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        comboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUserActionPerformed(evt);
            }
        });

        txtTitle.setFont(new java.awt.Font("宋体", 1, 48)); // NOI18N
        txtTitle.setText("Login Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPword)
                            .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(txtTitle)
                .addGap(109, 109, 109)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        boolean next=false;
       
        for(User u:list){
            if(u.getUserName().equals(comboUser.getSelectedItem())){
                if(u.getPassword().equals(txtPword.getText()))
                {
                    next=true;
                    CardLayout layout = (CardLayout)panelRight.getLayout();
                    panelRight.add(new SuccessScreen( u));
                    layout.next(panelRight);
                    
                    break;
                }
                
            }
        }
       if(!next){
            JOptionPane.showMessageDialog(null,"Your password is incorrect!","warning",JOptionPane.WARNING_MESSAGE);
        }   
     
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void comboUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboUserActionPerformed

    private void txtPwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwordActionPerformed

    
    private void initialize(){
        //text should either be "Supplier Login Screen" OR "Customer Login Screen"
        //Based on the selection
        txtTitle.setText(whichone+" Login Screen");
        comboUser.removeAllItems();
        for(User u:list){
        comboUser.addItem(u.getUserName());
       
        }
        
        //only customer or suppliers should be listed based on the selection
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Object> comboUser;
    private javax.swing.JTextField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
