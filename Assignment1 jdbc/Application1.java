package jdbc1pro;

import java.sql.*;

public class Application1 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shila","root","12345");
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery("show tables");
		while(res.next())
		System.out.println(res.getString(1));
		
		String query = "select Stu_Id,Stu_name,Stu from Students";
        ResultSet rs=st.executeQuery(query);
		ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
        int numberOfColumn = rsmd.getColumnCount();
        System.out.println(" Number Of Columns: " + numberOfColumn);
        
        System.out.println("All Details Of Columns:");
        for (int i = 1; i <= numberOfColumn; i++) 
        {
           String columnName = rsmd.getColumnName(i);
           String dataTypeOfColumn = rsmd.getColumnTypeName(i);
           System.out.println(columnName + " has data type " + dataTypeOfColumn);
        }

	}
}
