package addPayment;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseAMZ.BaseAMZ;

public class Testaddpayement extends BaseAMZ {
	POMpayment payment;
	public Testaddpayement () {
		super();
	}
	
	@BeforeMethod 
	public void setup () {
		initiate ();
	payment = new POMpayment ();
	}
	
	@Test
	public void testpayment () throws IOException, InterruptedException {
		payment.step1();
		payment.step3(prop.getProperty("username"));
		payment.step4();
		payment.step5(prop.getProperty("password"));
		payment.step6();
		payment.Accountstep2();
		payment.paymentstep1();
		payment.paymentstep2();
		payment.paymentstep3(prop.getProperty("card"),prop.getProperty("name"));
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
