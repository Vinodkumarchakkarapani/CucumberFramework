package basic_component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> column=driver.findElements(By.tagName("th"));
		int columncount=column.size();
		System.out.println("column size "+columncount);
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		int rowCount=row.size();
		System.out.println("row size "+rowCount);
		
		WebElement getpercent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following::td[1]"));
	String percent=getpercent.getText();
	System.out.println("get percentage:"+percent);
	
	List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
	List<Integer> numberlist= new ArrayList<Integer>(); 
	for (WebElement webElement : allProgress) {
		String individual=webElement.getText().replace("%","");
		 
		numberlist.add(Integer.parseInt(individual));
		System.out.println("final list"+numberlist);
	int smallvalue=Collections.min(numberlist);
	System.out.println("minimum value: "+smallvalue);
	String smallvalues=Integer.toString(smallvalue)+"%";
	String finalXpath="//td[normalize-space()="+"\""+smallvalues +"\""+"]"+"//following::td[1]";
	System.out.println(finalXpath);
	WebElement check=driver.findElement(By.xpath(finalXpath));
	check.click();
	}
	}

}
