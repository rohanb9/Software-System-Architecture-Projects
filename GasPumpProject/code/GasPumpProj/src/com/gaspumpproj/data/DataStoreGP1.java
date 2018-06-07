package com.gaspumpproj.data;

/**
 * DataStoreGP1 is class related to data store values of Gas Pump 1. It is shared by system components. 
 * Here, we have avoided to use getter setters for simplicity.
 * 
 * @author borde
 *
 */
public class DataStoreGP1 extends DataStore {
    // Temporary
    public float temp_a;
    public float temp_b;
    public String temp_p;
    
    // Non temporary
	public String pin;
    public float price;
    public int G;
    public float total;
    public float Rprice;
    public float Dprice;

}
