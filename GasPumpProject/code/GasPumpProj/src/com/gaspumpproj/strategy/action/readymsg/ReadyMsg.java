package com.gaspumpproj.strategy.action.readymsg;

import com.gaspumpproj.data.DataStore;


/**
 * Here, I have used Strategy Pattern.
 * This is the super class of ReadyMsgGP1 and ReadyMsgGP2. Also, this class is abstract class.
 * This class represents to "ReadyMsg" action which is used to displays the ready for pumping message.
 * 
 * @author borde
 *
 */

public abstract class ReadyMsg {
	
	public abstract void readyMsg();
}