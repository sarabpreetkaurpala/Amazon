package testsignin;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseAMZ.BaseAMZ;
import pomSignIn.POMSignIn;

public class TestSignIn extends BaseAMZ {
	POMSignIn pom;
	
	
	public TestSignIn () {
		
		super ();
		
	}
	@BeforeMethod
	public void setup (){
		initiate ();
		pom = new POMSignIn ();
		
	}
	
	@Test
	public void Test1 () throws IOException {
	String title = 	driver.getTitle();
		
	System.out.println(title);
			
		pom.step1();
		pom.step2();
		pom.step3(prop.getProperty("username"));
		pom.step4();
		pom.step5(prop.getProperty("password"));
		pom.checkboxclick();
		pom.step6();
	}

	@AfterMethod
	public void close () {
		driver.close();
	}
	
}
