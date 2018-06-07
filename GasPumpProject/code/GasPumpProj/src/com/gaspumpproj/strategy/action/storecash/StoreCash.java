package com.gaspumpproj.strategy.action.storecash;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of StoreCashGP1 and StoreCashGP2. Also, this class is abstract class.
 * This class represents to "StoreCash" action which is used to store cash from the temporary data store.
 * 
 * @author borde
 *
 */
public abstract class StoreCash {
	DataStore ds;

    public abstract void storeCash();
}
