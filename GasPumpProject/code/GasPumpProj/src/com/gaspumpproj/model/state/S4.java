package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S4 state.
 * 
 * @author borde
 */
class S4 extends State {

	S4(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }

    @Override
    void startPump() {
        if (modl.st == modl.LS[4]) {
        	// Transition to State S5
        	modl.st = modl.LS[5];
        	//  call SetInitialValues() and ReadyMsg()
            op.SetInitialValues();
            op.ReadyMsg();
        }
    }
}
