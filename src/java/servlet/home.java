
package servlet;

import DAO.Processing;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabean.Product;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class home extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        /* 
            Mặc định user chưa login tài khoản
        */
        getServletContext().setAttribute("isLogin", 0);
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        /* 
            Tạo các list chứa các loại sản phẩm
            và đổ dữ liệu lấy từ DB vào từng list
            sau đó forward dữ liệu lên trang hiển thị
        */
        
        Processing process=new Processing();
        ArrayList<Product> listPrMenFashion;
        ArrayList<Product> listPhone;
        ArrayList<Product> listElecDevice;
        ArrayList<Product> listPC;
        ArrayList<Product> listWatch;
        ArrayList<Product> listCamera;
        ArrayList<Product> listFootware;
        ArrayList<Product> listVehical;
        ArrayList<Product> listPrWomenFashion;
        ArrayList<Product> listBooks;

        listPrMenFashion= process.sellectNewProductByCategoryIDForHome(1);
        
        listPhone = process.sellectNewProductByCategoryIDForHome(2);
        
        listElecDevice = process.sellectNewProductByCategoryIDForHome(3);
        
        listPC = process.sellectNewProductByCategoryIDForHome(4);
        
        listWatch = process.sellectNewProductByCategoryIDForHome(5);
        
        listCamera = process.sellectNewProductByCategoryIDForHome(6);
        
        listFootware = process.sellectNewProductByCategoryIDForHome(7);
        
        listVehical = process.sellectNewProductByCategoryIDForHome(8);
        
        listPrWomenFashion = process.sellectNewProductByCategoryIDForHome(9);
        
        listBooks = process.sellectNewProductByCategoryIDForHome(10);
        
        request.setAttribute("listMenFashion", listPrMenFashion);
        request.setAttribute("listPhone", listPhone);
        request.setAttribute("listElecDevice", listElecDevice);
        request.setAttribute("listPC", listPC);
        request.setAttribute("listWatch", listWatch);
        request.setAttribute("listCamera", listCamera);
        request.setAttribute("listFootware", listFootware);
        request.setAttribute("listVehical", listVehical);
        request.setAttribute("listWomenFashion", listPrWomenFashion);
        request.setAttribute("listBooks", listBooks);
        
        request.getRequestDispatcher("/UI/home.jsp").forward(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "servlet home";
    }// </editor-fold>

}
