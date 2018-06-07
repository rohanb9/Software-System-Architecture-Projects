package com.gaspumpproj.strategy.action.paymsg;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of PayMsgGP1 and PayMsgGP2. Also, this class is abstract class.
 * This class represents to "PayMsg" action which is used to display a type of payment method.
 * 
 * @author borde
 *
 */
public abstract class PayMsg {
	
    public abstract void payMsg();
}
