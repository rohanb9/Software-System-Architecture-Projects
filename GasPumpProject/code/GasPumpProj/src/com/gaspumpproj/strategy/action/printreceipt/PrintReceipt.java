package com.gaspumpproj.strategy.action.printreceipt;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of PrintReceiptGP1 and PrintReceiptGP2. Also, this class is abstract class.
 * This class represents to "PrintReceipt" action which is used to print a receipt.
 * 
 * @author borde
 *
 */
public abstract class PrintReceipt {
	DataStore ds;

    public abstract void printReceipt();
}
