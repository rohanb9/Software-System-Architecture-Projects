package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S5 state.
 * 
 * @author borde
 */
class S5 extends State {

	S5(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }
	
    @Override
    void pump() {
        if (modl.st == modl.LS[5]) {
            // do self loop
        	// call PumpGasUnit() and GasPumpedMsg()
            op.PumpGasUnit();
            op.GasPumpedMsg();
        }
    }

    @Override
    void stopPump() {
        if (modl.st == modl.LS[5]) {
        	// Transition to State S6
        	modl.st = modl.LS[6];
        	// call StopMsg() action
        	op.StopMsg();
        }
    }
}
