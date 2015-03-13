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
public class LocationsView extends View {
    private final String MENU = "\n"
            + "\n----------------------------------"
            + "\n| Locations                       |"
            + "\n ---------------------------------"
            + "\nF - Forest"
            + "\nC - Farquad Castle"
            + "\nD - Dragon Castle"
            + "\nS - Swamp"
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

