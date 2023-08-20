package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotHandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		Thread.sleep(2000);
		
		 //Capturing the screenshot
		 
	     File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     //screenshot copied from buffer is saved at the mentioned path.
	     FileUtils.copyFile(src, new File("C:\\Users\\admin\\OneDrive\\Desktop\\selenium screenshot\\1.png"));
	     System.out.println("The Screenshot is captured.");
	     
	     //title 
	     WebElement e = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/h1[1]"));
	     File src1 = e.getScreenshotAs(OutputType.FILE);
	     //screenshot copied from buffer is saved at the mentioned path.
	     FileUtils.copyFile(src1, new File("C:\\Users\\admin\\OneDrive\\Desktop\\selenium screenshot\\2.jpeg"));
	     System.out.println("The Screenshot is captured.");
	     
	     //div container
	     WebElement e1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]"));
	     File src2 = e1.getScreenshotAs(OutputType.FILE);
	     //screenshot copied from buffer is saved at the mentioned path.
	     FileUtils.copyFile(src2, new File("C:\\Users\\admin\\OneDrive\\Desktop\\selenium screenshot\\3.jpg"));
	     System.out.println("The Screenshot is captured.");   
	     
	     Thread.sleep(2000);
	     driver.close();
	}

}
