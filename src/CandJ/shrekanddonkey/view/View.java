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
}
