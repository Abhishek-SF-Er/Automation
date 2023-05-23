package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("Chrome", "https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().setSize(new Dimension(1300, 700));
		String homeTilte = driver.getTitle();
		System.out.println("Title : " + homeTilte);

		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Mobiles")));
		driver.findElement(By.linkText("Mobiles")).click();
		String MobilePageTilte = driver.getTitle();
		System.out.println("Title Now : " + MobilePageTilte);

		driver.navigate().back();
		String newHomeTitle = driver.getTitle();
		if (newHomeTitle.equals(homeTilte))
			System.out.println("Reached Home Page");
		else
			System.out.println("Something went Wrong");
		driver.close();
	}

}
