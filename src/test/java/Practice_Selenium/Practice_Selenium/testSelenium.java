package Practice_Selenium.Practice_Selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testSelenium {
	public static WebDriver driver;
	
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	public static void main(String[] args) {
		setUp();
		driver.get("http://www.naukri.com/");
		System.out.println("url launch successfully ");
	     //handling multiple windows
		String mainWindow=driver.getWindowHandle();
		   Set<String>windows=driver.getWindowHandles();
		     Iterator<String>it=windows.iterator();
		     while(it.hasNext()) {
		    	 String childWindow=it.next();
		    	 if(mainWindow!=childWindow) {
		    		 driver.switchTo().window(childWindow);
		    		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		    		 driver.close();
		    	 }
		     }
		     driver.switchTo().window(mainWindow);
		     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		     WebDriverWait wait=new WebDriverWait(driver, 50);
		      WebElement tutarial=driver.findElement(By.xpath(""));
		    //Take screenshot in selenium.
		      TakesScreenshot screen=(TakesScreenshot)driver;
		      File scr=screen.getScreenshotAs(OutputType.FILE);
		      File file=new File("//");
		      //how to handleDropdown
		      WebElement drop=driver.findElement(By.xpath(""));
		      Select  dropDown=new Select(drop);
		   
		     
		      

	}

}
