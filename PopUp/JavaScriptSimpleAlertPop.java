package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptSimpleAlertPop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.cssSelector(".button-1.search-box-button"));
//		Thread.sleep(2000);
//		Alert alr = driver.switchTo().alert();
//		System.out.println(alr.getText());
//		alr.accept();
//		driver.findElement(By.id("ico-login"));
//		Thread.sleep(2000);
//		driver.quit();
//		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'click']"));
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
