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
    public double calcShrekAnger(double annoyingPhrase) {
        double currentMood = 5;
        double anger = currentMood + annoyingPhrase;
        
        if (annoyingPhrase > 0) {
            return -1;
        }
        if (anger > 5) {
            return -1;
        }
        
        return anger;
    }
}
