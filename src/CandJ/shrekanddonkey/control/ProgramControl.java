
package CandJ.shrekanddonkey.control;

import CandJ.shrekanddonkey.model.Player;
import shrekanddonkey.ShrekAndDonkey;


public class ProgramControl {

    public static Player createPlayer(String playerName) {
        System.out.println("\n**** createPlayer function called ****");
        return null;
        
        if (playerName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playerName);
        
        ShrekAndDonkey.setPlayer(player);
        
        return player;
    }
    
}
