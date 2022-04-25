<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>商品</title>
 <script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"/>
</head>
<body>
<script type="text/javascript">

    function x() {
       $.ajax({
        url:"${pageContext.request.contextPath}/ajax/a1",
        data:{"name":${"textname".val()},
            success:function (data,status) {
            console.log(data);
            console.log(status)
            }
                
            }
       });
$("textname") .val();

    }

</script>
<h3>
   用户名
    <input type="text" id="textname" onblur="">
</h3>
</body>
</html>