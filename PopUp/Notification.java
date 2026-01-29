package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Notification {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(7000);
		Robot bot = new Robot();
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		bot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
