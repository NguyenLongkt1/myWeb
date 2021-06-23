<%-- 
    Document   : cart
    Created on : Apr 29, 2021, 9:27:41 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page ="loginheader.jsp"></jsp:include>   
<jsp:include page ="navication_header.jsp"></jsp:include> 
   <div class="wrap_outside_content">
    <div class="need_background_gray">
        <div class="notify_free">
            <div class="icon_free_ship">
                <img src="/Shopee_clone/img/icon/icon-free-ship.png" alt="freeship">
            </div>
            <div class="notify_text">
                <p>Nhấn vào mục Mã giảm giá ở cuối trang để hưởng miễn phí vận chuyển bạn nhé!</p>
            </div>
            
        </div>

        <div class="grid_columns only_text">
            <div class="checkbox_btn">
                <form action="">
                    <input class="select_alls" type="checkbox" name="select_all">
                </form>
            </div>
            <div class="prd_name">
                <div class="prd_name_content">
                    <h3 class="prd_text">Sản Phẩm</h3>
                </div>
            </div>
            <div class="prd_price">
                    <h3 class="prd_text">Đơn Giá</h3>
            </div>
            <div class="prd_amount">
                    <h3 class="prd_text">Số Lượng</h3>
            </div>
            <div class="pr_total_price">
                    <h3 class="prd_text">Số Tiền</h3>
            </div>
            <div class="pr_actions">
                <h3 class="prd_text">Thao Tác</h3>
            </div>
        </div>
    
    <c:forEach items="${listPrInCart}" var="pr">    
        <div class="product_in_cart">
            <div class="grid_columns only_text only_bottom_border">
                <div class="checkbox_btn">
                        <form action="">
                            <input class="select_all_in" type="checkbox" name="select_all_in_this_shop"> 
                        </form>
                </div>
                    
                <div class="shop_name width_longer">
                    <div class="shop">
                        <div class="icon">
                            <i class="fas fa-store"></i>
                        </div> 
                        <h3 class="prd_text">${pr.seller}</h3>
                    </div>
                </div>
            </div>
            <div class="wrap_outside_box_contain_product">
            <div class="grid_columns">
                    <div class="checkbox_btn">
                        <form action="">
                            <input class="select_alls" type="checkbox" name="select_all">
                        </form>
                    </div>
                    <div class="name_and_img">
                            <div class="prds">
                                <div class="imagess">
                                    <img class="thumbnai" src="${pr.image}">
                                </div> 
                                <div class="wrap_text">
                                    <h3 class="prd_text">${pr.productName}</h3>
                                    <input type="hidden" name="product_id" value="${pr.productID}">
                                </div>
                                
                            </div> 
                    </div>

                    <div class="price_of_product">
                        <h3 id="price_of_a_product" class="prd_text">${pr.price}</h3>
                    </div>
                    <div class="amount_of_product">
                            <div class="form_select">
                                <button onclick="reduce_amount_product()" id="decr" class="selects down" name="decrease">-</button>
                                <input class="select_number" data-id-type="${pr.productID}" type="text" name="select_the_number_product" value="${pr.numbers}">
                                <button onclick="increament_amount_product()" id="incr" class="selects up" name="increase">+</button>
                            </div>
                    </div>

                    <div class="total_price_of_product">
                        <h3 id="total_prices" class="prd_text">${pr.total_price}</h3>
                    </div>

                    <div class="action_with_product">
                    <form action="/Shopee_clone/delete_product_cart" method="GET"> 
                        <input type="submit" name="delete_product" value="Xóa"/>
                    </form> 
                    </div>
            </div>
            </div>

            <div class="notify_free">
                <div class="icon_free_ship">
                    <i class="fas fa-truck-moving"></i>
                </div>
                <div class="notify_text">
                    <p>Miễn Phí Vận Chuyển cho đơn hàng từ ₫50.000 (giảm tối đa ₫15.000);
                        Miễn Phí Vận Chuyển cho đơn hàng từ ₫300.000 (giảm tối đa ₫70.000)
                    </p>
                </div>   
            </div>
        </div> 
    </c:forEach>    
        
    </div>
   </div> 
    
<jsp:include page ="footerLoginPage.jsp"></jsp:include>