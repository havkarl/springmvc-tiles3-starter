package com.karlhaviland.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Service that is used to expose and manage operations against the database or domain.
 */
public class YourService {
	public static Map<String, SuperHero> superHeroes = new HashMap();

	public List<String> findAllSuperPowers(){
		return Arrays.asList("X-Ray Vision", "Flight", "Super Strength", "Fire", "Invisibility");
	}

	public List<SuperHero> findAllBySuperPowers(String power){
		return Arrays.asList();
	}

	public Collection<SuperHero> saveSuperHero(SuperHero superHero){
		superHeroes.put(superHero.getName(), superHero);
		return superHeroes.values();
	}
}
