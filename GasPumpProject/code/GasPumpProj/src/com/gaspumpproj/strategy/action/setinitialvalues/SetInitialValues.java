package com.gaspumpproj.strategy.action.setinitialvalues;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of SetInitialValuesGP1 and SetInitialValuesGP2. Also, this class is abstract class.
 * This class represents to "SetInitialValues" action which is used to set G (or L) and total to 0.
 * 
 * @author borde
 *
 */
public abstract class SetInitialValues {
	DataStore ds;
	
    public abstract void setInitialValues();
}
