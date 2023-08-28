<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.studentmanagement.codsoft.Connectionprovided"%>
<% 
String rollnumber=request.getParameter("rollNo");
String s1=request.getParameter("s1");
String s2=request.getParameter("s2");
String s3=request.getParameter("s3");
String s4=request.getParameter("s4");
String s5=request.getParameter("s5");
String s6=request.getParameter("s6");
String s7=request.getParameter("s7");

try{
Connection con=Connectionprovided.getCon();
Statement st=con.createStatement();
st.executeUpdate("insert into result values('"+rollnumber+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
response.sendRedirect("adminHome.jsp");
}
catch( SQLException e){
	e.printStackTrace();
}
%>