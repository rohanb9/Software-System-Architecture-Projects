package com.gaspumpproj.strategy.action.setinitialvalues;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;

/**
 * This is SetInitialValues action class related to Gas pump 1. 
 * @author borde
 *
 */
public class SetInitialValuesGP1 extends SetInitialValues {

	public SetInitialValuesGP1(DataStore ds) {
	    this.ds = ds;
	}

    @Override
    public void setInitialValues() {
    	// set G and total to 0;
        DataStoreGP1 data = (DataStoreGP1) ds;
        data.G = 0;
        data.total = 0;
    }
}
