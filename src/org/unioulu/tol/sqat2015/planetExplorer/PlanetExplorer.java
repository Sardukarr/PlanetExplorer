package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:
public class PlanetExplorer {
	int posX;
	int posY;
	char face;
	//public enum directions{
	//	N(1),E(2),S(3),W(4);
		// private int value;

     //   private directions(int value) {
          //      this.value = value;
	//}
	//directions face1;
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	posX=0;
	posY=0;
	face='N';
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		char step;
		for(int i=0;i<command.length();i++)
		{
			step=command.charAt(i);
			move(step);
		}
		
		String location="("+posX+","+posY+","+face+")";
		return location;
	}
	
	private void move(char where)
	{
		switch(where)
		{
		case 'l':
			left();
			break;
		case 'r':
			right();
			break;
		case 'f':
			forward();
			break;
		case 'b':
			backward();
			break;
		}
		checkPos();
	}

	private void right()
	{
		switch(face)
		{
		case 'N': 
			face='E';
			break;
		case 'E':
			face='S';
			break;
		case 'S':
			face='W';
			break;
		case 'W':
			face='N';
			break;
		}
	}
	private void left()
	{
		switch(face)
		{
		case 'N': 
			face='W';
			break;
		case 'E':
			face='N';
			break;
		case 'S':
			face='E';
			break;
		case 'W':
			face='S';
			break;
		}
	}
	private void forward()
	{
		switch(face)
		{
		case 'N': 
			posX++;
			break;
		case 'E':
			posY++;
			break;
		case 'S':
			posX--;
			break;
		case 'W':
			posY--;
			break;
		}
	}
	private void backward()
	{
		switch(face)
		{
		case 'N': 
			posX--;
			break;
		case 'E':
			posY--;
			break;
		case 'S':
			posX++;
			break;
		case 'W':
			posY++;
			break;
		}
	}
	
	
	private void checkPos() {
		if(posX<0)
		{posX=posX+100;}
		if(posY<0)
		{posY=posY+100;}
	}
}

