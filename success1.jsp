<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.studentmanagement.codsoft.Connectionprovided"%>
<% 
String course=request.getParameter("course");
String branch=request.getParameter("branch");
String rollnumber=request.getParameter("rollNo");
String name=request.getParameter("name");
String fathername=request.getParameter("fatherName");
String gender=request.getParameter("gender");

try{
Connection con=Connectionprovided.getCon();
Statement st=con.createStatement();
st.executeUpdate("insert into management values('" + course + "','" + branch + "','" + rollnumber + "','" + name + "','" + fathername + "','" + gender + "')");

response.sendRedirect("adminHome.jsp");
}
catch( SQLException e){
	e.printStackTrace();
}
%>