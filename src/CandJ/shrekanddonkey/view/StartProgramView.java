
package CandJ.shrekanddonkey.view;

import CandJ.shrekanddonkey.control.ProgramControl;
import CandJ.shrekanddonkey.exceptions.MapControlException;
import CandJ.shrekanddonkey.model.Player;
import java.io.IOException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StartProgramView extends View {

    public StartProgramView() {
        super();
    }

    
    
    
    public void startProgram() throws MapControlException {
        
        this.displayBanner();
        
        String input = this.getInput();
        
        Player player = ProgramControl.createPlayer(input);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
        
    }

    public void displayBanner() {
   this.console.println("\n\n*************************************************");
       
       this.console.println("*                                               *" 
                      + "\n* This is the Donkey and Shrek game             *"
                      + "\n* In this game you will take the role of        *"
                      + "\n* Donkey. Donkey's friend Shrek has a problem   *"
                      + "\n* with fairytale creatures in his swamp. You    *"
                      + "\n* help him on his journey to find the princess  *"
                      + "\n* so that the creatures will be removed from    *"
                      + "\n* the swamp and Shrek can have peace and        *"
                      + "\n* quiet. Throughout the game you must keep      *"
                      + "\n* Shrek either happy or angry. Angry to get     *"
                      + "\n* through obstacles and happy to continue the   *"
                      + "\n* quest.                                        *");
       this.console.println("*                                               *"
                       +"\n* Good luck and may the odds be ever in your    *"
                       +"\n* favor.                                        *");
       this.console.println("*************************************************");
     }

    public String getInput() {
        boolean valid = false; 
        String input = null;
        
        
        while(!valid) {
            
            this.console.println("Enter the player's name below:");
            
            try {
                input = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
            }
            input = input.trim();
            
            if (input.length() < 2) {
                ErrorView.display("StartProgramView", "Invalid name - the name must not be blank");
                continue;
                
            }
            break;
        }
        return input;
    }

    public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n=============================================");
        this.console.println("\tWelcome to the game " + player.getName());
        this.console.println("\tWe hope you have a lot of fun!");
        this.console.println("=============================================");
               
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
