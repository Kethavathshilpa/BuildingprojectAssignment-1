package projects;

import java.util.Scanner;

class BedRoom 
{
	int cement=10;
	int bricks=150;
	int steel=55;
	int glass=70;
	int woods=20;
	int minimumbedroomyards=28;
	int no_of_bedroom,totalarea;
	int bedroomexceptedarea;
	int bedroomyards;
	int totalcement, totalbricks,totalsteel,totalglass,totalwoods;
	
    void bed()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter no.of bed room:");
    	int no_of_bedroom=sc.nextInt();
	    System.out.println("enter the excepted area for each bedroom room:");
	    bedroomexceptedarea=sc.nextInt();
		bedroomyards=no_of_bedroom*bedroomexceptedarea;
		System.out.println(bedroomyards);
		
	if(minimumbedroomyards<=bedroomexceptedarea)
	{
	     
	    totalcement=(cement*bedroomyards)/minimumbedroomyards;
	    totalbricks=(bricks*bedroomyards/minimumbedroomyards);
        totalsteel=(steel*bedroomyards/minimumbedroomyards);
        totalglass=(glass*bedroomyards/minimumbedroomyards);
	    totalwoods=(woods*bedroomyards/minimumbedroomyards);
	    
//	    System.out.println("totalbricks="+totalbricks);
//	    System.out.println("totalcementreqired="+totalcement);
//	    System.out.println("totalSteel="+totalsteel);
//	    System.out.println("totalglass="+totalglass);
//	    System.out.println("totalwoods="+totalwoods);
	}
	else 
	  {
	    	System.err.println("minimumyards>=28:");
	    	bed();
	  }
  }
}