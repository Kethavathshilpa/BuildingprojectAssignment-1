package jdbcApplication2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Students_School extends Student {
	Scanner sc = new Scanner(System.in);

	void students() {
		System.out.println("enter the how many students details you want inserted:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the ID of a students");
			Stu_ID = sc.nextInt();
			System.out.println("enter the emailaddress of a students:");
			EmailAddress = sc.next();
			System.out.println("enter the name of a students:");
			name = sc.next();
			System.out.println("enter the Age of a students");
			Age = sc.nextInt();
			System.out.println("enter the Gender male or female");
			Gender = sc.next();
			System.out.println("enter DOB of a students:");
			BOD = sc.next();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
				String query1= "insert into Students" + "(Stu_ID,EmailAddress,Name,Age,Gender,BOD)"
						+ "values(?,?,?,?,?,?)";
				PreparedStatement stmt1 = con1.prepareStatement(query1);
				stmt1.setInt(1, Stu_ID);
				stmt1.setString(2, EmailAddress);
				stmt1.setString(3, name);
				stmt1.setInt(4, Age);
				stmt1.setString(5, Gender);
				stmt1.setString(6, BOD);
				stmt1.executeUpdate();
				stmt1.executeUpdate();
				stmt1.executeUpdate();
				stmt1.executeUpdate();
				stmt1.executeUpdate();
				stmt1.executeUpdate();
				con1.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	void school() {
		System.out.println("enter the school details of each students:");
		System.out.println("enter how many School data you want to insert");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		System.out.println("enter ID of a students:");
		School_ID = sc.nextInt();
		System.out.println("enter the schoolname of a students:");
		SchoolName = sc.next();
		System.out.println("enter the Address of school:");
		Address = sc.next();
		System.out.println("enter the cityname of a School:");
		City = sc.next();
		System.out.println("enter the State name of a School:");
		State = sc.next();
		System.out.println("enter the Country name of a School:");
		Country = sc.next();
		System.out.println("enter the phonenumber of a Students:");
		PhoneNumber = sc.nextInt();
		System.out.println("enter the number of student_counts");
		Student_count = sc.nextInt();
		try {
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
			String query2 = "insert into School"
					+ "(ID, SchoolName, Address, City,State, Country, PhoneNumber,Student_count)"
					+ "values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement stmt2 = con2.prepareStatement(query2);
			stmt2.setInt(1, ID);
			stmt2.setString(2, SchoolName);
			stmt2.setString(3, Address);
			stmt2.setString(4, City);
			stmt2.setString(5, State);
			stmt2.setString(6, Country);
			stmt2.setInt(7, PhoneNumber);
			stmt2.setInt(8, Student_count);
			stmt2.executeUpdate();
			stmt2.executeUpdate();
			stmt2.executeUpdate();
			stmt2.executeUpdate();
			stmt2.executeUpdate();
			stmt2.executeUpdate();
			stmt2.executeUpdate();
			stmt2.executeUpdate();
			con2.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	  }
	}

    void Student_school() {
		    System.out.println("enter the how many students details you want to insert");
		    n=sc.nextInt();
		    for (int j = 1; j <= n; j++)
		    {
			System.out.println("enter the School_Student ID");
			int S_id = sc.nextInt();
			System.out.println("enter the student id");
			Stu_ID = sc.nextInt();
			System.out.println("assign School");
			School_ID = sc.nextInt();
			try {
				Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
				String query3 = "insert into Student_School" + "(S_id, Stu_ID,School_ID)" + "values(?,?,?)";
				PreparedStatement stmt3 = con3.prepareStatement(query3);
				stmt3.setInt(1, S_id);
				stmt3.setInt(2, Stu_ID);
				stmt3.setInt(3, School_ID);
				stmt3.executeUpdate();
				stmt3.executeUpdate();
				stmt3.executeUpdate();
				con3.close();
			} 
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}

	// update methods
void updatestudent()
	{
	   try 
	   {
		    String query4 = "UPDATE Students set name='shivakumar' where Stu_ID=6" ;
	        
		    Connection con4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
		   PreparedStatement stmt4 = con4.prepareStatement(query4);
		   stmt4.execute();
		   con4.close();}
	   
	     catch(Exception e) { System.out.println(e); }
	  }
void updateschool()
{
	 try 
	   {
		    String query5 = "UPDATE School set SchoolName='Crystal high school' where School_ID=4";
		    Connection con5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
		    PreparedStatement stmt5 = con5.prepareStatement(query5);
		    stmt5.execute(query5);
	   }
	   catch(Exception e){ System.out.println(e); }
	}

	// delete
void deleteschool() {
		try {
			Connection con8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
			String query8 = "delete from School where Address='kadthal' ";
			Statement stmt8 = con8.createStatement();
			stmt8.executeUpdate(query8); con8.close(); }
		catch (Exception e) {  System.out.println(e); }
	}
void deletestudent() {
		try {
			Connection con9 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
			String query9= "delete from Students where name='shi' ";
			Statement stmt9 = con9.createStatement();
			stmt9.executeUpdate(query9); 
			System.out.println("deleted successfully"); con9.close();} 
		catch (Exception e) { System.out.println(e); }
	 }
 void search() {
		System.out.println("enter the emailaddress to search");
		email = sc.next();
		try {
			Connection con10 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
			Statement stmt10 = con10.createStatement();
			ResultSet rs = stmt10.executeQuery("select * from Students Where EmailAddress='" + email + "'");

			if(rs.next()) {
				System.out.println("Present");
				Statement stm10 = con10.createStatement();
			     System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5) + " " + rs.getString(6));
			     ResultSet rs1 = stmt10.executeQuery("select * from Students inner join School ON Students.Stu_ID = School.School_ID");

			while (rs1.next()) 
			{
				System.out.println(rs1.getString("SchoolName") + " " + rs1.getString("Address") + " "
				+ rs1.getString("City") + " " + rs1.getString("State") + " " + rs1.getString("Country")
				+ " " + rs1.getInt("PhoneNumber") + " " + rs1.getInt(7) + " " + rs1.getInt(8));  }
            }
			else {  System.out.println("not present"); } }

       catch (Exception e) {  System.out.println(e); }
	}

	void accept()
  {
	  System.out.println("enter the year:");
	  year=sc.next();
	  try
	  {
	    Connection con11=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","12345");
	    Statement stmt11=con11.createStatement();
	    ResultSet rs2=stmt11.executeQuery("SELECT * from Students where BOD='"+year+" ' ");
	    while(rs2.next())
	    	System.out.println("name:"+rs2.getString("name"));

	         }
	    catch(Exception e) {  System.out.println(e); }  
 }

 void city()
  {
	  System.out.println("enter the city:");
       c=sc.next();
	  try
	  {
	   Connection con12 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","12345");
	   String query12 = "SELECT * FROM School WHERE City = ?";        
	   PreparedStatement stmt12 = con12.prepareStatement(query12);
	   stmt12.setString(1, c);
	   ResultSet p=stmt12.executeQuery();
	   while(p.next())
		   System.out.println(p.getString("SchoolName")); }
	  catch(Exception e) {  System.out.println(e.getMessage()); }
  }
 void state()
 {
	 System.out.println("enter the state:");
	 sta=sc.next();
	 try
	 {
		 Connection con13=DriverManager.getConnection("Jdbc:mysql://localhost:3306/sonoo","root" ,"12345");
		 String query13="Select * from School where State=?";
		 PreparedStatement stmt13=con13.prepareStatement(query13);
		 stmt13.setString(1, sta);
		 ResultSet res=stmt13.executeQuery();
		 while(res.next())
			 System.out.println(res.getString("SchoolName")); }
	 catch(Exception e){ System.out.println(e); }
}
 void studentcount()
 {
	 System.out.println("enter the student count:");
	 count=sc.nextInt();
	 try
	 {
		 Connection con14=DriverManager.getConnection("Jdbc:mysql://localhost:3306/sonoo","root" ,"12345");
		 String query14="Select * from School where Student_Count=?";
		 PreparedStatement stmt14=con14.prepareStatement(query14);
		 stmt14.setInt(1, count);
		 ResultSet res=stmt14.executeQuery("select * from school where Student_count>2 and Student_count<4");
		 while(res.next())
			 System.out.println(res.getString("SchoolName")); }
	 catch(Exception e){ System.out.println(e); } 
 }
 void association()
 {
	 System.out.println("enter the how many students details you want to associated :");
	 n=sc.nextInt();
	 for(i=1;i<=n;i++)
	 {
	 System.out.println("enter the Student ID");
     Stu_ID=sc.nextInt();
     System.out.println("enter School ID of a students:");
	 School_ID = sc.nextInt();
     System.out.println("enter the schoolname of a students:");
	 SchoolName = sc.next();
	 System.out.println("enter the Address of school:");
	 Address = sc.next();
	 System.out.println("enter the cityname of a School:");
	 City = sc.next();
	 System.out.println("enter the State name of a School:");
	 State = sc.next();
	 System.out.println("enter the Country name of a School:");
	 Country = sc.next();
	 System.out.println("enter the phonenumber of a Students:");
	 PhoneNumber = sc.nextInt();
	 	 try {
		Connection con6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
		String query6 = "insert into School"
					+ "(SchoolName, Address, City,State, Country, PhoneNumber,School_ID,Stu_ID)"
					+ "values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement stmt6 = con6.prepareStatement(query6);
			
			stmt6.setInt(1, ID);
			stmt6.setString(2, SchoolName);
			stmt6.setString(3, Address);
			stmt6.setString(4, City);
			stmt6.setString(5, State);
			stmt6.setString(6, Country);
			stmt6.setInt(7, Stu_ID);
			stmt6.setInt(8, PhoneNumber);
			stmt6.executeUpdate();
			stmt6.executeUpdate();
			stmt6.executeUpdate();
			stmt6.executeUpdate();
			stmt6.executeUpdate();
			stmt6.executeUpdate();
			stmt6.executeUpdate();
			stmt6.executeUpdate();}
	 	 catch (SQLException e) {  System.out.println(e);}
       }
	}
 void unassociation()
 {
	 String query7="Alter table associationtables drop column Stu_ID";
	 try
	 {
		 Connection con7=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
		 Statement stmt7 = con7.createStatement();
	     stmt7.executeUpdate(query7);
	     con7.close();}
	 catch(Exception e){ System.out.println(e); }
 }
 
 void deleteSchoolass()
 {
	 String query15="delete from associationtables where SchoolName='pragathi high School'";
	 try 
	 {
		 Connection con15=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
		 Statement stmt15 = con15.createStatement();
	     stmt15.executeUpdate(query15);
	     con15.close(); }
	 catch(Exception e){ System.out.println(e); }
 }
 void changeschool()
 {
	 System.out.println("enter the schoolName");
	 changedName=sc.next();
	 System.out.println("enter the school id");
	 School_ID=sc.nextInt();
	 try
	 {
		 Connection con16= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
		 String query16="UPDATE school set school.SchoolName= ? where school.School_ID=?";
		 PreparedStatement stmt16 = con16.prepareStatement(query16);
		 stmt16.setString(1, changedName);
		 stmt16.setInt(2, School_ID);
		 stmt16.executeUpdate();
         con16.close(); }
	 catch(Exception e){ System.out.println(e); }
  }
 void deleteuser()
 {
	 String query17="delete from Students where name='shirisha' ";
     String query18="delete from student_school where S_id=3";
     try 
	 {
		 Connection con17=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "12345");
		 Statement stmt17 = con17.createStatement();
	     stmt17.executeUpdate(query17);
	     Statement stmt18 = con17.createStatement();
	     stmt18.executeUpdate(query18);
	     con17.close(); }
	 catch(Exception e){ System.out.println(e); }
 }
 
}

