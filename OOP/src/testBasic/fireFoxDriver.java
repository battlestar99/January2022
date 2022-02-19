package testBasic;

public class fireFoxDriver implements WebDriver {

	@Override
	public void navigate() {
		System.out.println("navigage in firefox");
		
	}

	@Override
	public void deleteAllcookies() {
		System.out.println("deleteAllcookiesin firefox");
		
	}

	@Override
	public void sendKeys(String x) {
		System.out.println("deleteAllcookies in firefox");
		
	}

}

