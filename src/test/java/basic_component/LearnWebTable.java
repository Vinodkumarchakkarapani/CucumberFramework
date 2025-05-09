package basic_component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LearnWebTable {
	// private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinow\\OneDrive\\Desktop\\java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']//tr"));
	
		//List<WebElement> allRows =  driver.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']//tr")); 

		// And iterate over them and get all the cells 
		for (WebElement row : table) { 
		    List<WebElement> cells = row.findElements(By.tagName("td")); 

		    // Print the contents of each cell
		    for (WebElement cell : cells) {         

		    System.out.println(cell.getText());
		    //Or try below code 
		    //System.out.println(cell.getAttribute("
		
		
		    }
		    }
		    }
		
}
		
		/*List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);
		}

		List<WebElement> allrows = table.findElements(By.cssSelector("tr"));
		int size = allrows.size();
		System.out.println("Rows size: "+size);
		
		 * if(size ==3){ System.out.println("Pass"); }else System.out.println("fail");
		 
		for(WebElement row : allrows) {
			List<WebElement> colums =row.findElements(By.tagName("td"));
			WebElement firstColumn = colums.get(size);
				System.out.println(firstColumn.getText());
				}
		

				for (int i = 0; i < size; i++) { 
					List<WebElement> rows =allrows.get(i).findElements(By.tagName("td")); WebElement lastname =
						rows.get(1); String text = lastname.getText(); System.out.println(text);
						if(text.equals("Chatterjee")) { WebElement input =
								rows.get(3).findElement(By.tagName("input")); input.click(); break; }

				}



		}
	//driver.quit();
	

*///}
