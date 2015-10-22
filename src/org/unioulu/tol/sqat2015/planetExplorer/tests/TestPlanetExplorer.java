package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void BeginingPosition() {
			//Arrange
			PlanetExplorer exp = new PlanetExplorer(1,1,"");
			//Act
		
			//Assert
			assertEquals("(0,0,N)",exp.executeCommand(""));
			
		}
	@Test
	public void TurningLeft() {
			//Arrange
			PlanetExplorer exp = new PlanetExplorer(1,1,"");
			//Act
		
			//Assert
			assertEquals("(0,0,E)",exp.executeCommand("l"));
			
		}
}
