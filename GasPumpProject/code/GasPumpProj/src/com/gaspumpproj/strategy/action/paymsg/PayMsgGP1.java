package com.gaspumpproj.strategy.action.paymsg;

/**
 * This is PayMsg action class related to Gas pump 1. 
 * @author borde
 *
 */
public class PayMsgGP1 extends PayMsg {

    @Override
    public void payMsg() {
    	// displays a type of payment method
        System.out.println("Current selection is Gas pump #1");
        System.out.println("Please select payment type..");
    }
}
