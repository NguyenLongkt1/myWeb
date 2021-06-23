<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lấy lại mật khẩu</title>
        <link rel="stylesheet" href="/Shopee_clone/style/style_login_header.css">
        <link rel="stylesheet" href="/Shopee_clone/style/style_footer.css">
        <script src="/Shopee_clone/JS/javascript.js"></script>
        <style>
            .header{
                width: 100%;
                height: 60px;
                border-bottom: 1px solid #e7e7e7;
                box-shadow: 0px 6px 6px rgba(0,0,0,0.6);
                background-color: #fff; 
                display: grid;
                grid-template-columns: 25% 30%;
            }
            .header img{
                margin: 0 auto;
                height: 60px;
                display: inline-block;
            }
            .header h2{
                display: inline-block;
                text-align: left;
                color: #ee4d2d;
                line-height: 60px;
                font-weight: 300;
            }
            .wrap_main{
                width: 100%;
                height: 500px;
                background-color: #fff;
            }
            .content{
                width: 40%;
                position: absolute;
                top: 50%;
                left: 35%;
                transform: translateY(-50%);
                border: 1px solid #e7e7e7;
                box-shadow: 0 5px 5px #c0bfbf;
            }
            .content form{
                width: 100%;
            }
            .text{
                width: 100%;
                color: #ee4d2d;
                padding: 10px;
                text-align: center;
            }
            .wrap{
                width: 60%;
                margin: 0 auto;
                padding: 20px 0; 
            }
            #i-btn,#s-btn{
                width: 100%;
                outline: none;
                height: 40px;
            }
            #i-btn{
                border: 1px solid #e7e7e7;
            }
            #s-btn{
                background-color: #ee4d2d;
                color: #fff;
                border: none;
            }   
            .footer{
                margin-top: 0;
                border-top: 1px solid #e7e7e7; 
                background-color: #fff;
            }
        </style>
    </head>
    <body>
        <div class="wrap_page">
        <div class="header">
            <img src="/Shopee_clone/img/logo.png" alt="logo">
            <h2> Lấy lại mật khẩu</h2>
        </div>

        <div class="wrap_main">
            <div class="content">
                <form action="/Shopee_clone/forgot_password" method="POST">
                    <div class="text">
                        <h3>Lấy lại mật khẩu</h3>
                    </div>

                    <div class="wrap_input">
                        <div class="wrap">
                            <input id="i-btn" type="text" name="input_email" placeholder="Nhập email đăng ký" />
                        </div>
                        <div class="wrap">
                        <input id="s-btn" type="submit" onclick="notify()" name="send_me" value="Lấy lại mật khẩu" />
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="footer">
            <div class="address_and_contact">
              <div class="wrap_around">
                  <div class="address">
                      <h5>Địa chỉ: Tầng 28, Tòa nhà trung tâm Lotte Hà Nội, 54 Liễu Giai, phường Cống Vị, Quận Ba Đình, Hà Nội. Tổng đài hỗ trợ: 19001221 - Email: cskh@hotro.shopee.vn</h5>
                  </div>
                  <div class="company_numbers_id">
                      <h5>Mã số doanh nghiệp: 0106773786 do Sở Kế hoạch & Đầu tư TP Hà Nội cấp lần đầu ngày 10/02/2015</h5>
                  </div>
                  <div class="liesence_last_page">
                      <h5>&copy 2015 - Bản quyền thuộc về Công ty TNHH Shopee</h5>
                  </div>
              </div>
         </div>
        </div>
    </div>    
    </body>
</html>
