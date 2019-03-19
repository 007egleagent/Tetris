import java.util.Arrays;

public class Main {
	
	// instance variables 
	private int rows;
	private int columns;

	// constructor with the values for row and columns
	public Main() {
		this.rows = 20;
		this.columns = 10;
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
    	
    	// generates the 2d array with the rows and columns values from the constructor 
    	int[][] boardgame = new int[m.rows][m.columns];
    
    	// prints out the 2d array board 
    	for (int r = 0; r < boardgame.length; r++) {
    		System.out.println(Arrays.toString(boardgame[r]));}

    	// prints the values of the height and length in that order
    	System.out.println(m.rows);
    	System.out.println(m.columns);
    
    	}
        
}

