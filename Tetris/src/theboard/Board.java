package theboard;

public class Board extends Main{
	
	private int rows;
	private int columns;
	
	public Board(int rows, int colums) {
		rows = 8;
		colums = 12;
		
	}
	
	int[][] gameboard = new int[rows][columns];
	
	for(int i1 = 0; i1<rows; i1++)
	    for(int j2 = 0; j2<columns; j2++)
	        gameboard[i1][j2] = 0;

	for(int i = 0; i<rows; i++)
	{
	    for(int j = 0; j<columns; j++)
	    {
	        System.out.print(gameboard[i1][j]);
	    }
	    System.out.println();
	}
	
}


