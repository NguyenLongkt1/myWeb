<%-- 
    Document   : navication_header
    Created on : Apr 29, 2021, 1:33:53 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
      <div class="wrap_outside_nav">
        <div class="wrap_nav">  
         <div class="nav nav1">
                <a class="nav_items separated" href="/Shopee_clone/selling_channel">Kênh người bán</a>
                <a class="nav_items separated" href="#">Tải ứng dụng</a>
                <div class="text inlineblock">
                    <span>Kết nối</span>
                </div>
                <div class="social_connect inlineblock">
                    <a class="nav_items icon" href="https://facebook.com/SHOPEEVN"><i class="fab fa-facebook"></i></a>
                    <a class="nav_items icon" href="https://www.instagram.com/accounts/login/"><i class="fab fa-instagram"></i></a>
                </div>    
         </div>
         <div class="nav nav2">
                <a class="nav_items icon" href="#"><i class="fas fa-bell"></i>Thông báo</a>
                <a class="nav_items icon" href="#"><i class="far fa-question-circle"></i>Hỗ trợ</a>
                <a class="nav_items icon separated log" href="/Shopee_clone/UI/signupPage.jsp" ${isLogin==1?"style=\"display:none\"":"style=\"display:inline-block\""}>Đăng kí</a>
                <a class="nav_items icon sig" href="/Shopee_clone/UI/loginPage.jsp" ${isLogin==1?"style=\"display:none\"":"style=\"display:inline-block\""}>Đăng nhập</a>
                <a class="nav_items icon sig" href="/Shopee_clone/logout" ${isLogin==1?"style=\"display:inline-block\"":"style=\"display:none\""}>Đăng xuất</a>    
                <div class="welcome" ${isLogin==1?"style=\"display:inline-block\"":"style=\"display:none\""}>
                    <div class="elements">
                        <div class="user_icon">
                            <i class="far fa-user"></i>
                        </div>
                        <a class="nav_items icon separated log" href="/Shopee_clone/UI/signupPage.jsp">${usedName}</a>
                    </div>
                </div>
                
         </div>
        </div>
      </div>              
