package testBasic;

public class chromeDriver implements WebDriver {

	@Override
	public void navigate() {
		System.out.println("Navigating in chrome");
		
	}

	@Override
	public void deleteAllcookies() {
		System.out.println("delete all cookies in chrome");
		
	}

	@Override
	public void sendKeys(String x) {
		System.out.println("sendkeys in chrome");
		
	}

}
