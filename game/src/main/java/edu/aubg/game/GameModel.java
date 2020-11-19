package edu.aubg.game;

public class GameModel {
	
	  public String play(String theChoice) {

		String theResult = "error";  
		
		if (theChoice.equals("rock")) {
			return theResult = "tie";
		}
		
		if (theChoice.equals("paper")) {
			return theResult = "win";
		}
		
		if (theChoice.equals("scissors")) {
			return theResult = "loss";
		}
		
		return theResult;
	  }
}
