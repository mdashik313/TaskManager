<table border="1">
    <tr>
        <th>Name</th>
        <th>Email</th>
    </tr>
     <g:each var="user" in="${users}">
            <tr>
                <td>${user.name}</td>
                <td>${user.email}</td>
                
            </tr>
    </g:each>

</table>

<g:link action="create"> Add User </g:link>
