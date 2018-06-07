package com.gaspumpproj.strategy.action.pumpgasunit;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;


/**
 * This is PumpGasUnit action class related to Gas pump 2. 
 * @author borde
 *
 */
public class PumpGasUnitGP2 extends PumpGasUnit {

	public PumpGasUnitGP2(DataStore ds) {
	    this.ds = ds;
	}

    @Override
    public void pumpGasUnit() {
        
        // disposes unit of gas and counts # of units disposed
        DataStoreGP2 data = (DataStoreGP2) ds;
       
        // Do processing
        data.L = data.L + 1;
        data.total = data.price * data.L;
    }
}
