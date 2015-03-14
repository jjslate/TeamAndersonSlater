/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Jayson
 */
public enum Actor implements Serializable {
    
    Shrek("He is an ogre on a quest to have his swamp back."),
    Donkey("Shreks conpanion on the adventure."),
    Lord Farquad("The Lord who sent Shrek on his quest."),
    Fiona("The Princess that Lord Farquad sent Shrek to save."),
    Dragon("Gaurds the castle of Princess Fiona.");
    
    private final String description;
    private final Point coordinates;
    
    public Actor() {

        Actors(String description)
            this.description = description;
            coordinates = new Point(1,1);
}
    
    @Override
    public String toString() {
        return "Actor{" + "name=" + name + '}';
    }