package accountModule;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseAMZ.BaseAMZ;

public class AccountModule1 extends BaseAMZ{
	pomAccountModule pomaccount;
	public AccountModule1 () {
		super ();
	}
	
	@BeforeMethod
	public void setup() {
		initiate ();
		 pomaccount = new pomAccountModule ();
		 
	}
	
	
	@Test
	public void testaccount () throws IOException {
		
		
		// account Module
		pomaccount.Accountstep();
		pomaccount.Accountstep1();
		pomaccount.Accountstep2();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
