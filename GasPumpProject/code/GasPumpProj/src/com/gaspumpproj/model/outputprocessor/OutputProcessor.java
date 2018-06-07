package com.gaspumpproj.model.outputprocessor;

import com.gaspumpproj.factory.AbstractFactory;
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
 * This class is the general output processor for the gas pump system.
 * Each meta-action in this class calls the platform specific implementation of the action.
 * This class acts as the client class in the strategy design pattern.
 * 
 * @author borde
 *
 */
public class OutputProcessor {
	private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private ReadyMsg readyMsg;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPrice setPrice;
    private StopMsg stopMsg;
    private StoreCash storeCash;
    private InitializeData initializeData;
    private StorePrices storePrices;
    private WrongPinMsg wrongPinMsg;
    private StorePin storePin;
    private EnterPinMsg enterPinMsg;

    // Constructor for output processor class which initializes action class object values
    public OutputProcessor(AbstractFactory abstractfactory) {
    	fetchObjects(abstractfactory);
    }

    private void fetchObjects(AbstractFactory abf) {
    	this.cancelMsg = abf.getCancelMsgObj();
        this.displayMenu = abf.getDisplayMenuObj();
        this.gasPumpedMsg = abf.getGasPumpedMsgObj();
        this.payMsg = abf.getPayMsgObj();
        this.printReceipt = abf.getPrintReceiptObj();
        this.pumpGasUnit = abf.getPumpGasUnitObj();
        this.readyMsg = abf.getReadyMsgObj();
        this.rejectMsg = abf.getRejectMsgObj();
        this.returnCash = abf.getReturnCashObj();
        this.setInitialValues = abf.getSetInitialValuesObj();
        this.setPrice = abf.getSetPriceObj();
        this.stopMsg = abf.getStopMsgObj();
        this.storeCash = abf.getStoreCashObj();
        this.initializeData = abf.getInitializeDataObj();
        this.storePrices = abf.getStorePricesObj();
        this.wrongPinMsg =  abf.getWrongPinMsgObj();
        this.storePin =  abf.getStorePinObj();
        this.enterPinMsg =  abf.getEnterPinMsgObj();
    }
    /*
     * Following are the Meta actions which are implemented using strategy design pattern.
     */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g, int m) {
        this.setPrice.setPrice(g, m);
    }
    
    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void InitializeData() {
        this.initializeData.initializeData();
    }
    
    public void StorePrices(){
        this.storePrices.storePrices();
    }
    
    public void WrongPinMsg(){
        this.wrongPinMsg.wrongPinMsg();
    }
    
    public void StorePin(){
        this.storePin.storePin();
    }
    
    public void EnterPinMsg(){
        this.enterPinMsg.enterPinMsg();
    }
}
