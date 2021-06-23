<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Shopee Việt Nam | Mua và Bán trên ứng dụng di động</title>
        <link rel="icon" href="data:image/png;base64,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">
        <link rel="stylesheet" href="/Shopee_clone/style/style_login_header.css">
        <link rel="stylesheet" href="/Shopee_clone/style/style_body.css">
        <link rel="stylesheet" href="/Shopee_clone/style/style_footer.css">
        <link rel="stylesheet" href="/Shopee_clone/style/style_navication.css">
        <link rel="stylesheet" href="/Shopee_clone/style/style_cart.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <script src="/Shopee_clone/JS/javascript.js" type="text/javascript"></script> 
        <script src="/Shopee_clone/JS/modify_amount.js" type="text/javascript"></script> 
    </head>
    <body>
        <body>
    <div class="wrap_page">
      <div class ="space_outside_header">  
       <div class="wrap_around_header"> 
            <div class="warp_header">
                <div class="wrap_logo_and_text">
                        <div class="logo_page">
                            <a href=""><img class="logo-for-header" src="/Shopee_clone/img/logo.png" alt="logo page"></a>
                        </div>

                        <div class="text_login">
                            Đăng Nhập
                        </div>
                        
                        <div class="text_signup">
                            Đăng Ký
                        </div>
                </div> 

                <div class="need_help">
                    <a href="" class="help">Cần trợ giúp?</a>
                </div>
            </div>
       </div> 
      </div>      
