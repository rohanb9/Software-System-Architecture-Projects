package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S6 state.
 * 
 * @author borde
 */
class S6 extends State {

	S6(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }

    @Override
    void receipt() {
        if (modl.st == modl.LS[6]) {
        	// Transition to State S0
        	modl.st = modl.LS[0];
        	// call PrintReceipt() and ReturnCash() actions
        	op.PrintReceipt();
        	op.ReturnCash();
        }
    }

    @Override
    void noReceipt() {
        if (modl.st == modl.LS[6]) {
        	// Transition to State S0
        	modl.st = modl.LS[0];
        	// call ReturnCash() meta-actions
        	op.ReturnCash();
        }
    }
}
