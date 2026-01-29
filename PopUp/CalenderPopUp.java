package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2000);
		//calender withouttextfield
		driver.findElement(By.id("datepicker2")).sendKeys("09/12/2002");
		Thread.sleep(1000);
	//calender withtextfiled
		driver.findElement(By.className("col-xs-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
