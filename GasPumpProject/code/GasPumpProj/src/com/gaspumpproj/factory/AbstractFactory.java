package com.gaspumpproj.factory;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.strategy.action.cancelmsg.CancelMsg;
import com.gaspumpproj.strategy.action.displaymenu.DisplayMenu;
import com.gaspumpproj.strategy.action.enterpinmsg.EnterPinMsg;
import com.gaspumpproj.strategy.action.gaspumpedmsg.GasPumpedMsg;
import com.gaspumpproj.strategy.action.initializedata.InitializeData;
import com.gaspumpproj.strategy.action.paymsg.PayMsg;
import com.gaspumpproj.strategy.action.printreceipt.PrintReceipt;
import com.gaspumpproj.strategy.action.pumpgasunit.PumpGasUnit;
import com.gaspumpproj.strategy.action.readymsg.ReadyMsg;
import com.gaspumpproj.strategy.action.rejectmsg.RejectMsg;
import com.gaspumpproj.strategy.action.returncash.ReturnCash;
import com.gaspumpproj.strategy.action.setinitialvalues.SetInitialValues;
import com.gaspumpproj.strategy.action.setprice.SetPrice;
import com.gaspumpproj.strategy.action.stopmsg.StopMsg;
import com.gaspumpproj.strategy.action.storecash.StoreCash;
import com.gaspumpproj.strategy.action.storepin.StorePin;
import com.gaspumpproj.strategy.action.storeprices.StorePrices;
import com.gaspumpproj.strategy.action.wrongpinmsg.WrongPinMsg;

/**
 * Here, i used Abstract Factory design pattern.
 * This is the abstract class which is the super class of two abstract factories AbstractFactoryGP1 and AbstractFactoryGP2.
 * It initializes with the proper action for the specific gas pump that is desired. 
 * This is done thorough the Abstract Factory design pattern.
    
 * @author borde
 */
public abstract class AbstractFactory {

    public abstract DataStore getDataObj();

    public abstract CancelMsg getCancelMsgObj();

    public abstract DisplayMenu getDisplayMenuObj();

    public abstract GasPumpedMsg getGasPumpedMsgObj();

    public abstract PayMsg getPayMsgObj();

    public abstract PrintReceipt getPrintReceiptObj();

    public abstract PumpGasUnit getPumpGasUnitObj();

    public abstract ReadyMsg getReadyMsgObj();

    public abstract RejectMsg getRejectMsgObj();

    public abstract ReturnCash getReturnCashObj();

    public abstract SetInitialValues getSetInitialValuesObj();

    public abstract SetPrice getSetPriceObj();
    
    public abstract StopMsg getStopMsgObj();

    public abstract StoreCash getStoreCashObj();

    public abstract InitializeData getInitializeDataObj();
    
    public abstract StorePrices getStorePricesObj();
    
    public abstract WrongPinMsg getWrongPinMsgObj();
    
    public abstract StorePin getStorePinObj();
    
    public abstract EnterPinMsg getEnterPinMsgObj();
    

}