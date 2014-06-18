<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <meta charset="utf-8">
    <title><tiles:insertAttribute name="title"/></title>
	<tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="append-header" defaultValue=""/>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
	<tiles:insertAttribute name="navbar"/>
</div>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span3">
			<tiles:insertAttribute name="sidebar"/>
		</div>
		<div class="span9">
			<tiles:insertAttribute name="content"/>
		</div>
	</div>
</div>
<div clas="footer">
	<tiles:insertAttribute name="footer"/>
    <tiles:insertAttribute name="append-footer" defaultValue=""/>
</div>
</body>
</html>
