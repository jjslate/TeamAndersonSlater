/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrek.and.donkey;

import CandJ.shrekanddonkey.model.Player;
import CandJ.shrekanddonkey.view.StartProgramView;

/**
 *
 * @author Jayson
 */
public class ShrekAndDonkey {
    
   private static Game currentGame = null;

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
   private static Player player = null;
   
   
    

    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    }
    
}
