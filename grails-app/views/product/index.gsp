<html>

<body>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Code</th>
        <th>Price</th>
         <th>Action</th>
        
    </tr>
    <g:each var="product" in="${products}">
            <tr>
                <td>${product.name}</td>
                <td>${product.code}</td>
                <td>${product.price}</td>
                <td><g:link  action="delete" id="${product.id}">Delete</g:link>
</td>
                
                
            </tr>
    </g:each>
</table>

<g:link action="create"> Add Product </g:link>

</body>
</html>