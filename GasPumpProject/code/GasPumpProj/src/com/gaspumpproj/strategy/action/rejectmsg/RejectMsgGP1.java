package com.gaspumpproj.strategy.action.rejectmsg;

/**
 * This is RejectMsg action class related to Gas pump 1. 
 * @author borde
 *
 */
public class RejectMsgGP1 extends RejectMsg {

    @Override
    public void rejectMsg() {
    	// displays credit card not approved message
        System.out.println("Credit card has been rejected.");
        System.out.println("Transaction has been cancelled for gas pump #1..");
    }
}
