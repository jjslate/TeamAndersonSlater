/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import CandJ.shrekanddonkey.exceptions.MapControlException;

/**
 *
 * @author Owner
 */
public interface ViewInterface {
    
    public void display() throws MapControlException;
    public String getInput();
    public void doAction(String value) throws MapControlException;
    
}
