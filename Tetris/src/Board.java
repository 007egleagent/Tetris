import java.util.Arrays;
import java.util.Arrays;

public class Board {
	// instance variables 
		private int rows;
		private int columns;
		public static int[][] boardgame;

		// constructor with the values for row and columns
		public Board() {
			this.rows = 24;
			this.columns = 10;
			boardgame = new int[rows][columns];
		}
		
		public Board(int rows, int columns) {
			this.rows = 24;
			this.columns = 10;
		}
		
		public Board(Board copy) {
			this.rows = copy.rows;
			this.columns = copy.columns;
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
	    
	    // OP code
		// OP code that puts a row of 1's 
	    public static void rowsOfOne(){
	    	for (int r = 0; r < boardgame.length; r++) {
	    		for(int c = 0; c < boardgame[r].length; c++) {
	    			// board testing
	    			
	    			// testing a single column
//	    			boardgame[r][4] = 1;   	
	    			
	    			// testing a single row 			
	    			boardgame[1][c] = 4;
	    			boardgame[1][0]  = 0;
	    			
	    		}
	    	}
	    }
	    
	    // makes the pieces drop 
	    public static void makeEmDrop() {
	    	
	    	for (int r = 0; r < boardgame.length; r++) {
	    		for(int c = 0; c < boardgame[r].length; c++) {
//	    			System.out.println(r);
//	    			System.out.println(c);
	    			
	    			boolean somethingUnderIt = true;
	    			if(somethingUnderIt == false) {
	    				System.out.println("okgot eem");
	    			}
	    			
	    			for(int u : boardgame[c]) {
	    				while(u == 0) {
	    					somethingUnderIt = false;
	    					break;
	    				
	    				}
	    				somethingUnderIt = true;	 
	    				
	    			}
	    			while(somethingUnderIt) {
	    				for(int u = 0; u < boardgame[c].length;) {
	    					System.out.println("there is another one here");
	    					boardgame[u][c] = boardgame[u--][c];
	    					break;
	    				}
	    			}
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
}
