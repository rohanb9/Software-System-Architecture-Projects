package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents initial state.
 * 
 * @author borde
 */
class InitialState extends State {

	InitialState(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }

    @Override
    void activate() {
    	// check current state
        if (modl.st == modl.LS[7]) {
        	// Transition to State S0
        	modl.st = modl.LS[0];
        	// call the StorePrices() meta-action
        	op.StorePrices();
        }
    }
}
