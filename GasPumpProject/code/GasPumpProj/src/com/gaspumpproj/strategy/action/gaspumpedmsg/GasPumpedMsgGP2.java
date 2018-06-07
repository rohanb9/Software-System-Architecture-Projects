package com.gaspumpproj.strategy.action.gaspumpedmsg;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is GasPumpedMsg action class related to Gas pump 2. 
 * @author borde
 *
 */
public class GasPumpedMsgGP2 extends GasPumpedMsg {

    public GasPumpedMsgGP2(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void gasPumpedMsg() {
        
        // displays the amount of disposed gas
    	DataStoreGP2 data = (DataStoreGP2) ds;
        System.out.println("Total number of liters pumped: " + data.L);
        System.out.println("Total price: " + data.total);
    }
}
