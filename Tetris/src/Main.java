import javafx.application.Application;
import javafx.stage.Stage;


/*                       _             
  _ __  __ _  _ __ ___  (_) _ __  ___  
 | '__|/ _` || '_ ` _ \ | || '__|/ _ \ 
 | |  | (_| || | | | | || || |  | (_) |
 |_|   \__,_||_| |_| |_||_||_|   \___/ 
                                       
*/

public class Main extends Application {
	
    // the place where it runs                            
    public static void main(String[] args)throws Exception {
    	
    
    	// calls player
    	Player p = new Player();
    	 
    	Board b = new Board(); 
    	 
    	Graphics g = new Graphics();
    	
    	Board.rowsOfOne();
    	Board.rowSameValues();
//    	Board.printOutBoard();
    	Graphics.onesforx();
 
    	launch(args);
    
    	// prints the values of the height and length in that order
    	System.out.println(b.getRows());
    	System.out.println(b.getColumns());
    
    	}

	@Override
	public void start(Stage primaryStage) throws Exception {

	  	Graphics g = new Graphics();
	  	
	  	g.start(primaryStage);
		
	}
}
