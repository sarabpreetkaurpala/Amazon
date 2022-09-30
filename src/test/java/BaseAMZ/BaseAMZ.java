package BaseAMZ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Timeutils;

public class BaseAMZ {
	public static Properties prop = new Properties ();
	public static WebDriver driver;
	public static WebDriverWait wait;	
	public BaseAMZ () {
	try {
		FileInputStream File = new FileInputStream ("C:\\Users\\sarab\\eclipse-workspace\\AMAZON\\Config");
		prop.load(File);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		catch (IOException a) {
			a.printStackTrace();
	}
	}
	public static void initiate () {
		String browsername = prop.getProperty("browser");
		
		if (browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver ();
			
		}
		else if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver(); 
			WebDriverWait wait = new WebDriverWait (driver, 30);
	driver.get(prop.getProperty("url"));	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Timeutils.timepage, TimeUnit.SECONDS);
			}				
	}
}
	
	
	

	

