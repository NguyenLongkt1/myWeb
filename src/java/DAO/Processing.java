package DAO;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabean.Product;
import javabean.User;

public class Processing {
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
//------------------------- Get product by category ID ------------------------- 
    public int count_pr(int cid) throws SQLException{
        String query = "SELECT COUNT(*) FROM product WHERE categoryID = ?";
        try{
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, cid);
            rs = pstmt.executeQuery();
            while(rs.next()){
                return rs.getInt(1);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
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
        return 0;
    }    
//------------------------- Get product by category ID -------------------------     
    public ArrayList<Product> sellectProductByCategoryID(int cid,int index) throws SQLException{
        String query = "SELECT * FROM product WHERE categoryID = ? ORDER BY productID DESC LIMIT ? ,10";
        ArrayList<Product> listPr = new ArrayList<>();
        try {
            
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, cid);
            pstmt.setInt(2, index);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                listPr.add(new Product(rs.getInt("productID"),rs.getString("productname"),rs.getString("image"),rs.getInt("price"),rs.getInt("numbers"),rs.getString("categoryname"),rs.getString("description"),rs.getInt("userID"),rs.getInt("categoryID")));
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
    
    //------------------------- Get product by category ID -------------------------     
    public ArrayList<Product> sellectNewProductByCategoryIDForHome(int cid) throws SQLException{
        String query = "SELECT * FROM product WHERE categoryID = ? ORDER BY productID DESC LIMIT 6";
        ArrayList<Product> listPr = new ArrayList<>();
        try {
            
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, cid);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                listPr.add(new Product(rs.getInt("productID"),rs.getString("productname"),rs.getString("image"),rs.getInt("price"),rs.getInt("numbers"),rs.getString("categoryname"),rs.getString("description"),rs.getInt("userID"),rs.getInt("categoryID")));
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
    //------------------------- Get category ID -------------------------     
    public int getCategoryID(String cname) throws SQLException{
        String query = "SELECT * FROM product WHERE categoryname = ?";
        ArrayList<Product> listPr = new ArrayList<>();
        try {
            
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, cname);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                return rs.getInt("categoryID");
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
        return -1;
    }
//------------------------- Get product by Product Name-------------------------    
    public ArrayList<Product> sellectProductByName(String name) throws SQLException{
        String query = "SELECT * FROM product WHERE productname LIKE ? ";
        ArrayList<Product> listPr = new ArrayList<>();
        try {
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, name+"%");
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                listPr.add(new Product(rs.getInt("productID"),rs.getString("productname"),rs.getString("image"),rs.getInt("price"),rs.getInt("numbers"),rs.getString("categoryname"),rs.getString("description"),rs.getInt("userID"),rs.getInt("categoryID")));
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
    
//------------------------- Get product by Product Name-------------------------    
    public Product sellectProductById(int id) throws SQLException{
        String query = "SELECT * FROM product WHERE productID = ? ";
        try {
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {                
                return new Product(rs.getInt("productID"),rs.getString("productname"),rs.getString("image"),rs.getInt("price"),rs.getInt("numbers"),rs.getString("categoryname"),rs.getString("description"),rs.getInt("userID"),rs.getInt("categoryID"));
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
        return null;
    }  
//------------------------- Get User by accountname and passowrd-------------------------    
public User getUser(String acc,String pass) throws SQLException{
        String query = "SELECT * FROM users WHERE (username=? OR phoneNumbers=?)AND passwords=? ";
        try {
            getConnect();
            pstmt=connection.prepareStatement(query);
            pstmt.setString(1, acc);
            pstmt.setString(2, acc);
            pstmt.setString(3, pass);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt("userID"),rs.getString("username"), rs.getString("passwords"), rs.getString("fullname"),rs.getString("email"), rs.getString("phoneNumbers"), rs.getString("address")); 
            }
             } catch (SQLException ex) {
            System.out.println("Oops!Đã xảy ra lỗi gì đó");
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
        return null;
    } 

//------------------------- same account ? -------------------------
    public String getAccountName(String phoneNumber) throws SQLException{
        String query = "SELECT * FROM users WHERE phoneNumbers = ?";
        try {
            getConnect();
            pstmt=connection.prepareStatement(query);
            pstmt.setString(1, phoneNumber);
            rs = pstmt.executeQuery();
            while(rs.next())
              return rs.getString("phoneNumbers");
            } 
        catch (SQLException ex) {
            System.out.println("Oops!Đã xảy ra lỗi gì đó");
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
        return null;
    }
//------------------------- get categoryID by name -------------------------
    public int getCategoryIDs(String categoryName) throws SQLException{
        String query = "SELECT * FROM category WHERE categoryname = ?";
        try {
            getConnect();
            pstmt=connection.prepareStatement(query);
            pstmt.setString(1, categoryName);
            rs = pstmt.executeQuery();
            while(rs.next()){
                return rs.getInt("categoryID");
            }
            } 
        catch (SQLException ex) {
            System.out.println("Oops!Đã xảy ra lỗi gì đó");
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
        return -1;
    }    
//------------------------- add account to DB-------------------------
    public void insertAccToDB(String username,String pass,String fullname,String email,String phoneNumber,String address) throws SQLException{
        String query = "INSERT INTO users(username,passwords,fullname,email,phoneNumbers,address) VALUE(?,?,?,?,?,?)";
        try {
            getConnect();
            pstmt=connection.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, pass);
            pstmt.setString(3, fullname);
            pstmt.setString(4, email);
            pstmt.setString(5, phoneNumber);
            pstmt.setString(6, address);
            int i=pstmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println("Oops!Không thể thêm vào cơ sở dữ liệu");
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
    
//------------------------- add account to DB-------------------------
    public void insertProductToDB(String productname,String image,String price,String numbers,String categoryname,String description,int userID,int categoryID) throws SQLException{
        String query = "INSERT INTO product(productname,image,price,numbers,categoryname,description,userID,categoryID) VALUE(?,?,?,?,?,?,?,?)";
        try {
            getConnect();
            pstmt=connection.prepareStatement(query);
            pstmt.setString(1, productname);
            pstmt.setString(2, image);
            pstmt.setString(3, price);
            pstmt.setString(4, numbers);
            pstmt.setString(5, categoryname);
            pstmt.setString(6, description);
            pstmt.setInt(7, userID);
            pstmt.setInt(8, categoryID);

            int i=pstmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println("Oops!Không thể thêm vào cơ sở dữ liệu");
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
    
//------------------------- delete an item -------------------------
    public void DeleteItem(int prid) throws SQLException{
        String query ="DELETE FROM cart WHERE pid =?";
        try {
            getConnect();
            pstmt=connection.prepareStatement(query);
            pstmt.setInt(1, prid);
            int i= pstmt.executeUpdate();
            } 
        catch (SQLException ex) {
            System.out.println("Oops!Đã xảy ra lỗi gì đó");
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
    public String sellectUserNamebyID(int uid) throws SQLException{
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
    //------------------------- Get userName by user ID ------------------------- 
    public String sellectUserNamebyProductID(int pid) throws SQLException{
        String query = "SELECT * FROM users WHERE productID = ?";
        String seller ="";
        try {
            
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, pid);
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
 //------------------------- Get password by email -------------------------    
    public String getPasswordByEmail(String email) throws SQLException{
        String query = "SELECT passwords FROM users WHERE email=?";
        String pass = "";
        try{
            getConnect();
            pstmt = connection.prepareStatement(query);
            pstmt.setString(1, email);
            rs = pstmt.executeQuery();
            while(rs.next()){
                pass = rs.getString("passwords");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
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
        return pass;
    }
}
