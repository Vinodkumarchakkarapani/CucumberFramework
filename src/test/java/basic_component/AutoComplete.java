package basic_component;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//vinod//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement input=driver.findElement(By.id("tags"))	;
		input.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> optionlist =driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(optionlist.size());
		for (WebElement webElement : optionlist) {
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println("selecting "+webElement.getText());
				break;
				
			}
			
		}
		// TODO Auto-generated method stub

	}

}
