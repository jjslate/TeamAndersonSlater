/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.model;

import CandJ.shrekanddonkey.control.GameControl;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Owner
 */
public class Map implements Serializable{

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int noOfRows;
    private int noOfColumn;
    private Location[][] location;
    
    private static Map createMap() {
        Map map = new Map(20, 20);
        Scene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }
    
    private String rowNumber;
    private double columnNumber;

    private Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
    
}
