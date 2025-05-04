package seleniumProject;







		



		import java.time.Duration;

		import java.util.Set;



		import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.WebElement;

		import org.openqa.selenium.chrome.ChromeDriver;

		import org.openqa.selenium.interactions.Actions;

	import org.openqa.selenium.support.ui.ExpectedConditions;

	import org.openqa.selenium.support.ui.WebDriverWait;



		public class ntervueTest1 {



		    



			public static void main(String[] args) throws InterruptedException {



		        // Setup ChromeDriver and maximize window

		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();



		        // Implicit wait for elements to load

		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



		        // Navigate to the Intervue.io homepage

		        driver.get("https://www.intervue.io/");



		        // Initialize Actions class for mouse hover actions

		        Actions actions = new Actions(driver);



		        // Hover over top navigation menu items one by one

		        actions.moveToElement(driver.findElement(By.id("products"))).perform();

		        Thread.sleep(2000);

		        actions.moveToElement(driver.findElement(By.id("solutions"))).perform();

		        Thread.sleep(2000);

		        actions.moveToElement(driver.findElement(By.xpath("(//span[text()='Pricing'])[1]"))).perform();

		        Thread.sleep(2000);

		        actions.moveToElement(driver.findElement(By.id("resources"))).perform();

		        Thread.sleep(2000);

		        actions.moveToElement(driver.findElement(By.id("contact-us"))).perform();

		        Thread.sleep(2000);



		        // Store the current window handle

		        String mainWindow = driver.getWindowHandle();



		        // Click on the Login button

		        driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();



		        // Handle new window if opened

		        Set<String> allWindows = driver.getWindowHandles();

		        for (String windowHandle : allWindows) {

		            if (!windowHandle.equals(mainWindow)) {

		                driver.switchTo().window(windowHandle);



		                // Click Login on the popup

		                driver.findElement(By.xpath("(//div[text()='Login'])[1]")).click();



		                // Enter login credentials

		                driver.findElement(By.id("login_email")).sendKeys("neha@intervue.io");

		                driver.findElement(By.id("login_password")).sendKeys("Neha@567intervue");



		                // Click the Submit button

		              //button[@type='submit']
		                WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		                Actions actions1 = new Actions(driver);
		                actions.moveToElement(element).click().perform();

		


		                Thread.sleep(2000);

		            }

		        }



		        // Click on search icon

		        driver.findElement(By.xpath("//span[@class='HeaderSearch__SearchLensIconWrap-sc-1140h69-2 hVEOxf']")).click();



		      

				// Enter search query
		      
		   
		     JavascriptExecutor js = (JavascriptExecutor) driver;
		     Boolean exists = (Boolean) js.executeScript(
		       "return document.querySelector(\"input[placeholder='Type what you want to search for']\") !== null;");
		     System.out.println("Element exists: " + exists);
		     
		     WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Type what you want to search for']"));


		        searchBox.sendKeys("hello");

		      

		        // Click on the first search result (or desired result)

		        driver.findElement(By.xpath("//div[@class='style__Wrapper-pqpu-0 gpWKdX']")).click();



		        // Click on profile name or icon to open dropdown

		        driver.findElement(By.xpath("//div[@class='ant-dropdown-link ProfileHeader__StyedDropdownHoverLink-sc-1gwp6c1-3 cwhrSp']")).click();



		        // Hover over profile-related menu options

		        WebElement billing = driver.findElement(By.xpath("//a[text()='Billing']"));

		        WebElement teams = driver.findElement(By.xpath("//a[text()='Teams']"));

		        WebElement integrations = driver.findElement(By.xpath("//a[text()='Integrations']"));

		        WebElement settings = driver.findElement(By.xpath("//a[text()='Settings']"));



		        actions.moveToElement(billing).perform();

		        Thread.sleep(2000);

		        actions.moveToElement(teams).perform();

		        Thread.sleep(2000);

		        actions.moveToElement(integrations).perform();

		        Thread.sleep(2000);

		        actions.moveToElement(settings).perform();

		        Thread.sleep(2000);



		        // Click on Logout

		        driver.findElement(By.xpath("//a[text()='Logout']")).click();
		        Thread.sleep(4000);



		        // Close the browser

		        driver.quit();

		    }

		

	}


