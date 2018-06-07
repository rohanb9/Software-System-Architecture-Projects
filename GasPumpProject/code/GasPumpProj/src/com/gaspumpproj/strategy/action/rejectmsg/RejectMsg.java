package com.gaspumpproj.strategy.action.rejectmsg;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of RejectMsgGP1 and RejectMsgGP2. Also, this class is abstract class.
 * This class represents to "RejectMsg" action which is used to display credit card not approved message.
 * 
 * In this case, i have created two action strategy subclasses (RejectMsgGP1 and RejectMsgGP2) 
 * each one separately for each gas pump class by considering future modifications.
 * 
 * @author borde
 *
 */
public abstract class RejectMsg {

    public abstract void rejectMsg();
}
