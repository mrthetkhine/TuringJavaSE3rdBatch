/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.ListResourceBundle;

/**
 *
 * @author thetkhine
 */
public class SampleRB extends ListResourceBundle
{

    @Override
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];
        
        resources[0][0] = "title";
        resources[0][1] = "My Program";
        
        resources[1][0] = "StopText";
        resources[1][1] = "Stop";
        
        resources[2][0] = "StartText";
        resources[2][1] = "Start";
        
        return resources;
    }
}
