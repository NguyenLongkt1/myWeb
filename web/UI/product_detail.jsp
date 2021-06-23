<%-- 
    Document   : product_detail
    Created on : Apr 10, 2021, 12:02:43 PM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>

   <div class="product_introduction">
          <div class="wrap_left">
             <div class="image_frame">
                <img class="large_img" src="${product.image}" alt="">
             </div>

             <div class="another_img_of_product">
                 <div class="another_img"></div>
                 <div class="another_img"></div>
                 <div class="another_img"></div>
                 <div class="another_img"></div>
                 <div class="another_img"></div>
             </div>

             <div class="like_share">
                 <div class="share_with">
                    <div class="wrap_share_area"> 
                        <span class="share_text">Chia sẻ:  </span>
                        <button class="share_product_to_social_media mess"></button>
                        <button class="share_product_to_social_media face"></button>
                        <button class="share_product_to_social_media google"></button>
                        <button class="share_product_to_social_media prin"></button>
                        <button class="share_product_to_social_media twice"></button>
                    </div>  
                 </div>

                 <div class="liked_number">
                    <div class="wrap_like_area"> 
                        <i class="far fa-heart"> <h6>5</h6> </i>
                    </div>    
                 </div>
             </div>
          </div>

          <div class="wrap_right">

             <div class="wrap_around_right_content">
                 <div class="wrap_product_name">
                    <h2 class="product_name_h2">
                        ${product.product_name}
                    </h2>
                 </div>

                 <div class="wrap_statistic">
                     <div class="star_vote">
                        <div class="rate">
                             <span>5.0</span>
                        </div>
                        <div class="star">
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                        </div>
                     </div>
                     <div class="voted_number">
                         <span class="number_people_voted">552 </span>
                         <span class="voted"> Đánh giá </span>
                     </div>
                     <div class="selled_numbers">
                        <span class="number_people_bought">3,2K </span>
                        <span class="was_selled"> Đã bán</span>
                     </div>
                 </div>

                 <div class="wrap_product_price">
                     <div class="price prdetail">
                         ${product.formatNumber(product.price)}
                     </div>
                 </div>

                 <div class="wrap_voucher_and_transmit">
                     <div class="vourcher">
                         <div class="text_des">
                             <h4>Mã Giảm Giá Của Shop</h4>
                         </div>
                         <div class="code">

                         </div>
                     </div>
                     <div class="transmission">
                          
                          <div class="trans_name">
                            <h4>Vận Chuyển</h4>
                          </div>

                          <div class="transmission_form">
                              <div class="wrap_transmission_free">
                                  <img class="freeship" src="https://deo.shopeemobile.com/shopee/shopee-pcmall-live-sg/assets/1cdd37339544d858f4d0ade5723cd477.png">
                              </div>
                              <div class="transmission_free">
                                   <span> Miễn Phí Vận Chuyển</span>
                                   <h4 class="freeship_condition"> Miễn Phí Vận Chuyển khi đơn hàng đạt giá trị tối thiểu</h4>
                              </div>

                              <div class="wrap_transmission_free">
                                <i class="fas fa-truck-moving"></i>
                              </div>
                              <div class="transmission_to ">
                                   <span>Vận Chuyển Tới</span>

                                   <div class="select_city">
                                       <select>
                                           <option>Cần Thơ</option>
                                           <option>Đà Nẵng</option>
                                           <option>Hà Nội</option>
                                           <option>Hà Tĩnh</option>
                                           <option>Hải Dương</option>
                                           <option>Hải Phòng</option>
                                           <option>Huế</option>
                                           <option>Nghệ An</option>
                                           <option>Thanh Hóa</option>
                                           <option>TP Hồ Chí Minh</option>
                                       </select>
                                   </div>

                                   <span>Phí Vận chuyển</span>
                                   <div class="price_small">
                                       đ2.100.000
                                   </div>
                              </div>
                          </div>
                          
                     </div>
                 </div>

                 <div class="wrap_quantity_selected">
                     <div class="wrap_around_form">
                        <div class="quantity_selected_form">
                            <div class="text">
                                <span>Số lượng</span>
                            </div>
                            <div class="form_select">
                                    <button class="selects down" name="decrease" onclick="reduce()">-</button>
                                        <form action="/Shopee_clone/sellectNumberProduct" method="GET">
                                            <input class="select_number" type="text" name="select_the_number_product" value="1">
                                        </form>
                                    <button class="selects up" name="increase" onclick="increase()">+</button>
                            </div>
                            <div class="available">
                                <span class="pr_quantity">${product.numbers} sản phẩm có sẵn</span>
                            </div>
                            
                        </div>
                     </div>
                 </div>

                 <div class="wrap_customer_selection">
                    <div class="wrap_around_form nflex">
                        <form action="/Shopee_clone/addProductToCart" method="POST"> 
                            <button type="submit" class="buttons add_to_cart">
                                <i class="fas fa-cart-plus"></i>
                                <span>Thêm vào giở hàng</span>
                            </button>
                        </form>    
                        <form action="" method="POST">     
                            <button type="button" class="buttons buy_now">
                                <span>Mua ngay</span>
                            </button>
                        </form>    
                    </div>
                 </div>

                 <div class="wrap_gurantee">
                     <div class="gurantee">
                         <div class="gurantee_key">
                             <img id="shield" src="https://deo.shopeemobile.com/shopee/shopee-pcmall-live-sg/assets/67454c89080444c5997b53109072c9e0.png">
                             <a href="">
                                 Shopee Đảm Bảo
                             </a>
                         </div>
                         <div class="gurantee_value">
                             <a href="">
                                 3 Ngày Trả Hàng/Hoàn Tiền
                             </a>
                         </div>
                     </div>
                 </div>

             </div>

          </div>
   </div>

</div>
    
<jsp:include page="footerLoginPage.jsp"></jsp:include>
