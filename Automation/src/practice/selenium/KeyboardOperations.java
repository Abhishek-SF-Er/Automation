package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyboardOperations {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("chrome", "https://www.flipkart.com");
		driver.findElement(By.cssSelector("html>body")).sendKeys(Keys.ESCAPE);

		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);

		driver.navigate().to("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abhishek",
				Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.CONTROL, "c"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));

		driver.close();
	}
}
