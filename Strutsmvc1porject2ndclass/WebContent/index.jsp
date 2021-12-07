<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
    <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<logic:present name="s">
<bean:write name="s"/>
</logic:present>

<logic:present name="u">
<bean:write name="u"/>
</logic:present>


<html:form action="reg.do">
<table border="3" bgcolor="yellow">
<tr><td>Uid</td><td><html:text property="uid"/>   </td>    </tr>
<tr><td>Pass</td><td><html:password property="pass"/>   </td>    </tr>
<tr><td>Mobile</td><td><html:text property="mob"/>   </td>    </tr>
<tr><td>Addd</td><td><html:password property="add"/>   </td>    </tr>
<tr><td><html:submit property="method" value="save"></html:submit>   </td>


<td><a href="view.do?method=viewDetail">View</a></td>    </tr>

</table>
<table border="3" bgcolor="yellow">
<tr><td>UserID</td><td>Password</td><td>Mobile</td><td>Address</td></tr>
<logic:present name="lst">
<logic:iterate id="lst" name="lst"  type="max.login.RegDTO">
<tr>
<td><bean:write name="lst" property="uid" /></td>
<td><bean:write name="lst" property="pass" /></td>

<td><bean:write name="lst" property="mob" /></td>

<td><bean:write name="lst" property="add" /></td>

</tr>


</logic:iterate>

</logic:present>
</table>





</html:form>



</body>
</html>