package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyRobot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Robot bot= new Robot();
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_O);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_U);
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
