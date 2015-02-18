/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

/**
 *
 * @author Jayson
 */
public class StartProgramView {
    
    public StartProgramView() {
        
    }
    public void startProgram() {
        
        this.displayBanner();
    }

    private void displayBanner() {
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
}
