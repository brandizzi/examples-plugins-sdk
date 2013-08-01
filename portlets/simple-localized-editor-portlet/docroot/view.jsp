<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:renderURL var="listTranslationsURL" />

<form action="<%= listTranslationsURL %>" method="post">
	<liferay-ui:input-localized name="localizedEditor" xml="" type="editor" />
	<input type="submit" value="Submit post">
</form>