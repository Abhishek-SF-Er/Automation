package practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\Automation\\executables\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://demo.actitime.com/");
		String title = cdriver.getTitle();
		String url = cdriver.getCurrentUrl();
		String psource = cdriver.getPageSource();
		System.out.println("Title : " + title);
		System.out.println("Title Length : " + title.length());
		System.out.println("URL : " + url);
		System.out.println("Page Source : " + psource);
		System.out.println("Page Source Length : " + psource.length());
		cdriver.close();
	}

}
