package com.gaspumpproj.factory;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;
import com.gaspumpproj.strategy.action.cancelmsg.CancelMsg;
import com.gaspumpproj.strategy.action.cancelmsg.CancelMsgGP2;
import com.gaspumpproj.strategy.action.displaymenu.DisplayMenu;
import com.gaspumpproj.strategy.action.displaymenu.DisplayMenuGP2;
import com.gaspumpproj.strategy.action.enterpinmsg.EnterPinMsg;
import com.gaspumpproj.strategy.action.enterpinmsg.EnterPinMsgGP2;
import com.gaspumpproj.strategy.action.gaspumpedmsg.GasPumpedMsg;
import com.gaspumpproj.strategy.action.gaspumpedmsg.GasPumpedMsgGP2;
import com.gaspumpproj.strategy.action.initializedata.InitializeData;
import com.gaspumpproj.strategy.action.initializedata.InitializeDataGP2;
import com.gaspumpproj.strategy.action.paymsg.PayMsg;
import com.gaspumpproj.strategy.action.paymsg.PayMsgGP2;
import com.gaspumpproj.strategy.action.printreceipt.PrintReceipt;
import com.gaspumpproj.strategy.action.printreceipt.PrintReceiptGP2;
import com.gaspumpproj.strategy.action.pumpgasunit.PumpGasUnit;
import com.gaspumpproj.strategy.action.pumpgasunit.PumpGasUnitGP2;
import com.gaspumpproj.strategy.action.readymsg.ReadyMsg;
import com.gaspumpproj.strategy.action.readymsg.ReadyMsgGP2;
import com.gaspumpproj.strategy.action.rejectmsg.RejectMsg;
import com.gaspumpproj.strategy.action.rejectmsg.RejectMsgGP2;
import com.gaspumpproj.strategy.action.returncash.ReturnCash;
import com.gaspumpproj.strategy.action.returncash.ReturnCashGP2;
import com.gaspumpproj.strategy.action.setinitialvalues.SetInitialValues;
import com.gaspumpproj.strategy.action.setinitialvalues.SetInitialValuesGP2;
import com.gaspumpproj.strategy.action.setprice.SetPrice;
import com.gaspumpproj.strategy.action.setprice.SetPriceGP2;
import com.gaspumpproj.strategy.action.stopmsg.StopMsg;
import com.gaspumpproj.strategy.action.stopmsg.StopMsgGP2;
import com.gaspumpproj.strategy.action.storecash.StoreCash;
import com.gaspumpproj.strategy.action.storecash.StoreCashGP2;
import com.gaspumpproj.strategy.action.storepin.StorePin;
import com.gaspumpproj.strategy.action.storepin.StorePinGP2;
import com.gaspumpproj.strategy.action.storeprices.StorePrices;
import com.gaspumpproj.strategy.action.storeprices.StorePricesGP2;
import com.gaspumpproj.strategy.action.wrongpinmsg.WrongPinMsg;
import com.gaspumpproj.strategy.action.wrongpinmsg.WrongPinMsgGP2;

/**
 * This class is abstract factory which is related to Gas Pump 2.
 * Here, we instantiates the action strategies with the shared data structure for Gas Pump 2.
 * 
 * @author borde
 *
 */
public class AbstractFactoryGP2 extends AbstractFactory {
    private DataStore ds;

    public AbstractFactoryGP2() {
        // Create new data store which is related to GasPump2.
        this.ds  = new DataStoreGP2();
    }

    @Override
    public DataStore getDataObj() {
    	// Returns the data store appropriate for GasPump2
        return this.ds;
    }

    @Override
    public CancelMsg getCancelMsgObj() {
    	// Returns the CancelMsg class for GasPump2.
        return new CancelMsgGP2();
    }

    @Override
    public DisplayMenu getDisplayMenuObj() {
    	// Returns the DisplayMenu class that performs the appropriate action for displaying the menu prompt for GasPump2.
        return new DisplayMenuGP2(this.ds);
    }

    @Override
    public GasPumpedMsg getGasPumpedMsgObj() {
    	// Returns the GasPumpedMsg class for GasPump2.
        return new GasPumpedMsgGP2(this.ds);
    }

    @Override
    public PayMsg getPayMsgObj() {
    	// Returns the Payment prompt message action appropriate for GasPump2
        return new PayMsgGP2();
    }

    @Override
    public PrintReceipt getPrintReceiptObj() {
    	// Returns the PrintReceipt class which is responsible for printing the GasPump2
        return new PrintReceiptGP2(this.ds);
    }

    @Override
    public PumpGasUnit getPumpGasUnitObj() {
    	// Returns the PumpGasUnit class which is responsible to "pumping" a unit of gas for GasPump2
        return new PumpGasUnitGP2(this.ds);
    }

    @Override
    public ReadyMsg getReadyMsgObj() {
    	//  Returns the ReadyMsg class which is responsible for prompting the user to start pumping gas on GasPump2.
        return new ReadyMsgGP2();
    }

    @Override
    public RejectMsg getRejectMsgObj() {
    	// Returns the RejectMsg class that displays the appropriate credit card rejection message for GasPump2
        return new RejectMsgGP2();
    }

    @Override
    public ReturnCash getReturnCashObj() {
    	// Returns the ReturnCash action object appropriate for GasPump2
        return new ReturnCashGP2(this.ds);
    }

    @Override
    public SetInitialValues getSetInitialValuesObj() {
    	// Returns the SetInitialValues class which provides the appropriate action for initializing the shared data structure with GasPump2
        return new SetInitialValuesGP2(this.ds);
    }

    @Override
    public SetPrice getSetPriceObj() {
    	//  Returns the SetPrice class that is responsible for setting the price of gasoline according to specifications of GasPump2 requirements.
        return new SetPriceGP2(this.ds);
    }

    @Override
    public StopMsg getStopMsgObj() {
    	// Returns the StopMsg class which provides the appropriate action for displaying a message that the gas pump has been stopped according to GasPump2
        return new StopMsgGP2();
    }

    @Override
    public StoreCash getStoreCashObj() {
    	// Returns the StoreCash action object appropriate for GasPump2
        return new StoreCashGP2(this.ds);
    }

	@Override
	public InitializeData getInitializeDataObj() {
		// Returns the InitializeData action object appropriate for GasPump2
		return new InitializeDataGP2(this.ds);
	}

	@Override
	public StorePrices getStorePricesObj() {
		// Returns the StorePrices action object appropriate for GasPump2
		return new StorePricesGP2(this.ds);
	}

	@Override
	public WrongPinMsg getWrongPinMsgObj() {
		// Returns the WrongPinMsg action object appropriate for GasPump2
		return new WrongPinMsgGP2();
	}

	@Override
	public StorePin getStorePinObj() {
		// Returns the StorePin action object appropriate for GasPump2
		return new StorePinGP2(this.ds);
	}

	@Override
	public EnterPinMsg getEnterPinMsgObj() {
		// Returns the EnterPinMsg action object appropriate for GasPump2
		return new EnterPinMsgGP2();
	}
}
