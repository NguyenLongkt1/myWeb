package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabean.Cart;
import javabean.Product;
import javabean.User;

public class ProcessTableCart {
    String urlString="jdbc:mysql://localhost:3306/shopeecloneapp?characterEncoding=UTF-8";
    String userName="root";
    String password="root";
    Connection connection=null;
    Statement stmt=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    Product product = new Product();

//------------------------- Get a connect to Database -------------------------    
    public Connection getConnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(urlString,userName,password);
        } catch (Exception e) {
            System.out.println("Loi ket noi");
            e.printStackTrace();
        }
        return connection;
    }
//------------------------- add to cart -------------------------
    public void addToCart(int userID, String fullname ,int productID ,String productName ,String image ,int price ,int numbers ,int total_price ,int categoryID ,String categoryName, String seller) throws SQLException{
        String query = "INSERT INTO tbl_cart(userID,fullname,productID,productname,image,price,numbers,total_price,categoryID,categoryname,seller)"
                + "VALUE(?,?,?,?,?,?,?,?,?,?,?)";
        try {           
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1,userID);
            pstmt.setString(2,fullname);
            pstmt.setInt(3,productID);
            pstmt.setString(4,productName);
            pstmt.setString(5,image);
            pstmt.setInt(6,price);
            pstmt.setInt(7,numbers);
            pstmt.setInt(8,total_price);
            pstmt.setInt(9,categoryID);
            pstmt.setString(10,categoryName);
            pstmt.setString(11,seller);

            int i = pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Không thêm được sản phẩm vào csdl");
            ex.printStackTrace();
            Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(rs!=null)
                rs.close();
            if(pstmt!=null)
                pstmt.close();
            if(stmt!=null)
                stmt.close();
            if(connection!=null)
                connection.close();
        }        
    }
//------------------------- Get product by user ID -------------------------     
    public ArrayList<Cart> sellectProductByUserID(int uid) throws SQLException{
        String query = "SELECT * FROM tbl_cart WHERE userID = ?";
        ArrayList<Cart> listPr = new ArrayList<>();
        try {
            
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, uid);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                listPr.add(new Cart(rs.getInt("userID"),rs.getString("fullname"),rs.getInt("productID"),rs.getString("productname"),rs.getString("image"),rs.getInt("price"),rs.getInt("numbers"),rs.getInt("total_price"),rs.getInt("categoryID"),rs.getString("categoryname"),rs.getString("seller")));
            }
        } catch (SQLException ex) {
            System.out.println("Không lấy được sản phẩm");
            ex.printStackTrace();
            Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(rs!=null)
                rs.close();
            if(pstmt!=null)
                pstmt.close();
            if(stmt!=null)
                stmt.close();
            if(connection!=null)
                connection.close();
        }
        return listPr;
    }
//------------------------- delete an item -------------------------
    public void DeleteItem(int prid) throws SQLException{
        String query ="DELETE FROM tbl_cart WHERE productID =?";
        try {
            getConnect();
            pstmt=connection.prepareStatement(query);
            pstmt.setInt(1, prid);
            int i= pstmt.executeUpdate();
            } 
        catch (SQLException ex) {
            System.out.println("Oops!Đã xảy ra lỗi gì đó...Không xóa được sản phẩm này");
            ex.printStackTrace();
            Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(rs!=null)
                rs.close();
            if(pstmt!=null)
                pstmt.close();
            if(stmt!=null)
                stmt.close();
            if(connection!=null)
                connection.close();
        }
    }
//------------------------- Get userName by user ID -------------------------     
    public String sellectSellerbyID(int uid) throws SQLException{
        String query = "SELECT * FROM users WHERE userID = ?";
        String seller ="";
        try {
            
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, uid);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                seller =rs.getString("username");
            }
        } catch (SQLException ex) {
            System.out.println("Không lấy được thông tin");
            ex.printStackTrace();
            Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(rs!=null)
                rs.close();
            if(pstmt!=null)
                pstmt.close();
            if(stmt!=null)
                stmt.close();
            if(connection!=null)
                connection.close();
        }
        return seller;
    }
}