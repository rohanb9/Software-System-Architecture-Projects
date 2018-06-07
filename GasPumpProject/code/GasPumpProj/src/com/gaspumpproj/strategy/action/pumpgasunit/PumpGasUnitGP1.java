package com.gaspumpproj.strategy.action.pumpgasunit;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;


/**
 * This is PumpGasUnit action class related to Gas pump 1. 
 * @author borde
 *
 */
public class PumpGasUnitGP1 extends PumpGasUnit {

	 public PumpGasUnitGP1(DataStore ds) {
	        this.ds = ds;
	    }

    @Override
    public void pumpGasUnit() {
    	// disposes unit of gas and counts # of units disposed
        DataStoreGP1 data = (DataStoreGP1) ds;
        // Do processing
        data.G = data.G + 1;
        data.total = data.price * data.G;
    }
}
