package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloSelenium {

	public static void main(String[] args) {
		
	    String key = "webDriver.chrome.driver";
	    String location = "‪C:\\Users\\Agile1Tech\\Desktop\\programmingLibraries\\chromedriver.exe";
		
		System.setProperty(key, location);
		
		WebDriver driver = new ChromeDriver();
		
		
		System.out.println("this is first selenium class");	
		
		

	}

}
