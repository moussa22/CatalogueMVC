<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catalogue</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<body>

<div id="formProduit">

<f:form modelAttribute="produit" method="post" action="saveProduit"> 
<table>

<tr>
<td>Reference</td>
<td><f:input path="reference"/> </td>
<td><f:errors path="reference" cssClass="errors"/> </td>
</tr>

<tr>
<td>Designation</td>
<td><f:input path="designation"/> </td>
<td><f:errors path="designation" cssClass="errors"/> </td>
</tr>
<tr>
<td>Prix</td>
<td><f:input path="prix"/> </td>
<td><f:errors path="prix" cssClass="errors"/> </td>
</tr>
<tr>
<td>Quantite</td>
<td><f:input path="quantite"/> </td>
<td><f:errors path="quantite" cssClass="errors"/> </td>
</tr>
  <tr><td> <input type="submit" value="Save"></td></tr>
</table>

</f:form>

</div>

<div id="Lisproduit">

<table class="table1">

  <tr>
  
    <th>REF</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th>
  </tr>
     <c:forEach items="${produits}" var="p">
     
       <tr>
         
         <td>${p.reference}</td>
          <td>${p.designation}</td>
          <td>${p.prix}</td>
          <td>${p.quantite}</td>
       
        </tr>
     
      </c:forEach>
</table>

</div>

</body>
</html>