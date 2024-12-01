/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthyme;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Parth Anil Bidave S
 */
public class SearchPage extends javax.swing.JFrame {
private DefaultListModel<String> listModel;
    /**
     * Creates new form SearchPage
     */
    public SearchPage() {
    initComponents();
    listModel = new DefaultListModel<>();  // Initialize the DefaultListModel
    resultList.setModel(listModel);  // Set the listModel to resultList
    
    searchButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String searchTerm = searchField.getText();
            if (!searchTerm.isEmpty()) {
                performSearch(searchTerm);
            } else {
                JOptionPane.showMessageDialog(SearchPage.this, "Please enter a search term.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    });

    // Make the frame visible
    this.setVisible(true);
}
private void performSearch(String searchTerm) {
    List<String> results = new ArrayList<>();
    String url = "jdbc:mysql://localhost:3306/healtyme"; // Replace with your DB details
    String user = "root"; // Replace with your username
    String password = "root"; // Replace with your password

    String query = "SELECT foodname, calories, protein, image FROM food_database WHERE foodname LIKE ?";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        // Use the search term in the SQL query
        preparedStatement.setString(1, "%" + searchTerm + "%");
        
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                String foodName = "Food Name: " + resultSet.getString("foodname");
                String calories = "Calories: " + resultSet.getString("calories");
                String protein = "Protein: " + resultSet.getString("protein");
                
                // Assuming 'image' is of type BLOB
                

                // Add results to the list
                results.add(foodName);
                results.add(calories);
                results.add(protein);

                
            }
        }

        // Handle the results (displaying text and image in the UI)
        listModel.clear();
        if (!results.isEmpty()) {
            for (String result : results) {
                listModel.addElement(result);
            }
        } else {
            JOptionPane.showMessageDialog(SearchPage.this, "No results found.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(SearchPage.this, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList<>();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sora", 0, 24)); // NOI18N
        jLabel3.setText("What did you eat today?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 300, -1));

        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 60, 60));

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Sora", 0, 18)); // NOI18N
        searchField.setToolTipText("");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 410, 40));

        searchButton.setBackground(new java.awt.Color(0, 0, 0));
        searchButton.setBorderPainted(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 30, 40));

        resultList.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(resultList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 350, 220));

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        profile obj1 = new profile();
        obj1.show();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       // Check if an item is selected in the resultList
    int selectedIndex = resultList.getSelectedIndex();
    if (selectedIndex == -1) {
        JOptionPane.showMessageDialog(SearchPage.this, "Please select an item from the list.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the selected food item from the list
    String selectedItem = resultList.getSelectedValue();
    
    // Assuming the list item is in the format "Food Name: X", "Calories: Y", extract calories
    String foodName = selectedItem.split(",")[0].replace("Food Name: ", "").trim();
    String caloriesString = resultList.getModel().getElementAt(selectedIndex + 1).replace("Calories: ", "").trim();
    int calories = Integer.parseInt(caloriesString);  // Convert calories string to int

    String url = "jdbc:mysql://localhost:3306/healtyme";  // Replace with your DB details
    String user = "root";  // Replace with your DB username
    String password = "root";  // Replace with your DB password

    // SQL insert query to add the selected food and calories to calorie_log table
    String insertQuery = "INSERT INTO calorie_log (foodname, calories) VALUES (?, ?)";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

        // Set the food name and calories in the SQL query
        preparedStatement.setString(1, foodName);
        preparedStatement.setInt(2, calories);

        // Execute the insert query
        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(SearchPage.this, "Calories added to log!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(SearchPage.this, "Failed to add calories to log.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(SearchPage.this, "Error adding to log: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    // TODO add your handling code here:    
    }//GEN-LAST:event_addActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> resultList;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
