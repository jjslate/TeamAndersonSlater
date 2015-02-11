/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.control;

/**
 *
 * @author Jayson
 */
public class PhraseControl {
    public double calcShrekHappiness(double friendlyPhrase) {
        double currentMood = 5;
        double happiness = currentMood + friendlyPhrase;
        
        if (friendlyPhrase < 5) {
                return -1;
    }
        if (happiness < 10) {
            return -1;
        }
       
        
        return happiness;
    }
}
