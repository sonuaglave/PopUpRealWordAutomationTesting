package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEasyMttripApp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/0");
		Thread.sleep(5000);
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("srlabel")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
