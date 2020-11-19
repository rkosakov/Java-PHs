package edu.aubg.game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.aubg.game.GameModel;


@Controller

public class GameController {

	@GetMapping ("/playagame")

	public String playGame(
		@RequestParam(name="choice", required=true) 
			          String theChoice, Model model) {
		
		GameModel gmMdl = new GameModel();
		
		String theResult = gmMdl.play(theChoice);
		
		model.addAttribute("result", theResult);

          // Return the name of the view to display the result
		return "outcome";
		
	}
}
