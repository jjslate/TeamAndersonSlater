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
public class Location implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6873334917740756591L;
	private int row;
    private int column;
    private String explored;
    private String unexplored;

    public Location() {
    }
    
    

    public int getRow() {
        return row;
    }

    public void setRow(int row2) {
        this.row = row2;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column2) {
        this.column = column2;
    }

    public String getExplored() {
        return explored;
    }

    public void setExplored(String explored) {
        this.explored = explored;
    }

    public String getUnexplored() {
        return unexplored;
    }

    public void setUnexplored(String unexplored) {
        this.unexplored = unexplored;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", explored=" + explored + ", unexplored=" + unexplored + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.row);
        hash = 13 * hash + Objects.hashCode(this.column);
        hash = 13 * hash + Objects.hashCode(this.explored);
        hash = 13 * hash + Objects.hashCode(this.unexplored);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.explored, other.explored)) {
            return false;
        }
        if (!Objects.equals(this.unexplored, other.unexplored)) {
            return false;
        }
        return true;
    }



	public void setScene(Scene scene) {
		// TODO Auto-generated method stub
		
	}



	public void setVisited(boolean b) {
		// TODO Auto-generated method stub
		
	}
     
    
}

