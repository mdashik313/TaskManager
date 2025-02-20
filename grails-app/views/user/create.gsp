<html>

<body>

<h2> Add new user </h2>

<g:form controller="user" action="save" method="POST"  >
    <label> Name: </label>
    <g:textField name="name" required="true" /> <br>
    <label> Email: </label>
    <g:textField name="email" required="true" /> <br>
    <g:submitButton name="add user" />
 </g:form>

</body>
</html>