package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBasicOne {

	public static void main(String[] args) {
	
		//String key = "webdriver.chrome.driver";
	    //String location = "‪C:\\Users\\Agile1Tech\\Desktop\\programmingLibraries\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver","‪C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

	}

}
