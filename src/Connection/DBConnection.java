package Connection;

import java.sql.*;

public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/student_registration?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        
            try{
                conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
                return conn;
            }catch(Exception ex){
               
              //  System.out.println("DB is having some error. Please try again later.");
                
                System.out.println(ex);
                
                return null;
            }
    }
}