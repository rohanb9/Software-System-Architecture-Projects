package com.gaspumpproj.strategy.action.cancelmsg;

/**
 * This is CancelMsg action class related to Gas pump 1. 
 * @author borde
 *
 */

public class CancelMsgGP1 extends CancelMsg {

    @Override
    public void cancelMsg() {
    	// Print a cancellation message
        System.out.println("Transaction has been cancelled for gas pump #1..");
    }
}
