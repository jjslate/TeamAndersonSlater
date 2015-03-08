/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import java.util.Scanner;

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
            + "\n----------------------------------";
    
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
        boolean valid = false; 
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Enter phrase 6 - 10 to move:");
            
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input.hashCode() > 10) {
                System.out.println("Invalid phrase - phrase must 6 - 10");
                continue;
                else (input.hashCode() < 6) {
                System.out.println("Invalid phrase - phrase must 6 - 10");
                continue;
            }
            }
            break;
        }
        return input;
    }
public void doAction(char choice) {
        
        switch (choice) {
            case 5:
                this.moveOne();
                break;
            case 6:
                this.moveTwo();
                break;
            case 8:
                this.moveThree();
                break;
            case 9:
                this.moveFour();
                break;
            case 10:
                this.moveFive();    
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
    }
}

    private void moveOne() {

        private String getInput() {
        boolean valid = false; 
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Enter the player's name below:");
            
            input = keyboard.nextLine();
            input = input.trim();
            
            if (input.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
                
            }
            break;
        }
        return input;
    }
    

    private void moveTwo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveThree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveFour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveFive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    