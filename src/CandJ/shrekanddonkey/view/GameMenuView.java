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
public class GameMenuView {

   public void doAction(char selection) {
       
       switch (selection) {
           case 'T': //travel to new location
               this.displayMenu();
               break;
           case 'O': // view obstacles
               this.viewObstacles();
               break;
           case 'M': // view annoying phrases
               this.viewAnnoyingPhrase();
               break;
           case 'F': //view friendly phrases
               this.viewFriendlyPhrase();
               break;
           case 'A': // view actors
               this.viewActors();
               break;
       }
   }
    
    
    
    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
