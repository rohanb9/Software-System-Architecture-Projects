package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S3 state.
 * 
 * @author borde
 */
class S3 extends State {

	S3(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }

    @Override
    void selectGas(int g) {
        if (modl.st == modl.LS[3]) {
            op.SetPrice(g, modl.M);
        }
    }

    @Override
    void cancel() {
        if (modl.st == modl.LS[3]) {
        	// Transition to State S0
        	modl.st = modl.LS[0];
            op.CancelMsg();
            op.ReturnCash();
        }
    }
    
    @Override
    void continueTr() {
        if (modl.st == modl.LS[3]) {
        	// Transition to State S4
        	modl.st = modl.LS[4];
        }
    }
}
