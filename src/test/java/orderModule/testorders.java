package orderModule;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseAMZ.BaseAMZ;

public class testorders extends BaseAMZ{
	POMOrderModule pomorder;
	public testorders () {
		super ();
	}
	
	
	@BeforeMethod
	public void setup() {
		initiate ();
	 pomorder = new POMOrderModule ();
	
	}
	@Test 
	public void orderstep1 () throws IOException {
		pomorder.step1();
		//pomorder.step2();
		pomorder.step3(prop.getProperty("username"));
		pomorder.step4();
		pomorder.step5(prop.getProperty("password"));
		pomorder.checkboxclick();
		pomorder.step6();
		
		// account Module
		pomorder.Accountstep();
		pomorder.Accountstep1();
		pomorder.Accountstep2();
		
		pomorder.Orderstep();
		pomorder.Orderstep1();
	}
	
	
	
}
