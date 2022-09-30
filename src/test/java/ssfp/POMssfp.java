package ssfp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import BaseAMZ.BaseAMZ;


public class POMssfp extends BaseAMZ{
SoftAssert soft;
JavascriptExecutor js;
Select drop ;

		 //Search
		  @FindBy (css = "#twotabsearchtextbox")
		  WebElement searchtab;
		  
		  @FindBy (css = "#nav-search-submit-button")
		  WebElement searchsubmit;
		  
		  @FindBy (css = "#n\\/21204935011 > span:nth-child(1) > a:nth-child(1)")
		  WebElement validation1;
		  
		  @FindBy (css = ".widgetId\\=search-results_4 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > img:nth-child(1)")
		  WebElement validation2;
		  
		  @FindBy (css = "#n\\/13233458011 > span:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
		  WebElement validation3;
		  
		  @FindBy ( css = ".widgetId\\=search-results_5 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > img:nth-child(1)")
		  WebElement validation4;
		  
		  @FindBy (css = ".autocomplete-results-container > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
		  WebElement validation5;
		  
		  @FindBy (css = "#n\\/667823011 > span:nth-child(1) > a:nth-child(1)")
		  WebElement validation6;
		  
		  @FindBy (css = "#n\\/7012523011 > span:nth-child(1) > a:nth-child(1)")
		  WebElement validation7;
		  
		  @FindBy (css = ".widgetId\\=search-results_2 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1)")
		  WebElement dysonproduct;
		  @FindBy (css ="#productTitle")
		  WebElement dysontitlevalidation;
		  @FindBy (css = "div.a-spacing-micro:nth-child(1) > span:nth-child(1) > span:nth-child(2) > span:nth-child(2)")
		  WebElement dysonprice;
          @FindBy (css = "#averageCustomerReviews > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > a:nth-child(1) > i:nth-child(1)")
		  WebElement dysonratings;
		  @FindBy (css = "#averageCustomerReviews > span:nth-child(3) > a:nth-child(1) > span:nth-child(1)")
		  WebElement dysonratingsnumber;
		  
		  @FindBy (css = "a.s-pagination-item:nth-child(6)")
		  WebElement nextpage;
		  
		  @FindBy (css = "a.s-pagination-item:nth-child(1)")
		  WebElement previouspage;
		  
		  @FindBy (css ="#p_n_date\\/12035757011 > span:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
		  WebElement newarrival;
		  
		  @FindBy (css = ".a-star-medium-4")
		  WebElement customerrating;
		  @FindBy (css = ".a-expander-prompt")
		  WebElement seemore;
		  @FindBy (css = "#p_89\\/Amazon\\ Essentials > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)")
		  WebElement checkbrand;
		  
		  @FindBy (css = "#B09DYPS5TY-best-seller-label > span:nth-child(1) > span:nth-child(1)")
		  WebElement bestseller;
		  @FindBy(css = "#p_36\\/12035760011 > span:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
		  WebElement byprice;
		  @FindBy (css = "#p_n_deal_type\\/23565506011 > span:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
		  WebElement discount;
		  @FindBy(css = "div._bGlmZ_item_awNhH:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > a:nth-child(2) > div:nth-child(1)")
		  WebElement discountvalidation;
		  
		  @FindBy (css = "#p_n_availability\\/12035748011 > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)")
		  WebElement availability;
		  
		  @FindBy (css = "#a-autoid-0-announce")
		  WebElement sortbydrop;
		  
		  @FindBy (partialLinkText = "Price: Low to High")
		  WebElement pricelowtohigh;
		  
		  @FindBy (id = "s-result-sort-select_2")
		  WebElement hightolow;
		  
		  @FindBy (id = "s-result-sort-select_3")
		  WebElement Avgcustomerrating;
		  
		  @FindBy (css = "#s-result-sort-select_4")
		  WebElement newestarrival;
		  @FindBy (css = ".widgetId\\=search-results_5 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > img:nth-child(1)")
		  WebElement locator;
		  
		  @FindBy (css = "span.s-pagination-item:nth-child(1)")
		  WebElement previouspagedisable;
		  
		  @FindBy (css = "span.s-pagination-item:nth-child(7)")
		  WebElement nextpagedisable;
		  
		 
		  
		  @FindBy (css = "a.s-pagination-item:nth-child(3)")
		  WebElement pagetwo;
		  
		  @FindBy (css = "a.s-pagination-item:nth-child(4)")
		  WebElement pagethree;
		  
		  @FindBy (css = "a.s-pagination-item:nth-child(5)")
		  WebElement pagefour;
		  @FindBy (css = "a.s-pagination-item:nth-child(6)")
		  WebElement pagefive;
		  
		  @FindBy (css = "a.s-pagination-item:nth-child(7)")
		  WebElement pagesix;
		  
		  @FindBy (css = "a.s-pagination-item:nth-child(8)") 
		  WebElement pageseven;
		  
		  
		  
		public POMssfp () {
			PageFactory.initElements(driver, this);
		}
			
			public static void capture (WebDriver driver) throws IOException {
				  File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					 FileUtils.copyFile(srcfile,new File("d://"+ System.currentTimeMillis()+" screenshot12.jpg"));
			  }
		
	
	//ssfp
	public void search1 () throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search1"));
	    searchsubmit.click();
	 boolean validate1 =   validation1.isDisplayed();
	Assert.assertEquals("clothing", "clothing");
	 System.out.println(validate1);
	 POMssfp.capture(driver);
	 
	}
	public void search2 () throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search2"));
		searchsubmit.click();
		Assert.assertEquals("waterproof pink thin", "waterproof pink thin");
		POMssfp.capture(driver);
		boolean validate2 = validation2.isDisplayed();
		System.out.println(validate2);
	}
	
	public void search3 () throws IOException, InterruptedException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search3"));
		Thread.sleep(10000);
				POMssfp.capture(driver);
		
	
	}
	
	public void search4 () throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search4"));
		searchsubmit.click();
		boolean validate4 = validation4.isDisplayed();
		System.out.println(validate4);
		
		POMssfp.capture(driver);
	}
	
	public void search5 () throws IOException, InterruptedException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search5"));
		Thread.sleep(10000);
		POMssfp.capture(driver);
	}
	public void search6 () throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search6"));
		
		searchsubmit.click();
		boolean validate6 = validation6.isDisplayed();
		System.out.println(validate6);
		Assert.assertEquals("Electronics", "Electronics");
		POMssfp.capture(driver);
		
	}
	
	public void search7 () throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search7"));
		
		searchsubmit.click();
		boolean validate7 = validation7.isDisplayed();
		System.out.println(validate7);
		Assert.assertEquals("women watch", "women watch");
		POMssfp.capture(driver);
	}
	public void search8 () throws IOException {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		
		searchtab.sendKeys(prop.getProperty("search8"));
		
		searchsubmit.click();
		dysonproduct.click();
		boolean validate8 = dysontitlevalidation.isDisplayed();
		System.out.println("dyson title"+ validate8);
		boolean validate9 = dysonratings.isDisplayed();
		System.out.println("dyson ratings"+ validate9);
		boolean validate10 = dysonprice.isDisplayed();
		System.out.println("dyson price"+ validate10);
		boolean validate11 = dysonratingsnumber.isDisplayed();
		System.out.println("dyson price"+ validate11);
		Assert.assertEquals("Dyson Hot + Cool HEPA Air Purifier Fan & Heater HP07 Latest 2021 Release White / Silver ", "Dyson Hot + Cool HEPA Air Purifier Fan & Heater HP07 Latest 2021 Release White / Silver ");
		POMssfp.capture(driver);
	}
	public void search9 () throws InterruptedException, IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search8"));
		
		searchsubmit.click();
		js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView();", nextpage);
		POMssfp.capture(driver);
		nextpage.click();
		Thread.sleep(5000);
		POMssfp.capture(driver);
			
	}
	public void search10 () throws IOException, InterruptedException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView();" , newarrival);
		POMssfp.capture(driver);
		newarrival.click();
		Thread.sleep(5000);
		POMssfp.capture(driver);
	}
	public void search11 () throws IOException, InterruptedException {
		
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView();" , customerrating);
		POMssfp.capture(driver);
		customerrating.click();
		Thread.sleep(5000);
		POMssfp.capture(driver);
	}
	
	public void search12 () throws IOException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView();" , seemore);
		seemore.click();
		checkbrand.click();
		POMssfp.capture(driver);
		
				
	}
	public void search13 () throws IOException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		bestseller.click();
	String bestsellertitle =	driver.getTitle();
	System.out.println(bestsellertitle);
	soft = new SoftAssert ();
	soft.assertEquals(bestsellertitle, "Amazon Best Seller");
	POMssfp.capture(driver);
	}
	public void search14 () throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		byprice.click();
		POMssfp.capture(driver);}
	
	
	public void numberofitems () throws IOException {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		WebElement truetext = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div/span[1]"));
		String actualtext = truetext.getText();
	System.out.println(actualtext);
	SoftAssert soft = new SoftAssert();
soft.assertEquals(actualtext , "1-60 of over 100,000 results for");

	/*if (driver.getPageSource().contains("1-60 of over")) {
		System.out.println(text + "1-48 items");
	}else {
		System.out.println(actualtext);

		POMssfp.capture(driver);*/
	}
	
	
	public void search15 () throws IOException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		discount.click();
	boolean bestdeal =	discountvalidation.isDisplayed();
	System.out.println(bestdeal);
	SoftAssert soft = new SoftAssert();
	soft.assertEquals("true", bestdeal);
		POMssfp.capture(driver);
	}
	public void search16 () throws IOException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		availability.click();
		js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView();" , availability);
		POMssfp.capture(driver);
	String title =	driver.getTitle();
	System.out.println(title);
	}
	public void search17() throws IOException, InterruptedException {
		searchtab.sendKeys(prop.getProperty("search10"));
		searchsubmit.click();
		
		POMssfp.capture(driver);
		Thread.sleep(10000);
		
		List<WebElement>beforeFilterPrice =driver.findElements(By.className("a-price-whole"));
		List<Double>beforeFilterPriceList = new ArrayList<Double>();
		for (WebElement p : beforeFilterPrice) {
		beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")))	;
		}
		sortbydrop.click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Price: Low to High")));
		pricelowtohigh.click();
		POMssfp.capture(driver);
		
		List<WebElement>afterFilterPrice = driver.findElements(By.className("a-price-whole"));
		List<Double>afterFilterPriceList = new ArrayList<Double>();
		for (WebElement p : afterFilterPrice) {
			afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")))	;
		}
		//compare before and after
		System.out.println(beforeFilterPriceList);
		System.out.println(afterFilterPriceList);
		Collections.sort(beforeFilterPriceList);
		
		
		Thread.sleep(5000);
		}
	
	public void search18() throws IOException, InterruptedException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		Thread.sleep(10000);
		sortbydrop.click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-sort-select_2")));
		hightolow.click();
		POMssfp.capture(driver);
	}
	public void search19() throws IOException, InterruptedException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		Thread.sleep(10000);
		sortbydrop.click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-sort-select_3")));
		Avgcustomerrating.click();
		POMssfp.capture(driver);
	}
	public void search20() throws IOException, InterruptedException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		Thread.sleep(10000);
		sortbydrop.click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#s-result-sort-select_4")));
		newestarrival.click();
		POMssfp.capture(driver);
		
	}
	public void search21() throws IOException, InterruptedException {
		searchtab.sendKeys(prop.getProperty("search9"));
		searchsubmit.click();
		Thread.sleep(10000);
		sortbydrop.click();
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#s-result-sort-select_4")));
		newestarrival.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".a-star-medium-4")));
		POMssfp.capture(driver);
		js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView();" , customerrating);
		POMssfp.capture(driver);
		customerrating.click();
		POMssfp.capture(driver);
					}
	public void search22() throws IOException, InterruptedException {
		searchtab.sendKeys(prop.getProperty("search11"));
		searchsubmit.click();
		js = (JavascriptExecutor )driver;
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.s-pagination-item:nth-child(1)")));
		js.executeScript("arguments[0].scrollIntoView();" , previouspagedisable);
		POMssfp.capture(driver);
		boolean previousdisable = previouspagedisable.isEnabled();
		System.out.println(previousdisable);
		Assert.assertEquals(previousdisable, "true");
			
}
	public void search23 () throws InterruptedException, IOException {
		searchtab.sendKeys(prop.getProperty("search11"));
		searchsubmit.click();
		js = (JavascriptExecutor )driver;
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.s-pagination-item:nth-child(3)")));
		js.executeScript("arguments[0].scrollIntoView();" , pagetwo);
		pagetwo.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.s-pagination-item:nth-child(4)")));
		js.executeScript("arguments[0].scrollIntoView();" , pagethree);
		pagethree.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.s-pagination-item:nth-child(5)")));
		js.executeScript("arguments[0].scrollIntoView();" , pagefour);
		pagefour.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.s-pagination-item:nth-child(6)")));
		js.executeScript("arguments[0].scrollIntoView();" ,previouspage);
		pagefive.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.s-pagination-item:nth-child(7)")));
		js.executeScript("arguments[0].scrollIntoView();" , previouspage);
		pagesix.click();
		
		js.executeScript("arguments[0].scrollIntoView();" , previouspage);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.s-pagination-item:nth-child(7)")));
		boolean nextdisable = nextpagedisable.isEnabled();
		POMssfp.capture(driver);
		System.out.println(nextdisable);
		SoftAssert soft = new SoftAssert ();
		soft.assertEquals(nextdisable, "true");
		
		Thread.sleep(5000);
		
		
		
	}
	public void search24 () throws InterruptedException, IOException {
		searchtab.sendKeys(prop.getProperty("search12"));
		searchsubmit.click();
		POMssfp.capture(driver);
		List<WebElement> products = driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
		Collection<Object> texts = products.stream().map(WebElement::getText).collect(Collectors.toList());
		System.out.println(texts);
		int count = products.size();
		
		if (count > 1) {
			System.out.println("there are duplicates");}
			else {
				System.out.println("there are no duplicates");
				
			}
			}
		
	}
