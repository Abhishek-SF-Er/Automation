package practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch2 {

	public static void main(String[] args) {

		WebDriver driver = Mine.setUp("chrome", "https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.id("APjFqb")).sendKeys("Testing Interview Questions");

		List<WebElement> gSugg = driver
				.findElements(By.cssSelector("ul>li>*:nth-child(1)>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("Total suggestion count is : " + gSugg.size());

		for (int i = 0; i < gSugg.size(); i++) {
			if (gSugg.get(i).getText().equalsIgnoreCase("Testing Interview Questions for freshers")) {
				gSugg.get(i).click();
				break;
			}
		}
		wait.until(ExpectedConditions.titleIs("testing interview questions for freshers - Google Search"));
		if ("testing interview questions for freshers - Google Search".equalsIgnoreCase(driver.getTitle()))
			System.out.println("Validation Successful");
		else
			System.out.println("Validation Failed");
		driver.close();
	}
}
