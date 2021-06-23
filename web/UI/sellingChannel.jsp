
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="header.jsp"></jsp:include>
    
<div class="wrap_main_content">
          <div class="wrap_around_inside_area">
            <form action="/Shopee_clone/addProductToDB" method="POST"> 
                <div class="notify_status">
                    <h3>${sucessed}</h3>
                </div>
            <div class="input_about_product">
                <div class="content">
                    <h2 id="first">Thêm 1 sản phẩm mới</h2>
                    <span>Vui lòng chọn ngành hàng phù hợp cho sản phẩm của bạn</span>                  
                </div>
                <hr> 
                <div class="form">
                    <div class="product_name pr">
                        <label>Tên sản phẩm: </label>
                        <div class="wrap_ip_area">
                            <input type="text" name="input_product_name" placeholder="Nhập vào">
                        </div>    
                    </div>
                    
                    <div class="description pr descr">
                        <label>Mô tả sản phẩm: </label>
                        <div class="wrap_ip_area">
                            <textarea name="description_about_product" placeholder="Mô tả sản phẩm"></textarea>
                        </div>

                    </div>

                    <div class="category_of_product pr">
                        <label>Danh mục: </label>
                        <select name="category_of_product">
                            <option>Thời Trang Nam</option>
                            <option>Điện thoại và phụ kiện</option>
                            <option>Thiết bị điện tử</option>
                            <option>Máy tính & Laptop</option>
                            <option>Đồng hồ</option>
                            <option>Máy Ảnh</option>
                            <option>Giày dép</option>
                            <option>Ô tô - Xe máy - Xe đạp</option>
                            <option>Thời trang nữ</option>
                            <option>Sách</option>
                        </select>
                    </div>
                    <br>
                </div> 
            </div>

            <div class="input_about_product">
                <div class="content">
                    <h2>Thông tin bán hàng</h2>
                </div>
                <hr>
                <div class="form">
                    <div class="product_price pr">
                        <label>Giá: </label>
                        <div class="wrap_ip_area">
                            <input type="text" name="input_product_price" placeholder="Nhập vào">
                        </div>
                    </div>
                    
                    <div class="warehouse pr">
                        <label>Kho hàng: </label>
                        <div class="wrap_ip_area">
                            <input type="text" name="warehouse_product" placeholder="Số lượng">
                        </div>
                    </div>
                    <br>
                </div>  
            </div>

            <div class="input_about_product">
                <div class="content">
                    <h2>Quản lý hình ảnh</h2>
                </div>
                <hr>
                <div class="form">
                    <div class="product_price pr">
                        <label>Hình ảnh sản phẩm: </label>
                        <div class="wrap_ip_area">
                            <input type="text" name="link_to_product_image" placeholder="Đường dẫn đến ảnh">
                        </div>
                    </div>
                    <br>
                </div>  
            </div>

            <div class="sellProduct" ${sucessed !="" ?"style=\"display:block\"":"style=\"display:none\""}>
                <input type="submit" name="finished" value="Thêm sản phẩm">
            </div>
          </form>
          </div>
      </div>

  </div>
<jsp:include page="footerLoginPage.jsp"></jsp:include>