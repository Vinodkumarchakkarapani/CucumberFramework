package basic_component;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//vinod//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
	 WebElement button= driver.findElement(By.id("Click"));
	button.click();
	
	String text=driver.findElement(By.id("Click")).getText();
	System.out.println(text);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
//	driver.switchTo().frame("frame2");
//	 WebElement button1= driver.findElement(By.id("Click']"));
//	 
//		button1.click();
//		String text1=driver.findElement(By.id("Click")).getText();
//		System.out.println(text1);
//	
//		driver.switchTo().defaultContent();
		List<WebElement> button2 = driver.findElements(By.xpath("//button[text()='Count Frames']"));
	
	int size =button2.size();
	System.out.println("no of frame:"+size);
	}
	

}
