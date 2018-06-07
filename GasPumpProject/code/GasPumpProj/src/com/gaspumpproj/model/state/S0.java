package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S0 state.
 * 
 * @author borde
 */
class S0 extends State {

	S0(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }

    @Override
    void start() {
        if (modl.st == modl.LS[0]) {
        	// Transition to State S1
        	modl.st = modl.LS[1];
        	//call the PayMsg(), InitializeData(), SetM() meta-action
        	op.PayMsg();
        	op.InitializeData();
        	modl.M = 1;
        }
    }
}
