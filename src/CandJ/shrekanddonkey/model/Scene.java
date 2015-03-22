/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.model;

import java.io.Serializable;
import java.util.Objects;

import javax.swing.ImageIcon;

/**
 *
 * @author Owner
 */
public class Scene implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 7428008971531878478L;

	public Scene() {
    }
    
    private String explored;
    private String description;

    public String getExplored() {
        return explored;
    }

    public void setExplored(String explored) {
        this.explored = explored;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
        return true;
    }

	public void setMapSymbol(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setBlocked(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setTravelTime(double i) {
		// TODO Auto-generated method stub
		
	}

	public void setIcon(ImageIcon startingSceneImage) {
		// TODO Auto-generated method stub
		
	}
    
    
    
}
