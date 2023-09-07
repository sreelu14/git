
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Automation {
	    public static void main(String[] args) throws InterruptedException {
	        // Set the path to the chromedriver executable


	        // Define the number of times to hit the website
	        int numIterations = 20;

	        for (int i = 0; i < numIterations; i++) {
	            // Create a new instance of the Chrome driver
	            WebDriver driver = new ChromeDriver();

	            // Open the website
	            driver.get("https://qualitek.ai/");
	            Thread.sleep(3000);
	           // driver.findElement(By.xpath("//p[normalize-space()='Key Services']")).click();
	            // Perform your desired actions on the website (e.g., clicking buttons, filling forms, etc.)

	            // Close the browser
	            driver.quit();
	        }
	    }
	}



