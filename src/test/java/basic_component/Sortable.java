package basic_component;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> sort=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		WebElement fromelement=sort.get(5);
		WebElement toelement=sort.get(0);
		Actions action=new Actions(driver);
		action.clickAndHold(fromelement);
		action.moveToElement(toelement);
		action.release(toelement);
		action.build().perform();
		// TODO Auto-generated method stub

	}

}
