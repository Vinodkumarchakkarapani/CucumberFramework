package basic_component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
private DragAndDrop() {}
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		//driver.get("http://www.leafground.com/pages/drop.html");
		WebElement drag =driver.findElement(By.id("draggable"));
		//@SuppressWarnings("deprecation")
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("draggable")));
		//System.out.println("wait for 30 sec"+wait);
		
		
		WebElement drop =driver.findElement(By.id("droppable"));
		//WebElement rdrop =driver.findElement(By.id("mydiv"));
		
		
		Actions action = new Actions(driver);
		
		
	action.clickAndHold(drag).moveToElement(drop).release(drop).pause(3000).build().perform();
	action.dragAndDropBy(drop, -145,-25).build().perform();
	//action.moveToElement(drop).clickAndHold(drag).release(drag).build().perform();
	//driver.wait(3000);
	//driver.close();
	//driver.quit();
	}

}
