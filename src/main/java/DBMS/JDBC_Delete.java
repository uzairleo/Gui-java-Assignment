package DBMS;

//STEP 1. Import required packages
import java.sql.*;

public class JDBC_Delete {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/company";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "DELETE FROM Orders " +
                   "WHERE o_id = 1";
      stmt.executeUpdate(sql);

      // Now you can extract all the records
      // to see the remaining records
      sql = "SELECT o_id, c_id, p_id, date FROM Orders";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int o_id  = rs.getInt("o_id");
         int c_id = rs.getInt("c_id");
         String p_id = rs.getString("p_id");
         String date = rs.getString("date");

         //Display values
         System.out.print("ID: " + o_id);
         System.out.print(", Age: " + c_id);
         System.out.print(", First: " + p_id);
         System.out.println(", Last: " + date);
      }
      rs.close();
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