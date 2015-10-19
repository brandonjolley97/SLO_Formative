package formative.controller;

import formative.view.SLOPopup;

public class SLOController 
{
	private SLOPopup myPopups;
	double cookies = 10;
	
	public SLOController()
	{
		myPopups = new SLOPopup();
	}
	
	public void start()
	{
		for(int startCount = 0;startCount<10;startCount++)
		{
		runMouse();
		}
	}
	
	public void runMouse()
	{
		
		int mouseTraps;
		mouseTraps = 0;
		
		if(cookies == 9)
		{
			myPopups.grabAnswer("A mouse has eaten one of your cookies!  Do you want to put a mouse trap next to your cookies?");
			mouseTraps = 1;
			myPopups.showResponse("Regardless of how you answered, a mouse trap was placed next to the cookies.  There is " + mouseTraps + " mouse trap.");
			
		}
		else if(cookies == 8)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 2;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 7)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 3;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 6)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 4;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 5)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 5;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 4)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 6;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 3)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 7;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 2)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 8;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 1)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			mouseTraps = 9;
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.  There are " + mouseTraps + " mouse traps.");
			
		}
		else if(cookies == 0)
		{
			myPopups.showResponse("Your cookies are gone..... and now the mouse wants some milk...");
		}
		
		cookies--;
		
	}
}




















