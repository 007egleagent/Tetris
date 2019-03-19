public class Main {
	
	private int rows;
	private int columns;
	
	
	
	public Main() {
		this.rows = 8;
		this.columns = 120;
		
	}
	
    public void setRows(int rows){
        this.rows = rows;
    }
    
    public void setColumns(int columns) {
    	this.columns = columns;
    }

    public int getRows(){
        return rows;
    }
    
    public int getColumns() {
    	return columns;
    }
	
    public static void main(String[] args) {
    	
    	Main mw = new Main();

    	System.out.println(mw.rows);
    	System.out.println(mw.columns);
    }
        
}

