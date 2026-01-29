package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		//for the cssSelector 
		driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("Simple alert Text."+simpleAlert.getText());
		Thread.sleep(1000);
		simpleAlert.accept();
		
		//Conformation alert
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(1000);
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("conformation Alert:"+confirmAlert.getText());
		confirmAlert.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);

		Alert prompt =driver.switchTo().alert();
		System.out.println("prompt Alert text:"+prompt.getText());
		prompt.sendKeys("Sonuuuuuuuu");
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
