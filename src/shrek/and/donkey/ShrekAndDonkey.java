/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrek.and.donkey;

import CandJ.shrekanddonkey.model.Player;

/**
 *
 * @author Jayson
 */
public class ShrekAndDonkey {
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintsone");
        playerOne.setHighScore(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
