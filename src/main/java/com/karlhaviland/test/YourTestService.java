package com.karlhaviland.test;

import java.util.Arrays;
import java.util.List;


/**
 * Service that is used to expose and manage operations against the database or domain.
 */
public class YourTestService{

	public List<String> findAllSuperPowers(){
		return Arrays.asList("X-Ray Vision", "Flight", "Super Strength", "Fire", "Invisibility");
	}

	public List<Test> findAllBySuperPowers(String power){
		return Arrays.asList();
	}
}
