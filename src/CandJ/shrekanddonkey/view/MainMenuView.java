/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import CandJ.shrekanddonkey.control.GameControl;
import CandJ.shrekanddonkey.exceptions.MapControlException;
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
        
        char selection = ' ';
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
            selection = input.charAt(0);
            
            this.doAction(selection);           
        
        } while (selection != 'E');
    }

    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void doAction(char choice) throws MapControlException {
        
        switch (choice) {
            case 'N':
                this.startNewGame();
                break;
            case 'G':
                this.startSavedGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'P':
                this.printReport();
            case 'S':
                this.saveGame();
                break;
            case 'E':
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

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    private void printReport() { // I think this might be the function for actually printing the report so this code maybe doesn't go here.
        this.console.println() // this will prompt the user for a file path
        
        String filePath = this.getInput(); // getting the file path?
   
        try {
            
        } catch () {
            ErrorView.display() // number 3 part e. catch all runtime exceptions?
        }
        }

}
    
