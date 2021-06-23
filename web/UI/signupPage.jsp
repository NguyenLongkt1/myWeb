
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="loginheader.jsp"></jsp:include>
    <div class="wrap_content">
           <div class="main_space">
               <div class="form_signup">
                   <div class="form_content">
                       <div class="warning_notify">
                        <h3 class="sucessed">${sucess}</h3>
                        <h3 class="warning">${warning}</h3>
                       </div>
                       <form action="/Shopee_clone/signup" method="POST">
                            <div class="text">Đăng Ký</div>
                            <div class="input_area area_signup">
                                <div class="uNameForm uNameForm2">
                                    <input class="i_area" type="text" name="userName" placeholder="Số điện thoại" required>
                                </div>
                                <div class="passwordForm2">
                                    <input class="i_area pass" type="password" name="userPass" placeholder="Mật khẩu" required>
                                    <div class="hidshow" onclick="displayOrHidden()">
                                        <div class="hid"">
                                           <i class="fas fa-eye-slash"></i>
                                        </div>
                                        <div class="show">
                                           <i class="fas fa-eye"></i>
                                        </div>
                                    </div>
                                </div>
                                <div class="passwordForm2">
                                    <input class="i_area pass" type="password" name="userPass2" placeholder="Nhập lại mật khẩu" required>
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
                                <input class="btn_submit" type="submit" name="submit" value="Đăng Ký">
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

                            <div class="signup_policy">
                                <span>Bằng việc đăng ký, bạn đã đồng ý về </span>
                                <a href="">Điều khoản dịch vụ</a>
                                <span> và </span>
                                <a href="">Chính sách bảo mật</a>
                            </div>
                            
                            <div class="login_path">
                                <span>Bạn đã có tài khoản?</span>
                                <a class="link_login" href="loginPage.jsp">Đăng Nhập</a>
                            </div>
                       </form>
                       
                       <form class="next_to_another" action="/Shopee_clone/UI/addInformation.jsp" method="POST">
                           <input class="next_to_page" type="submit" name="next_to_add" value="Thêm thông tin" />
                       </form>
                   </div>
               </div>
           </div>
       </div>
        
   </div>
   <script>
       document.getElementsByClassName("text_login")[0].style.display="none";
       document.getElementsByClassName("text_signup")[0].style.display="inline-block";
   </script>
<jsp:include page="footerLoginPage.jsp"></jsp:include>
