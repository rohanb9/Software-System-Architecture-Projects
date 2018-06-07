package com.gaspumpproj.factory;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;
import com.gaspumpproj.strategy.action.cancelmsg.CancelMsg;
import com.gaspumpproj.strategy.action.cancelmsg.CancelMsgGP1;
import com.gaspumpproj.strategy.action.displaymenu.DisplayMenu;
import com.gaspumpproj.strategy.action.displaymenu.DisplayMenuGP1;
import com.gaspumpproj.strategy.action.enterpinmsg.EnterPinMsg;
import com.gaspumpproj.strategy.action.enterpinmsg.EnterPinMsgGP1;
import com.gaspumpproj.strategy.action.gaspumpedmsg.GasPumpedMsg;
import com.gaspumpproj.strategy.action.gaspumpedmsg.GasPumpedMsgGP1;
import com.gaspumpproj.strategy.action.initializedata.InitializeData;
import com.gaspumpproj.strategy.action.initializedata.InitializeDataGP1;
import com.gaspumpproj.strategy.action.paymsg.PayMsg;
import com.gaspumpproj.strategy.action.paymsg.PayMsgGP1;
import com.gaspumpproj.strategy.action.printreceipt.PrintReceipt;
import com.gaspumpproj.strategy.action.printreceipt.PrintReceiptGP1;
import com.gaspumpproj.strategy.action.pumpgasunit.PumpGasUnit;
import com.gaspumpproj.strategy.action.pumpgasunit.PumpGasUnitGP1;
import com.gaspumpproj.strategy.action.readymsg.ReadyMsg;
import com.gaspumpproj.strategy.action.readymsg.ReadyMsgGP1;
import com.gaspumpproj.strategy.action.rejectmsg.RejectMsg;
import com.gaspumpproj.strategy.action.rejectmsg.RejectMsgGP1;
import com.gaspumpproj.strategy.action.returncash.ReturnCash;
import com.gaspumpproj.strategy.action.returncash.ReturnCashGP1;
import com.gaspumpproj.strategy.action.setinitialvalues.SetInitialValues;
import com.gaspumpproj.strategy.action.setinitialvalues.SetInitialValuesGP1;
import com.gaspumpproj.strategy.action.setprice.SetPrice;
import com.gaspumpproj.strategy.action.setprice.SetPriceGP1;
import com.gaspumpproj.strategy.action.stopmsg.StopMsg;
import com.gaspumpproj.strategy.action.stopmsg.StopMsgGP1;
import com.gaspumpproj.strategy.action.storecash.StoreCash;
import com.gaspumpproj.strategy.action.storecash.StoreCashGP1;
import com.gaspumpproj.strategy.action.storepin.StorePin;
import com.gaspumpproj.strategy.action.storepin.StorePinGP1;
import com.gaspumpproj.strategy.action.storeprices.StorePrices;
import com.gaspumpproj.strategy.action.storeprices.StorePricesGP1;
import com.gaspumpproj.strategy.action.wrongpinmsg.WrongPinMsg;
import com.gaspumpproj.strategy.action.wrongpinmsg.WrongPinMsgGP1;

/**
 * This class is abstract factory which is related to Gas Pump 1.
 * Here, we instantiates the action strategies with the shared data structure for Gas Pump 1.
 * 
 * @author borde
 *
 */
public class AbstractFactoryGP1 extends AbstractFactory {
    private DataStore ds;

    public AbstractFactoryGP1() {
        // Create new data store which is related to GasPump1.
        this.ds  = new DataStoreGP1();
    }

    @Override
    public DataStore getDataObj() {
    	// Returns the data store appropriate for GasPump1
        return this.ds;
    }

    @Override
    public CancelMsg getCancelMsgObj() {
    	// Returns the CancelMsg class for GasPump1.
        return new CancelMsgGP1();
    }

    @Override
    public DisplayMenu getDisplayMenuObj() {
    	// Returns the DisplayMenu class that performs the appropriate action for displaying the menu prompt for GasPump1.
        return new DisplayMenuGP1(this.ds);
    }

    @Override
    public GasPumpedMsg getGasPumpedMsgObj() {
    	// Returns the GasPumpedMsg class for GasPump1.
        return new GasPumpedMsgGP1(this.ds);
    }

    @Override
    public PayMsg getPayMsgObj() {
    	// Returns the Payment prompt message action appropriate for GasPump1
        return new PayMsgGP1();
    }

    @Override
    public PrintReceipt getPrintReceiptObj() {
    	// Returns the PrintReceipt class which is responsible for printing the GasPump1
        return new PrintReceiptGP1(this.ds);
    }

    @Override
    public PumpGasUnit getPumpGasUnitObj() {
    	// Returns the PumpGasUnit class which is responsible to "pumping" a unit of gas for GasPump1
        return new PumpGasUnitGP1(this.ds);
    }

    @Override
    public ReadyMsg getReadyMsgObj() {
    	//  Returns the ReadyMsg class which is responsible for prompting the user to start pumping gas on GasPump1.
        return new ReadyMsgGP1();
    }

    @Override
    public RejectMsg getRejectMsgObj() {
    	// Returns the RejectMsg class that displays the appropriate credit card rejection message for GasPump1
        return new RejectMsgGP1();
    }

    @Override
    public ReturnCash getReturnCashObj() {
    	// Returns the ReturnCash action object appropriate for GasPump1
        return new ReturnCashGP1();
    }

    @Override
    public SetInitialValues getSetInitialValuesObj() {
    	// Returns the SetInitialValues class which provides the appropriate action for initializing the shared data structure with GasPump1
        return new SetInitialValuesGP1(this.ds);
    }

    @Override
    public SetPrice getSetPriceObj() {
    	//  Returns the SetPrice class that is responsible for setting the price of gasoline according to specifications of GasPump1 requirements.
        return new SetPriceGP1(this.ds);
    }
    
    @Override
    public StopMsg getStopMsgObj() {
    	// Returns the StopMsg class which provides the appropriate action for displaying a message that the gas pump has been stopped according to GasPump1
        return new StopMsgGP1();
    }

    @Override
    public StoreCash getStoreCashObj() {
    	// Returns the StoreCash action object appropriate for GasPump1
        return new StoreCashGP1();
    }

	@Override
	public InitializeData getInitializeDataObj() {
		// Returns the InitializeData action object appropriate for GasPump1
		return new InitializeDataGP1(this.ds);
	}

	@Override
	public StorePrices getStorePricesObj() {
		// Returns the StorePrices action object appropriate for GasPump1
		return new StorePricesGP1(this.ds);
	}

	@Override
	public WrongPinMsg getWrongPinMsgObj() {
		// Returns the WrongPinMsg action object appropriate for GasPump1
		return new WrongPinMsgGP1();
	}

	@Override
	public StorePin getStorePinObj() {
		// Returns the StorePin action object appropriate for GasPump1
		return new StorePinGP1(this.ds);
	}

	@Override
	public EnterPinMsg getEnterPinMsgObj() {
		// Returns the EnterPinMsg action object appropriate for GasPump1
		return new EnterPinMsgGP1();
	}
}
