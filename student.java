package assignment5;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.Connection;

public class student {
    public static void main(String[] args)
    {
        String urlDB="jdbc:mysql://localhost:3306/hr";
        String usrName = "root";
        String passKey = "adminReaper241999";

        try{
            Connection con = DriverManager.getConnection(urlDB, usrName, passKey);
            System.out.println("Connection Successful");
            
            studentInput obj = new studentInput();
            obj.input(con);

        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
