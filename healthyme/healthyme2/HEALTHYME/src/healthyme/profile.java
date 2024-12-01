/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthyme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Parth Anil Bidave S
 */
public class profile extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
    


    public profile() {
        initComponents();
        setLocation(250,70);
//        loadUserProfile();  
        loadTotalCalories();
    }
    
   
    public void setTextName(String text) {
          // Debug output
        nameLabel.setText(text);
    }

    // Setter for age
    public void setTextAge(String age) {
        ageLabel.setText(age);
    }

    // Setter for weight
    public void setTextWeight(String weight) {
        weightLabel.setText(weight);
    }

    // Setter for height
    public void setTextHeight(String height) {
        heightLabel.setText(height);
    }

    // Setter for gender
    public void setTextGender(String gender) {
        genderLabel.setText(gender);
    }

    // Setter for calorie
    public void setTextCalorie(String calorie) {
        calorieLabel.setText(calorie);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ageLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        viewbmi = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        totalCaloriesLabel = new javax.swing.JLabel();
        calorieLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sora", 1, 36)); // NOI18N
        jLabel3.setText("YOUR PROFILE.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sora", 1, 22)); // NOI18N
        jLabel7.setText("THIS WEEK INTAKE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sora", 1, 22)); // NOI18N
        jLabel8.setText("CALORIE GOAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD MEAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 170, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        ageLabel.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        ageLabel.setText("age");
        getContentPane().add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 310, -1));

        weightLabel.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        weightLabel.setText("weight");
        getContentPane().add(weightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 320, -1));

        heightLabel.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        heightLabel.setText("height");
        getContentPane().add(heightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 310, -1));

        viewbmi.setBackground(new java.awt.Color(0, 0, 0));
        viewbmi.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        viewbmi.setForeground(new java.awt.Color(255, 255, 255));
        viewbmi.setText("view bmi");
        viewbmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbmiActionPerformed(evt);
            }
        });
        getContentPane().add(viewbmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        genderLabel.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        genderLabel.setText("gender");
        getContentPane().add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 310, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LOGOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        totalCaloriesLabel.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        totalCaloriesLabel.setText("intake");
        getContentPane().add(totalCaloriesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        calorieLabel.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        calorieLabel.setText("goal");
        getContentPane().add(calorieLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 90, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nameLabel.setText("name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 320, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    private void loadUserProfile() {
//
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healtyme","root","root");
//            String sql = "SELECT name, age, weight, height, gender, calorie FROM profile "; // Use the appropriate condition
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//           
//            ResultSet rs = pstmt.executeQuery();
//
//            if (rs.next()) {
//                // Set the text of the JLabels with data from the ResultSet
//                nameLabel.setText("Name: " + rs.getString("name"));
//                ageLabel.setText("Age: " + rs.getString("age"));
//                weightLabel.setText("Weight: " + rs.getString("weight"));
//                heightLabel.setText("Height: " + rs.getString("height"));
//                genderLabel.setText("Gender: " + rs.getString("gender"));
//                calorieLabel.setText("/" + rs.getString("calorie"));
//            } else {
//                // Handle case where no data is found
//                JOptionPane.showMessageDialog(this, "No user profile found.");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Error retrieving profile data.");
//        }
//    }
    
    private void loadTotalCalories() {
    try {
        // Establish connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healtyme", "root", "root");

        // Query to get the sum of calories
        String sql = "SELECT SUM(calories) AS total_calories FROM calorie_log";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        // Execute the query
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            // Get the total calories and set the label
            int totalCalories = rs.getInt("total_calories");
            String totalCaloriesString = String.valueOf(totalCalories);

            totalCaloriesLabel.setText(totalCaloriesString);
        } else {
            totalCaloriesLabel.setText("0");
        }
        
        // Close connection
        rs.close();
        pstmt.close();
        conn.close();
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error fetching total calories.");
    }
}

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SearchPage obj2 = new SearchPage();
        obj2.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Createprofile obj1 = new Createprofile();
        obj1.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        landingpage obj3 = new landingpage();
        obj3.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void viewbmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbmiActionPerformed
      try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healtyme", "root", "root");
        String sql = "SELECT weight, height FROM profile";  // Adjust if you need conditions for specific users
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            // Retrieve weight and height from the result set
            double weight = rs.getDouble("weight");
            double height = rs.getDouble("height");

            // Convert height from cm to meters (if necessary)
          // Assuming height is stored in cm

            // Calculate BMI
            double bmi = weight / (height * height);

            // Show the BMI in a dialog box
            JOptionPane.showMessageDialog(this, "Your BMI is: " + String.format("%.2f", bmi));

        } else {
            JOptionPane.showMessageDialog(this, "No profile data found to calculate BMI.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error retrieving data for BMI calculation.");
    }    
    }//GEN-LAST:event_viewbmiActionPerformed

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel calorieLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel totalCaloriesLabel;
    private javax.swing.JButton viewbmi;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
