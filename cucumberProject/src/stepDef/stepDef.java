package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.cart;
import pages.checkOutStepTwo;
import pages.checkoutStepOne;
import pages.loginPage;
import pages.productPage;


public class stepDef {
	
	WebDriver driver; 
	
	loginPage lp; 
	cart ct; 
	checkoutStepOne csone; 
	checkOutStepTwo cstwo; 
	productPage pp; 
	
	
	int x ; 
	
	
	
	@After
	
	public void finishTest() {
		
		driver.quit();
		
	}
	
	
	
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
		 ct = new cart(driver); 
		 csone = new checkoutStepOne(driver); 
		 cstwo = new checkOutStepTwo(driver); 
		 pp = new productPage(driver); 
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
	   
	}

	@When("^user enters valid username$")
	public void user_enters_valid_username() {
	  
		//System.out.println(x);
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
		
	  Assert.assertEquals("https://www.saucedemo.com/inventory.html", url);
	    
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
	
	
	// end to end steps star here 
	

@When("^user add product to the cart$")
public void user_add_product_to_the_cart()  {
	
	pp.addBackpacktoCart().click();
	
	
    
}

@Then("^user should get the product to the cart$")
public void user_should_get_the_product_to_the_cart()  {
	
	pp.clickCart().click(); 
	
	String actualText = ct.getRemoveProductOne().getText(); 
	Assert.assertEquals("REMOVE", actualText);
	
  
}

@Then("^user should be able to go to checkout page$")
public void user_should_be_able_to_go_to_checkout_page()  {
	
	String url = driver.getCurrentUrl(); 
	//Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", url);
	
    
}

@Then("^user should be able to click on checkout$")
public void user_should_be_able_to_click_on_checkout() throws InterruptedException  {
	
	Thread.sleep(1000);
	boolean x = ct.getCheckOutbutton().isEnabled();
	ct.getCheckOutbutton().click();
	
	Assert.assertTrue(x);
  
}

@When("^user enters first name$")
public void user_enters_first_name()  {
  
	csone.getfirstName().sendKeys("michael");
}

@When("^user enters last name$")
public void user_enters_last_name() {
    csone.getlastName().sendKeys("john");
}

@When("^user enters zip code$")
public void user_enters_zip_code() throws Throwable {
    csone.getzipcode().sendKeys("74674");
}

@Then("^user should click on the continue button$")
public void user_should_click_on_the_continue_button()  {
   boolean x = csone.getContButton().isEnabled();
   csone.getContButton().click();
   
   Assert.assertTrue(x);
}

@Then("^user should be final checkout page$")
public void user_should_be_final_checkout_page()  {

	String url = driver.getCurrentUrl(); 
	Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", url);
	
}

@When("^user clicks on finish$")
public void user_clicks_on_finish()  {
  
	cstwo.getFinish().click();
}

@Then("^user should see successful order message$")
public void user_should_see_successful_order_message()  {
    
	String url = driver.getCurrentUrl(); 
	
	Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", url);
	
	
	
}

@When("^user enters username \"([^\"]*)\" in the login$")
public void user_enters_username_in_the_login(String username) throws Throwable {
    
	lp.getUserName().sendKeys(username);
}

@When("^user enters password \"([^\"]*)\" in the login$")
public void user_enters_password_in_the_login(String password) throws Throwable {
    lp.getPassword().sendKeys(password);
}

@Then("^user can be on the page based on the test data$")
public void user_can_be_on_the_page_based_on_the_test_data() throws Throwable {
  
	String actualUrl = driver.getCurrentUrl();
	
	Assert.assertEquals("https://www.saucedemo.com/inventory.html", actualUrl);
	
	
}

@Then("^user can stay or login to the page \"([^\"]*)\" based on test data$")
public void user_can_stay_or_login_to_the_page_based_on_test_data(String expectedUrl) throws Throwable {
    
     String actualUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(expectedUrl, actualUrl);	
	
}

@When("^user add a product to the cart$")
public void user_add_a_product_to_the_cart() {
    
	pp.addBackpacktoCart().click();
	
	
	
}

@Then("^user should see the remove option enabled$")
public void user_should_see_the_remove_option_enabled()  {
  
	String actualText = pp.removeBackpacktoCart().getText();
	String expectedText = "REMOVE";
	
	
	Assert.assertEquals(expectedText, actualText);
	
	
}

@When("^user click remove option$")
public void user_click_remove_option() throws InterruptedException  {
	
	Thread.sleep(1000);
	pp.removeBackpacktoCart().click();
	
	
    
}

@Then("^user should see the add option to cart is enabled$")
public void user_should_see_the_add_option_to_cart_is_enabled()  {
   
	
	String actualText = pp.addBackpacktoCart().getText();
	String expectedText = "ADD TO CART";
	
	
	Assert.assertEquals(expectedText, actualText);
	
	
}








	
	
	

}
