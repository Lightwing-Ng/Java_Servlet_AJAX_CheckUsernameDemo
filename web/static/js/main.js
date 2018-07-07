function ajaxFunction() {
    var xmlHttp;
    try { // Firefox, Opera 8.0+, Safari
        xmlHttp = new XMLHttpRequest();
    }
    catch (e) {
        try {// Internet Explorer
            xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
        }
        catch (e) {
            try {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            catch (e) {
            }
        }
    }

    return xmlHttp;
}

function checkUserName() {
    // 获取输入框的值 document 整个网页
    var name = document.getElementById("name").value;
    // 1.创建对象
    var request = ajaxFunction();

    // 2.发送请求
    request.open("POST", "/CheckUserNameServlet", true);

    // 注册状态改变监听，获取服务器传送过来的数据
    request.onreadystatechange = function () {
        if (request.readyState == 4 && request.status == 200) {
            //alert(request.responseText);
            var data = request.responseText;
            if (data == 1) {
                document.getElementById("span01").innerHTML =
                    "<img src='static/img/error.svg' style='width: 15px'>&nbsp;" +
                    "<span class='UserNameHint Error'>" +
                    "&nbsp;" +
                    "This username has ever exist!" +
                    "</span>";
            } else {
                document.getElementById("span01").innerHTML =
                    "<img src='static/img/success.svg' style='width: 15px'>&nbsp;" +
                    "<span class='UserNameHint Success'>" +
                    "Available!" +
                    "</span>";
            }
        }
    };

    request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    request.send("name: " + name);
}