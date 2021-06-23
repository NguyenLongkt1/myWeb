package servlet;

import DAO.Processing;
import com.mysql.cj.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forgot_password extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String email_user_input = request.getParameter("input_email");
        final String ACC = "nguyenduyww5@gmail.com";
        final String PASS = "nguyenduyww";
        final String RECEIVE_EMAIL = email_user_input;
        final String HOST_NAME = "smtp.gmail.com";
        final String SSL_PORT = "465";
        
        Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.host", HOST_NAME);
            properties.put("mail.smtp.socketFactory.port", SSL_PORT);
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            properties.put("mail.smtp.port", SSL_PORT);
            
            javax.mail.Session session = javax.mail.Session.getInstance(properties, new javax.mail.Authenticator() {
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(ACC, PASS);
                }
            });
        try (PrintWriter out = response.getWriter()) {
            Processing prc = new Processing();
            String content = "Your password " + prc.getPasswordByEmail(email_user_input)+" .Please to keep your password safe.";
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(ACC));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(RECEIVE_EMAIL));
            message.setSubject("We were send to you your password");
            message.setText(content);
            Transport transport = session.getTransport("smtp");
            transport.connect(ACC, PASS);
            transport.sendMessage(message, message.getAllRecipients());   
            transport.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        response.sendRedirect("/Shopee_clone/UI/forgot_pass.jsp");
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
