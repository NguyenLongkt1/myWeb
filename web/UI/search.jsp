
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>
   <div class="wrap_main_content">
        <div class="wrap_part_all_product">
            <div class="wrap_filter_and_all_category">
               <div class="__filter">
                   <div class="outside"> 
                       <div class="filter_text">
                           <div class="wrap_icon">
                               <i class="fas fa-filter"></i>
                           </div>
                           <div class="wrap_text">Bộ Lọc Tìm Kiếm</div>
                       </div>
                   </div>
                   <div class="filter_with_address">
                       <div class="filer_type_name">Nơi bán</div>
                       <div class="sellect_items">
                           <div class="chooses">
                               <input class="my_choose" type="checkbox" name="CanTho">
                               <label>Cần Thơ</label>
                           </div>
                           <div class="chooses">
                               <input class="my_choose" type="checkbox" name="DaNang">
                               <label>Đà Nẵng</label>
                           </div>
                           <div class="chooses">
                               <input class="my_choose" type="checkbox" name="HaNoi">
                               <label>Hà Nội</label>
                           </div> 
                           <div class="chooses">
                               <input class="my_choose" type="checkbox" name="HaTinh">
                               <label>Hà Tĩnh</label>
                           </div>
                           <div class="chooses">
                               <input class="my_choose" type="checkbox" name="HaiDuong">
                               <label>Hải Dương</label>
                           </div>
                           <div class="chooses">
                               <input class="my_choose" type="checkbox" name="HaiPhong">
                               <label>Hải Phòng</label>
                           </div>
                           
                       </div>
                       <hr>
                   </div>

                   <div class="filter_with_price_ranges">
                       <div class="filter_type_name">Khoảng Giá</div>
                       <div class="input_price_area">
                           <input class="input_price" type="text" name="price_from" placeholder="TỪ">
                           - 
                           <input class="input_price" type="text" name="price_to" placeholder="ĐẾN">
                       </div>
                       <div class="btn_apply">
                           <input type="button" name="apply" value="ÁP DỤNG">
                       </div>
                       <hr>
                   </div>
               </div>

            </div>

            <div class="wrap_list_product">
                <div class="result_search">
                    <div class="s_icon">
                        <i class="fas fa-lightbulb"></i>
                    </div>
                    
                    <div class="text_search">
                        Kết quả tìm kiếm cho từ khóa '<span style="color: #ee4d2d"><%=request.getAttribute("text")%></span>'
                    </div>
                </div>
                <div class="wrap_type_sort">
                    <div class="wrap_around">
                        <div class="sort">
                           <div class="text_name">Sắp xếp theo </div>

                           <div class="select_sort">
                               <input class="sel_btn" type="button" name="popular" value="Phổ biến">
                           </div>

                           <div class="select_sort">
                               <input class="sel_btn" type="button" name="latest" value="Mới nhất">
                           </div>

                           <div class="select_sort">
                               <input class="sel_btn" type="button" name="sellest" value="Bán chạy">
                           </div>

                           <div class="select_sort box_ip">
                               <input class="ip_price" type="text" name="with_price" value="Giá">
                               <i class="fas fa-angle-down"></i>
                           </div>

                        </div>

                        <div class="page">
                           <div class="number">
                               1/100
                           </div>
                           <div class="next_pre_page">
                               <div class="previous_btn">
                                   <input class="next_pre_btn" type="button" name="previousbtn">
                                   <i class="fas fa-chevron-left"></i>
                               </div>
                               <div class="next_btn">
                                   <input class="next_pre_btn" type="button" name="nextbtn">
                                   <i class="fas fa-chevron-right"></i>
                               </div>
                           </div>
                        </div>
                    </div>
                </div>

                <div class="_list_product">
                    <c:forEach items="${listSearch}" var="list">  
                       <div class="product">
                           <div class="pr_img">
                             <img src="${list.image}" alt="" class="pr_pic">
                           </div>

                           <div class="pr_name_text">
                              <h4 class="text_name">
                                 <a href="/Shopee_clone/detailProduct?pid=${list.ID}">${list.product_name}</a>
                              </h4>
                           </div>

                           <div class="pr_price">
                              <h4 class="price">
                                  ${list.formatNumber(list.price)}
                              </h4>
                              <h5 class="selled">
                                  Đã bán 2k2
                              </h5>
                           </div>
                       </div>
                    </c:forEach>   
                </div>
            </div>
        </div>
      </div>
   </div>
<jsp:include page="footerLoginPage.jsp"></jsp:include>