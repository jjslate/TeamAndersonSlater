/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.control;

import CandJ.shrekanddonkey.model.Game;
import CandJ.shrekanddonkey.model.Map;
import CandJ.shrekanddonkey.model.Obstacle;
import CandJ.shrekanddonkey.model.Player;
import CandJ.shrekanddonkey.model.Scene;
import shrekanddonkey.ShrekAndDonkey;

/**
 *
 * @author Jayson
 */
public class GameControl {

    public static void createNewGame(Player player) {
    System.out.println("*** createNewGame in GameControl called ***");
    
    Game game = new Game();
    ShrekAndDonkey.setCurrentGame(game);
    
    game.setPlayer(player);
    
        Obstacle obstacle = new Obstacle();
    game.setObstacle(obstacle);
    
    Map map = MapControl.createMap();
    game.setMap(map);
      
    }
    public static Obstacle[] createObstacle() {
        System.out.println("*** called createObstacle() in GameControl ***");
        return null;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

