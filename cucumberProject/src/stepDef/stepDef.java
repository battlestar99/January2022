package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.loginPage;


public class stepDef {
	
	WebDriver driver; 
	
	loginPage lp; 
	
	
	
	
	
	@Given("^precondition$")
	public void precondition()  {
	    
		System.out.println("pre condtion of the test");
	}

	@When("^user action one$")
	public void user_action_one() {
	  
		
		System.out.println("user action one");
	}

	@When("^user action two$")
	public void user_action_two() throws Throwable {
	  
		
		System.out.println("user action two");
	}

	@Then("^application response one$")
	public void application_response_one() {
	    
		System.out.println("applicaiton response one");
	}

	@Then("^application respone two$")
	public void application_respone_two()  {
	    
		System.out.println("applicaiton response two");
	}
	
	
	
	@Then("^c$")
	public void c() throws Throwable {
		System.out.println("this is c");
	}


	@Given("^a$")
	public void a()  {
	    
		System.out.println("this is a");
	}

	@When("^b$")
	public void b() throws Throwable {
		System.out.println("this is b");
	}

	
	// ------------------------------------------------
	

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws InterruptedException  {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\cucumberProject\\lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		lp = new loginPage(driver);
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
	   
	}

	@When("^user enters valid username$")
	public void user_enters_valid_username() {
	  
		
		lp.getUserName().sendKeys("standard_user");
		
		
		
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() {
		
		lp.getPassword().sendKeys("secret_sauce");
	   
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() {
	    
		lp.getloginButton().click();
	}

	@Then("^user should be in the product page$")
	public void user_should_be_in_the_product_page() {
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	    
	}

	@When("^user enters invalid username$")
	public void user_enters_invalid_username() {
		
		lp.getUserName().sendKeys("locked_out_user");
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() {
	   
		lp.getPassword().sendKeys("secret_sauce");
	}

	@Then("^user should stay in the login page$")
	public void user_should_stay_in_the_login_page() throws Throwable {
	   
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
	}
	
	@Given("^user is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\January_2022_WS\\cucumberProject\\lib\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
	   
	}

	@When("^user enters firstname$")
	public void user_enters_firstname() throws Throwable {
		
		driver.findElement(By.name("firstName")).sendKeys("john");
		
	   
	}

	@When("^user enters lastname$")
	public void user_enters_lastname()  {
		
		driver.findElement(By.name("lastName")).sendKeys("mitcehl");
		
	 
	}



	
	
	

}
