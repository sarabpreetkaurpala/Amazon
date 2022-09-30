package shoppingCart;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseAMZ.BaseAMZ;

public class Carttesting extends BaseAMZ {
	PomCart cart;
	SoftAssert soft;
	public Carttesting () {
		super();
	}
	
	
	@BeforeMethod 
	public void setup () {
		initiate ();
		cart = new PomCart ();
		}
	
	@Test (priority = 1)
	public void cartstep1 () throws IOException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart1(prop.getProperty("search13"));
	}
	
	@Test (priority = 2)
	public void cartstep2 () throws IOException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart2(prop.getProperty("search13"));
	}
	@Test (priority = 3)
	public void cartstep3 () throws IOException, InterruptedException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart3(prop.getProperty("search13"));
	}
	/*@Test (priority = 4)
	public void cartstep4 () throws IOException, InterruptedException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart4(prop.getProperty("search13"), prop.getProperty("search14"));

}*/
/*	@Test
	public void cartstep5 () throws IOException, InterruptedException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart5();
	}*/
	@Test (priority = 6)
	public void cartstep6 () throws IOException, InterruptedException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart6();
	}
	@Test (priority= 7)
	public void cartstep7 () throws IOException, InterruptedException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart7();
	
	}
	@Test (priority = 5)
	public void cartstep8 () throws IOException, InterruptedException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart8();
	
	}
	@Test ( priority = 4)
	public void cartstep9 () throws IOException, InterruptedException {
		cart.step1();
		cart.step3(prop.getProperty("username"));
		cart.step4();
		cart.step5(prop.getProperty("password"));
		cart.step6();
		cart.cart9();
	
	}
	
	@AfterMethod
	public void close () {
		driver.close();
	}
	
}

