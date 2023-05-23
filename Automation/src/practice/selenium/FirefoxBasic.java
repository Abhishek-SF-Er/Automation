package practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:/Workspace/Automation/executables/geckodriver.exe");
		WebDriver fdriver = new FirefoxDriver();
		fdriver.manage().window().maximize();
		fdriver.get("https://www.facebook.com/");
		String title = fdriver.getTitle();
		String url = fdriver.getCurrentUrl();
		String psource = fdriver.getPageSource();
		System.out.println("Title : " + title);
		System.out.println("Title Length : " + title.length());
		System.out.println("URL : " + url);
		System.out.println("Page Source : " + psource);
		System.out.println("Page Source Length : " + psource.length());
		fdriver.close();

	}

}
