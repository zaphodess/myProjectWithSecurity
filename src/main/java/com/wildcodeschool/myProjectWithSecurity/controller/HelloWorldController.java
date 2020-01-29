package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	 @GetMapping("/")
	    public String hello() {
	        return "Welcome to the SHIELD";
	    }
	 
	 @GetMapping("/avengers/assemble")
	    public String avengersAssemble() {
	        return "Avengers ...... Assemble!";
	    }
	 
	 @GetMapping("/secret-bases")
	    public String secretBases() {
	        return "     Biarritz<br>" + 
	        		"    Bordeaux<br>" + 
	        		"    La Loupe <br>" + 
	        		"    Lille<br>" + 
	        		"    Lyon<br>" + 
	        		"    Marseille<br>" + 
	        		"    Nantes<br>" + 
	        		"    Orléans<br>" + 
	        		"    Paris<br>" + 
	        		"    Reims<br>" + 
	        		"    Strasbourg<br>" + 
	        		"    Toulouse<br>" + 
	        		"    Tours<br>" + 
	        		"<br>" +
	        		"    Amsterdam<br>" + 
	        		"    Barcelone<br>" + 
	        		"    Berlin<br>" + 
	        		"    Bonn<br>" + 
	        		"    Bruxelles<br>" + 
	        		"    Bucarest<br>" + 
	        		"    Budapest<br>" + 
	        		"    Darmstadt<br>" + 
	        		"    Dublin<br>" + 
	        		"    Kicklingen - very secret indeed<br>" + 
	        		"    Lisbonne<br>" + 
	        		"    Londres<br>" + 
	        		"    Madrid<br>" + 
	        		"    Milan";
	    }
	 
	 @GetMapping("/admin")
	 public String admin() {
	     return "Hello Admin!!!";
	 }


}
