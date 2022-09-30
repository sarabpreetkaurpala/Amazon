package ssfp;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseAMZ.BaseAMZ;

public class SSFPtestingpart3 extends BaseAMZ{


	POMssfp pom;
	SoftAssert soft;
public SSFPtestingpart3 () {
	
	super ();	
}
@BeforeMethod
public void setup () {
	initiate();
	 pom = new POMssfp ();
}
	
	@Test
	public void items () throws IOException {
		pom.numberofitems();
	}
	@Test
	public void search15 () throws IOException {
		pom.search15();
	}
	@Test
	public void search16 () throws IOException {
		pom.search16();
	}
	@Test
	public void search17 () throws IOException, InterruptedException {
		pom.search17();
	}
	@Test
	public void search18 () throws IOException, InterruptedException {
		pom.search18();
	}
	@Test
	public void search19 () throws IOException, InterruptedException {
		pom.search19();
	}
	@Test
	public void search20 () throws IOException, InterruptedException {
		pom.search20();
	}
	@Test
	public void search21 () throws IOException, InterruptedException {
		pom.search21();
	}
	@Test
	public void search22 () throws IOException, InterruptedException {
		pom.search22();
	}
	@Test
	public void search23 () throws IOException, InterruptedException {
		pom.search23();
	}
	@Test
	public void search24 () throws IOException, InterruptedException {
		pom.search24();
	}
	@AfterMethod
	public void close () {
		driver.close();
	}
}

