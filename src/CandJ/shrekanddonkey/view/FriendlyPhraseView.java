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
public class FriendlyPhraseView extends View {

   

    private String promptMessage;
    
    public FriendlyPhraseView(String promptMessage) {
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
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
@Override
    public String getInput() {
        boolean valid = false; 
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Enter number of spaces below:");
            
            input = keyboard.nextLine();
            input = input.trim();
            
            try{
            int nInput = Integer.parseInt(input);
            }
            catch(NumberFormatException e){
                                System.out.println("Number can only be 6,7,8,9,10" + e.getMessage());
                continue;
            }
                    if (input.length() > 2) {
                System.out.println("Number can only be 6,7,8,9,10");
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
