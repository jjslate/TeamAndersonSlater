/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.model;

import CandJ.shrekanddonkey.control.GameControl;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Objects;

import javax.swing.ImageIcon;

import shrek.and.donkey.ShrekAndDonkey;
import CandJ.shrekanddonkey.control.*;
import CandJ.shrekanddonkey.exceptions.MapControlException;

/**
 *
 * @author Owner
 */
public class Map implements Serializable{
   
    /**
	 * 
	 */
	private static final long serialVersionUID = -3073490864606677619L;

	public enum SceneType {
        start,
        fight,
        argument,
        trapped,
        dragonfight,
        rescue,
        finish;
    }
   
    private int noOfRows;
    private int noOfColumn;
    private Location[][] location;
	private String rowNumber;
	private double columnNumber;
   

    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumn = noOfColumns;

        //create 2-D array for location
        this.location = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                //create and initialize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                // assign the Location object to the current position in array
                this.location[row][column] = location;

        }
    }
}

    public String getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(String rowNumber) {
        this.rowNumber = rowNumber;
    }

    public double getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(double columnNumber) {
        this.columnNumber = columnNumber;
    }

    @Override
    public String toString() {
        return "Map{" + "rowNumber=" + rowNumber + ", columnNumber=" + columnNumber + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.rowNumber);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.columnNumber) ^ (Double.doubleToLongBits(this.columnNumber) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowNumber, other.rowNumber)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnNumber) != Double.doubleToLongBits(other.columnNumber)) {
            return false;
        }
        return true;
    }

	public Location[][] getLocations() {
		// TODO Auto-generated method stub
		return null;
	}
	
    public static Scene[] createScenes() throws MapControlException  {
	       BufferedImage image = null;
	       
	       Game game = ShrekAndDonkey.getCurrentGame();
	       
	       Scene[] scenes = new Scene[SceneType.values().length];
	       
	       Scene startingScene = new Scene();
	       startingScene.setDescription("\nLord Farquad has just commanded that you(Donkey) and Shrek "
	                                    + "go and rescue the Princess Fiona who is trapped in a castle "
	                                    + "far away. Here your journey begins at the entrance to the forest");
	       startingScene.setMapSymbol(" ST ");
	       startingScene.setBlocked(false);
	       startingScene.setTravelTime(240);
	       ImageIcon startingSceneImage = MapControl.getImage(startingScene,
	                    "C:\\Users\\Jayson\\Documents\\CIT 260\\ShrekandDonkeyForest.jpg");
	       startingScene.setIcon(startingSceneImage);
	       scenes[SceneType.start.ordinal()] = startingScene;
	       
	       Scene finishScene = new Scene();
	       finishScene.setDescription("\nCongratulations! You have rescued Princess Fiona."
	                                    + "On your way returning to Lord Farquad the Princess and Shrek"
	                                    + " fell in love. (Of course it only helped that Fiona "
	                                    + "actually transformed into an Ogre because she was cursed).");
	       finishScene.setMapSymbol(" FN ");
	       finishScene.setBlocked(false);
	       finishScene.setTravelTime(Double.POSITIVE_INFINITY);
	       ImageIcon finishSceneImage = MapControl.getImage(finishScene,
	                    "C:\\Users\\Jayson\\Documents\\CIT 260\\ShrekandFionaMarried.jpg");
	                    finishScene.setIcon(finishSceneImage);
	       scenes[SceneType.finish.ordinal()] = finishScene;
               return scenes;
	    }
	   
	   public static Map createMap() throws MapControlException {
	        Map map = new Map(20, 20);
	        Scene[] scenes = createScenes();
	        GameControl.assignScenesToLocations(map, scenes);
	        return map;
	    }
    
    
    
}
