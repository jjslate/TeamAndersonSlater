/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public abstract class View implements ViewInterface {

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    private String promptMessage;

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
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
    public String getInput() {
        
        boolean valid = false; 
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            
            System.out.println("Enter Command");
            
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
}
