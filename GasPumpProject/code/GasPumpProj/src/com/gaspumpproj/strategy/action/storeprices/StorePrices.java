package com.gaspumpproj.strategy.action.storeprices;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of StorePricesGP1 and StorePricesGP2. Also, this class is abstract class.
 * This class represents to "StorePrices" action which is used to stores price(s) for the gas from the temporary data store.
 * 
 * @author borde
 *
 */
public abstract class StorePrices {
	DataStore ds;

    public abstract void storePrices();
}
