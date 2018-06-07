package com.gaspumpproj.strategy.action.gaspumpedmsg;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;
import com.gaspumpproj.data.DataStoreGP2;


/**
 * This is GasPumpedMsg action class related to Gas pump 1. 
 * @author borde
 *
 */
public class GasPumpedMsgGP1 extends GasPumpedMsg {

    public GasPumpedMsgGP1(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void gasPumpedMsg() {
    	// displays the amount of disposed gas
    	DataStoreGP1 data = (DataStoreGP1) ds;
        System.out.println("Total number of gallons pumped: " + data.G);
        System.out.println("Total price: " + data.total);
    }

}
