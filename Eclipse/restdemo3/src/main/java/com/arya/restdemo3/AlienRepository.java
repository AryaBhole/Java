package com.arya.restdemo3;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	List<Alien> aliens;
	
	public AlienRepository () {
		aliens = new ArrayList<>();
		
		Alien a1 = new Alien();
		a1.setName("Arya");
		a1.setPoints(50);
		
		Alien a2 = new Alien();
		a2.setName("ar2");
		a2.setPoints(30);
		
		aliens.add(a1);
		aliens.add(a2);
	}
}
