/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.view;

import java.io.PrintWriter;
import shrek.and.donkey.ShrekAndDonkey;
import static sun.security.krb5.KrbException.errorMessage;

/**
 *
 * @author Jayson
 */
public class ErrorView {
    private static final PrintWriter errorFile = ShrekAndDonkey.getOutFile();
    private static final PrintWriter logFile = ShrekAndDonkey.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                        "-------------------------------------------"
                        + "\n- ERROR - " + errorMessage
                        + "\n--------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
