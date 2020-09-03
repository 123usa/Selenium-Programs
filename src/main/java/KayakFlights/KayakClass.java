package KayakFlights;
import org.junit.Assert;
//import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KayakClass {

	private static WebDriver driver = null;
	private static final String browser = "chrome";
	private static final String url = "http://www.kayak.com";
	private static final long sleepTime = 3000;
	private static final Utils util = new Utils();
	private static int SelectResultEntryNumberFromTheList = 3;
	private static final String[] originCities = { "AMD", "LAX", "SFO"};
	private static final String[] mDestinationCities = { "SFO", "AMD", "AMD"};
	private static int counter = 0;
	private static final String FLIGHT_TAB = "/html/body/div[1]/div/div[2]/div/div/header/div/div[2]/nav/div/div[2]/a";
	private static final String COMPARE_SOURCE_ADDRESS = "/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/span[1]";
	private static final String COMPARE_DESTINATION_ADDRESS = "/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/span[3]";

	public static void main(String[] args) {
	
		
		
		
			getBrowser(browser);
			System.setProperty("chrome.driver.webdriver","C:\\Users\\neeru\\Downloads\\chromedriver_win32");
	       driver.get(url);
		   util.printLog("Browser Trigger successful; Page Loaded");

		
	       driver.findElement(By.xpath(FLIGHT_TAB)).click();		
		  util.printLog("Flight linked opened");
		  util.sleep(sleepTime); 
          	
		  searchTrips();

		
		  selectSearchResult(SelectResultEntryNumberFromTheList);


		  util.printLog("Test completed. Closing the browser.");
		  driver.close();
	}

	
	
	
	
	public static void getBrowser(String browser) {
		util.printLog("Trying to trigger " + browser + " browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} 
	}

	
	public static void enterTravelCities(String origin, String destination) {
		driver.findElement(By.id("origin")).sendKeys(origin);
		driver.findElement(By.id("destination")).sendKeys(destination);
	}

	
	public static void selectDates() {
		driver.findElement(By.id("travel_dates-start-wrapper")).click();
		driver.findElement(By.id("travel_dates-start-wrapper")).click();
		util.sleep(sleepTime);
		if (counter == 0) {
			// First Iteration (Flight Search Initial Page)
			driver.findElement(
					By.xpath("/html/body/div[10]/div[3]/span[2]/span[2]/span[4]/span[4]/span"))
					.click();
			util.printLog("Departure Date Selected");
			util.sleep(sleepTime);
			driver.findElement(By.id("travel_dates-end-wrapper")).click();
			driver.findElement(
					By.xpath("/html/body/div[10]/div[4]/span[2]/span[2]/span[4]/span[3]/span"))
					.click();
			util.printLog("Arrival Date Selected");
		} else {
			
			driver.findElement(
					By.xpath("/html/body/div[8]/div[3]/span[2]/span[2]/span[4]/span[4]/span"))
					.click();
			util.printLog("Departure Date Selected");
			util.sleep(sleepTime);
			driver.findElement(By.id("travel_dates-end-wrapper")).click();
			driver.findElement(
					By.xpath("/html/body/div[8]/div[4]/span[2]/span[2]/span[4]/span[3]/span"))
					.click();
			util.printLog("Arrival Date Selected");
		}
	}

	public static void searchTrips() {
		for (int i = 0; i < originCities.length; i++) {
			clearSearchCriteria();


      
			util.sleep(sleepTime);
			enterTravelCities(originCities[i], mDestinationCities[i]);
			util.printLog("Origin City - " + originCities[i]
					+ " Destination City - " + mDestinationCities[i]);


			driver.findElement(By.name("nearbyO")).click();
			driver.findElement(By.id("nearbyD")).click();
			util.printLog("Nearby checkbox selected");


			selectDates();
			
			if (counter == 0) {
				driver.findElement(By.id("fdimgbutton")).click();
				util.sleep(sleepTime);
			} else {
				
				util.printLog("Inside else Condition. Trying to click the search button");
				if (counter == 0) {
					util.printLog("Clicking the search button first time");
					driver.findElement(
							By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[10]/button"))
							.click();
				} else {
					util.printLog("Clicking the search button second/third time");
					driver.findElement(
							By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/form/div/div[6]/button"))
							.click();
				}
			}

			util.sleep(sleepTime);



			if (counter > 0) {
				WebElement dialogBox = driver.findElement(By
						.id("dialogContentnull"));
				util.printLog("Ad Dialog Showed up - "
						+ dialogBox.getAttribute("visible"));
				if (Boolean.getBoolean(dialogBox.getAttribute("visible"))) {
					driver.findElement(
							By.xpath("/html/body/div[10]/div[2]/div[1]/div[2]"))
							.click();
				}
			}



			util.printLog("Comparing the entered source/destination cities with the cities in the flight search list");
			compareDestinations(originCities[i], mDestinationCities[i]);

			// Press the search button to look for the results
			util.printLog("Iteration - " + (i + 1)
					+ " completed. Starting the next iteration");
			counter++;
		}
	}

	public static void clearSearchCriteria() {
		if (counter != 0) {
			driver.findElement(
					By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[10]/button"))
					.click();
		}
		driver.findElement(By.id("origin")).clear();
		driver.findElement(By.id("destination")).clear();
	}

	public static void compareDestinations(String origin, String destination) {


		String sourceCity = driver
				.findElement(
						By.xpath(COMPARE_SOURCE_ADDRESS))
				.getText();
		String destinationCity = driver
				.findElement(
						By.xpath(COMPARE_DESTINATION_ADDRESS))
				.getText();



				
		Assert.assertTrue("The Origin Cities do not match",
				origin.contains(sourceCity));
		Assert.assertTrue("The destination cities do not match",
				destination.contains(destinationCity));
	}

	public static void selectSearchResult(int n) {
		util.printLog("Selecting the search result as per the user input");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[8]/div[" + n+ "]/div/div/div[1]/div[2]/span[1]/a/span")).click();
	}

}
 