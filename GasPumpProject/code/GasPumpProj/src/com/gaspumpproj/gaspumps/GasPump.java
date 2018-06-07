package com.gaspumpproj.gaspumps;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.factory.AbstractFactory;
import com.gaspumpproj.model.outputprocessor.OutputProcessor;
import com.gaspumpproj.model.state.StateVMModel;


/**
 * This is the abstract class which is the super class of GasPump_1 and GasPump_2.
 * Here, we do initializations using abstract factory related to each Gas Pump.
 * 
 * @author borde
 *
 */
public abstract class GasPump {
	DataStore ds;
    StateVMModel m;

    // Constructor to initialize the object creation and setting values.
    GasPump(AbstractFactory af) {
    	OutputProcessor outp = new OutputProcessor(af);
        this.ds = af.getDataObj();
        this.m = new StateVMModel(outp);
        
        //        this.m.setOutputProcessor(outp);
    }

}
