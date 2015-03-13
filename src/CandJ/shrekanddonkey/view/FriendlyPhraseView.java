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

    @Override
    public void doAction(String friendlyphrase) {

        char choice = friendlyphrase.charAt(0);
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
