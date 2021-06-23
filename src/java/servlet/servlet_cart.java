package servlet;

import DAO.ProcessTableCart;
import DAO.Processing;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabean.Cart;
import javabean.Product;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet_cart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext context = request.getServletContext();
        int uid = (int) context.getAttribute("user_ID");    // lấy ra ID của người dùng
        ProcessTableCart ptc = new ProcessTableCart();
        Processing prc = new Processing();
        try {
            ArrayList<Cart> list = ptc.sellectProductByUserID(uid);     // lấy ra danh sách sản phẩm trong giỏ hàng của người dùng
            request.setAttribute("listPrInCart", list);
            request.setAttribute("list_size", list.size());
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(servlet_cart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getRequestDispatcher("/UI/cart.jsp").forward(request, response);
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
}
