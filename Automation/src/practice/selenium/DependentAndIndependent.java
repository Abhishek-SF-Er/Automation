package practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DependentAndIndependent {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("chrome", "https://www.flipkart.com");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._2KpZ6l._2doB4z")));
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String s = driver
				.findElement(By.xpath("//div[a[contains(text(),'SAMSUNG 80 cm (32 Inch)')]]/a[3]/div[1]/div[1]"))
				.getText();
		System.out.println("Price of Samsung TV : " + s);

		driver.navigate().to("https://www.redbus.in");
		driver.findElement(By.id("src")).sendKeys("Pune");
		List<WebElement> source = driver.findElements(By.cssSelector(".autoFill>li"));
		for (int i = 0; i < source.size(); i++) {
			if (source.get(i).getText().equalsIgnoreCase("Pune")) {
				source.get(i).click();
				break;
			}
		}

//		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);

		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		List<WebElement> dest = driver.findElements(By.cssSelector(".autoFill>li"));

		for (WebElement e : dest) {
			if (e.getText().equalsIgnoreCase("Bangalore")) {
				e.click();
				break;
			}
		}

		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.cssSelector(".current.day")).click();
		driver.findElement(By.id("search_btn")).click();

//		wait.until(ExpectedConditions.presenceOfElementLocated(
//				By.xpath("//div[div[div[text()='VRL Travels']]]/div[6]/div/div[@class='fare d-block']/span")));
		String s1 = driver
				.findElement(By.xpath(
						"//div[div[div[text()='Sharma Transports']]]/div[6]/div/div[@class='fare d-block']/span"))
				.getText();
		System.out.println("Sharma Transports Fare from Pune to Bangalore is : " + s1);

		driver.close();
	}
}
