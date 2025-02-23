<html>

<body>

<h2> Add new product </h2>

<g:form controller="product" action="save" method="POST"  >
    <label> Name: </label>
    <g:textField name="name" required="true" /> <br>
    <label> Code: </label>
    <g:textField name="code" required="true" /> <br>
    <label> Price: </label>
    <g:textField name="price" required="true" /> <br>
    <g:submitButton name="add product" />
    
 </g:form>

</body>
</html>