
package servlet;

import DAO.Processing;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class signup extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String phoneNumber = request.getParameter("userName");
        String pass = request.getParameter("userPass");
        Processing prs = new Processing();
        if(prs.getAccountName(phoneNumber)==null){
            HttpSession userAccount = request.getSession();
            userAccount.setAttribute("phoneNumbers", phoneNumber);
            userAccount.setAttribute("password", pass);
            userAccount.setMaxInactiveInterval(-1);
            request.setAttribute("sucess", "Đăng ký thành công!");
//            request.getRequestDispatcher("UI/addInformation.jsp").forward(request, response);
        }
        else{
            request.setAttribute("warning", "Số điện thoại này đã được đăng ký!");
        }
        request.getRequestDispatcher("UI/signupPage.jsp").forward(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
