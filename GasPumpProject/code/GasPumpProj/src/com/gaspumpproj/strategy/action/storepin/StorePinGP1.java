package com.gaspumpproj.strategy.action.storepin;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;

/**
 * This is StorePin action class related to Gas pump 1. 
 * 
 * @author borde
 *
 */
public class StorePinGP1 extends StorePin {

	public StorePinGP1(DataStore ds) {
        this.ds = ds;
    }
	
    @Override
    public void storePin() {
    	// stores pin from the temporary data store
        DataStoreGP1 data = (DataStoreGP1) ds;
        data.pin = data.temp_p;
        System.out.println("Pin has been saved successfully..");
    }
}
