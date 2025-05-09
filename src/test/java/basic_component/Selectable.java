package basic_component;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//vinod//Downloads//chromedriver-win64 (1)//chromedriver-win64//chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize(); 
//      driver.manage().window().getSize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement heros = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select myheros = new Select(heros);
		
		List<WebElement> selectable= myheros.getAllSelectedOptions();
		for(WebElement webelement : selectable) {
			System.out.println(webelement.getText());
		}
		
//		System.out.println(selectable);
		int listsize=selectable.size();
		System.out.println(listsize);
		Actions action= new Actions(driver);
//		action.keyDown(Keys.CONTROL).click(selectable.get(0).click(selectable.get(1)).click(selectable.get(2))).build().perform();
//		action.keyDown(Keys.CONTROL).click(selectable.get(0).click(selectable.get(1)).click(selectable.get(2))).build().perform();
		// TODO Auto-generated method stub
		action.click();
action.clickAndHold(selectable.get(0));
action.clickAndHold(selectable.get(2));
action.clickAndHold(selectable.get(4));
action.build().perform();
System.out.println(selectable);
	}

}
