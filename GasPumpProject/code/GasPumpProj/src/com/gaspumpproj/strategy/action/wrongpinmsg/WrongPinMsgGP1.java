package com.gaspumpproj.strategy.action.wrongpinmsg;

/**
 * This is WrongPinMsg action class related to Gas pump 1. 
 * @author borde
 *
 */
public class WrongPinMsgGP1 extends WrongPinMsg {

    @Override
    public void wrongPinMsg() {
    	// displays incorrect pin message
        System.out.println("Wrong pin entered in Gas Pump #1..");
    }
}
