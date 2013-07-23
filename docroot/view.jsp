<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

How do you like your coffe?

<select id="<portlet:namespace/>coffePref" name="<portlet:namespace/>coffePref">
	<option value="black">Black</option>
	<option value="sweet">Sweet</option>
	<option value="milk">With milk</option>
</select>

<aui:script use="liferay-store">
A.one('#<portlet:namespace/>coffePref').on(
	'change',
	function(event) {
		var instance = this;

		Liferay.Store('<portlet:namespace/>coffe-preference', instance.val());
	}
);
</aui:script>