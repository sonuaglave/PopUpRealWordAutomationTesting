package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDWSPageAlert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println("simple alert message"+alert.getText());
		alert.accept();
		
//		click login
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
