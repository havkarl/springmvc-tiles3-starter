<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="well sidebar-nav">
	<ul class="nav nav-list">
		<li class="nav-header">Sections</li>
		<c:forEach var="s" items="${sections}">
			<!-- todo: this is not selecting the active class! -->
			<li> <a href="/measure/findAll">${s.header}</a> </li>
		</c:forEach>
	</ul>
</div>