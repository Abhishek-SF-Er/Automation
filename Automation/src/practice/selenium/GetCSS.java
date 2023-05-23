package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCSS {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("td[style='padding-left:6px;']>span"), "class",
				"errormsg"));

		WebElement erMsg = driver.findElement(By.cssSelector("td[style='padding-left:6px;']>span"));
		System.out.println(erMsg.getCssValue("color"));
		System.out.println(erMsg.getCssValue("font-family"));
		System.out.println(erMsg.getCssValue("font-size"));
		System.out.println(erMsg.getCssValue("text-align"));
		System.out.println(erMsg.getCssValue("font-weight"));
		System.out.println(erMsg.getCssValue("line-height"));

		driver.close();
	}
}
