/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;


import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    Connection conn =null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public Add() {
        initComponents();
        Toolkit toolkit =getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
       conn=db.java_db();
       emp3.setText(String.valueOf(Emp.empname).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        empid = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        divisio = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        division = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emp1 = new javax.swing.JLabel();
        emp2 = new javax.swing.JLabel();
        emp3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("empid");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("gender");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("age");

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        empid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("search");

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        divisio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        divisio.setText("division");

        w.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        w.setText("password");

        division.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("salary");

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Logged in as :");

        emp2.setText("jLabel11");

        emp3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emp3.setText("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divisio)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(emp3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(emp2)
                                                        .addGap(96, 96, 96)
                                                        .addComponent(emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(162, 162, 162))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(65, 65, 65)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(delete)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(update)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(w)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(emp1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emp3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisio)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(clear)
                    .addComponent(delete)
                    .addComponent(update)
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        int x= JOptionPane.showConfirmDialog(null,"Are you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(x==0){
         String sql="INSERT INTO emp_info(empid,name,gender,age,division,password,salary)VALUES(?,?,?,?,?,?,?)";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,empid.getText());
            pst.setString(2,name.getText());
            pst.setString(3,gender.getText());
            pst.setString(4,age.getText());
            pst.setString(5,division.getText());
            pst.setString(6,password.getText());
            pst.setString(7,salary.getText());
             //pst.setBytes(5,person_image);
            
            pst.execute();
            this.setVisible(false);
            
            
            JOptionPane.showMessageDialog(null,"System Update Completed");
            
           //  rs.close();
          //  pst.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        try {

                String sq ="select * from emp_info where (empid) NOT IN (select empid from Users)";
                pst=conn.prepareStatement(sq);
                rs=pst.executeQuery();

                while(rs.next()){

                    String add1 =rs.getString("empid");
                    String add2 =rs.getString("name");
                    String add3 =rs.getString("password");
                   // String result =add3.replace("/" ,"");
                    String add4 =rs.getString("division");

                    String sqle ="insert into Users (division,username,password,empid) values ('"+add4+"','"+add2+"','"+add3+"','"+add1+"') ";
                    pst=conn.prepareStatement(sqle);

                    pst.execute();
                    JOptionPane.showMessageDialog(null,"User account has been created successfully: " +" Username:  "+add2+ " Password:  "+add3);
                }

            }catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }finally{
            
        
        try{
           rs.close();
            pst.close();
        }
        catch(Exception e)
        {
            
        }
    }
        
        
        }
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        int x= JOptionPane.showConfirmDialog(null,"Are you want to clear","clear Record",JOptionPane.YES_NO_OPTION);
        if(x==0){
        empid.setText(null);
        name.setText(null);
        gender.setText(null);
        age.setText(null);
        division.setText(null);
        password.setText(null);
        salary.setText(null);
        }   
    }//GEN-LAST:event_clearActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        try{
          String sql="select * from emp_info where name=? ";
          pst=conn.prepareStatement(sql);
          pst.setString(1,search.getText());
          rs=pst.executeQuery();
          if(rs.next())
          {
              String add1=rs.getString("empid");
              
              empid.setText(add1);
              String add2=rs.getString("name");
              name.setText(add2);
        
        String add3=rs.getString("age");
        age.setText(add3);
        String add4=rs.getString("gender");
        gender.setText(add4);
         String add5=rs.getString("salary");
        salary.setText(add5);
        String add6=rs.getString("division");
        division.setText(add6);
         String add7=rs.getString("password");
        password.setText(add7);
       
       
              
          }
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,e);
      }
        finally{
            
        
        try{
           rs.close();
            pst.close();
        }
        catch(Exception e)
        {
            
        }
    }
    }//GEN-LAST:event_searchKeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         int x= JOptionPane.showConfirmDialog(null,"Are you want to delete record","delete Record",JOptionPane.YES_NO_OPTION);
        if(x==0){
          try{
          String sql="delete from emp_info where empid=? ";
          pst=conn.prepareStatement(sql);
          pst.setString(1,empid.getText());
          pst.execute();
          JOptionPane.showMessageDialog(null,"Record deleted");
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,e);
      }
          finally{
        try{
           rs.close();
            pst.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         int x= JOptionPane.showConfirmDialog(null,"Are you want to update record","update Record",JOptionPane.YES_NO_OPTION);
        if(x==0){
         try{
          String v1=empid.getText();
          String v2=name.getText();
          String v3=gender.getText();
          String v4=age.getText();
          String v5=salary.getText();
          String v6=password.getText();
          String v7=division.getText();
        
          String sql="update emp_info set empid='"+v1+"',name='"+v2+"',gender='"+v3+"',age='"+v4+"',salary='"+v5+"',password='"+v6+"',division='"+v7+"' where empid ='"+v1+"' ";
          String sqle="update users set empid='"+v1+"',username='"+v2+"',password='"+v6+"',division='"+v7+"' where empid ='"+v1+"' ";
         // String sql= "update Staff_information set id='"+value1+"',Salary='"+value2+"' where id='"+value1+"' where empid ='"+v1+"'";
         
                pst=conn.prepareStatement(sql);
                //pst=conn.prepareStatement(sqle);
                pst.execute();
                 pst=conn.prepareStatement(sqle);
                 pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
             finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
        }
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                MainMenu j=new MainMenu();
                j.setVisible(true);
                this.dispose();
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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField age;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel divisio;
    private javax.swing.JTextField division;
    private javax.swing.JLabel emp1;
    private javax.swing.JLabel emp2;
    private javax.swing.JLabel emp3;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    private javax.swing.JLabel w;
    // End of variables declaration//GEN-END:variables
  
}

