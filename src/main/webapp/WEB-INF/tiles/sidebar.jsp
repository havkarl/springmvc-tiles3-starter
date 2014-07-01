<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="well sidebar-nav">
	<ul class="nav nav-list">
		<li class="nav-header">Super Powers</li>
		<c:forEach var="s" items="${a_list_of_super_powers}">
			<li> <a href="/test/find-super-powers/${s}">${s}</a> </li>
		</c:forEach>
	</ul>
</div>