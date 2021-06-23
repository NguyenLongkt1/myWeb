  var count=0;
function displayOrHidden(){
    count++;
    console.log(count);
    if(count % 2 !== 0){
      document.getElementsByClassName("hid")[0].style.display="none";
      document.getElementsByClassName("show")[0].style.display="block";
      document.getElementsByClassName("pass")[0].type="text";
    }
    else{
      document.getElementsByClassName("show")[0].style.display="none";
      document.getElementsByClassName("hid")[0].style.display="block";
      document.getElementsByClassName("pass")[0].type="password";
    }
}
function notify(){
    setTimeOut(function(){
        alert("Please check your email");
    },100);
}
function nextPage(){
    var pre_page = Number(document.getElementById("starts").innerText);
    var last_page = Number(document.getElementById("ends").innerText);
    if(pre_page> 0 && pre_page<last_page){
        var newNumber = pre_page +1;
        document.getElementById("starts").innerText = newNumber;
    }
}

function prePage(){
    var pre_page = Number(document.getElementById("starts").innerText);
    var last_page = Number(document.getElementById("ends").innerText);
    if(pre_page> 1){
        var newNumber = pre_page - 1;
        document.getElementById("starts").innerText = newNumber;
    }
}


