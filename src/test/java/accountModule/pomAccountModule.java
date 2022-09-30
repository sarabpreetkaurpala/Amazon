package accountModule;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseAMZ.BaseAMZ;

public class pomAccountModule extends BaseAMZ{
	Actions hover ;
	WebDriverWait wait;
	
	
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
	
	
	public pomAccountModule () {
		
		PageFactory.initElements(driver, this);	
	}
		
	
	//AccountModule
		
 public void Accountstep () throws IOException {
		 
		mousehover.click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-al-your-account")));
		boolean bannerresult = banner.isEnabled();
		System.out.println(bannerresult);
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot7.jpg"));
	 }
	 public void Accountstep1 () throws IOException {
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav_prefetch_yourorders")));
		 hover.moveToElement(mousehover).build().perform();
		 yourorders.click();
		 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot8.jpg"));
}
	public void Accountstep2 () throws IOException {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList")));
		String title = driver.getTitle();
		System.out.println (title);
		AccountnLists.click();
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot9.jpg"));
	}
 }
