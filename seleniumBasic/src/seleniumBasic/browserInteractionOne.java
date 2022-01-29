package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserInteractionOne {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		
		// to maximize the window 
		
		driver.manage().window().maximize();
		
		// reading the value of current url 
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		// reading the title of the page 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.linkText("Help")).click();
		
		// its a java function, it stops any code for specific amount of time 
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
