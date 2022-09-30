package shoppingCart;

import java.io.File;
import java.io.IOException;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import BaseAMZ.BaseAMZ;
import addPayment.POMpayment;

public class PomCart extends BaseAMZ{
	JavascriptExecutor js;
	Actions hover ;
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
		  
		  
	//shopping cart
		  
		  @FindBy (css = "#twotabsearchtextbox")
		  WebElement searchbox;
		  @FindBy (css = "#nav-search-submit-button")
		  WebElement submitbutton;
		  
		  @FindBy (css = ".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
		  WebElement product1;
		  
		  @FindBy (css = "#add-to-cart-button")
		  WebElement cart;
		  
		  @FindBy (css = "#nav-cart-count")
		  WebElement cartcount;
		  
		  @FindBy ( css = ".sc-product-image")
		  WebElement productimage;
		  
		  @FindBy (id = "sc-subtotal-amount-activecart")
		  WebElement subtotal;
		  
		  @FindBy (partialLinkText = "2")
		  WebElement quantity;
		  @FindBy (css = ".a-dropdown-prompt")
		  WebElement quantityagain;
		  
		  @FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div[2]/span/a/div/img")
		  WebElement product2;
		  	  
		  @FindBy (xpath = "/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]") 
		  WebElement product2title;
		  
		  		  
		  @FindBy (xpath = "/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[4]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]")
		  WebElement product1title;
		  
		
		  
		  @FindBy (css = ".sc-product-image")
		  WebElement productimageprinter;
		  
		  @FindBy (xpath= "/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[4]/div[4]/div/div[2]/p/span")
		  WebElement price1;
		  		  		  
		  @FindBy (xpath = "/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/p/span")
		  WebElement price2;
		 
		  @FindBy (xpath = "/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")
		  WebElement delete;
		  @FindBy (css = "span.a-size-small:nth-child(3) > span:nth-child(1) > input:nth-child(1)")
		  WebElement delete2;
		  
		  @FindBy (css = "#sc-buy-box-ptc-button > span:nth-child(1) > input:nth-child(1)")
		  WebElement checkout;
		  @FindBy (css = ".ship-to-this-address > span:nth-child(1) > a:nth-child(1)")
		  WebElement deliveryaddress;
		  @FindBy (css = "#pp-A1Cl5y-67 > span:nth-child(1) > input:nth-child(1)")
		  WebElement Addpayment;
		  
		  
		  
		  
		  public PomCart () {
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
	
	
				public void cart1 (String search13) throws IOException {
					searchbox.sendKeys(search13);
					PomCart.capture(driver);
					submitbutton.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")));
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product1);
					PomCart.capture(driver);
					product1.click();
					cart.click();
					cartcount.click();
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , productimage);
					PomCart.capture(driver);
					boolean image = productimage.isDisplayed();
					System.out.println (image);
					boolean subtotalresult = subtotal.isDisplayed();
					System.out.println (subtotalresult);
					PomCart.capture(driver);
					WebElement truetext = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span"));
					String actualtext = truetext.getText();
				System.out.println(actualtext);
				SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualtext , "Vermont Teddy Bear - Fuzzy Soft & Cuddly Bear, 18 inches, Brown");
				}
	
				public void cart2 (String search13) throws IOException {
					searchbox.sendKeys(search13);
					PomCart.capture(driver);
					submitbutton.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")));
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product1);
					PomCart.capture(driver);
					product1.click();
					cart.click();
					cartcount.click();
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , productimage);
					PomCart.capture(driver);
					
				boolean quantityresult =	quantity.isDisplayed();
				System.out.println( "quantity is 2 , it is " + quantityresult);
				PomCart.capture(driver);
					
					String price = driver.findElement(By.cssSelector(".sc-product-price")).getText();
					 
					price = price.replace("$", "");
					System.out.println(price);
					
					double priceValue = Double.valueOf(price).intValue();
					System.out.println ("PriceValue : " +priceValue);
					double total = priceValue * 2;
					System.out.println(total);
					
					
					boolean subtotalresult = subtotal.isDisplayed();
					System.out.println ("subtotal is " + subtotalresult);
					
							System.out.println("No match");
											
					PomCart.capture(driver);
					
					}
				public void cart3 (String search13) throws IOException, InterruptedException {
					searchbox.sendKeys(search13);
					PomCart.capture(driver);
					submitbutton.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")));
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product1);
					PomCart.capture(driver);
					product1.click();
					cart.click();
					Thread.sleep(2000);
					searchbox.clear();
					Thread.sleep(5000);
					searchbox.sendKeys(search13);
					submitbutton.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")));
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product1);
					PomCart.capture(driver);
					product1.click();
					cart.click();
					searchbox.clear();
					Thread.sleep(5000);
					searchbox.sendKeys(search13);
					submitbutton.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")));
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product1);
					PomCart.capture(driver);
					product1.click();
					cart.click();
					searchbox.clear();
					Thread.sleep(5000);
					searchbox.sendKeys(search13);
					submitbutton.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")));
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product1);
					PomCart.capture(driver);
					product1.click();
					cart.click();
					cartcount.click();
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , productimage);
					PomCart.capture(driver);
				boolean	quantityresult = quantityagain.isDisplayed();
				System.out.println( "quantity is 4 , it is " + quantityresult);
				String Q = quantityagain.getText();
				System.out.println( Q);
				PomCart.capture(driver);
					
					
				}
				public void cart4 (String search13, String search14) throws IOException, InterruptedException {
					searchbox.sendKeys(search13);
					PomCart.capture(driver);
					submitbutton.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".widgetId\\=search-results_8 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")));
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product1);
					PomCart.capture(driver);
					product1.click();
					Thread.sleep(5000);
					cart.click();
					
					Thread.sleep(5000);
					
					searchbox.clear();
					
					searchbox.sendKeys(search14);
					submitbutton.click();
					Thread.sleep(2000);
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , product2);
					product2.click();
					
					cart.click();
					driver.findElement(By.cssSelector("#attachSiNoCoverage > span:nth-child(1) > input:nth-child(1)")).click();
					Thread.sleep(2000);
					cartcount.click();
					js = (JavascriptExecutor )driver;
					js.executeScript("arguments[0].scrollIntoView();" , productimage);
					PomCart.capture(driver);
				
					//validate image
					boolean productimage1 = productimage.isDisplayed();
					System.out.println(productimage1 + "teddy image is there");
					
					boolean productimage2 = productimageprinter.isDisplayed();
					System.out.println(productimage2 + "printer is there");
				
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[1]")));
					
					//validate title
					
					String actualtext = product1title.getText();
				System.out.println(actualtext);
				SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualtext , "Vermont Teddy Bear - Fuzzy Soft & Cuddly Bear, 18 inches, Brown");
					
					String title2 = product2title.getText();
					System.out.println(title2);
					soft.assertEquals(title2 , "HP OfficeJet Pro 8025e All-in-One Wireless Color Printer for Home Office, with Bonus 6 Months Free Instant Ink with HP+, Compatible with Alexa (1K7K3A)" );	
					
					
				PomCart.capture(driver);
				
				// validate price
				
					String p1 = price1.getText();
					System.out.println (p1);
					Assert.assertEquals(p1, "$45.99");
					String p2 = price2.getText();
					System.out.println (p2);
					Assert.assertEquals(p2, "$229.99");
					
					
				}
				
				public void cart5 () throws IOException {
					cartcount.click();
			String subtotalcart = 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[3]/span[2]/span")).getText();
			System.out.println(subtotalcart);
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(subtotalcart, "$275.98");
			PomCart.capture(driver);
			
				}
				public void cart6 () throws IOException {
					cartcount.click();
					delete.click();
					String subtotalcart = 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[3]/span[2]/span")).getText();
					System.out.println(subtotalcart);
					SoftAssert soft = new SoftAssert();
					soft.assertEquals(subtotalcart, "$229.99");
					PomCart.capture(driver);
				}
				public void cart7 () throws IOException {
					cartcount.click();
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-size-small:nth-child(3) > span:nth-child(1) > input:nth-child(1)")));
					delete2.click();
					SoftAssert soft = new SoftAssert();
				String empty =	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/div/div/h1")).getText();
				soft.assertEquals(empty, "Your Amazon Cart is empty.");
				System.out.println(empty);
					String subtotalcart = 		driver.findElement(By.id("sc-subtotal-label-activecart")).getText();
					System.out.println(subtotalcart);
					
					soft.assertEquals(subtotalcart, "$0");
					PomCart.capture(driver);
}
				public void cart8 () throws InterruptedException, IOException {
					cartcount.click();
					Thread.sleep(5000);
					driver.findElement(By.cssSelector(".a-truncate-cut")).click();
					
					Thread.sleep(10000);
					
					PomCart.capture(driver);
						String title =	driver.getTitle();
				System.out.println (title);
				PomCart.capture(driver);
				
				}
				public void cart9 () throws InterruptedException, IOException {
					cartcount.click();
					Thread.sleep(5000);
					checkout.click();
					PomCart.capture(driver);
					deliveryaddress.click();
					PomCart.capture(driver);
					Addpayment.click(); 
					PomCart.capture(driver);
					
					
					
}
}
