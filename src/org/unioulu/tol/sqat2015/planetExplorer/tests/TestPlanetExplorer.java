package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	PlanetExplorer exp = new PlanetExplorer(100,100,"");
	
	@Test
	public void BeginingPosition() {
			//Arrange

			//Act
		
			//Assert
			assertEquals("(0,0,N)",exp.executeCommand(""));
			
		}
	@Test
	public void TurningLeft() {
			//Arrange

			//Act
		
			//Assert
			assertEquals("(0,0,W)",exp.executeCommand("l"));
			
		}
	@Test
	public void TurningRight() {
			//Arrange
			
			//Act
		
			//Assert
			assertEquals("(0,0,E)",exp.executeCommand("r"));
			
		}
	@Test
	public void MovingForward() {
			//Arrange
			
			//Act
		
			//Assert
			assertEquals("(1,0,N)",exp.executeCommand("f"));
			
		}
	@Test
	public void MovingBacwardAfter2Turns() {
			//Arrange
			
			//Act
		
			//Assert
			assertEquals("(1,0,S)",exp.executeCommand("rrb"));
			
		}
}
