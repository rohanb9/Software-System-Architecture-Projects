package com.gaspumpproj.strategy.action.setprice;

import com.gaspumpproj.data.DataStore;


/**
 * Here, I have used Strategy Pattern.
 * This is the super class of SetPriceGP1 and SetPriceGP2. Also, this class is abstract class.
 * This class represents to "SetPrice" action which is used to set the price for the gas identified by g identifier as in SelectGas(int g); if M=1, the price may be increased.
 * 
 * @author borde
 *
 */
public abstract class SetPrice {
    DataStore ds;

    // Regular: g=1; 
    // Super: g=2; 
    // Premium: g=3; 
    // Diesel: g=4
    public abstract void setPrice(int g, int m);

}
