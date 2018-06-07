package com.gaspumpproj.model.state;

/**
 * MDA-EFSM: This class represents S1 state.
 * 
 * @author borde
 */
class S1 extends State {

	S1(StateVMModel model) {
    	this.modl = model;
    	this.op = modl.getOutputProcessor();
    }

	// credit: t=1; 
    // cash: t=2; 
    // debit: t=3;
    @Override
    void payType(int t) {
    	if(modl.st == modl.LS[1]) {
    		if (t == 1) {
    			// Transition to State S2
    			modl.st = modl.LS[2];
    		} else if (t == 2) {
    			// Transition to State S3
    			modl.st = modl.LS[3];
    			op.StoreCash();
    			op.DisplayMenu();
    			modl.M = 0;
    		} else if (t == 3) {
    			// Transition to State S8
    			modl.st = modl.LS[8];
    			op.EnterPinMsg();
    			op.StorePin();
    		}
    	}
    }
}
