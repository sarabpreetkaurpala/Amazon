package addressModule;

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

public class POMAddress extends BaseAMZ{
WebDriverWait wait;
Actions hover;	
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
	
	//Address module
	@FindBy (css = "div.ya-card-row:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)")
	WebElement clickaddress;
	
	
	@FindBy (css = "#ya-myab-plus-address-icon")
	WebElement addaddress;
	
	
	@FindBy (css = "#address-ui-widgets-countryCode > span:nth-child(1) > span:nth-child(1)")
	WebElement country;
	
	@FindBy (css = "#address-ui-widgets-enterAddressFullName")
	WebElement FullName;
	
	@FindBy (css = "#address-ui-widgets-enterAddressPhoneNumber")
	WebElement Number;
	
	@FindBy (css = "#address-ui-widgets-enterAddressLine1")
	WebElement AddressLine;
	
	@FindBy (css = "#address-ui-widgets-enterAddressCity")
	WebElement city;
	
	@FindBy (css = "#address-ui-widgets-enterAddressStateOrRegion")
	WebElement province;
	
	@FindBy (css = "#address-ui-widgets-enterAddressPostalCode")
	WebElement postalcode;
	
	@FindBy (css = "#address-ui-widgets-use-as-my-default")
	WebElement defaultcheckbox;
	
	@FindBy (css = ".a-button-input")
	WebElement submit;
	
	@FindBy (css = "#a-autoid-2 > span:nth-child(1) > input:nth-child(1)")
	WebElement save;
	
  public POMAddress () {
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
		POMAddress.capture(driver);
	
		}
	public void step3 (String name) throws IOException {
	wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ap_email")));
		username.sendKeys(name);
		POMAddress.capture(driver);
	}
	public void step4 () throws IOException {
		Continuebutton.click();
		POMAddress.capture(driver);
		
		
	}
	public void step5 (String pass) throws IOException {
		password.sendKeys(pass);
		POMAddress.capture(driver);
	}
	
	public void checkboxclick () throws IOException {
		checkbox.click();
		POMAddress.capture(driver);
	}
	
	public void step6 () throws IOException {
		signin.click();
		POMAddress.capture(driver);
	}
	//Account Module Steps
		
	/* public void Accountstep () throws IOException {
		 
		 hover.moveToElement(mousehover).build().perform();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-al-your-account")));
		boolean bannerresult = banner.isEnabled();
		System.out.println(bannerresult);
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot7.jpg"));
	 }
	 public void Accountstep1 () throws IOException {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav_prefetch_yourorders")));
		 hover.moveToElement(mousehover).build().perform();
		 yourorders.click();
		 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot8.jpg"));
} */
	public void Accountstep2 () throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList")));
		String title = driver.getTitle();
		System.out.println (title);
		AccountnLists.click();
		POMAddress.capture(driver);
	}
	public void Addressstep1 () throws IOException {
		clickaddress.click();
		POMAddress.capture(driver);
	}
	public void Addressstep2 () throws IOException {
		addaddress.click();
		POMAddress.capture(driver);
	}
	
	public void Addressstep3 () throws IOException {
	boolean result =	country.equals(driver.findElement(By.partialLinkText("Canada")));
		System.out.println(result);
		POMAddress.capture(driver);
	}
	
	public void Addressstep4 (String name) throws IOException {
		FullName.sendKeys(name);
		POMAddress.capture(driver);
		
	}
	public void Addressstep5 (String phone) throws IOException {
		Number.sendKeys(phone);
		POMAddress.capture(driver);
	}
	public void Addressstep6 ( String StreetName) throws IOException {
		AddressLine.sendKeys(StreetName);
		POMAddress.capture(driver);
	}
	public void Addressstep7 (String fullcity) throws IOException {
		city.sendKeys(fullcity);
		POMAddress.capture(driver);
		
	}
	public void Addressstep8 () {
		province.click();
		driver.findElement(By.partialLinkText("Ontario")).click();
		
	}
	public void Addressstep9 (String postal) throws IOException {
		postalcode.sendKeys(postal);
		POMAddress.capture(driver);
		
	}
	public void Addressstep10 () {
		defaultcheckbox.click();
	}
	public void Addressstep11 () throws IOException {
		submit.click();
		POMAddress.capture(driver);
	}
	public void Addressstep12 () throws IOException {
		save.click();
		POMAddress.capture(driver);
	}
	
}
