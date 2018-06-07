package com.gaspumpproj.model.state;

import com.gaspumpproj.model.outputprocessor.OutputProcessor;

/**
 * This class is the abstract class. It is the super class of all state classes.
 * In this class each operation should be abstract but currently i am considering each method implementation
 * does not do anything here. I have done it as to avoid implementation of methods which are not required in state
 * classes. To avoid empty methods in sub classes i have kept it in this class with "Do nothing methods"
 * 
 * Each state subclass inherits these methods and overrides the appropriate ones.
   This means that methods that do not get overridden will show "Access Denied" message.
 *  
 * @author borde
 *
 */
public abstract class State {
    protected StateVMModel modl;
    protected OutputProcessor op;

    void activate() {
    	showAccessDeniedMsg();
    }
    void start(){
    	showAccessDeniedMsg();
    }

    void payType(int t){
    	showAccessDeniedMsg();
    }
    void approved(){
    	showAccessDeniedMsg();
    }
    void reject(){
    	showAccessDeniedMsg();
    }
    void selectGas(int g){
    	showAccessDeniedMsg();
    }
    void cancel(){
    	showAccessDeniedMsg();
    }
    void startPump(){
    	showAccessDeniedMsg();
    }
    void pump(){
    	showAccessDeniedMsg();
    }
    void stopPump(){
    	showAccessDeniedMsg();
    }
    void receipt(){
    	showAccessDeniedMsg();
    }
    void noReceipt(){
    	showAccessDeniedMsg();
    }
    void correctPin() {
    	showAccessDeniedMsg();
    }
    void incorrectPin() {
    	showAccessDeniedMsg();
    }
    // continue
    void continueTr() {
    	showAccessDeniedMsg();
    }
    
    private void showAccessDeniedMsg() {
        System.out.println("Access Denied: This operation not allowed here.");
    }
}
