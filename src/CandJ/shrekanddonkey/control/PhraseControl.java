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
    public double calcShrekHappiness(double friendlyPhrase, double currentMood, double Happiness) {
        currentMood = 5;
        if (friendlyPhrase < 5) {
                return -1;
    }
        if (Happiness < 10) {
            return -1;
        }
        Happiness = currentMood + friendlyPhrase;
        
        return Happiness;
    }
}
