/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpus;

/**
 *
 * @author Advie Rifaldy
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Perpus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        form mainForm  = new form();
        mainForm.setVisible(true);
        mainForm.setTitle("Sistem Informasi Perpustakaan");
        mainForm.setLocation(560, 160);
        
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabaseName";
        String user = "YourUsername";
        String password = "YourPassword";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");
            
            // Perform database operations here
            
            conn.close();
            System.out.println("Disconnected from the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
