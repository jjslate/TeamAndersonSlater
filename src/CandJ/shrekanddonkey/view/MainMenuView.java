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
public class MainMenuView {

    private final String MENU = "\n"
            + "\n------------------------"
            + "\n| Menu                 |"
            + "\nN - Start Game"
            + "\nG - Get and start saved game"
            + "\nH - Get Help"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n------------------------";
    
    public void displayMenu() throws MapControlException {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);           
        
        } while (selection != 'E');
    }

    private String getInput() {
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
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
    }
    
}  

    private void startNewGame() throws MapControlException {
        System.out.println("\n*** startNewGame funtion called ***");
        GameControl.createNewGame(ShrekAndDonkey.getPlayer());
        String MENU = "";
        GameMenuView gameMenu = new GameMenuView(MENU);
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame funtion called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu funtion called ***");
    }

    private void saveGame() {
        System.out.println("\nEnter file path where the game will be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(ShrekAndDonkey.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
    
