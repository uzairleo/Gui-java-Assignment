package DBMS;

//STEP 1. Import required packages
import java.sql.*;

public class JDBC_Create {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/company";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try
   {
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO Customers " +
                   "VALUES (Null, 'Atif', 'atif@atif.com', 09984858)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Customers " +
                   "VALUES (Null, 'Atif', 'atif@atif.com', 09984858)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Customers " +
                   "VALUES (Null, 'Atif', 'atif@atif.com', 09984858)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Customers " +
                   "VALUES (Null, 'Atif', 'atif@atif.com', 09984858)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample