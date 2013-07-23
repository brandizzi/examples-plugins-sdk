<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

How do you like your coffee?

<select id="<portlet:namespace/>coffeePref" name="<portlet:namespace/>coffeePref">
	<option value="black">Black</option>
	<option value="sweet">Sweet</option>
	<option value="milk">With milk</option>
</select>

<aui:script use="liferay-store">
A.one('#<portlet:namespace/>coffeePref').on(
	'change',
	function(event) {
		var instance = this;

		Liferay.Store('<portlet:namespace/>coffee-preference', instance.val());
	}
);
</aui:script>