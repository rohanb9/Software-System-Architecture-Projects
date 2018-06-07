package com.gaspumpproj.strategy.action.gaspumpedmsg;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of GasPumpedMsgGP1 and GasPumpedMsgGP2. Also, this class is abstract class.
 * This class represents to "GasPumpedMsg" action which is used to display the amount of disposed gas.
 * 
 * @author borde
 *
 */
public abstract class GasPumpedMsg {
	DataStore ds;

    public abstract void gasPumpedMsg();
}
