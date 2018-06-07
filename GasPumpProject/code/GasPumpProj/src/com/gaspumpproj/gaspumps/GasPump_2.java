package com.gaspumpproj.gaspumps;

import com.gaspumpproj.data.DataStoreGP2;
import com.gaspumpproj.factory.AbstractFactory;
/**
 * This class is used as input processor for gas pump 2.
 * @author borde
 */
public class GasPump_2 extends GasPump {

	public GasPump_2(AbstractFactory af) {
	    super(af);
	}
	
	/*
	 * Operations of the Input Processor
	 */
	// Validate input params and call activate event.
	public void Activate(float a, float b, float c) {
		if (a > 0 && b > 0 && c > 0) {
            DataStoreGP2 d = (DataStoreGP2) this.ds;
            d.temp_a = a;
            d.temp_b = b;
            d.temp_c = c;
            m.activate();
        } else {
            System.out.println("Invalid prices (price should be greater than 0).. Activation failed!");
        }
	}
	
	public void PayCash(int cash) {
		if (cash > 0) {
			DataStoreGP2 d = (DataStoreGP2) ds;
            d.temp_cash = cash;
            m.start();
            m.payType(2);
        } else {
            System.out.println("Invalid cash amount..");
        }
	}

	public void PayCredit() {
		m.start();
		m.payType(1);
	}

	public void Approved() {
		m.approved();
	}

	public void Reject() {
		m.reject();
	}

	public void Premium() {
		m.selectGas(3);
		m.continueTr();
	}

	public void Cancel() {
		m.cancel();
	}

	public void Regular() {
		m.selectGas(1);
		m.continueTr();
	}

	public void Super() {
		m.selectGas(2);
		m.continueTr();
	}

	public void PumpLiter() {
		DataStoreGP2 d = (DataStoreGP2) ds;
        if (d.cash>0 && (d.cash < d.price * (d.L + 1))) {
            m.stopPump();
        } else {
            m.pump();
        }
	}

	public void NoReceipt() {
		m.noReceipt();
	}

	public void Stop() {
		m.stopPump();
	}

	public void StartPump() {
		m.startPump();
	}

	public void Receipt() {
		m.receipt();
	}
}
