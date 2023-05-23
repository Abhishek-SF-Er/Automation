package practice.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("Chrome", "https://demo.automationtesting.in/Register.html");

		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByVisibleText("1990");

		Select month = new Select(driver.findElement(By.cssSelector("select[placeholder='Month']")));
		month.selectByVisibleText("November");

		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByVisibleText("30");
		List<Integer> days = new ArrayList<Integer>();
		for (int i = 1; i < day.getOptions().size(); i++) {
			String s = day.getOptions().get(i).getText();
			days.add(Integer.parseInt(s));
		}
		List<Integer> dupDays = new ArrayList<Integer>(days);
		// dupDays.addAll(days);
		Collections.sort(dupDays);
		System.out.println(days.equals(dupDays));

		driver.close();
	}
}
