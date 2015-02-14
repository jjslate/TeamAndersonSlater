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
public class LocationControl {
    public double clacLocation(double longitude, double latitude) {
        double location = longitude + latitude;
        if (longitude < 1) {
            return -1;
                    }
        if (latitude < 1) {
            return -1;
        }
        return location;
    }
}
