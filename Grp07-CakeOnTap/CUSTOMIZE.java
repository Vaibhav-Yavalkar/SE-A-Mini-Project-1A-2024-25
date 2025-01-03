/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CakeOnTap;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author vaish444
 */
public class CUSTOMIZE extends javax.swing.JFrame {
     private static final String username = "root";
    private static final String password = "123456";
    private static final String dataConn = "jdbc:mysql://localhost:3306/cake_on_tap";
    private double tot;
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    int q,i,id,deleteItem;
  
    /**
     * Creates new form CUSTOMIZE
     */
    public CUSTOMIZE() throws ClassNotFoundException, SQLException {
        initComponents();
        upDateDB();
        upDateDB1();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     //=====================================Function======================================================
    public void upDateDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(dataConn, username, password);
            pst = Con.prepareStatement("select * from customization");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();
                
                for(i=1;i<=q;i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("options"));
                    columnData.add(rs.getString("price"));
                    
                }
                RecordTable.addRow(columnData);  
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    //==================================================end function upDateDB=============================================
    
    //==================================================function upDateDB1================================================
    public void upDateDB1()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(dataConn, username, password);
            pst = Con.prepareStatement("select * from mycustomization");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();
                
                for(i=1;i<=q;i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("customization"));
                    columnData.add(rs.getString("price"));
                    
                }
                RecordTable.addRow(columnData);  
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    //==================================================end function upDateDB=============================================
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcusttotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtoption = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbtndelete = new javax.swing.JButton();
        jbtncusttotal = new javax.swing.JButton();
        jbtnadd = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtsr = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(190, 106, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("CUSTOMIZE ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 330, 80));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("\"CRAFTED TO PERFECTION,COSTOMIZED TO YOUR SWEETEST DREAMS!\"");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 670, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\vaish444\\Downloads\\custlogo-removebg-preview.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 130));

        txtcusttotal.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        txtcusttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcusttotalMouseClicked(evt);
            }
        });
        txtcusttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcusttotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtcusttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 130, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 51));
        jLabel12.setText("Price");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, -1));
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 280, 40));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO.", "CUSTOMIZE", "PRICE"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 630, 180));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 51));
        jLabel14.setText("My customization!!");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));
        jPanel1.add(txtoption, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 280, 40));

        jTable2.setBackground(new java.awt.Color(255, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNO.", "CUSTOMIZATION", "PRICE"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 630, 190));

        jbtndelete.setBackground(new java.awt.Color(190, 106, 51));
        jbtndelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtndelete.setForeground(new java.awt.Color(102, 0, 0));
        jbtndelete.setText("DELETE");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 140, 40));

        jbtncusttotal.setBackground(new java.awt.Color(190, 106, 51));
        jbtncusttotal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtncusttotal.setForeground(new java.awt.Color(102, 0, 51));
        jbtncusttotal.setText("TOTAL:");
        jbtncusttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncusttotalActionPerformed(evt);
            }
        });
        jPanel1.add(jbtncusttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 140, 40));

        jbtnadd.setBackground(new java.awt.Color(190, 106, 51));
        jbtnadd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnadd.setForeground(new java.awt.Color(102, 0, 0));
        jbtnadd.setText("ADD");
        jbtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 51));
        jLabel15.setText("Customization Option");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrActionPerformed(evt);
            }
        });
        jPanel1.add(txtsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 280, 40));

        jButton2.setBackground(new java.awt.Color(190, 106, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("GO TO ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 260, 50));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 51));
        jLabel16.setText("Sno.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedIndex = jTable1.getSelectedRow();
        
        txtsr.setText(RecordTable.getValueAt(SelectedIndex, 0).toString());
        txtoption.setText(RecordTable.getValueAt(SelectedIndex, 1).toString());
        txtprice.setText(RecordTable.getValueAt(SelectedIndex, 2).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection(dataConn, username, password);
            pst = Con.prepareStatement("insert into mycustomization(id,customization,price)value(?,?,?)");

            pst.setString(1, txtsr.getText());
            pst.setString(2, txtoption.getText());
            pst.setString(3, txtprice.getText());
            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added!!");
            upDateDB1();
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageCakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ManageCakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        
        
    }//GEN-LAST:event_jbtnaddActionPerformed

    private void jbtncusttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncusttotalActionPerformed
        // TODO add your handling code here:
        int numrow = jTable2.getRowCount();
        tot = 0;
        for(int i=0; i<numrow; i++){
            double val = Double.valueOf(jTable2.getValueAt(i,2).toString());
            tot+=val;
        }
        txtcusttotal.setText(Double.toString(tot));
       
        
        
    }//GEN-LAST:event_jbtncusttotalActionPerformed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
        int SelectedRows = jTable2.getSelectedRow();
        
        try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            deleteItem = JOptionPane.showConfirmDialog(null,"Confirm If you want to delete ??","warning",JOptionPane.YES_NO_OPTION);
            if (deleteItem==JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection(dataConn, username, password);
                pst = Con.prepareStatement("delete from mycustomization where id=?");
                pst.setInt(1,id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Deleted!!");
                upDateDB1();
                
                txtsr.setText("");
                txtoption.setText("");
                txtprice.setText("");        
                
            }
        }catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageCakes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void txtsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrActionPerformed

    private void txtcusttotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcusttotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcusttotalMouseClicked

    private void txtcusttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcusttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcusttotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         OrderCake o1 = null;
         try {
             o1 = new OrderCake();
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(CUSTOMIZE.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(CUSTOMIZE.class.getName()).log(Level.SEVERE, null, ex);
         }
         o1.setVisible(true);
         dispose();
         
         
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
            java.util.logging.Logger.getLogger(CUSTOMIZE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMIZE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMIZE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMIZE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CUSTOMIZE().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CUSTOMIZE.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CUSTOMIZE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnadd;
    private javax.swing.JButton jbtncusttotal;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JTextField txtcusttotal;
    private javax.swing.JTextField txtoption;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsr;
    // End of variables declaration//GEN-END:variables
}
