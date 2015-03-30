/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import CandJ.shrekanddonkey.control.GameControl;
import CandJ.shrekanddonkey.exceptions.MapControlException;
import CandJ.shrekanddonkey.model.Game;
import shrek.and.donkey.ShrekAndDonkey;

/**
 *
 * @author Jayson
 */
public class MainMenuView extends View {


    public MainMenuView() {
        super();
    }

    

    
    
    public void displayMenu() throws MapControlException {
        
        String selection = "";
        do {
            this.setPromptMessage("\n"
            + "\n------------------------"
            + "\n| Menu                 |"
            + "\nN - Start Game"
            + "\nG - Get and start saved game"
            + "\nH - Get Help"
            + "\nP - Print report"        
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n------------------------");
            this.console.println(this.getPromptMessage());
            
            String input = this.getInput();
            selection = input;
            
            this.doAction(selection);           
        
        } while (selection != "E");
    }

    @Override
    public String getInput() {
    	boolean valid = false;
        String input = null;

        while (!valid) {

            this.console.println("Enter Command");

            try {
                input = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            input = input.trim();

            if (input.length() < 2) {
                ErrorView.display("View", "Invalid name - the name must not be blank");
                continue;

            }
            break;
        }
        return input;
        }

   @Override
    public void doAction(String choice) throws MapControlException {
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startSavedGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "P":
                this.printReport();
            case "S":
                this.saveGame();
                break;
            case "E":
                return;
            default:
                ErrorView.display("MainMenuView", "\n*** Invalid Selection *** Try Again");
                break;
    }
    
}  

    private void startNewGame() throws MapControlException {
        this.console.println("\n*** startNewGame funtion called ***");
        GameControl.createNewGame(ShrekAndDonkey.getPlayer());
      
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startSavedGame() {
        this.console.println("\n*** startExistingGame funtion called ***");
        
        String filePath = this.getInput();
        
        try {
            
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display ("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        }    

    private void displayHelpMenu() {
        this.console.println("\n*** displayHelpMenu funtion called ***");
    }

    private void saveGame() {
        this.console.println("\nEnter file path where the game will be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(ShrekAndDonkey.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void printReport() { 
        this.console.println("\nEnter file path where the report is to be printed."); 
        
        String filePath = this.getInput(); 
   
        try {
        	this.printAction(filePath);
            
        } catch (Exception e) {
            ErrorView.display(filePath, e.getMessage()); // number 3 part e. catch all runtime exceptions?
        }
        
        this.console.println("Report printed successfully.");
        
        }

    
    private void printAction(String filePath) throws IOException{
    	FileOutputStream fops = new FileOutputStream(filePath);
    	ObjectOutputStream output = new ObjectOutputStream(fops);
    	
    	
    	
    	this.console.println("        Game"
				+ "/n"
				+ "Actors          Player");
    	Game game = new Game();
    	String player = game.getPlayer().toString();
    	for (int i = 0; i < 10; i++) {
    		
    		String listActors[] = game.getActors();
    		this.console.println(listActors[i] +         player);
    		
			
		}
    	output.writeObject(game);	   	
    	output.close();
    }
}
    
