package practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Mine.setUp("chrome", "https://www.flipkart.com");
		Actions action = new Actions(driver);

		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		List<WebElement> menu = driver.findElements(By.cssSelector("._37M3Pb>div>a>*:last-child"));

		System.out.println("Below are Menu List : ");
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i).getText());
			action.moveToElement(menu.get(i)).perform();
			Thread.sleep(1000);
		}
		driver.close();
	}
}
