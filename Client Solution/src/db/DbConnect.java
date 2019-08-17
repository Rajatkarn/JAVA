package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    static public Connection c;
    static public Statement st;
    static public PreparedStatement insertUser;
    static public PreparedStatement getUsers;
    static public PreparedStatement updateUser;
    static String driver ="com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/clientsoldb"; 
    static String uname = "root";
    static String pass = "Karn";
    static{
        try{
        Class.forName(driver);
        c=DriverManager.getConnection(url,uname,pass);
        st=c.createStatement();
        insertUser=c.prepareStatement(
          "insert into client_info (name,gender,dob,country,address,"
                  + "language) values(?,?,?,?,?,?)");
        getUsers=c.prepareStatement(
                "select * from client_info where name like ?");
        updateUser=c.prepareStatement(
          "update client_info set name=?,gender=?,dob=?,country=?,address=?,"
                  + "language=? where cid=?");
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
        }
    }
}
