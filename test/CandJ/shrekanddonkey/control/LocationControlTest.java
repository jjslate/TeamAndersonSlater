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
 * @author Owner
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }

    /**
     * Test of clacLocation method, of class LocationControl.
     */
    @Test
    public void testClacLocation() {
        System.out.println("clacLocation");
        double longitude = 1.0;
        double latitude = 5.0;
        LocationControl instance = new LocationControl();
        double expResult = 6.0;
        double result = instance.clacLocation(longitude, latitude);
        assertEquals(expResult, result, 0.0);
    }
    
}
