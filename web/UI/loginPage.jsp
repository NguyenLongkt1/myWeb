
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/UI/loginheader.jsp"></jsp:include>
    <div class="wrap_content">
           <div class="main_space">
               <div class="form_login">
                   <div class="warning_notify">
                       <h3 class="warning">${warnings}</h3>
                   </div>
                   <div class="form_content">
                       <form action="/Shopee_clone/login" method="POST">
                            <div class="texts">Đăng nhập</div>
                            <div class="input_area">
                                <div class="uNameForm">
                                    <input class="i_area" type="text" name="userName" placeholder="Email/Số điện thoại/Tên đăng nhập" required>
                                </div>
                                <div class="passwordForm">
                                    <input class="i_area pass" type="password" name="userPass" placeholder="Mật khẩu" required>
                                    <div class="hidshow" onclick="displayOrHidden()">
                                        <div class="hid">
                                           <i class="fas fa-eye-slash"></i>
                                        </div>
                                        <div class="show">
                                           <i class="fas fa-eye"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="btn_submits">
                                <input class="btn_submit" type="submit" name="submit" value="Đăng nhập">
                            </div>
                            <div class="forgot">
                                <a href="/Shopee_clone/UI/forgot_pass.jsp" class="forgot_pass">Quên mật khẩu</a>
                                <a href="" class="login_with_sms">Đăng nhập với SMS</a>
                            </div>

                            <div class="separate">
                                <div class="separated_icons">
                                    <div class="separated_icon">
                                    </div>
                                </div>
                                <span> Hoặc </span>
                                <div class="separated_icons">
                                     <div class="separated_icon">
                                     </div>
                                </div>
                            </div>

                            <div class="connect_with_social_account">
                                <div class="social_account fb">
                                   <i class="fab fa-facebook"></i>
                                   <h5 class="social_name">Facebook</h5>
                                </div>
                                <div class="social_account gg">
                                   <i class="fab fa-google"></i>
                                   <h5 class="social_name">Google</h5>
                                </div>
                                <div class="social_account ap">
                                   <i class="fab fa-apple"></i>
                                   <h5 class="social_name">Apple</h5>
                                </div>
                            </div>

                            <div class="signup_path">
                                <span>Bạn mới biết đến Shopee?</span>
                                <a class="link_signup" href="/Shopee_clone/UI/signupPage.jsp">Đăng ký</a>
                            </div>
                       </form>   
                   </div>
               </div>
           </div>
       </div>
        
   </div>
<jsp:include page="/UI/footerLoginPage.jsp"></jsp:include>