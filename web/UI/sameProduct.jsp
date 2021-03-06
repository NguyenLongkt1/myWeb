<%-- 
    Document   : sameProduct
    Created on : Apr 12, 2021, 10:40:38 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>
   <div class="wrap_main_content">
         <div class="shopee_mall">
             <div class="shopee_mall_title">
                 <h2>SHOPEE MALL</h2>
             </div>
             <div class="logos_up">
                 <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/7a79c07b0eb23b3e5ea651d249ed518a"></a></div>
                 <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/5620022f51909627758ddc0a3f01fe32"></a></div>
                 <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/7fbef06de8ae485c147677fc3cd8e59b"></a></div>
                 <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/412cdfd3b18c8e64f17d898e6fc45bfc"></a></div>
                 <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/ac92694a2b3ded8e72882d2e1f1e64b1"></a></div>
                 <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/48cf97be3168aa20b816bb62eac51893"></a></div>
             </div>
             <div class="logos_down">
                <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/fe48c2da397466662d746e3244858420"></a></div>
                <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/50c5ac43751ebd1b56999f3f97305805"></a></div>
                <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/f01dd34ffb9407d60d2f2738a3657b33"></a></div>
                <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/8198c8e29b6e6056451ade61d9b5c00c"></a></div>
                <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/53ad7e065590a8206d91db4863dfe6cf"></a></div>
                <div class="item_logo"><a href=""><img src="https://cf.shopee.vn/file/a324c68626b7f5800aff56a9b72d5cab"></a></div>
             </div>
         </div>

         <div class="wrap_part_all_product">
             <div class="wrap_filter_and_all_category">
                <div class="__category">  
                   <div class="outside"> 
                        <div class="category_text">
                            <div class="wrap_icon">
                                <i class="fas fa-list-ul"></i>
                            </div>
                            <div class="wrap_text">T???t C??? Danh M???c</div>
                        </div>
                        <hr>
                   </div>

                   <div class="tab_product_category_clicked">
                        <div class="category_text cat_clik">
                            <div class="wrap_icon cat">
                                <i class="fas fa-caret-right"></i>
                            </div>
                            <div class="wrap_text_name">??i???n Tho???i & Ph??? Ki???n</div>
                        </div>

                        <div class="list_pr">
                            <ul class="list_product_of_this_category">
                                <li class="product_of_this_category">
                                    <a href="">??i???n tho???i</a>
                                </li>
                                <li class="product_of_this_category">
                                    <a href="">M??y t??nh b???ng</a>
                                </li>
                                <li class="product_of_this_category">
                                    <a href="">V???,Bao & ???p l??ng</a>
                                </li>
                                <li class="product_of_this_category">
                                    <a href="">Mi???ng d??n m??n h??nh</a>
                                </li>
                                <li class="product_of_this_category">
                                    <a href="">Pin & S???c d??? ph??ng</a>
                                </li>
                                <li class="product_of_this_category">
                                    <a href="">Sim</a>
                                </li>
                                <li class="product_of_this_category">
                                    <a href="">Gi?? ????? & B??? s???c</a>
                                </li>
                                <li class="product_of_this_category">
                                    <a href="">G???y ch???p h??nh</a>
                                </li>
                            </ul>
                        </div>
                   </div>

                </div>

                <div class="__filter">
                    <div class="outside"> 
                        <div class="filter_text">
                            <div class="wrap_icon">
                                <i class="fas fa-filter"></i>
                            </div>
                            <div class="wrap_text">B??? L???c T??m Ki???m</div>
                        </div>
                    </div>
                    <div class="filter_with_address">
                        <div class="filer_type_name">N??i b??n</div>
                        <div class="sellect_items">
                            <div class="chooses">
                                <input class="my_choose" type="checkbox" name="CanTho">
                                <label>C???n Th??</label>
                            </div>
                            <div class="chooses">
                                <input class="my_choose" type="checkbox" name="DaNang">
                                <label>???? N???ng</label>
                            </div>
                            <div class="chooses">
                                <input class="my_choose" type="checkbox" name="HaNoi">
                                <label>H?? N???i</label>
                            </div> 
                            <div class="chooses">
                                <input class="my_choose" type="checkbox" name="HaTinh">
                                <label>H?? T??nh</label>
                            </div>
                            <div class="chooses">
                                <input class="my_choose" type="checkbox" name="HaiDuong">
                                <label>H???i D????ng</label>
                            </div>
                            <div class="chooses">
                                <input class="my_choose" type="checkbox" name="HaiPhong">
                                <label>H???i Ph??ng</label>
                            </div>
                            
                        </div>
                        <hr>
                    </div>

                    <div class="filter_with_price_ranges">
                        <div class="filter_type_name">Kho???ng Gi??</div>
                        <div class="input_price_area">
                            <input class="input_price" type="text" name="price_from" placeholder="T???">
                            - 
                            <input class="input_price" type="text" name="price_to" placeholder="?????N">
                        </div>
                        <div class="btn_apply">
                            <input type="button" name="apply" value="??P D???NG">
                        </div>
                        <hr>
                    </div>
                </div>

             </div>

             <div class="wrap_list_product">
                 <div class="wrap_type_sort">
                     <div class="wrap_around">
                         <div class="sort">
                            <div class="text_name">S???p x???p theo </div>

                            <div class="select_sort">
                                <input class="sel_btn" type="button" name="popular" value="Ph??? bi???n">
                            </div>

                            <div class="select_sort">
                                <input class="sel_btn" type="button" name="latest" value="M???i nh???t">
                            </div>

                            <div class="select_sort">
                                <input class="sel_btn" type="button" name="sellest" value="B??n ch???y">
                            </div>

                            <div class="select_sort box_ip">
                                <input class="ip_price" type="text" name="with_price" value="Gi??">
                                <i class="fas fa-angle-down"></i>
                            </div>

                         </div>

                         <div class="page">
                            <div class="number">
                                <span id="starts" name="fisrt_page" style="color: #000">1</span>
                                <span style="color: #000">/</span>
                                <span id="ends" name="last_page" style="color: #000">${endPage}</span>
                            </div>
                            <div class="next_pre_page">
                                <div class="previous_btn" onclick="prePage()">
                                    <input class="next_pre_btn" type="button" name="previousbtn">
                                    <i class="fas fa-chevron-left"></i>
                                </div>
                                <div class="next_btn" onclick="nextPage()">
                                    <input class="next_pre_btn" type="button" name="nextbtn">
                                    <i class="fas fa-chevron-right"></i>
                                </div>
                            </div>
                         </div>
                     </div>
                 </div>
                 
                 <div class="_list_product">
                    <c:forEach items="${list}" var="prd">
                          <div class="product">
                              <div class="pr_img">
                                <img src="${prd.image}" alt="${prd.product_name}" class="pr_pic">
                              </div>

                              <div class="pr_name_text">
                                 <h4 class="text_name">
                                    <a href="/Shopee_clone/detailProduct?pid=${prd.ID}">${prd.product_name}</a>
                                 </h4>
                              </div>

                              <div class="pr_price">
                                 <h4 class="price">
                                     ${prd.formatNumber(prd.price)}
                                 </h4>
                                 <h5 class="selled">
                                     ???? b??n 2k2
                                 </h5>
                              </div>
                          </div>   
                    </c:forEach> 
                 </div>
                 
             </div>
         </div>
      </div>
    </div>
<jsp:include page="footer.jsp"></jsp:include>
