 /*                       _             
  _ __  __ _  _ __ ___  (_) _ __  ___  
 | '__|/ _` || '_ ` _ \ | || '__|/ _ \ 
 | |  | (_| || | | | | || || |  | (_) |
 |_|   \__,_||_| |_| |_||_||_|   \___/ 
                                       
*/
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

    // the place where it runs                            
    public static void main(String[] args) {
    	
    	// calls main
    	Main m = new Main();

    	// OP code that puts a row of 1's 
    	for (int r = 0; r < boardgame.length; r++) {
    		for(int c = 0; c < boardgame[r].length; c++) {
    			boardgame[5][c] = 1;
    		}
    	}
    	
    	
    	if(boardgame[5][1] == 1) {
    		boardgame[5][1] = 0;
    	}
    	// prints out the 2d array board 
    	for (int r = 0; r < boardgame.length; r++) {
 				System.out.println(Arrays.toString(boardgame[r]));
    			
    	}

    	// prints the values of the height and length in that order
    	System.out.println(m.rows);
    	System.out.println(m.columns);
    
    	}
}

