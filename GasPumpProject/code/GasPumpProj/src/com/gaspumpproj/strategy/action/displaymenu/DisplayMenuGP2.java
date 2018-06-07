package com.gaspumpproj.strategy.action.displaymenu;


import com.gaspumpproj.data.DataStore;
import com.gaspumpproj.data.DataStoreGP2;

/**
 * This is DisplayMenu action class related to Gas pump 2. 
 * @author borde
 *
 */
public class DisplayMenuGP2 extends DisplayMenu {

    public DisplayMenuGP2(DataStore ds) {
        this.ds = ds;
    }

    @Override
    public void displayMenu() {
    	// display a menu with a list of selections
    	 DataStoreGP2 data = (DataStoreGP2) ds;
         System.out.println("Please select gas type from following list: ");
         System.out.println(
        		 "\n#6 Premium (Rate: $" + data.Pprice + " per liter)" +
                 "\n#7 Regular (Rate: $" + data.Rprice + "per liter) " +
                 "\n#8 Super (Rate: $" + data.Sprice + "per liter) " +
                 "Please select #5 to cancel");
                 
    }
}

