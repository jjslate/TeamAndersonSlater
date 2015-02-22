/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import CandJ.shrekanddonkey.control.GameControl;
import shrek.and.donkey.ShrekAndDonkey;

/**
 *
 * @author Jayson
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n------------------------"
            + "\n| Menu                 |"
            + "\nG - Start Game"
            + "\nH - Get Help"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n------------------------";
    
    public void displayMenu() {
        
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

    public void doAction(char choice) {
        
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

    private void startNewGame() {
        System.out.println("\n*** startNewGame funtion called ***");
        GameControl.createNewGame(ShrekAndDonkey.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame funtion called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu funtion called ***");
    }

    private void saveGame() {
        System.out.println("\n*** startExistingGame funtion called ***");
    }
}
    
