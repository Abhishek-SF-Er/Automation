package practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Cordinate {

	public static void main(String[] args) {
		WebDriver driver = Mine.setUp("chrome", "https://demo.actitime.com/login.do");

		WebElement uname = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		Point uCordinate = uname.getLocation();
		System.out.println("Username X cordinate : " + uCordinate.getX());
		System.out.println("Username Y cordinate : " + uCordinate.getY());

		WebElement pwd = driver.findElement(By.name("pwd"));
		Point pwdCordinate = pwd.getLocation();
		System.out.println("Password X cordinate : " + pwdCordinate.getX());
		System.out.println("Password Y cordinate : " + pwdCordinate.getY());

		WebElement check = driver.findElement(By.id("keepLoggedInLabel"));
		Point p1 = check.getLocation();
		System.out.println("Checkbox X cordinate : " + p1.getX());
		System.out.println("Checkbox Y cordinate : " + p1.getY());

		WebElement login = driver.findElement(By.id("loginButton"));
		Point p2 = login.getLocation();
		System.out.println("Login X cordinate : " + p2.getX());
		System.out.println("Login Y cordinate : " + p2.getY());

		driver.close();
	}
}
