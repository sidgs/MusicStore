<%--
  Created by IntelliJ IDEA.
  User: Vytlasai
  Date: 3/9/2017
  Time: 12:28 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/views/templates/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Admin Page</h1>

            <p class="lead">This is a administrator page</p>
        </div>

        <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            Welcome: ${pageContext.request.userPrincipal.name} | <a href="<c:url
                value="/j_spring_security_logout" />">Logout</a>
        </h2>
        </c:if>

        <h3>
            <a href="<c:url value="/admin/productInventory"/>">Product Inventory </a>
        </h3>

        <p> Here you can view, check and notify the product inventory </p>

<%@include file="/WEB-INF/views/templates/footer.jsp"%>