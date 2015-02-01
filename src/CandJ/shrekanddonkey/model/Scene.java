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
 * @author Owner
 */
public class Scene implements Serializable{

    public Scene() {
    }
    
    private String explored;
    private double description;

    public String getExplored() {
        return explored;
    }

    public void setExplored(String explored) {
        this.explored = explored;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Scene{" + "explored=" + explored + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.explored);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.description) ^ (Double.doubleToLongBits(this.description) >>> 32));
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.explored, other.explored)) {
            return false;
        }
        if (Double.doubleToLongBits(this.description) != Double.doubleToLongBits(other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
