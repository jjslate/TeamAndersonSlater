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
        double friendlyPhrase = 4.0;
        PhraseControl instance = new PhraseControl();
        double expResult = 11.0;
        double result = instance.calcShrekHappiness(friendlyPhrase);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
