package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
		static String browser="FF";
		static		String url="";
				static WebDriver d;
				
		public void launchBrowser()
		{
			if(browser.equals("FF"))
			{
				FirefoxDriver d = new FirefoxDriver();
				System.out.println("open firefox");
			}
			
			else  if(browser.equals("chrome"))
			{
				ChromeDriver d = new ChromeDriver();
				System.out.println("open chrome");
				
			}
			
			d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
			public void closeBrowser()
			{
				d.quit();
			}
	

public static void main(String[] args) {
}
}