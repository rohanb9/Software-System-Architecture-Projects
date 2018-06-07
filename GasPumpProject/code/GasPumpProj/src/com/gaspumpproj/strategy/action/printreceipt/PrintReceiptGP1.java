package com.gaspumpproj.strategy.action.printreceipt;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;

/**
 * This is PrintReceipt action class related to Gas pump 1. 
 * @author borde
 *
 */
public class PrintReceiptGP1 extends PrintReceipt {

	public PrintReceiptGP1(DataStore ds) {
	    this.ds = ds;
	}

    @Override
    public void printReceipt() {
    	// print a receipt
        DataStoreGP1 data = (DataStoreGP1) ds;
        System.out.println("Printing receipt ...");
        System.out.println("==========================================================================");
        System.out.println(" Number of gallons: " + data.G);
        System.out.println(" Fuel price: $" + data.price + " per gallon");

        System.out.println("\n--------------------------------------------");
        System.out.println("Total amount : $" + data.total);
        System.out.println("===========================================================================");
        System.out.println("Thanks for using Gas Pump #1.\nTransaction completed successfully..");
    }
}
