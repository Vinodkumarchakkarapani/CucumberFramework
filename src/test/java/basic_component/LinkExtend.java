package basic_component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExtend {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		   WebElement link= driver.findElement(By.linkText("Go to Home Page"));
		link.click();
		driver.navigate().back();
		 WebElement whereToGo= driver.findElement(By.partialLinkText("Find where"));
		 String withOut=whereToGo.getAttribute("href");
		 System.out.println("this link is going to"+withOut);
		 WebElement broken= driver.findElement(By.linkText("Verify am I broken?"));
		   broken.click();
		   String title=driver.getTitle();
		   if(title.contains("xxx")) {
			   System.out.println("link is broken");
		   }
		   driver.navigate().back();
		   WebElement link1= driver.findElement(By.linkText("Go to Home Page"));
		   link1.click();
		   driver.navigate().back();
		  List<WebElement> total= driver.findElements(By.tagName("a"));
		  int linktotal=total.size();
		  System.out.println("total links : "+linktotal);
		   // TODO Auto-generated method stu
	}

}
