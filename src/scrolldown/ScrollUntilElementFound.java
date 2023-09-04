package scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilElementFound {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scrolling untill specific element found
		WebElement el = driver.findElement(By.xpath("//button[@id='mousehover']"));
		js.executeScript("arguments[0].scrollIntoView();", el);

		driver.quit();
	}
}
