package com.gaspumpproj.strategy.action.displaymenu;

import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP1;

/**
 * This is DisplayMenu action class related to Gas pump 1. 
 * @author borde
 *
 */
public class DisplayMenuGP1 extends DisplayMenu {

    public DisplayMenuGP1(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void displayMenu() {
    	// display a menu with a list of selections
    	DataStoreGP1 data = (DataStoreGP1) ds;
        
        System.out.println("Card has been approved. \n Please select gas type from following list: ");
        System.out.println(
                "\n#8 Diesel (Rate: $" + data.Dprice + " per gallon) " +
                "\n#9 Regular (Rate: $" + data.Rprice + " per gallon) " +
                "Please select #6 to cancel");
    }
}
