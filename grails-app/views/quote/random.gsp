<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 4/1/18
  Time: 9:14 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Random Quote</title>
    <g:javascript library="jquery" />
</head>

<body>

<ul id="menu">
	<li>
		<g:remoteLink action="ajaxRandom" update="quote">
			Next Quote
		</g:remoteLink>
	</li>
	<li>
		<g:link action="list">
			Admin
		</g:link>
	</li>
</ul>

<div id="quote">
    %{--<q>${content}</q>--}%
    %{--<p>${author}</p>--}%
    <q>${quote.content}</q>
    <p>${quote.author}</p>
</div>



</body>
</html>