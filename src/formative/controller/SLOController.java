package formative.controller;

import formative.view.SLOPopup;

public class SLOController 
{
	private SLOPopup myPopups;
	
	public SLOController()
	{
		myPopups = new SLOPopup();
	}
	
	public void start()
	{
		double cookies;
		cookies = 10;
		
		int mouseTraps;
		mouseTraps = 0;
		
		if(cookies == 9)
		{
			myPopups.grabAnswer("A mouse has eaten one of your cookies!  Do you want to put a mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, a mouse trap was placed next to the cookies.");
			mouseTraps = 1;
		}
		else if(cookies == 8)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 2;
		}
		else if(cookies == 7)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 3;
		}
		else if(cookies == 6)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 4;
		}
		else if(cookies == 5)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 5;
		}
		else if(cookies == 4)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 6;
		}
		else if(cookies == 3)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 7;
		}
		else if(cookies == 2)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 8;
		}
		else if(cookies == 1)
		{
			myPopups.grabAnswer("A mouse has eaten another one of your cookies!  Do you want to put a another mouse trap next to your cookies?");
			myPopups.showResponse("Regardless of how you answered, another mouse trap was placed next to the cookies.");
			mouseTraps = 9;
		}
		else if(cookies == 0)
		{
			myPopups.showResponse("Your cookies are gone..... and now the mouse wants some milk...");
		}
		
		cookies--;
		
	}
}




















