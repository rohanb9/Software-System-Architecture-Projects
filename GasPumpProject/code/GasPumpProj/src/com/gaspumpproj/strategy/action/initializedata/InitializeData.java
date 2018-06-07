package com.gaspumpproj.strategy.action.initializedata;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of InitialDataGP1 and InitialDataGP2. Also, this class is abstract class.
 * This class represents to "InitialData" action which is used to set the value of price to 0.
 * 
 * @author borde
 *
 */
public abstract class InitializeData {
	DataStore ds;
	
    public abstract void initializeData();
}
