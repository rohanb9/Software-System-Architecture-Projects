package com.gaspumpproj.model.state;

import com.gaspumpproj.model.outputprocessor.OutputProcessor;

/**
 * Here, I am using the De-centralized State Design Pattern. 
 * Each state has it's own classes to perform actions as well as change of state.
 * State = 7 is the initial state.
 * Other wise all the state class names represents the state name.
 *  
 * @author borde
 *
 */
public class StateVMModel {
    protected State st;
    protected int M;
    // There are 9 states in our state diagram.
    protected State[] LS = new State[9];
    private OutputProcessor op;

    public StateVMModel(OutputProcessor op) {
    	this.op = op; 
    	createStateObjects();
        // State = 7 is the initial state.
        st = LS[7]; 
    }
    
    private void createStateObjects() {
    	 // instantiate each state
        LS[7] = new InitialState(this);
        LS[0] = new S0(this);
        LS[1] = new S1(this);
        LS[2] = new S2(this);
        LS[3] = new S3(this);
        LS[4] = new S4(this);
        LS[5] = new S5(this);
        LS[6] = new S6(this);
        LS[8] = new S8(this);
    }
    
    /*
     * Implementation of state event functions.
     * Here, we forward the call to the state particular state class to perform action and state transition.
        
     */

    public void activate() {
        st.activate();
    }

    public void start() {
        st.start();
    }
  
    // credit: t=1; 
    // cash: t=2; 
    // debit: t=3;
    public void payType(int t) {
        st.payType(t);
    }

    public void reject() {
        st.reject();
    }

    public void cancel() {
        st.cancel();
    }
    
    public void approved() {
        st.approved();
    }

    // Regular: g=1; 
    // Super: g=2; 
    // Premium: g=3; 
    // Diesel: g=4
    public void selectGas(int g) {
        st.selectGas(g);
    }

    public void startPump() {
        st.startPump();
    }

    public void pump() {
        st.pump();
    }

    public void stopPump() {
        st.stopPump();
    }

    public void receipt() {
        st.receipt();
    }

    public void noReceipt() {
        st.noReceipt();
    }
    
    public void correctPin() {
        st.correctPin();
    }
    
    public void incorrectPin() {
        st.incorrectPin();
    }
    
    // continue
    public void continueTr() {
        st.continueTr();
    }

    /*
    	OutputProcessor : Getters and Setters  
	 */
	public OutputProcessor getOutputProcessor() {
	    return this.op;
	}
	
	public void setOutputProcessor(OutputProcessor op) {
	    this.op = op;
	}

}
