package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class GoogleSreachSteps {

	private WebDriver driver;

	@Before
	public void setup() {


	}

	@Given("browser window is open")
	public void browser_window_is_open() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Win 10/eclipse-workspace/MyCucumberPJava/resources/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Inside Step - browser is open");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@And("user is on google search page")

	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - user is on goolge search page");
		driver.get("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside Step - user enters a text in search box");

		driver.findElement(By.name("q")).sendKeys("What is Cucumber Testing");

		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside Step - hits enter");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - user is navigated to search results");

		driver.getPageSource().contains("Introduction to Cucumber Testing Framework");
		driver.quit();

	}

	@After
	public void quitBrowser() {
		
	}

}
