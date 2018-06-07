package com.gaspumpproj.data;

/**
 * DataStoreGP2 is class related to data store values of Gas Pump 2. It is shared by system components. 
 * Here, we have avoided to use getter setters for simplicity.
 * 
 * @author borde
 *
 */
public class DataStoreGP2 extends DataStore {
    // Temporary
    public float temp_a;
    public float temp_b;
    public float temp_c;
    public float temp_cash;
    
    // Non temporary
    public float Sprice;
    public float Rprice;
    public float Pprice;
    public float price;
    public float cash;
    public int L;
    public float total;

}

