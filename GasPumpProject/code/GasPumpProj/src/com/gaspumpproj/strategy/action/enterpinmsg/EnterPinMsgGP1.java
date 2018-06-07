package com.gaspumpproj.strategy.action.enterpinmsg;

/**
 * This is EnterPinMsg action class related to Gas pump 1. 
 * @author borde
 *
 */
public class EnterPinMsgGP1 extends EnterPinMsg {

    @Override
    public void enterPinMsg() {
    	// displays a message to enter pin
        System.out.println("This operation is related to Gas Pump #1..");
        System.out.println("Please enter pin..");
    }
}
