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
			assertEquals("(2,2,E)",exp.executeCommand("ffrff"));
			
		}
	@Test
	public void MovingBacwardAfter2Turns() {
			//Arrange
			
			//Act
		
			//Assert
			assertEquals("(1,0,S)",exp.executeCommand("rrb"));
			
		}
	@Test
	public void SpawningAtOtherSide() {
			//Arrange
			
			//Act
		
			//Assert
			assertEquals("(99,0,N)",exp.executeCommand("b"));
			
		}
	@Test
	public void movingTest() {
		//Arrange
		
		//Act
	
		//Assert
		assertEquals("(99,0,N)",exp.executeCommand("b"));
		
	}
	@Test
	public void SpawningAfterFewCommand() {
		//Arrange
		
		//Act
	
		//Assert
		assertEquals("(99,98,S)",exp.executeCommand("fflfflfff"));
		
	}
	@Test
	public void FacingObstacle() {
		//Arrange
		
		//Act
	
		//Assert
		assertEquals("(0,0,E)(0,1)",exp.executeCommand("rf"));
		
	}
}
