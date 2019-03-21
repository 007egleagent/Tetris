
import java.awt.Color;
import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.shape.Line; 
import javafx.scene.image.Image;

/*                       _             
  _ __  __ _  _ __ ___  (_) _ __  ___  
 | '__|/ _` || '_ ` _ \ | || '__|/ _ \ 
 | |  | (_| || | | | | || || |  | (_) |
 |_|   \__,_||_| |_| |_||_||_|   \___/ 
                                       
*/

public class Graphics extends Application {
	
	private static int windowX;
	private static int windowY;
	private static int lenRows;
	private static int lenCol;
	private static int[][] boardrowsx;
	private static Double[][] boardrowsy;
	
//	private static int[][] whatever = new int[][] {{4,5,6,2},{4,5,2,3},{9,2,6,3}};
	
	public Graphics() {
		Graphics.windowX = 330;
		Graphics.windowY = 660;
		
		Graphics.lenRows = 24;
		Graphics.lenCol = 10;
		
		boardrowsx = new int[lenCol][4];
		boardrowsy = new Double[lenRows][4];
	}
	
    public void setLenRows(int lenRows){
    	Graphics.lenRows = lenRows;
    }   
    
    public void setLenCol(int lenCol){
    	Graphics.lenCol = lenCol;
    }   
     
    public void setWindowX(int windowX){
    	Graphics.windowX = windowX;
    }   
    
    public void setWindowY(int windowY){
    	Graphics.windowY = windowY;
    }  
     
    // getters
    public static int getWindowX(){
        return windowX;
    }
        
    public static int getWindowY(){
        return windowY;
    }
    
    public int getLenRows(){
        return lenRows;
    }
    
    public int getLenCol(){
        return lenCol;
    }
     
    //--------
    
    // gets the coordinates for the X lines
    public static void theCoordsForX() {
    	
    	for(int i = 0; i < lenCol; i++) {
    		boardrowsx[i][0] = getWindowX()/lenCol;
    		boardrowsx[i][2] = getWindowX()/lenCol;
    	}	
    }
    
    // gets the coordinates for the Y lines
    public static void theCoordsForY() {
    	
    	for(int i = 0; i < lenRows; i++) {
    		boardrowsy[i][1] = (double) (getWindowY()/lenRows);
    		boardrowsy[i][3] = (double) (getWindowY()/lenRows);
    	}	
    }
    
    // prints out the board for the coordinates X coordinates
    public static void onesforx() {
    	theCoordsForX();
    	theCoordsForY();
    	
    	// prints x board
    	for (int r = 0; r < boardrowsx.length; r++) { 
 				System.out.println(Arrays.toString(boardrowsx[r]));	
 				}
    	
    	// prints Y board
    	for (int b = 0; b < boardrowsy.length; b++) { 
				System.out.println(Arrays.toString(boardrowsy[b]));	
				}
    }
    
    // stuff for the javafx
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tetris");
        
//        theCoordsForY();
        theCoordsForX();
        theCoordsForY();

        // draws the X line
        Line linex = new Line(boardrowsx[0][0], 675, boardrowsx[0][2], 0); 
        
        // draws the Y line 
        Line liney = new Line(345, boardrowsy[0][1], 0, boardrowsy[0][3]);
      
        Group root = new Group(linex, liney); 
        

        Scene scene = new Scene(root, windowX, windowY);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
 
    	

}



	



