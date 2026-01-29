package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPop_Up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(4000);
		WebElement sendWordFile = driver.findElement(By.xpath("//input[@type='file']"));
		sendWordFile.sendKeys("C:\\Users\\Sonu\\Downloads\\52001 wp sudarshan  Mini Project (1).docx");
		Thread.sleep(2000);
		driver.quit();
	}

}
