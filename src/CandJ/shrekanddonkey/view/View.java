/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import shrek.and.donkey.ShrekAndDonkey;

/**
 *
 * @author Owner
 */
public abstract class View implements ViewInterface {

    private String message;

    protected final BufferedReader keyboard = ShrekAndDonkey.getInFile();
    protected final PrintWriter console = ShrekAndDonkey.getOutFile();

    public View() {
        super();
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

            this.console.println(promptMessage);

            String input = this.getInput();

            this.doAction(input);

        } while (selection != 'E');
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String input = null;

        while (!valid) {

            this.console.println("Enter Command");

            try {
                input = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            input = input.trim();

            if (input.length() < 2) {
                ErrorView.display("View", "Invalid name - the name must not be blank");
                continue;

            }
            break;
        }
        return input;
    }
}
