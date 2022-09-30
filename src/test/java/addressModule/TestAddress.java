package addressModule;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseAMZ.BaseAMZ;

public class TestAddress extends BaseAMZ {
	POMAddress pom;
	
	public TestAddress () {
		
		super ();
		
	}
	
	@BeforeMethod
	public void setup () {
		initiate ();
		pom = new POMAddress ();
	}
	
	
	
	
	
	@DataProvider 
	public Object [][]Data (){
		Object result [][]= ExcelSheet.readdata("Sheet1");
		return result;
	}
	
	@Test (dataProvider = "Data")
	public void teststeps (String username, String password, String fullname, String phone, String addressline, String city, String postalcode) throws IOException {
		pom.step1();
		pom.step3(username);
		pom.step4();
		pom.step5(password);
		pom.step6();
		pom.Accountstep2();
		pom.Addressstep1();
		pom.Addressstep2();
		pom.Addressstep3();
		pom.Addressstep4(fullname);
		pom.Addressstep5(phone);
		pom.Addressstep6(addressline);
		pom.Addressstep7(city);
		pom.Addressstep8();
		pom.Addressstep9(postalcode);
		pom.Addressstep10();
		pom.Addressstep11();
		pom.Addressstep12();
		
	}
	
}
