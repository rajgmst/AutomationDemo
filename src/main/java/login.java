import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login<Webdriver> {
	
			@BeforeMethod
			public void setUp() throws Exception {
			}
		
			@SuppressWarnings("null")
			@AfterMethod
			public void tearDown() throws Exception {
				
			}

			@Test
   			public void login() throws InterruptedException, IOException {
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
				WebDriver driver = null;
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://sit1.geniqtek.com/iHMO_SMG_iModuleLogin/Login.aspx");
				driver.manage().window().maximize();
				WebElement username = driver.findElement(By.xpath("//*[@id=\"UserName\"]"));
				username.sendKeys("raj@gmst.ie");
				WebElement password  = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
				password.sendKeys("Gmstraj2022$");
				driver.findElement(By.xpath("//*[@id=\"iStarSpanButton\"]")).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				System.out.println("qMetrics Login is Sucessful");
				driver.findElement(By.id("ctl00_lbLogOut")).click();
			    driver.switchTo().alert().accept();
			    driver.close();
				
				
			}

			
			
}
