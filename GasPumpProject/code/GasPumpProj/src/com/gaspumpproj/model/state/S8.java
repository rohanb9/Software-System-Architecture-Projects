package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S8 state.
 * 
 * @author borde
 */
class S8 extends State {

	S8(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }

    @Override
    void correctPin() {
        if (modl.st == modl.LS[8]) {
        	// Transition to State S3
			modl.st = modl.LS[3];
			op.DisplayMenu();
        }
    }

    @Override
    void incorrectPin() {
        if (modl.st == modl.LS[8]) {
        	// Transition to State S0
			modl.st = modl.LS[0];
			op.WrongPinMsg();
        }
    }
}
