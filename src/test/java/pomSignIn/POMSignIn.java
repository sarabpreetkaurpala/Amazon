package pomSignIn;

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

import BaseAMZ.BaseAMZ;

public class POMSignIn extends BaseAMZ {
	Actions hover;
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

	public POMSignIn () {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait (driver , 20);
	}
	public void step1 () {
		
		 hover = new Actions (driver);
		 
		 hover.moveToElement(mousehover).click().perform();
		 
			
		
		}
		
		public void step2 () throws IOException {
			signinbutton.click();
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("d://screenshot1.jpg"));
		
			}
		public void step3 (String name) throws IOException {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ap_email")));
			username.sendKeys(name);
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("d://screenshot2.jpg"));
		}
		public void step4 () throws IOException {
			Continuebutton.click();
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("d://screenshot3.jpg"));
			
			
		}
		public void step5 (String pass) throws IOException {
			password.sendKeys(pass);
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("d://screenshot4.jpg"));
		}
		
		public void checkboxclick () throws IOException {
			checkbox.click();
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("d://screenshot5.jpg"));
		}
		
		public void step6 () throws IOException {
			signin.click();
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(srcfile,new File("d://screenshot6.jpg"));
		}
	
	
	
	
	

}
