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
public class SaveGameView extends View {
    public SaveGameView(String promptMessage) {
		super(promptMessage);
		
	}

	private final String MENU = "\n"
            + "\n------------------------"
            + "\n| Save Game                 |"
            + "\nY - Yes"
            + "\nN - No"
            + "\nE - Exit"
            + "\n------------------------";

public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            String selectionString = String.valueOf(selection);
            this.doAction(selectionString);           
        
        } while (selection != 'E');
        
}

@Override
public void doAction(String value) {
	
}
}


