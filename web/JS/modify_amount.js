const list = document.querySelectorAll("input[data-id-type]");
function reduce_amount_product(id){
    var number=Number(document.getElementsByClassName("select_number")[0].value);
    var price = Number(document.getElementById("price_of_a_product").innerText);
    var tprice = Number(document.getElementById("total_prices").innerText);
    var newNumber=number;
    if(number > 0){
        newNumber =  number-1;
        document.getElementsByClassName("select_number")[0].value = newNumber;
        document.getElementById("total_prices").innerText = tprice - price;
    }
    if(number=0){
        document.getElementById("total_prices").innerText = tprice - price; 
    }
}

function increament_amount_product(){
    var number=Number(document.getElementsByClassName("select_number")[0].value);
    var price = Number(document.getElementById("price_of_a_product").innerText);
    var tprice = Number(document.getElementById("total_prices").innerText);
    var upNumber=number;
    if(number < 10){
        upNumber =  number+1;
        document.getElementsByClassName("select_number")[0].value = upNumber;
        var total = tprice + price;
        document.getElementById("total_prices").innerText = total;
    }
}
function delete_this_product(){
    var del = document.getElementByClassName("product_in_cart")[0].style.display="none";
    
}

function reduce(){
    var number = Number(document.getElementsByClassName("select_number")[0].value);
    var newNumber = number;
    if(number > 0){
        newNumber =  number-1;
        document.getElementsByClassName("select_number")[0].value = newNumber;
    }
}
function increase(){
    var number = Number(document.getElementsByClassName("select_number")[0].value);
    var newNumber = number;
    var numberPattern = /\d+/g;
    var str = document.getElementsByClassName("pr_quantity")[0].innerText;
    var quantity = Number(str.match(numberPattern));
    if(number < quantity){
        newNumber =  number+1;
        document.getElementsByClassName("select_number")[0].value = newNumber;
    }
}


