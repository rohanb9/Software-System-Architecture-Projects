package com.gaspumpproj.strategy.action.storepin;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of StorePinGP1 and StorePinGP2. Also, this class is abstract class.
 * This class represents to "StorePin" action which is used to store the pin from the temporary data store.
 * 
 * @author borde
 *
 */
public abstract class StorePin {
	DataStore ds;

    public abstract void storePin();
}
