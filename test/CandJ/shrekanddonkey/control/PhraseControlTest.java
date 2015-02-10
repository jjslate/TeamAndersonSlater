/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jayson
 */
public class PhraseControlTest {
    
    public PhraseControlTest() {
    }

    /**
     * Test of calcShrekHappiness method, of class PhraseControl.
     */
    @Test
    public void testCalcShrekHappiness() {
        System.out.println("calcShrekHappiness");
        double friendlyPhrase = 6;
        double currentMood = 5;
        double Happiness = 10;
        PhraseControl instance = new PhraseControl();
        double expResult = 11;
        double result = instance.calcShrekHappiness(friendlyPhrase, currentMood, Happiness);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
