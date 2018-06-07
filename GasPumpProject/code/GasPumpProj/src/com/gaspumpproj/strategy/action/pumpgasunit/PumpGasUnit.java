package com.gaspumpproj.strategy.action.pumpgasunit;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of PumpGasUnitGP1 and PumpGasUnitGP2. Also, this class is abstract class.
 * This class represents to "PumpGasUnit" action which is used to dispose unit of gas and counts # of units disposed.
 * 
 * @author borde
 *
 */
public abstract class PumpGasUnit {
	DataStore ds;

    public abstract void pumpGasUnit();
}
