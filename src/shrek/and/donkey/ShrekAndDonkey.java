/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrek.and.donkey;

import CandJ.shrekanddonkey.exceptions.MapControlException;
import CandJ.shrekanddonkey.model.Game;
import CandJ.shrekanddonkey.model.Player;
import CandJ.shrekanddonkey.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Jayson
 */
public class ShrekAndDonkey {
    
   private static Game currentGame = null;
   private static Player player = null;
   
   private static PrintWriter outFile = null;
   private static BufferedReader inFile = null;
   
   private static PrintWriter logFile = null;

   
   public static void main(String[] args) throws MapControlException {
       // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
       try {
           // open stream files for end user input and output
           ShrekAndDonkey.inFile = 
                   new BufferedReader(new InputStreamReader(System.in));
           
           ShrekAndDonkey.outFile = new PrintWriter(System.out, true);
           
           // open log
           String filePath = "log.txt";
           ShrekAndDonkey.logFile = new PrintWriter(filePath);
       } catch (Exception e) {
                System.out.println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
   }
       finally {
        try {
          if (ShrekAndDonkey.inFile != null)
              ShrekAndDonkey.inFile.close();
          
          if (ShrekAndDonkey.outFile != null)
           ShrekAndDonkey.outFile.close();
          
          if (ShrekAndDonkey.logFile != null)
              ShrekAndDonkey.outFile.close();
       } catch (IOException ex) {
               System.out.println("Error closing files");
               return;
               }
       }
   }
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ShrekAndDonkey.outFile = outFile;
    }
   

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ShrekAndDonkey.inFile = inFile;
    }
    
     public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ShrekAndDonkey.logFile = logFile;
    }
   
   
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ShrekAndDonkey.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ShrekAndDonkey.player = player;
    }
   
}
