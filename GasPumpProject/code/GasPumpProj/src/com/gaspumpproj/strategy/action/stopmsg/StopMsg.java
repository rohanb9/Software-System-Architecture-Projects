package com.gaspumpproj.strategy.action.stopmsg;
/**
 * Here, I have used Strategy Pattern.
 * This is the super class of StopMsgGP1 and StopMsgGP2. Also, this class is abstract class.
 * This class represents to "StopMsg" action which is used to stop pump message and receipt msg (optionally).
 * 
 * In this case, i have created two action strategy subclasses (StopMsgGP1 and StopMsgGP2) 
 * each one separately for each gas pump class by considering future modifications.  
 * 
 * @author borde
 *
 */
public abstract class StopMsg {

    public abstract void stopMsg();
}
