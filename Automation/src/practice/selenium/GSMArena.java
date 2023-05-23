package practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GSMArena {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("chrome", "https://www.gsmarena.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> deviceList = driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("Device Count is : " + deviceList.size());
		System.out.println("Below are Devices : ");
		for (int i = 0; i < deviceList.size(); i++) {
			System.out.println(deviceList.get(i).getText());
		}

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='samsung-phones-9.php']")));
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();

		List<WebElement> samsungDevices = driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		System.out.println();
		System.out.println("Device Count is : " + samsungDevices.size());
		System.out.println("Below are Devices : ");
		for (int i = 0; i < samsungDevices.size(); i++) {
			System.out.println(samsungDevices.get(i).getText());
		}
		driver.close();
	}
}
