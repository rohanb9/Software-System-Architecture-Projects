package com.gaspumpproj.gaspumps;

import com.gaspumpproj.data.DataStoreGP1;
import com.gaspumpproj.factory.AbstractFactory;

/**
 * This class is used as input processor for gas pump 1.
 * @author borde
 */
public class GasPump_1 extends GasPump {
	
	public GasPump_1(AbstractFactory af) {
	    super(af);
	}

	/*
	 * Operations of the Input Processor
	 */
	// Validate input params and call activate event.
	public void Activate(float a, float b) {
		if (a > 0 && b > 0) {
            DataStoreGP1 d = (DataStoreGP1) this.ds;
            d.temp_a = a;
            d.temp_b = b;
            m.activate();
        } else {
            System.out.println("Invalid prices (price should be greater than 0).. Activation failed!");
        }
		
	}

	public void Start() {
		m.start();
	}

	public void PayCredit() {
		m.payType(1);
	}

	public void Reject() {
		 m.reject();
	}

	public void PayDebit(String pin) {
		DataStoreGP1 d = (DataStoreGP1) this.ds;
		d.temp_p = pin;
		m.payType(3);
	}

	public void Pin(String x) {
		DataStoreGP1 d = (DataStoreGP1) this.ds;
		if ((d.pin).equals(x)) {
			m.correctPin();
		} else { 
			m.incorrectPin();
		}
	}

	public void Cancel() {
		m.cancel();
	}

	public void Approved() {
		m.approved();
	}

	public void Diesel() {
		m.selectGas(4);
	}

	public void Regular() {
		m.selectGas(1);
	}

	public void StartPump() {
		DataStoreGP1 d = (DataStoreGP1) this.ds;
		if (d.price > 0) {
			m.continueTr();
			m.startPump();
		}
	}

	public void PumpGallon() {
		m.pump();
	}

	public void StopPump() {
		m.stopPump();
		m.receipt();
	}

	public void FullTank() {
		m.stopPump();
		m.receipt();
	}
	
}
