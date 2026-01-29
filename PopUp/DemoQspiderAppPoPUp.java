package PopUp;
import java.awt.Robot;
import java.nio.file.WatchEvent;
import java.sql.Driver;

import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspiderAppPoPUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
		Thread.sleep(2222);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.dismiss();
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		Alert conformAlert=driver.switchTo().alert();
		System.out.println(conformAlert.getText());
		ale.dismiss();
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		Alert conform3=driver.switchTo().alert();
		System.out.println(conform3.getText());
		ale.dismiss();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deleteButton")).click();
		Thread.sleep(2000);
		Alert conform4=driver.switchTo().alert();
		System.out.println(conform4.getText());
		ale.accept();

		Thread.sleep(2000);
		//authntication pop 
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		//fileUploadPopup
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fullName")).sendKeys("tudarshan tishan glave");
		Thread.sleep(1000);
		driver.findElement(By.id("emailId")).sendKeys("tudarshantishanglave@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("password@Gmail.com");
		Thread.sleep(200);
		driver.findElement(By.id("mobile")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Chennai']")).click();
		Thread.sleep(1000);
	    WebElement fileResumesend =	driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(1999);
		fileResumesend.sendKeys("C:\\Users\\Sonu\\Downloads\\Sprial_Soft_Copy_.docx");
//		fileResumesend
        driver.findElement(By.xpath("//option[text()='Express']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()='Receive job alerts according to your skills']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Create Profile']")).click();
        Thread.sleep(1000);
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
