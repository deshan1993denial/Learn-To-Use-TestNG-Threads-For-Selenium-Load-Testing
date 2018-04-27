package seleniumPrograms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LoadTestThreadpool 
{
	
	//invocationCount === The number of times this method should be invoked.
	//threadPoolSize ==	The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount. 
	//Note: this attribute is ignored if invocationCount is not specified
@Test(threadPoolSize=3,invocationCount=5)
public void Demo() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\deshanr\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//System.out.println("Thread ID: "+Thread.currentThread().getId());  
}
	
	
}
