
          //                            STUDENT MANAGEMENT SYSTEM
//                                              (RESULT) 



package com.studentmanagement.codsoft;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionprovided {
public static Connection getCon()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root");
		return con;
	}
	catch(Exception e) {
		System.out.println(e);
		return null;
	}
}
}
