package orderModule;

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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseAMZ.BaseAMZ;

public class POMOrderModule extends BaseAMZ {
	WebDriverWait wait;
Actions hover ;
Select drop;
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
	
	//  Order Module
	
	@FindBy (css = "div.ya-card-row:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > span:nth-child(1)")
	WebElement orders;
	
	@FindBy (css = "#a-autoid-1-announce")
	WebElement orderdropdown;
	
	@FindBy ( css = "#time-filter_2")
	WebElement yearwise;
	
	@FindBy (css = "html.a-ws.a-js.a-audio.a-video.a-canvas.a-svg.a-drag-drop.a-geolocation.a-history.a-webworker.a-autofocus.a-input-placeholder.a-textarea-placeholder.a-local-storage.a-gradients.a-transform3d.a-touch-scrolling.a-text-shadow.a-text-stroke.a-box-shadow.a-border-radius.a-border-image.a-opacity.a-transform.a-transition.a-ember body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate div#a-page section.your-orders-content-container.aok-relative.js-yo-container div.your-orders-content-container__content.js-yo-main-content div.a-section.a-spacing-medium.page-tabs ul li.page-tabs__tab a.a-link-normal")
	WebElement buyagainlink;
	
	@FindBy (css = "li.page-tabs__tab:nth-child(3) > a:nth-child(1)")
	WebElement notyetshippedlink;
	
	@FindBy (css = "li.page-tabs__tab:nth-child(4) > a:nth-child(1)")
	WebElement cancelledorders;
	
	
	public POMOrderModule () {
		
		PageFactory.initElements(driver, this);	
	}
	
	//Sign In Steps
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
	wait = new WebDriverWait(driver, 20);
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
	//Account Module Steps
		
	 public void Accountstep () throws IOException {
		 
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
}
	public void Accountstep2 () throws IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList")));
		String title = driver.getTitle();
		System.out.println (title);
		AccountnLists.click();
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot9.jpg"));
	}
	
	// Orders
	
	public void Orderstep () throws IOException {
		
		orders.click();
		 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot10.jpg"));
	}
	public void Orderstep1 () throws IOException  {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-autoid-1-announce")));
		 orderdropdown.click();
		driver.findElement(By.partialLinkText("2022")).click();;
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcfile,new File("d://screenshot11.jpg"));
		
	}
	
	
 }

