package com.arya.restdemo3;

import java.util.Arrays;
import java.util.List;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("aliens")
public class AlienResource {
	
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {
		Alien a1 = new Alien();
		a1.setName("Arya");
		a1.setPoints(50);
		
		Alien a2 = new Alien();
		a2.setName("ar2");
		a2.setPoints(30);
		
		System.out.println("Hi");
		
		List<Alien> aliens = Arrays.asList(a1, a2);
		
		return aliens;
	}
}
