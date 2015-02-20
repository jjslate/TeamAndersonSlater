
package CandJ.shrekanddonkey.control;

import CandJ.shrekanddonkey.model.Player;
import shrekanddonkey.ShrekAndDonkey;


public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        ShrekAndDonkey.setPlayer(player);
        
        return player;
    }
    
}
