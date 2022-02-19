package testBasic;

public class testscript {

	public static void main(String[] args) {
		
		WebDriver driver = new chromeDriver();
		
		WebDriver driver1 = new fireFoxDriver();
		
		
		driver.deleteAllcookies();
		
		driver1.deleteAllcookies();

	}

}
