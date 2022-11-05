/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bookstore1;
import java.sql.*;
import javax.sql.*;


public class DBconnection {

    Connection con = null;
    
    public static Connection Connectt() throws ClassNotFoundException, SQLException {
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" , "");
        System.out.println("Connected");
        return con;
    }
}
