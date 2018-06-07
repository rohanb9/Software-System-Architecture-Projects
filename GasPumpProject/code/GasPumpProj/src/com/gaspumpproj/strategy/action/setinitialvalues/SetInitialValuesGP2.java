package com.gaspumpproj.strategy.action.setinitialvalues;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is SetInitialValues action class related to Gas pump 2. 
 * @author borde
 *
 */
public class SetInitialValuesGP2 extends SetInitialValues {

	public SetInitialValuesGP2(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void setInitialValues() {
    	// set L and total to 0;
        DataStoreGP2 data = (DataStoreGP2) ds;
        data.L = 0;
        data.total = 0;
    }
}
