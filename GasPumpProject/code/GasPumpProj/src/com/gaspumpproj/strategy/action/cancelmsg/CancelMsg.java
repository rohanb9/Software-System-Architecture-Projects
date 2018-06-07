package com.gaspumpproj.strategy.action.cancelmsg;
/**
 * Here, I have used Strategy Pattern.
 * This is the super class of CancelMsgGP1 and CancelMsgGP2. Also, this class is abstract class.
 * This class represents to "CancelMsg" action which is used to displays a cancellation message.
 * 
 * In this case, i have created two action strategy subclasses (CancelMsgGP1 and CancelMsgGP2) 
 * each one separately for each gas pump class by considering future modifications.  
 * 
 * @author borde
 *
 */

public abstract class CancelMsg {
    public abstract void cancelMsg();
}
