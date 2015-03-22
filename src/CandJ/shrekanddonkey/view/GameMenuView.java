/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

/**
 *
 * @author Owner
 */
public class GameMenuView extends View {
    private String promptMessage;
    public GameMenuView(String promptMessage){
        super(promptMessage);
        this.promptMessage = promptMessage;
    }
   @Override
    public void display() {
        
        char selection = ' ';
        do {
            
            System.out.println(promptMessage);
            
            String input = this.getInput();
            
            this.doAction(input);           
        
        } while (selection != 'E');
    }
  @Override
   public void doAction(String selection) {
       
       switch (selection) {
           case "T": //travel to new location
               this.display();
               break;
           case "O": // view obstacles
               this.viewObstacles();
               break;
           case "M": // view annoying phrases
               this.viewAnnoyingPhrase();
               break;
           case "F": //view friendly phrases
               this.viewFriendlyPhrase();
               break;
           case "A": // view actors
               this.viewActors();
               break;
       }
   }
    
    private void viewAnnoyingPhrase(){
    	
    }
    
    private void viewFriendlyPhrase(){
          String MENU = "\n"
            + "\n----------------------------------"
            + "\n| Friendly Phrase                |"
            + "\n ---------------------------------"
            + "\n6 - Move one space"
            + "\n7 - Move two spaces"
            + "\n8 - Move three spaces"
            + "\n9 - Move four spaces"
            + "\n10 - Move five spaces"
            + "\nE - Exit"
            + "\n----------------------------------";
        FriendlyPhraseView friendlyPhrase = new FriendlyPhraseView(MENU);
        friendlyPhrase.display();
        
    }
    
    private void viewActors(){
 	
    }
    
    private void viewObstacles(){
     	
    }
    
    
}
