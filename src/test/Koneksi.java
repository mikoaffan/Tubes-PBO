/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Asus
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {

    public static Connection ConnectDb(){

        Connection conn ;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tubespbo","root","");
            JOptionPane.showMessageDialog(null, "Anda Sudah Terhubung");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
