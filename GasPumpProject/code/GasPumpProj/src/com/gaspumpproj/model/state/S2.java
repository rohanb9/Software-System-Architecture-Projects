package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S2 state.
 * 
 * @author borde
 */
class S2 extends State {

	S2(StateVMModel modl) {
    	this.modl = modl;
    	this.op = modl.getOutputProcessor();
    }

    @Override
    void approved() {
        if (modl.st == modl.LS[2]) {
        	// Transition to State S3
        	modl.st = modl.LS[3];
        	// call DisplayMenu() meta-action
        	op.DisplayMenu();
        }
    }

    @Override
    void reject() {
        if (modl.st == modl.LS[2]) {
        	// Transition to State S0
            modl.st = modl.LS[0];
            // call RejectMsg() action
            op.RejectMsg();
        }
    }
}
