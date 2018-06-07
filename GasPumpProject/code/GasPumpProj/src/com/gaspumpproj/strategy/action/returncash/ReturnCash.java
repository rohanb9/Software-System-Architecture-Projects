package com.gaspumpproj.strategy.action.returncash;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of ReturnCashGP1 and ReturnCashGP2. Also, this class is abstract class.
 * This class represents to "ReturnCash" action which is used to returns the remaining cash.
 * 
 * @author borde
 *
 */
public abstract class ReturnCash {
   DataStore ds;

   public abstract void returnCash();
}
