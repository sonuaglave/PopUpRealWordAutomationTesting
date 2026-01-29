package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click()	;
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Tester Suda Test");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("testersudatest@gmai.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Test@gmail.com123");
		Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("9112426378");
		Thread.sleep(1000);
		driver.findElement(By.className("iconWrap")).click();
		Thread.sleep(1000);
		WebElement sendResumeExp = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(1000);
		sendResumeExp.sendKeys("C:\\Users\\Sonu\\Downloads\\Sudarshan_Aglave_All_Testing_ATS_Optimized.docx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send me important updates & promotions via SMS, email, and']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Register now']"));
		Thread.sleep(1000);
		
//		driver.findElement(null)
		Thread.sleep(2000);
		driver.quit();
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
