package com.google.gmail;

import java.sql.*;

public class InsertingRowsInToUserInforamtionTable 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		String query1="insert into dorababu1.usersinformation values('dorababu','adari','xyz@123',1234567897,'asdzxc')";
		String query2="insert into dorababu1.usersinformation values('manu','roy','xyz@123',0987654321,'abcde')";
		String query3="insert into dorababu1.usersinformation values('mani','kumar','xyz@123',567890432,'efghi')";
		String query4="insert into dorababu1.usersinformation values('chand','durga','xyz@123',789098765,'jklmno')";
		String query5="insert into dorababu1.usersinformation values('kiran','kimar','xyz@123',0987987654,'pqrst')";
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step 1 connection completed");
			Statement stmt=connection.createStatement();
			System.out.println("step 2 platform created");
			stmt.executeUpdate(query1);
			stmt.executeUpdate(query2);
			stmt.executeUpdate(query3);
			stmt.executeUpdate(query4);
			stmt.executeUpdate(query5);
			System.out.println("step 3 rows inserted");
			connection.close();
			System.out.println("step 4 coonection closed");
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
