package projects;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{    
		int totalexceptedarea;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total yards:");
		int totalyards=sc.nextInt();
		
		
		Livingroom lr=new Livingroom();
		lr.living();
		System.out.println("###############bedroom###################");
		BedRoom br=new BedRoom();
		br.bed();
		
		System.out.println("################kitchen####################");
		Kitchen ki=new Kitchen();
		ki.kitchen();
		totalexceptedarea=(lr.livingyards+br.bedroomyards+ ki.kitchenexceptedarea);
	    System.out.println("totalexpectedarea:"+totalexceptedarea);		
		if(totalexceptedarea<=totalyards)
		{
		System.out.println("livingroom");
		System.out.println("totalbricks="+lr.totalbricks);
	    System.out.println("totalcementreqired="+lr.totalcement);
	    System.out.println("totalSteel="+lr.totalsteel);
	    System.out.println("totalglass="+lr.totalglass);
	    System.out.println("totalwoods="+lr.totalwoods);
	    System.out.println("bedroom");
	    System.out.println("totalbricks="+br.totalbricks);
	    System.out.println("totalcementreqired="+br.totalcement);
	    System.out.println("totalSteel="+br.totalsteel);
	    System.out.println("totalglass="+br.totalglass);
	    System.out.println("totalwoods="+br.totalwoods);
	    System.out.println("kitchen");
	    System.out.println("totalbricks="+ki.totalbricks);
	    System.out.println("totalcementreqired="+ki.totalcement);
	    System.out.println("totalSteel="+ki.totalsteel);
	    System.out.println("totalglass="+ki.totalglass);
	    System.out.println("totalwoods="+ki.totalwoods);
		
		
		System.out.println();
		System.out.println("########finalcalculation########");
		System.out.println("cement=" +(lr.totalcement+ br.totalcement+ ki.totalcement));
		System.out.println("bricks="+(lr.totalbricks+br.totalbricks+ki.totalbricks));
		System.out.println("steel="+(lr.totalsteel+br.totalsteel+ki.totalsteel));
		System.out.println("glass="+(lr.totalglass+br.totalglass+ki.totalglass));
		System.out.println("woods="+(lr.totalwoods+br.totalwoods+ki.totalwoods));
		
		}
		else 
		{
			System.err.println("area must be less than totalyards:");
		}
	}
}
	    