/**
* File: Lab04Prob01.java
* Class: CSCI 1301
* Author: Jayden Morua, hannah pamplona
* Created on: feb 7, 2025
* Last Modified: feb 7, 2025
* Description: Write a Java program that will determine, based on a randomly-generated age
between 0-65, whether a person that age is legally allowed to purchase alcohol or not.
*/
import gsu.Math;
public class Lab04Prob01 {

	public static void main(String[] args) {
		
		// generate a random age 
		int randomAge = (int)(Math.random() * 66);
		String canDrink = "";
		// determine if eligible to drink
		if (randomAge < 21) {
			canDrink = "not ";
		}
		// output result
		System.out.println("You are " + randomAge + " years old and are " + canDrink + "eligible to purchase alcohol.");
		
	}

}
