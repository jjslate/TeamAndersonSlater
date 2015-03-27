/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.control;

import CandJ.shrekanddonkey.exceptions.GameControlException;
import CandJ.shrekanddonkey.exceptions.MapControlException;
import CandJ.shrekanddonkey.model.Game;
import CandJ.shrekanddonkey.model.Location;
import CandJ.shrekanddonkey.model.Map;
import CandJ.shrekanddonkey.model.Obstacle;
import CandJ.shrekanddonkey.model.Player;
import CandJ.shrekanddonkey.model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import shrek.and.donkey.ShrekAndDonkey;

/**
 *
 * @author Jayson
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlException {
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
        Obstacle[] obstacle = new Obstacle[5];
        
        Obstacle tree = new Obstacle();
        tree.setDescription("Tree");
        tree.setLocation("forest");
        obstacle[ListObstacle.tree.ordinal()] = tree;
        
        Obstacle boulder = new Obstacle();
        boulder.setDescription("Boulder");
        boulder.setLocation("forest");
        obstacle[ListObstacle.boulder.ordinal()] = boulder;
        
        Obstacle river = new Obstacle();
        river.setDescription("River");
        river.setLocation("forest");
        obstacle[ListObstacle.river.ordinal()] = river;
        
        Obstacle creature = new Obstacle();
        creature.setDescription("creature");
        creature.setLocation("forest");
        obstacle[ListObstacle.creature.ordinal()] = creature;
        
        Obstacle dragon = new Obstacle();
        dragon.setDescription("Dragon");
        dragon.setLocation("castle");
        obstacle[ListObstacle.dragon.ordinal()] = dragon;
        
        return obstacle;
        
        
    }

    public static void saveGame(Game currentGame, String filepath) {
          throw new GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); 
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
        }
    }
    
    public static void getSavedGAme(String filepath)
            throws GameControlException {
        Game currentGame = null; 
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputSteam output = new ObjectInputStream(fips);
            
            currentGame = (Game) output.readObject();
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        ShrekAndDonkey.setCurrentGame(currentGame);
        }

    public static void getSavedGame(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

         
    }
    public enum ListObstacle {
            tree,
            boulder,
            river,
            creature,
            dragon;
        

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        
    
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[Map.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[Map.SceneType.fight.ordinal()]);
        locations[0][2].setScene(scenes[Map.SceneType.argument.ordinal()]);
        locations[0][3].setScene(scenes[Map.SceneType.trapped.ordinal()]);
        locations[1][0].setScene(scenes[Map.SceneType.dragonfight.ordinal()]);
        locations[1][1].setScene(scenes[Map.SceneType.rescue.ordinal()]);
        locations[1][2].setScene(scenes[Map.SceneType.finish.ordinal()]);
        
            }
        }
 
