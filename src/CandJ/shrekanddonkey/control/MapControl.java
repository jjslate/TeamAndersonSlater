/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.control;

import javax.swing.ImageIcon;

import CandJ.shrekanddonkey.exceptions.MapControlException;
import CandJ.shrekanddonkey.model.Map;
import CandJ.shrekanddonkey.model.Scene;

/**
 *
 * @author Jayson
 */
public class MapControl {

    static Map createMap() throws MapControlException {
    	 Map map = new Map(20, 20);
         Scene[] scenes = Map.createScenes();
         GameControl.assignScenesToLocations(map, scenes);
         return map; }
    
    public static ImageIcon getImage(Scene scene, String string){
		return null;
    	
    }
    
}
