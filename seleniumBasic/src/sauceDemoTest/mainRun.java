package sauceDemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginPage;

public class mainRun {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		loginPage lp = new loginPage(driver);
		
		
		
		

	}

}
