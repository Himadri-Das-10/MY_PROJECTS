package Java_Database_Connectivity;
import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

class StudentDAO
{
    public static boolean insert(Student st)
    {
        try{
            Connection con=Connect.connection();
            String query="INSERT INTO students(student_id,student_name,student_age,class,division) VALUES(?,?,?,?,?)";


        
            PreparedStatement prepstmt=con.prepareStatement(query);

            prepstmt.setInt(1, st.getStudent_id());
            prepstmt.setString(2, st.getStudent_name());
            prepstmt.setInt(3, st.getStudent_age());
            prepstmt.setString(4, st.getClass_());
            prepstmt.setString(5, st.getDivision());

            prepstmt.executeUpdate();
            con.close();
            return true;

        }
        catch(Exception e)
        {
            return false;
        }
    }


     public static boolean delete(Student st)
    {
        try{
            Connection con=Connect.connection();
            String query="DELETE FROM students WHERE student_id=?";


        
            PreparedStatement prepstmt=con.prepareStatement(query);

            prepstmt.setInt(1, st.getStudent_id());
           

            prepstmt.executeUpdate();
            con.close();
            return true;

        }
        catch(Exception e)
        {
            return false;
        }
    }
    public static void view()
    {
        try{
            Connection con=Connect.connection();
            String query="SELECT * FROM students";
            
            Statement st=con.createStatement();
            ResultSet rset=st.executeQuery(query);

            while(rset.next())
            {
                System.out.println("STUDENT ID   \t"+rset.getInt(1));
                System.out.println("STUDENT NAME \t"+rset.getString(2));
                System.out.println("STUDENT AGE  \t"+rset.getString(3));
                System.out.println("CLASS        \t"+rset.getString(4));
                System.out.println("DIVISION     \t"+rset.getString(5));
                System.out.println("---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---");


            }
            con.close();


        }
        catch(Exception e)
        {
            System.out.println("Failed to display");
        }
    }
}