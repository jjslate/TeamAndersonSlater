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
    public GameMenuView(){
        super();
        
    }
   @Override
    public void display() {
        
        char selection = ' ';
        do {
            this.setPromptMessage(null);
            this.console.println(this.getPromptMessage());
            
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
          
        FriendlyPhraseView friendlyPhrase = new FriendlyPhraseView();
        friendlyPhrase.display();
        
    }
    
    private void viewActors(){
 	
    }
    
    private void viewObstacles(){
     	
    }
    
    
}
