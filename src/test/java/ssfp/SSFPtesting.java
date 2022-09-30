package ssfp;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseAMZ.BaseAMZ;

public class SSFPtesting extends BaseAMZ {
	POMssfp pom;
	SoftAssert soft;
public SSFPtesting () {
	
	super ();	
}
@BeforeMethod
public void setup () {
	initiate();
	 pom = new POMssfp ();
	
}
@Test (priority = 1)
public void searchfunction1	() throws IOException {
	pom.search1();
}
@Test (priority = 2)
public void searchfunction2	() throws IOException {
	pom.search2();
	
}
@Test (priority = 3)
public void searchfunction3	() throws IOException, InterruptedException {
	pom.search3();
	
}
@Test (priority = 4)
public void searchfunction4	() throws IOException {
	pom.search4();
}
@Test (priority = 5)
public void searchfunction5	() throws IOException, InterruptedException {	
	
	pom.search5();
}
@Test (priority = 6)
public void searchfunction6	() throws IOException {
	pom.search6();
}
@Test (priority = 7)
public void searchfunction7	() throws IOException {
	pom.search7();
}
@Test (priority = 8)
public void searchfunction8	() throws IOException {
	pom.search8();
}

@Test (priority = 9)
public void searchfunction9	() throws IOException, InterruptedException {
	pom.search9();
}
	
@AfterMethod
public void close () {
	driver.close();
}
}
