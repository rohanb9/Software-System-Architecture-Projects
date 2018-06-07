package com.gaspumpproj.strategy.action.storeprices;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;


/**
 * This is StorePrices action class related to Gas pump 1. 
 * 
 * @author borde
 *
 */
public class StorePricesGP1 extends StorePrices {
	
	public StorePricesGP1(DataStore ds) {
	    this.ds = ds;
	}

    @Override
    public void storePrices() {
    	// stores initial prices
    	// stores price(s) for the gas from the temporary data store
    	DataStoreGP1 data = (DataStoreGP1) ds;
    	data.Rprice = data.temp_a;
    	data.Dprice = data.temp_b;
        System.out.println("Gas Pump #1 activated successfully!!!");
    }
}
