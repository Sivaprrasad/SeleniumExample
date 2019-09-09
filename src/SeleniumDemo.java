import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		// 1. setup selenium + your webdriver
			// Selenium + Chrome
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/sivaprrasad/Desktop/chromedriver ");
		WebDriver driver = new ChromeDriver();
		
		// 2. go to the website
		
				driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
				
		// 3. write code to do some stuff on that website
				
			// 3a.  type some nonsense into the single input box
				// -------------------------------------------------
				// - GET the box (the box has a unique id)
				WebElement inputBox = driver.findElement(By.id("user-message"));
				// - TYPE NONSESE INTO THE BOX
				inputBox.sendKeys("here is some nonsense");
				
			// 3b. Automatically push the submit button 
				// -------------------------------------------------
				// - GET the button
				WebElement showMessageButton = driver.findElement(
						By.cssSelector("form#get-input button"));
				// - PUSH the button
				showMessageButton.click();
				
		// 4. close the browser
				Thread.sleep(5000);
				driver.close();
		
		

	}

}
