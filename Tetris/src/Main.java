 /*                       _             
  _ __  __ _  _ __ ___  (_) _ __  ___  
 | '__|/ _` || '_ ` _ \ | || '__|/ _ \ 
 | |  | (_| || | | | | || || |  | (_) |
 |_|   \__,_||_| |_| |_||_||_|   \___/ 
                                       
*/
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	
	// instance variables 
	private int rows;
	private int columns;
	private static int[][] boardgame;

	// constructor with the values for row and columns
	public Main() {
		this.rows = 24;
		this.columns = 10;
		boardgame = new int[rows][columns];
	}
	// setters 
	 
	// sets the rows values
    public void setRows(int rows){
    	this.rows = rows;
    }  
        
    // sets the columns value
    public void setColumns(int columns) {
    	this.columns = columns;
    }
    
    // getters
                        
    // gets values from rows
    public int getRows(){
        return rows;
    }
    
    // gets the values from the columns 
    public int getColumns() {
    	return columns;
    }
    
	// OP code that puts a row of 1's 
    public static void rowsOfOne(){
    	for (int r = 0; r < boardgame.length; r++) {
    		for(int c = 0; c < boardgame[r].length; c++) {
    			boardgame[2][c] = 1;
    			boardgame[2][4] = 5;
    			boardgame[5][c] = 1;
    		 	boardgame[0][9] = 1;
    		 	boardgame[3][5] = 3;
    		 	boardgame[3][6] = 6;
    		 	boardgame[3][7] = 2;
    		 	boardgame[3][6] = 3;
    		 	boardgame[3][8] = 9;
    		 	boardgame[3][9] = 1;
    		 	boardgame[3][4] = 7;
    		 	boardgame[3][3] = 6;
    		 	boardgame[3][2] = 2;
    		 	boardgame[3][1] = 5;
//    		 	boardgame[3][0] = 5;   		 
    		}
    	}
    }
    
   	// prints out the 2d array board 
    public static void printOutBoard() {
    	for (int r = 0; r < boardgame.length; r++) {
 				System.out.println(Arrays.toString(boardgame[r]));		
    	}
    }
    
    public static void rowSameValues() {	
    	
    	for (int r = 0; r < boardgame.length; r++) {
    	    System.out.println("start of row " + r);
    	    for (int c = 0; c < boardgame[r].length; c++) {
    	    	System.out.println(boardgame[r][c]);  	
   	
    	    	boolean isHigherThanZero = true;
    	    	
    	    	for (int i : boardgame[r]) {
    	    	    if (i <= 0) {
    	    	        isHigherThanZero = false;
    	    	        break;
    	    	    }
    	    	}
    	    	if (isHigherThanZero) {
    	    	    for (int i=0; i<boardgame[r].length; i++) {
    	    	        boardgame[r][i] = 0;
    	    	    }
    	    	}
    	 
    	    }
 
    	} 
    	
    }
    	
    // the place where it runs                            
    public static void main(String[] args) {
    	
    	// calls main
    	Main m = new Main(); 	
    	
    	rowsOfOne();
    	rowSameValues();
    	printOutBoard();

    	// prints the values of the height and length in that order
    	System.out.println(m.rows);
    	System.out.println(m.columns);
    
    	}
}
