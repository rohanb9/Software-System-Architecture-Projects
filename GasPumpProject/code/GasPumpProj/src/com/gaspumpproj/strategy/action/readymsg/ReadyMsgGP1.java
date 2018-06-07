package com.gaspumpproj.strategy.action.readymsg;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;


/**
 * This is ReadyMsg action class related to Gas pump 1. 
 * @author borde
 *
 */

public class ReadyMsgGP1 extends ReadyMsg {

    @Override
    public void readyMsg() {
    	// Display Message
        System.out.println("All set. Ready to dispense fuel..");
        System.out.println("Press key #b to dispense 1 gallon fuel");
        System.out.println("Press key #c to stop");
    }
}
