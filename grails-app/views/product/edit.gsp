<!DOCTYPE html>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
    <h2>Edit Product</h2>

    <g:form controller="product" action="update" method="POST">
        <g:hiddenField name="id" value="${product.id}"/>

        <label>Name:</label>
        <g:textField name="name" value="${product.name}" required="true"/><br>

        <label>Code:</label>
        <g:textField name="code" value="${product.code}"/><br>

        <label>Price:</label>
        <g:field type="number" name="price" value="${product.price}"/><br>

        <g:submitButton name="Update Product"/>
    </g:form>

    <br>
    <g:link action="index">Back to Product List</g:link>
</body>
</html>