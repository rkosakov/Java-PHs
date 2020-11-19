package edu.aubg.hello;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingController {
	@GetMapping("/greeting")
	
	public String greeting(Model model) { //method for displaying the greeting
		
		String[] names = new String [] // array of strings for the names
				{"Vasil Kosakov", 
				"Violeta Kosakova", 
				"Ivan Kosakov", 
				"George Kosakov", 
				"John Kosakov", 
				"Maria Kosakova"};
		
		Random rand = new Random(); //invoking the random class 
		int num = rand.nextInt(6); //declaring an integer variable to store the random number
		String name = names[num]; // declaring a string variable to store the randomly chosen name
		
		
		model.addAttribute("name", name); //adding the name (attribute) to the view
		return "greeting";
	}
}
