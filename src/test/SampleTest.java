package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class SampleTest 
{

	@BeforeSuite(alwaysRun = true)
    @Parameters({ "requestId", "reportPath", "Environment", "ExecutionType",
                  "ApplicationToTest" }) 
	public void beforeFixture()
	{
		
	}

	@Parameters({ "browser", "browserVersion", "os", "dataSource" })
	@BeforeClass
	public void beforeClassTest()
	{
		
	}
	
	@Test
	public void doTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.softcrylic.com");
		driver.findElement(By.id("solutions-button")).click();
		driver.findElement(By.linkText("Microsoft .NET Development")).click();
		driver.findElement(By.linkText("E-commerce Development")).click();
		driver.findElement(By.id("li4")).findElement(By.tagName("a")).click();
		driver.findElement(By.className("partner_logo")).findElement(By.tagName("a")).click();

		driver.quit();
	}
	
	
}
