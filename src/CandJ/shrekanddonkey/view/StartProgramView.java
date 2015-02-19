
package CandJ.shrekanddonkey.view;

import CandJ.shrekanddonkey.control.ProgramControl;
import CandJ.shrekanddonkey.model.Player;


public class StartProgramView {
    
    public StartProgramView() {
        
    }
    public void startProgram() {
        
        this.displayBanner();
        
        String playerName = this.getPlayerName();
        
        Player player = ProgramControl.createPlayer(playerName);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    public void displayBanner() {
       System.out.println("\n\n*********************************************");
       
       System.out.println("*                                               *" 
                        + "\n* This is the Donkey and Shrek game           *"
                        + "\n* In this game you will take the role of      *"
                        + "\n* Donkey. Donkey's friend Shrek has a problem *"
                        + "\n* with fairytale creatures in his swamp. You  *"
                        + "\n* help him on his journey to find the princess*"
                        + "\n* so that the creatures will be removed from  *"
                        + "\n* the swamp and Shrek can have peace and      *"
                        + "\n* quiet. Throughout the game you must keep    *"
                        + "\n* Shrek either happy or angry. Angry to get   *"
                        + "\n* through obstacles and happy to continue the *"
                        + "\n* quest.                                      *");
       System.out.println("*                                               *"
                        +"\n* Good luck and may the odds be ever in your   *"
                        +"\n* favor.                                       *");
       System.out.println("*************************************************");
     }

    public String getPlayerName() {
        boolean valid = false; 
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Enter the player's name below:");
            
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
            
            if (playerName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
                
            }
            break;
        }
        return playerName;
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=============================================");
               
    }
    
}
