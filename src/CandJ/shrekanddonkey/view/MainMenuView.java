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
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
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

    private void startExistingGame() {
        this.console.println("\n*** startExistingGame funtion called ***");
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

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
