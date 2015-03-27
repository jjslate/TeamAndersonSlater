/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jayson
 */
public class FriendlyPhraseView extends View {

   
    
    public FriendlyPhraseView() {
        super();
    }

    @Override
    public void display() {
        
        char selection = ' ';
        do {
            this.setPromptMessage("\n"
            + "\n----------------------------------"
            + "\n| Friendly Phrase                |"
            + "\n ---------------------------------"
            + "\n6 - Move one space"
            + "\n7 - Move two spaces"
            + "\n8 - Move three spaces"
            + "\n9 - Move four spaces"
            + "\n10 - Move five spaces"
            + "\nE - Exit"
            + "\n----------------------------------");
            this.console.println(this.getPromptMessage());
            
            String input = this.getInput();
            
            this.doAction(input);           
        
        } while (selection != 'E');
    }
    
    @Override
    public void doAction(String friendlyphrase) {

        char choice = friendlyphrase.charAt(0);
        switch (choice) {
            case 6:
                this.moveOne();
                break;
            case 7:
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
                ErrorView.display("FriendlyPhraseView", "\n*** Invalid Selection *** Try Again");
                break;
        }
    }
@Override
    public String getInput() {
        boolean valid = false; 
        String input = null;
        
        
        while(!valid) {
            
            this.console.println("Enter number of spaces below:");
            
            try {
                input = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(FriendlyPhraseView.class.getName()).log(Level.SEVERE, null, ex);
            }
            input = input.trim();
            
            try{
            int nInput = Integer.parseInt(input);
            }
            catch(NumberFormatException e){
                                this.console.println("Number can only be 6,7,8,9,10" + e.getMessage());
                continue;
            }
                    if (input.length() > 2) {
                this.console.println("Number can only be 6,7,8,9,10");
                continue;
                
            }
            break;
        }
        return input;
    }
    private void moveOne() {
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
