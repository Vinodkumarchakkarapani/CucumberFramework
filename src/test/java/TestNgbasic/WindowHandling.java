package TestNgbasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandling {

    @Test
    public void handleWindows() {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize(); // optional
        driver.get("https://www.leafground.com/dashboard.xhtml");

        // Store the main window handle
        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindow);

        // Click the button to open multiple windows
        driver.findElement(By.xpath("\"(//a[@href='#'])[5]\"")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Window')]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'Open')])[1]")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(allWindows);

        // Switch to the second window (index 1)
        if (windowList.size() > 1) {
            driver.switchTo().window(windowList.get(1));
            System.out.println("Switched to Window: " + driver.getCurrentUrl());
            driver.close();  // Close child window
        }

        // Switch back to main window
        driver.switchTo().window(mainWindow);
        System.out.println("Back to Main Window: " + driver.getCurrentUrl());

        driver.quit();
    }
}
