package travelSimply;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class travelRun {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\seleniumBasic\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://travel.testsigma.com/signup");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement fullName = driver.findElement(By.id("name"));
		WebElement emailId = driver.findElement(By.id("emailid"));
		WebElement phone = driver.findElement(By.id("phone"));
		WebElement address = driver.findElement(By.id("address"));
		
		WebElement ageRange = driver.findElement(By.xpath("//*[@id=\"formid\"]/div[3]/div[1]/div/div[1]/label/span"));
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"formid\"]/div[3]/div[2]/div/div[1]/label"));
		WebElement hobby = driver.findElement(By.xpath("//*[@id=\"formid\"]/div[4]/div[1]/div/div[2]/label/span"));
		WebElement interest = driver.findElement(By.xpath("//*[@id=\"formid\"]/div[4]/div[2]/div/div[3]"));
		
		WebElement password = driver.findElement(By.id("pass"));
		WebElement Cpassword = driver.findElement(By.id("cpass"));
		
		WebElement profilePic = driver.findElement(By.xpath("//*[@id=\"formid\"]/div[6]/div/div[1]/input"));
		WebElement register = driver.findElement(By.xpath("//*[@id=\"btnid\"]/button"));
		
		
		fullName.sendKeys("John Doe");
		emailId.sendKeys("john@gmail.com");
		phone.sendKeys("7871237654");
		address.sendKeys("Fairfax, Virginia");
		
		Thread.sleep(2000);
		ageRange.click();
		gender.click();
		hobby.click();
		interest.click();
		
		Thread.sleep(2000);
		
		password.sendKeys("dklajfl");
		Cpassword.sendKeys("dklajfl");
		
		profilePic.sendKeys("C:\\Users\\Agile1Tech\\Desktop\\Manual Testing class\\class121221\\Defect\\2.PNG");
		
		register.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
