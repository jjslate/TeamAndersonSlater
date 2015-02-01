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
    private String row;
    private String column;
    private String explored;
    private String unexplored;

    public Location() {
    }
    
    

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
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
     
    
}

