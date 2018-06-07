package com.gaspumpproj.strategy.action.stopmsg;

/**
 * This is StopMsg action class related to Gas pump 2. 
 * 
 * @author borde
 */
public class StopMsgGP2 extends StopMsg {

    @Override
    public void stopMsg() {
    	// stop pump message and receipt msg (optionally)
    	System.out.println("Gas pump #1 has been stopped..");
    }
}
