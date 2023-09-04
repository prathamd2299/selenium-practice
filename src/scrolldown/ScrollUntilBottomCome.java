package scrolldown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilBottomCome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling upto webpage bottom come
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		// Scrolling upto webpage top come
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		driver.quit();
	}

}
