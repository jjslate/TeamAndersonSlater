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
public class FriendlyPhraseView {
    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n| Friendly Phrase                |"
            + "\n ---------------------------------"
            + "\n6 - Move one space"
            + "\n7 - Move two spaces"
            + "\n8 - Move three spaces"
            + "\n9 - Move four spaces"
            + "\n10 - Move five spaces"
            + "\nE - Exit"
            + "\n-----------------------------------";
    
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
public void doAction(char choice) {
        
        switch (choice) {
            case '6':
                this.moveOne();
                break;
            case '7':
                this.moveTwo();
                break;
            case '8':
                this.moveThree();
                break;
            case '9':
                this.moveFour();
                break;
            case '10':
                this.moveFive();    
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
    }
    