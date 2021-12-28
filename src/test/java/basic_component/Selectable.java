package basic_component;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> selectable= driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int listsize=selectable.size();
		System.out.println(listsize);
		Actions action= new Actions(driver);
		//action.keyDown(Keys.CONTROL).click(selectable.get(0).click(selectable.get(1)).click(selectable.get(2))).build().perform();
		//action.keyDown(Keys.CONTROL).click(selectable.get(0).click(selectable.get(1)).click(selectable.get(2))).build().perform();
		// TODO Auto-generated method stub
action.clickAndHold(selectable.get(0));
action.clickAndHold(selectable.get(2));
action.clickAndHold(selectable.get(5));
action.build().perform();
	}

}
