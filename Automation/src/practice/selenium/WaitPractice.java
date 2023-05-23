package practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("Chrome", "https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
//		Wait wait = new FluentWait(driver)
//				.withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(java.util.NoSuchElementException.class);

		System.out.println("Title Before Login" + driver.getTitle());

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		System.out.println("Title After Login" + driver.getTitle());

		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
