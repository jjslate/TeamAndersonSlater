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
        // created array(list) of obstacles
        Obstacle obstacle = new Obstacle[5]
        
        Obstacle tree = new Obstacle();
        tree.setDescription("Tree");
        tree.setLocation(Forest);
        obstacle[ListObstacle.tree.ordinal()] = tree;
        
        Obstacle boulder = new Obstacle();
        boulder.setDescription("Boulder");
        boulder.setLocation(Forest);
        obstacle[ListObstacle.boulder.ordinal()] = boulder;
        
        Obstacle river = new Obstacle();
        river.setDescription("River");
        river.setLocation(Forest);
        obstacle[ListObstacle.river.ordinal()] = river;
        
        Obstacle creature = new Obstacle();
        creature.setDescription("creature");
        creature.setLocation(Forest);
        obstacle[ListObstacle.creature.ordinal()] = creature;
        
        Obstacle dragon = new Obstacle();
        dragon.setDescription("Dragon");
        dragon.setLocation(Castle);
        obstacle[ListObstacle.dragon.ordinal()] = dragon;
        
        return obstacle;
        
        
    }
    public enum ListObstacle {
            tree,
            boulder,
            river,
            creature,
            dragon;
        }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

