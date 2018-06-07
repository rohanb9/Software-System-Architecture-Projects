package com.gaspumpproj.strategy.action.returncash;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is ReturnCash action class related to Gas pump 2. 
 * 
 * @author borde
 *
 */
public class ReturnCashGP2 extends ReturnCash {

	public ReturnCashGP2(DataStore ds) {
	     this.ds = ds;
	}
    
    @Override
    public void returnCash() {
    	// returns the remaining cash
        DataStoreGP2 data = (DataStoreGP2) ds;
        float creturn = data.cash - data.total;
        if (creturn > 0) {
            System.out.println("Calculated cash return: $" + creturn);
            System.out.println("Returning $" + creturn);
        } else {
            System.out.println("No cash to return");
        }
        data.cash = 0;
        System.out.println("Thanks for using gas pump #2. \nTransaction completed successfully..");
    }
}
