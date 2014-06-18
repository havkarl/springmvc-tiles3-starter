<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Le styles -->
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>"/>
<style>
	body {
		padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
	}
</style>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.css"/>"/>
<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/measures.css"/>"/>

<tiles:insertAttribute name="append-header" defaultValue=""/>