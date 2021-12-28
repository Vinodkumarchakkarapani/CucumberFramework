package basic_component;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts();
		driver.get("https://letcode.in/windows");
		String windowHandle = driver.getWindowHandle();
		System.out.println("first Window: "+windowHandle);
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		// TODO Auto-generated method stub
//driver.close();
	}

}
