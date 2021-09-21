package projekod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class baglama {
   
    static Connection conn;
    
    public static void main (String[] args)
    {
        
    }
    public static Connection java_baglama()
    {
        
        try {
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sare\\Desktop\\PROLAB II\\Proje 3\\kullanicilar\\kayiticerik.db");
            return conn;
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
    
    static void ekle(String sql_sorgu) throws SQLException{
        
        Statement st;
        conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sare\\Desktop\\PROLAB II\\Proje 3\\kullanicilar\\kayiticerik.db");
       
        try {
              //Create statement
              st=conn.createStatement();
              st.executeUpdate(sql_sorgu);

            System.out.println("Kayit basarili");
        } catch (SQLException e) {
        }
    }
    
     public static Connection tur_baglama()
    {
        
        try {
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sare\\Desktop\\PROLAB II\\Proje 3\\turler\\filmturleri.db");
            return conn;
             
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
     public static Connection netflix_baglama()
    {
        
        try {
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sare\\Desktop\\PROLAB II\\Proje 3\\NetflixDB\\netflixdb.sqlite");
            return conn;
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
    static ResultSet sorgula(String sql_sorgu){

        Statement st;
        ResultSet rs=null; 

      try{
          st=conn.createStatement();
          rs=st.executeQuery(sql_sorgu);
         }catch(SQLException e) {

           e.printStackTrace();
           }
     return rs;
}
} 
