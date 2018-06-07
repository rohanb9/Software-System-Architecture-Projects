package com.gaspumpproj.strategy.action.readymsg;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;
import com.gaspumpproj.data.DataStoreGP2;


/**
 * This is ReadyMsg action class related to Gas pump 2. 
 * @author borde
 *
 */

public class ReadyMsgGP2 extends ReadyMsg {

    @Override
    public void readyMsg() {
       	// Display Message
        System.out.println("All set. Ready to dispense fuel..");
        System.out.println("Press key #a to dispense 1 liter fuel");
        System.out.println("Press key #b to stop");
    }
}
