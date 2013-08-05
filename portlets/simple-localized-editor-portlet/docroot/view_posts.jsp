<%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@page import="com.liferay.examples.localizededitor.PostPortlet"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.search.QueryConfig"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryPos"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.examples.localizededitor.service.PostLocalServiceUtil"%>
<%@page import="com.liferay.examples.localizededitor.model.Post"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.LocalizationUtil"%>

<%@page import="java.util.Locale"%>
<%@page import="java.util.Map"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects/>

<ul>
<%
List<Post> posts = PostLocalServiceUtil.getPosts(0, QueryUtil.ALL_POS);

for (Post curPost : posts) {
%>
	<portlet:renderURL var="postURL">
		<portlet:param name="postId" value="<%= String.valueOf(curPost.getPostId()) %>"/>
	</portlet:renderURL>
    <li>
    	<a href="<%= postURL %>"><%= curPost.getTitle(LocaleUtil.getDefault()) %></a>
    </li>
<%
}
%>
</ul>

<%
long postId = ParamUtil.getLong(renderRequest, "postId");
Post post = null;
if (postId > 0) {
	post = PostLocalServiceUtil.getPost(postId);
}
%>

<portlet:actionURL name="savePost" var="savePostURL" />

<aui:form action="<%= savePostURL %>" method="post">
	<aui:fieldset>
		<aui:model-context model="<%= Post.class %>" bean="<%= post %>" />
	
		<aui:input name="postId" type="hidden" />

		<aui:input name="title" />
		<aui:input name="content" />
	
		<aui:button name="submit" type="submit" />
	</aui:fieldset>
</aui:form>