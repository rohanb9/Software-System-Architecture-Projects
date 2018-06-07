package com.gaspumpproj.driver;

import java.util.Scanner;

import com.gaspumpproj.factory.AbstractFactory;
import com.gaspumpproj.factory.AbstractFactoryGP1;
import com.gaspumpproj.factory.AbstractFactoryGP2;
import com.gaspumpproj.gaspumps.GasPump_1;
import com.gaspumpproj.gaspumps.GasPump_2;

/**
 * This is the driver class which where user provides the input information as well as data.
 * 
 * @author borde
 *
 */
public class Driver {
	/*
	 * Process on gas pump 1
	 */
	static void processGaspump_1(Scanner reader) {
		AbstractFactory abf = new AbstractFactoryGP1();
		GasPump_1 gp1 = new GasPump_1(abf);
		float a, b;
		String pin, x;
		int c1;
		char ch;
		//Menu
		System.out.println("\t\t=====================================================");
		System.out.println("\t\t\t\t\tGasPump-1");
		System.out.println("\t\tMENU of Operations");
		System.out.println("\t\t0. Activate(float, float)");
		System.out.println("\t\t1. Start()");
		System.out.println("\t\t2. PayCredit()");
		System.out.println("\t\t3. Reject()");
		System.out.println("\t\t4. PayDebit(String)");
		System.out.println("\t\t5. Pin(String)");
		System.out.println("\t\t6. Cancel()");
		System.out.println("\t\t7. Approved()");
		System.out.println("\t\t8. Diesel()");
		System.out.println("\t\t9. Regular()");
		System.out.println("\t\ta. StartPump()");
		System.out.println("\t\tb. PumpGallon()");
		System.out.println("\t\tc. StopPump()");
		System.out.println("\t\td. FullTank()");
		System.out.println("\t\tPlease make a note of these operations");
		System.out.println("\t\tGasPump-1 Execution");
		System.out.println("\t\t=====================================================");
		
		ch = '1';
		while (ch !='q') {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println(" Select Operation: ");
			System.out.println("0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-PayDebit, 5-Pin, 6-Cancel,");
			System.out.println("7-Approved, 8-Diesel, 9-Regular, a-StartPump, b-PumpGallon, c-StopPump, d-FullTank, q-quit");
			System.out.println("Enter your choice : ");
			ch =(char) reader.next().charAt(0);
			switch (ch) {
				case '0': { //Activate()
							System.out.println(" Operation: Activate()");
							System.out.println(" Enter value a :");
							a = reader.nextFloat();
							System.out.println(" Enter value b :");
							b = reader.nextFloat();
							gp1.Activate(a,b);
							break;
						}
				
				case '1': { //Start
							System.out.println(" Operation: Start()");
							gp1.Start();
							break;
						}
				case '2': { //PayCredit
							System.out.println(" Operation: PayCredit()");
							gp1.PayCredit();
							break;
						}
				case '3': { //Reject
							System.out.println(" Operation: Reject()");
							gp1.Reject();
							break;
						}
				case '4': {//PayDebit
							System.out.println(" Operation: PayDebit()");
							System.out.println(" Enter pin string: ");
							pin = reader.next();
							gp1.PayDebit(pin);
							break;
						}
				case '5': {//Pin
							System.out.println("Operation: Pin()");
							System.out.println(" Enter pin value: ");
							x = reader.next();
							gp1.Pin(x);
							break;
						}
				case '6': {//Cancel
							System.out.println(" Operation: Cancel()");
							gp1.Cancel();
							break;
						}
				case '7': { //Approved
							System.out.println(" Operation: Approved()");
							gp1.Approved();
							break;
						}
				case '8': { //Diesel
							System.out.println("Operation: Diesel()");
							gp1.Diesel();
							break;
						}
				case '9': {//Regular
							System.out.println(" Operation: Regular()");
							gp1.Regular();
							break;
						}
				case 'a': {
							//StartPump
							System.out.println(" Operation: StartPump()");
							gp1.StartPump();
							break;
						}
				case 'b': { //PumpGallon
							System.out.println(" Operation: PumpGallon()");
							gp1.PumpGallon();
							break;
						}
				case 'c': { //StopPump
							System.out.println(" Operation: StopPump()");
							gp1.StopPump();
							break;
						}
				case 'd': { //FullTank
							System.out.println(" Operation: FullTank()");
							gp1.FullTank();
							break;
				}
				case 'q': break;
			}// endswitch
			System.out.println("-----------------------------------------------------------------------------------");
		} //endwhile
	}
	
	/*
	 * Process on gas pump 2 
	 */
	static void processGaspump_2(Scanner reader) {
		AbstractFactory abf = new AbstractFactoryGP2();
		GasPump_2 gp2 = new GasPump_2(abf);
		float a, b, c;
		int c1;
		char ch;
		//Menu
		System.out.println("\t\t=====================================================");
		System.out.println("\t\t\t\t\tGasPump-2");
		System.out.println("\t\tMENU of Operations");
		System.out.println("\t\t0. Activate(float, float, float)");
		System.out.println("\t\tx. Start()");
		System.out.println("\t\t1. PayCash(int)");
		System.out.println("\t\t2. PayCredit()");
		System.out.println("\t\t3. Approved()");
		System.out.println("\t\t4. Reject()");
		System.out.println("\t\t5. Cancel()");
		System.out.println("\t\t6. Premium()");
		System.out.println("\t\t7. Regular()");
		System.out.println("\t\t8. Super()");
		System.out.println("\t\t9. StartPump()");
		System.out.println("\t\ta. PumpLiter()");
		System.out.println("\t\tb. Stop()");
		System.out.println("\t\tc. Receipt()");
		System.out.println("\t\td. NoReceipt()");
		System.out.println("\t\tq. Quit the program");
		System.out.println("\t\tPlease make a note of these operations");
		System.out.println("\t\tGasPump-2 Execution");
		System.out.println("\t\t=====================================================");
		
		ch = '1';
		while (ch !='q') {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println(" Select Operation: ");
			System.out.println("0-Activate, 1-PayCash, 2-PayCredit, 3-Approved, 4-Reject, 5-Cancel, 6-Premium,");
			System.out.println("7-Regular, 8-Super, 9-StartPump, a-PumpLiter, b-Stop, c-Receipt, d-NoReceipt, q-quit");
			System.out.println("Enter your choice : ");
			ch =(char) reader.next().charAt(0);
			switch (ch) {
				case '0': { //Activate()
							System.out.println(" Operation:");
							System.out.println(" Enter value a :");
							a = reader.nextFloat();
							System.out.println(" Enter value b :");
							b = reader.nextFloat();
							System.out.println(" Enter value c :");
							c = reader.nextFloat();
							gp2.Activate(a,b,c);
							break;
						}
				case '1': { //PayCash
							System.out.println(" Operation: PayCash(int c)");
							System.out.println(" Enter value of the parameter c:");
							c1 = reader.nextInt();
							gp2.PayCash(c1);
							break;
						}
				case '2': { //PayCredit
							System.out.println(" Operation: PayCredit()");
							gp2.PayCredit();
							break;
						}
				case '3': { //Approved
							System.out.println(" Operation: Approved()");
							gp2.Approved();
							break;
						}
				case '4': {//Reject
							System.out.println(" Operation: Reject()");
							gp2.Reject();
							break;
						}
				case '5': {//Cancel
							System.out.println("Operation: Cancel()");
							gp2.Cancel();
							break;
						}
				case '6': {//Premium
							System.out.println(" Operation: Premium()");
							gp2.Premium();
							break;
						}
				case '7': { //Regular
							System.out.println(" Operation: Regular()");
							gp2.Regular();
							break;
						}
				case '8': { //Super
							System.out.println("Operation: Super()");
							gp2.Super();
							break;
						}
				case '9': {//StartPump
							System.out.println(" Operation: StartPump()");
							gp2.StartPump();
							break;
						}
				case 'a': {
							//PumpLiter
							System.out.println(" Operation: PumpLiter()");
							gp2.PumpLiter();
							break;
						}
				case 'b': { //Stop
							System.out.println(" Operation: Stop()");
							gp2.Stop();
							break;
						}
				case 'c': { //Receipt
							System.out.println(" Operation: Receipt()");
							gp2.Receipt();
							break;
						}
				case 'd': { //NoReceipt
							System.out.println(" Operation: NoReceipt()");
							gp2.NoReceipt();
							break;
				}
				case 'q': break;
			}// endswitch
			System.out.println("-----------------------------------------------------------------------------------");
		} //endwhile
	}

	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		char ch = '1';
		// Selection of gas pump type:
		System.out.println("\t\t=====================================================");
		System.out.println("\t\t\t\t Select Gaspump Type: ");
		System.out.println("\t\t1. Gas Pump - 1 ");
		System.out.println("\t\t2. Gas Pump - 2 ");
		System.out.println("Enter Choice : ");
		ch =(char) reader.next().charAt(0);
		
		System.out.println("\t\t=====================================================");
		
		switch (ch) {
			case '1':
				processGaspump_1(reader);
				break;
			case '2':
				processGaspump_2(reader);
				break;
			default:
				System.out.println(" Wrong selection. Exiting application.");
		}
		
		
	}// main
}
