
package servlet;

import DAO.Processing;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addProductToDB extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Processing prc = new Processing();
        HttpSession session = request.getSession();
        String prName = request.getParameter("input_product_name");
        String description = request.getParameter("description_about_product");
        String price = request.getParameter("input_product_price");
        String numbers = request.getParameter("warehouse_product");
        String categoryname = request.getParameter("category_of_product");
        String image = request.getParameter("link_to_product_image");
        int userID = (int) session.getAttribute("UserID");
        
        try{
             int categoryID = prc.getCategoryIDs(categoryname);
             System.out.println(categoryname);
             System.out.println(categoryID);
             prc.insertProductToDB(prName, image, price, numbers, categoryname, description, userID, categoryID);
             request.setAttribute("sucessed", "Thêm sản phẩm thành công");
             response.sendRedirect("/Shopee_clone/UI/sellingChannel.jsp");
             request.setAttribute("sucessed", "");
        }
        catch(SQLException ex){
            System.out.println("Không thể thêm sản phẩm");
            ex.printStackTrace();
        }
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
