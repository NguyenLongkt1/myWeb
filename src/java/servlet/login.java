
package servlet;

import DAO.Processing;
import com.mysql.cj.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabean.User;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        Processing prs=new Processing();        
        ServletContext context=getServletContext();             // tạo đối tượng servlet context
        String userNameInput=request.getParameter("userName");  // lấy ra tài khoản người dùng
        String userPassInput=request.getParameter("userPass");  // lấy mật khẩu
        User userLogin = prs.getUser(userNameInput, userPassInput);
 
    /*
        validate tài khoản để điều khiển luồng đi
    */    
        // Nếu tài khoản đúng -> Lưu thông tin và chuyển hướng về trang chủ
        if(prs.getUser(userNameInput, userPassInput)!=null){ 
            
            /*
                Lưu thông tin user vào session
            */
            HttpSession session = request.getSession();
            session.setAttribute("Password", userPassInput);
            session.setAttribute("Address", userLogin.getAddress());
            session.setAttribute("UserID", userLogin.getUserID());
            session.setMaxInactiveInterval(-1);
            /*
                Lưu thông tin vào context để truy cập ở mọi servlet
            */
            context.setAttribute("usedName", prs.getUser(userNameInput, userPassInput).getName());
            context.setAttribute("user_ID", prs.getUser(userNameInput, userPassInput).getUserID());
            
            String sessionId = session.getId();
            Cookie ssId= new Cookie("sessionId", sessionId);
            ssId.setMaxAge(-1);;
            context.setAttribute("isLogin", 1);
            response.sendRedirect("/Shopee_clone/home");
        }
        // Nếu tài khoản sai -> Trở lại trang đăng nhập
        else{
            request.setAttribute("warnings", "Thông tin tài khoản,mật khẩu không chính xác");
            request.getRequestDispatcher("UI/loginPage.jsp").forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
