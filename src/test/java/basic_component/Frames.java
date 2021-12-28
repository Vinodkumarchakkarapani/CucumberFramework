package basic_component;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
	 WebElement button= driver.findElement(By.id("Click"));
	button.click();
	
	String text=driver.findElement(By.id("Click")).getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	 WebElement button1= driver.findElement(By.id("Click1"));
		button1.click();
	
		driver.switchTo().defaultContent();
		List<WebElement> button2 = driver.findElements(By.tagName("iframe"));
	
	int size =button2.size();
	System.out.println("no of frame:"+size);
	}
	

}
