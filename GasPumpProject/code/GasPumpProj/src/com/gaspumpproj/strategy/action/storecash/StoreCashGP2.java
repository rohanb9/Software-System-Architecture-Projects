package com.gaspumpproj.strategy.action.storecash;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is StoreCash action class related to Gas pump 2. 
 * 
 * @author borde
 *
 */
public class StoreCashGP2 extends StoreCash {

    public StoreCashGP2(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void storeCash() {
    	// stores cash from the temporary data store
        DataStoreGP2 data = (DataStoreGP2) ds;
        data.cash = data.temp_cash;
        System.out.println("Cash added to system $" + data.cash + " successfully..");
    }
}
