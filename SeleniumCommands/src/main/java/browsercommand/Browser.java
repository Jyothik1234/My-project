package browsercommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jyothi\\Desktop\\chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("TITLE IS:" + title);
		
		if (driver.getTitle().equals("Selenium Easy - Best Demo website to practice Selenium Webdriver Online")) {
			System.out.println("TITLE OBTAINED");
		} else {
			System.out.println("TITLE IS NOT FOUND");
		}
		
		String q = driver.getCurrentUrl();
		System.out.println("CURRENT URL IS:" + q);

		//String z = driver.getPageSource();
		//System.out.println("PAGE SOURCE is:" + z);
		Thread.sleep(5000);
		//driver.close();
		//driver.quit();
	}

}
