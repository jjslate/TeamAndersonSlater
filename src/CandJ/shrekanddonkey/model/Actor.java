/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.model;

import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Jayson
 */
public enum Actor implements Serializable {
    
    Shrek("He is an ogre on a quest to have his swamp back."),
    Donkey("Shreks conpanion on the adventure."),
    Farquad("The Lord who sent Shrek on his quest."),
    Fiona("The Princess that Lord Farquad sent Shrek to save."),
    Dragon("Guards the castle of Princess Fiona.");
    
    private final String description;
    private final Point coordinates;

  Actor(String description) {
            this.description = description;
            coordinates = new Point(1,1);
    }
  public String getDescription() {
      return description;
  }
  public Point getCoordinates() {
      return coordinates;
  }
}   
     