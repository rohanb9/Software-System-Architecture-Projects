package com.gaspumpproj.strategy.action.storeprices;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is StorePrices action class related to Gas pump 2. 
 * 
 * @author borde
 *
 */
public class StorePricesGP2 extends StorePrices {

	public StorePricesGP2(DataStore ds) {
	    this.ds = ds;
	}

    @Override
    public void storePrices() {
    	// stores initial prices
    	// stores price(s) for the gas from the temporary data store
    	DataStoreGP2 data = (DataStoreGP2) ds;
    	data.Rprice = data.temp_b;
    	data.Pprice = data.temp_c;
    	data.Sprice = data.temp_a;
        System.out.println("Gas Pump #2 activated successfully!!!");
    }
}
