package projects;

import java.util.Scanner;
class Livingroom 
{
	int cement=20;
	int bricks=200;
	int steel=70;
	int glass=200;
	int woods=20;
	int minimumlivingyards=35;
	int no_of_livingroom;
	int livingroomexceptedarea;
	int livingyards,totalcement,totalbricks,totalglass,totalwoods,totalsteel;
    void living()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter no.of living room:");
    	int no_of_livingroom=sc.nextInt();
	    System.out.println("enter the excepted area for each living room:");
	    livingroomexceptedarea=sc.nextInt();
		livingyards=no_of_livingroom*livingroomexceptedarea;
		System.out.println(livingyards);
	if(minimumlivingyards<=livingroomexceptedarea)
	{
			
	    totalcement=(cement*livingyards)/minimumlivingyards;
	    totalbricks=(bricks*livingyards)/minimumlivingyards;
        totalsteel=(steel*livingyards)/minimumlivingyards;
        totalglass=(glass*livingyards)/minimumlivingyards;
	    totalwoods=(woods*livingyards)/minimumlivingyards;
	    
//	    System.out.println("totalbricks="+totalbricks);
//	    System.out.println("totalcementreqired="+totalcement);
//	    System.out.println("totalSteel="+totalsteel);
//	    System.out.println("totalglass="+totalglass);
//	    System.out.println("totalwoods="+totalwoods);
	}
	else 
	  {
	    	System.err.println("minimumyards>=35:");
	    	living();
	  }
  }
	 
	
  }



    
