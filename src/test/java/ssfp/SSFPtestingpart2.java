package ssfp;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseAMZ.BaseAMZ;

public class SSFPtestingpart2 extends BaseAMZ{
	
	
	POMssfp pom;
	SoftAssert soft;
public SSFPtestingpart2 () {
	
	super ();	
}
@BeforeMethod
public void setup () {
	initiate();
	 pom = new POMssfp ();
}
@Test (priority = 1)
public void searchfunction9	() throws IOException, InterruptedException {
	pom.search9();
}
	
@Test (priority = 2)
public void searchfunction10 () throws IOException, InterruptedException {
	pom.search10();
}

@Test (priority = 3)
public void searchfunction11	() throws IOException, InterruptedException {
	pom.search11();
}

@Test (priority = 4)
public void searchfunction12	() throws IOException {
	pom.search12();
}
@Test (priority = 5)
public void searchfunction13	() throws IOException {
	pom.search13();
}
@Test (priority = 1)
public void searchfunction14	() throws IOException, InterruptedException {
	pom.search14();
}
@AfterMethod
public void close () {
	driver.close();
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
