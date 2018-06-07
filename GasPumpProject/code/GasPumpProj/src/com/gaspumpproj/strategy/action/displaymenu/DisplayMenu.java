package com.gaspumpproj.strategy.action.displaymenu;

import com.gaspumpproj.data.DataStore;

/**
 * Here, I have used Strategy Pattern.
 * This is the super class of DisplayMenuGP1 and DisplayMenuGP2. Also, this class is abstract class.
 * This class represents to "DisplayMenu" action which is used to display a menu with a list of selections.
 * 
 * @author borde
 *
 */
public abstract class DisplayMenu {
    DataStore ds;

    public abstract void displayMenu();

}
