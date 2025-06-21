package Java_Database_Connectivity;

import java.sql.*;


public class Connect 
{
    static Connection conn;
    public static Connection connection()
    {
        try
        {
            conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/school","postgres","ch3cooc2h5");

        }
        catch(Exception e)
        {
            System.out.println("Failure");
        }
        return conn;
        
    }
    
}
