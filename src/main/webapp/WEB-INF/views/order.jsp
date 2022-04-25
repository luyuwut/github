<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" isErrorPage="false" %>

<html>
<head>
    <title>商品列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>商品列表 —— 显示所有商品</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <%--<a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增</a>--%>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>商品编号</th>
                    <th>商品订单</th>
                    <th>商品名称</th>
                    <th>商品类型</th>
                    <th>用户出生日期</th>
                    <th>用户电话</th>
                    <th>用户地址</th>
                    <th>用户编码</th>
                    <th>用户姓名</th>
                    <th>用户密码</th>
                    <th>用户性别</th>
                    <th>用户出生日期</th>
                    <th>用户电话</th>
                    <th>用户地址</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="bill" items="${list}">
                    <tr>
                        <th>${bill.id}</th>
                        <th>${bill.billCode}</th>
                        <th>${bill.productName}</th>
                        <th>${bill.productDesc}</th>
                        <th>${bill.productUnit}</th>
                        <th>${bill.productCount}</th>
                        <th>${bill.totalPrice}</th>
                        <th>${bill.isPayment}</th>
                        <th>${bill.createdBy}</th>
                        <th>${bill.creationDate}</th>
                        <th>${bill.modifyBy}</th>
                        <th>${bill.modifyDate}</th>
                        <th>${bill.providerId}</th>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
    <div>
        <a>上一页</a>  <a>下一页</a>
    </div>
</div>