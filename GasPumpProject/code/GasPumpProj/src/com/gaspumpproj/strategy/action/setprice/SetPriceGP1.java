package com.gaspumpproj.strategy.action.setprice;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;

/**
 * This is SetPrice action class related to Gas pump 1. 
 * 
 * @author borde
 *
 */
public class SetPriceGP1 extends SetPrice {

    public SetPriceGP1(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void setPrice(int g, int m) {
    	// set the price for the gas identified by g identifier as in SelectGas(int g); 
    	// if M=1, the price may be increased
        DataStoreGP1 data = (DataStoreGP1) ds;
        String gType = "";
        if (g == 1) { 
        	// Regular 
        	data.price = data.Rprice;
        	gType = "Regular";
        } else if (g == 4) { 
        	// Diesel 
        	data.price = data.Dprice;
        	gType = "Diesel";
        }
        System.out.println("Selected Gas Type : " + gType);
        System.out.println("Press key #a to start the pump..");
    }
}
