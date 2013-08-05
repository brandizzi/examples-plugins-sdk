<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.LocalizationUtil"%>

<%@page import="java.util.Locale"%>
<%@page import="java.util.Map"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects/>

<ul>
<%
Map<Locale, String> translations = LocalizationUtil.getLocalizationMap(
    renderRequest, "localizedEditor");

for (Locale locale : translations.keySet()) {
    String translation = translations.get(locale);

        if (Validator.isNotNull(translation)) {
        %>
            <li>
                    <%= locale.getDisplayLanguage() %>:
                    <div>
                        <%= translation %>
                    </div>
            </li>
        <%
        }
}
%>
</ul>

<portlet:renderURL var="listTranslationsURL" />

<form action="<%= listTranslationsURL %>" method="post">
	<liferay-ui:input-localized name="localizedEditor" xml="" type="editor" />
	<input type="submit" value="Submit post">
</form>