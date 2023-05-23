package practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
		Actions action = new Actions(driver);

		List<WebElement> source = driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));

		action.dragAndDrop(source.get(1), target).build().perform();
	}
}
