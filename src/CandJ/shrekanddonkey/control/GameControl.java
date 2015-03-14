/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.control;

import CandJ.shrekanddonkey.model.Player;

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
    
    Obstacle[] obstacle = new Obstacle();
    game.setObstacle(obstacle);
    
    Map map = MapControl.createMap();
    game.setMap(map);
      
    }
    
}
