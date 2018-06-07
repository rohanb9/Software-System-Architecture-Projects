package com.gaspumpproj.strategy.action.setprice;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is SetPrice action class related to Gas pump 2. 
 * 
 * @author borde
 *
 */
public class SetPriceGP2 extends SetPrice {

    public SetPriceGP2(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void setPrice(int g, int m) {
        // set the price for the gas identified by g identifier as in SelectGas(int g); 
    	// if M=1, the price may be increased
        DataStoreGP2 data = (DataStoreGP2) ds;
        String gType = "";
        if (g == 1) { 
        	// Regular 
        	data.price = data.Rprice;
        	gType = "Regular";
        } else if (g == 2) { 
        	// Super 
        	data.price = data.Sprice;
        	gType = "Super";
        } else if (g == 3) { 
        	// Premium 
        	data.price = data.Pprice;
        	gType = "Premium";
        }
        
        System.out.println("Selected Gas Type : " + gType);
        System.out.println("Press key #9 to start the pump..");
        
        if(m == 1) {
        	data.price=(float) (1.1*data.price);
        	System.out.println("Note: Price increased -> price=1.1*price.");
        }
    }
}
