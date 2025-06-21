package Java_Database_Connectivity;

import java.sql.*;


public class Connect 
{
    static Connection conn;
    public static Connection connection()
    {
        try
        {
            conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/database_name","user_name","password");

        }
        catch(Exception e)
        {
            System.out.println("Failure");
        }
        return conn;
        
    }
    
}
