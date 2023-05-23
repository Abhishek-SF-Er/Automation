package practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("Chrome", "https://www.google.com/");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Selenium");
		List<WebElement> googleSug = driver.findElements(
				By.cssSelector("ul>.sbct>*:first-child>*:nth-child(2)>div:nth-of-type(1)>div:nth-of-type(1)>span"));
		System.out.println("Total suggestion count is : " + googleSug.size());
		System.out.println("Below are Selenium suggestions : ");

		for (int i = 0; i < googleSug.size(); i++) {
			System.out.println(googleSug.get(i).getText());
		}
	}

}
