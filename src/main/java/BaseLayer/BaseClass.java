package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static WebDriver driver;
	public static void initialization()
	{
		
		// up casting 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://ui.cogmento.com/");
	}

}
