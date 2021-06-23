package servlet;

import DAO.ProcessTableCart;
import DAO.Processing;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabean.Product;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addProductToCart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext context = request.getServletContext();
        Processing prc = new Processing();

        int pid = (int) context.getAttribute("pids");
        String fullname = (String) context.getAttribute("usedName");
        int uid = (int) context.getAttribute("user_ID");
        Product pr = prc.sellectProductById(pid); 
        int buyNumber = 2;
        
        ProcessTableCart ptc = new ProcessTableCart();
        
        int total = pr.getPrice()* buyNumber;
        int cid = prc.getCategoryID(pr.getCategoryname());
        String seller = prc.sellectUserNamebyProductID(pid);
          
        try {
            ptc.addToCart(uid, fullname, pid, pr.getProduct_name(), pr.getImage(), pr.getPrice(), buyNumber, total, cid, pr.getCategoryname(),seller);
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(addProductToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("/detailProduct?pid="+pid).forward(request, response);
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(addProductToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(addProductToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
