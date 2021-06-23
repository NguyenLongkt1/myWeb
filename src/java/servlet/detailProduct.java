
package servlet;

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

public class detailProduct extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext context = request.getServletContext();
        
        String url = request.getRequestURL().toString()+"?"+request.getQueryString();
        String pids = (url.substring(url.indexOf("=")+1));
        int pid = Integer.parseInt(pids);
        context.setAttribute("pids", pid);   
        Processing prs = new Processing();
        Product pr = prs.sellectProductById(pid);
        request.setAttribute("product", pr);
        request.getRequestDispatcher("UI/product_detail.jsp").forward(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(detailProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(detailProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
