/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author dipak
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            //Class.forName("com-mysql.jdbc.driver");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem", "root", "Admin9767");
            return con;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.toString());
            return null;
        }
    }
}
