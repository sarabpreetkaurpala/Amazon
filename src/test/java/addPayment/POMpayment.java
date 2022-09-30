package addPayment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseAMZ.BaseAMZ;
public class POMpayment extends BaseAMZ {
	//SignIn
		@FindBy (css = "#nav-link-accountList")
		WebElement mousehover;
		@FindBy (css = "#nav-flyout-ya-signin > a:nth-child(1) > span:nth-child(1)")
	  WebElement signinbutton;
		@FindBy (css = "#ap_email")
		WebElement username;
		@FindBy (css = "#continue")
		WebElement Continuebutton;
		@FindBy (css = "#ap_password")
		WebElement password;
	  @FindBy (css = ".a-checkbox > label:nth-child(1) > input:nth-child(1)")
		WebElement checkbox;
	  @FindBy (id = "signInSubmit")
		WebElement signin;
	  
	  // Account Module
		@FindBy (css = "#nav-link-accountList")
		WebElement AccountnLists;

		@FindBy (css = "#nav-al-your-account")
		WebElement banner;
		
		@FindBy (css = "#nav_prefetch_yourorders" )
		WebElement yourorders;
		
		// AddPayment
	
	@FindBy ( css = "div.ya-card-row:nth-child(3) > div:nth-child(2) > a:nth-child(1)")
	WebElement Addbutton;
	
	@FindBy (partialLinkText = "Add a payment method")
	WebElement Addpaymentplus;
	
	@FindBy (css = ".a-button-input")
	WebElement Addcreditcard;
	
	@FindBy (name = "addCreditCardNumber")
	WebElement CardNumber;
	
	@FindBy (name = "ppw-accountHolderName")
	WebElement Nameoncard;
	
	
	@FindBy (xpath = "/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[1]/span/span/span")
	WebElement month;
	
	@FindBy (xpath = "/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[3]/span/span/span")
	WebElement year;
	
	@FindBy (css = ".a-button-input")
	WebElement Addcard;
	
	@FindBy (css = ".a-button-input")
	WebElement Save;
	
	
	public POMpayment () {
		PageFactory.initElements(driver, this);
	}
	
	public static void capture (WebDriver driver) throws IOException {
		  File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("d://"+ System.currentTimeMillis()+" screenshot12.jpg"));
	  }
	//Sign In Steps
		public void step1 () {
			
		Actions hover = new Actions (driver);
		 
		 hover.moveToElement(mousehover).click().perform();
		
		}
		
		public void step2 () throws IOException {
			signinbutton.click();
		POMpayment.capture(driver);
			}
		public void step3 (String name) throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ap_email")));
			username.sendKeys(name);
			POMpayment.capture(driver);
		}
		public void step4 () throws IOException {
			Continuebutton.click();
			POMpayment.capture(driver);
			
			
		}
		public void step5 (String pass) throws IOException {
			password.sendKeys(pass);
			POMpayment.capture(driver);
		}
		
		public void checkboxclick () throws IOException {
			checkbox.click();
			POMpayment.capture(driver);
		}
		
		public void step6 () throws IOException {
			signin.click();
			POMpayment.capture(driver);
		}
		//Account Module Steps
		
		public void Accountstep2 () throws IOException {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList")));
			String title = driver.getTitle();
			System.out.println (title);
			AccountnLists.click();
			POMpayment.capture(driver);
		}
		// AddPayment
		public void paymentstep1 () throws IOException {
			
			Addbutton.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".a-button-input")));
	boolean	Yourpaymentbutton =	driver.findElement(By.cssSelector(".a-button-input")).isEnabled();
			System.out.println(Yourpaymentbutton);
			POMpayment.capture(driver);
		}
		public void paymentstep2 () {
			Addpaymentplus.click();
			boolean yourpaymentbutton2 = driver.findElement(By.cssSelector(".a-button-input")).isEnabled();
			System.out.println(yourpaymentbutton2);
		}
	    public void paymentstep3 (String number, String name) throws InterruptedException, IOException {
	    	Thread.sleep(10000);
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".a-button-input")));
	    	Addcreditcard.click();
	    	Thread.sleep(5000);
	    	POMpayment.capture(driver);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pp-BcCTEI-15")));
	    	driver.findElement(By.cssSelector("#pp-BcCTEI-15")).sendKeys(number);;
	    	driver.findElement(By.cssSelector("#pp-BcCTEI-17")).sendKeys(name);
	    	
	    	month.click();
	    	driver.findElement(By.partialLinkText("05"));
	    	year.click();
	    	driver.findElement(By.partialLinkText("24"));
	    		Addcard.click();
	    		boolean savebutton = driver.findElement(By.cssSelector(".a-button-input")).isEnabled();
	    		System.out.println(savebutton);
	    		Save.click();
	    	boolean success =	driver.findElement(By.cssSelector(".a-color-success")).isDisplayed();
	    	System.out.println(success);
	    }
		
}
