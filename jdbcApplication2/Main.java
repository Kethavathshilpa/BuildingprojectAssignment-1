package jdbcApplication2;

import java.sql.SQLException;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("insert data in a students tables enter 1 ");
		System.out.println("insert data in a School tables enter 2 ");
		System.out.println("Student and School using reference foreegin key to insert data enter 3 ");
		System.out.println(" To updatestudent enter 4");
		System.out.println("To updateSchool enter 5");
		System.out.println("Associate student to a school enter 6");
		System.out.println("Unassociate students to a school enter 7");
		System.out.println("delete school enter 8");
		System.out.println("delete Students enter 9");
		System.out.println("who are born in a specific year enter 10");
		System.out.println("search for Student enter 11");
		System.out.println("All schools under the specific city enter 12");
		System.out.println("All schools under the specific state enter 13");
		System.out.println("enter the range of a student count enter 14");
		System.out.println("Remove all students associated with School enter 15");
		System.out.println("Change a student school enter 16");
		System.out.println("When delete users delete an entry in the associated table as well enter 17.");
		Students_School sc=new Students_School();
	    System.out.println("enter the numbers of a method");
	    int s=input.nextInt();
	    switch(s)
	    {
	    case 1:
	    	 sc.students();
	    	 break;
	    case 2:
	    	
	    	sc.school();
	    	break;
	    case 3:
	    	
	    	sc.Student_school();
	    	break;
	    case 4:
	    	
	    	sc.updatestudent();
	    	break;
	    case 5:
	    	
		     sc.updateschool();
		     break;
	    case 6:
	    	
	    	sc.association();
	    	break;
	    case 7:
	    	
	    	sc.unassociation();
	    	break;
	    case 8:
	        
		    sc.deleteschool();
		    break;
	    case 9:
	    	
		    sc.deletestudent();
		    break;
	    case 10:
	    	
	        sc.search();
	    case 11:
	    	
		    sc.accept();
		    break;
	    case 12:
	    	
		    sc.city();
		    break;
	    case 13:
	    	
	    	sc.state();
	    	break;
	    case 14:
	    	
		    sc.studentcount();
	    	break;
	    case 15:
	    	
	    	sc.deleteSchoolass();
	    	break;
	    case 16:
	    	
		    sc.changeschool();
		    break;
	    case 17:
	    	
		    sc.deleteuser();
		    break;
		default:
		    	System.out.println("enter a proper number:");
		}
	}
}
