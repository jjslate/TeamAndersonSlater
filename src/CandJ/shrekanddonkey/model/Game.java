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
public class Game implements Serializable {

    public Game() {
    }
    
    private String totaltime;

    public String getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(String totaltime) {
        this.totaltime = totaltime;
    }

    @Override
    public String toString() {
        return "Game{" + "totaltime=" + totaltime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.totaltime);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.totaltime, other.totaltime)) {
            return false;
        }
        return true;
    }
    
    
    
}
