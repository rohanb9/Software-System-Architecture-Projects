package com.gaspumpproj.strategy.action.initializedata;

import com.gaspumpproj.data.DataStore;

/**
 * This is InitializeData action class related to Gas pump 2. 
 * @author borde
 *
 */
public class InitializeDataGP2 extends InitializeData {

	public InitializeDataGP2(DataStore ds) {
	    this.ds = ds;
	}

    @Override
    public void initializeData() {
    	// set the initial values in future
    }
}
