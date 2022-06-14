package projects;
import java.util.Scanner;
class Kitchen
{
	int cement=10;
	int bricks=150;
	int steel=55;
	int glass=70;
	int woods=20;
	int minimumkitchenyards=18;
	int kitchenexceptedarea,totalcement,totalsteel,totalbricks,totalglass,totalwoods;
	
	void kitchen()
    {
    	Scanner sc=new Scanner(System.in);
    	
	    System.out.println("enter the excepted area for each kitchen room:");
	    kitchenexceptedarea=sc.nextInt();
		
	if(minimumkitchenyards<=kitchenexceptedarea)
	{
			
	    totalcement=(cement*kitchenexceptedarea/minimumkitchenyards);
	    totalbricks=(bricks*kitchenexceptedarea/minimumkitchenyards);
        totalsteel=(steel*kitchenexceptedarea/minimumkitchenyards);
        totalglass=(glass*kitchenexceptedarea/minimumkitchenyards);
	    totalwoods=(woods*kitchenexceptedarea/minimumkitchenyards);
	    
//	    System.out.println("totalbricks="+totalbricks);
//	    System.out.println("totalcementreqired="+totalcement);
//	    System.out.println("totalSteel="+totalsteel);
//	    System.out.println("totalglass="+totalglass);
//	    System.out.println("totalwoods="+totalwoods);
	}
	else 
	  {
	    	System.err.println("minimumyards>=18:");
	    	kitchen();
	  }
  }
}
