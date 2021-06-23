
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="loginheader.jsp"></jsp:include>
    <div class="wrap_content">
           <div class="main_space">
               <div class="form_signup">
                   <div class="form_content">
                       <form action="/Shopee_clone/addInformation" method="GET">
                            <div class="text">Hoàn Tất Thông Tin</div>
                            <div class="input_area area_add">
                                <div class="uNameForm uNameForm2">
                                    <input class="i_area" type="text" name="accountName" placeholder="Tên tài khoản" required>
                                </div>
                                
                                <div class="uNameForm uNameForm2">
                                    <input class="i_area" type="text" name="fullName" placeholder="Tên người dùng" required>
                                </div>
                                
                                <div class="uNameForm uNameForm2">
                                    <input class="i_area" type="text" name="email" placeholder="Email" required>
                                </div>
                                
                                <div class="uNameForm uNameForm2">
                                    <input class="i_area" type="text" name="address" placeholder="Địa chỉ" required>
                                </div>
                            </div>

                            <div class="btn_submits finish">
                                <input class="btn_submit" type="submit" name="submit" value="Hoàn Thành">
                            </div>

                            
                       </form>   
                   </div>
               </div>
           </div>
       </div>
        
   </div>
   <script>
       document.getElementsByClassName("text_login")[0].style.display="none";
       document.getElementsByClassName("text_signup")[0].style.display="none";
   </script>
<jsp:include page="footerLoginPage.jsp"></jsp:include>

