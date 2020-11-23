package navigationcommnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jyothi\\Desktop\\chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		//driver.close();

	}

}
