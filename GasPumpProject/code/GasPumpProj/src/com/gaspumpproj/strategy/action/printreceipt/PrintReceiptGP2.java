package com.gaspumpproj.strategy.action.printreceipt;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is PrintReceipt action class related to Gas pump 2. 
 * @author borde
 *
 */
public class PrintReceiptGP2 extends PrintReceipt {

	public PrintReceiptGP2(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void printReceipt() {
    	// print a receipt
        
        DataStoreGP2 data = (DataStoreGP2) ds;
        System.out.println("Printing receipt ...");
        System.out.println("==========================================================================");
        System.out.println(" Number of liters: " + data.L);
        System.out.println(" Fuel price: $" + data.price + " per liter");
        System.out.println(" Cash inserted: $" + data.cash);
        System.out.println("\n--------------------------------------------");
        System.out.println("Total amount : $" + data.total);
        System.out.println("===========================================================================");
        System.out.println("Thanks for using Gas Pump #2.\nTransaction completed successfully..");
    }
}
