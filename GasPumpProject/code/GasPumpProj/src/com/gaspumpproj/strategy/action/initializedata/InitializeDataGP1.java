package com.gaspumpproj.strategy.action.initializedata;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;

/**
 * This is InitializeData action class related to Gas pump 1. 
 * @author borde
 *
 */
public class InitializeDataGP1 extends InitializeData {

	public InitializeDataGP1(DataStore ds) {
	    this.ds = ds;
	}

    @Override
    public void initializeData() {
    	// set the value of price to 0
        DataStoreGP1 data = (DataStoreGP1) ds;
        data.price = 0;
    }
}
