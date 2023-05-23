package practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoBlaze {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("chrome", "https://www.demoblaze.com");
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Device Count is : " + deviceList.size());
		System.out.println("Below are Devices : ");
		for (int i = 0; i < deviceList.size(); i++) {
			System.out.println(deviceList.get(i).getText());
		}
		driver.close();
	}

}
