package wikipediasteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepWikipedia {
	
	public static WebDriver driver;
	
	
	@Given("User navigate to the Wikipedia {string}")
	public void user_navigate_to_the_wikipedia(String string) {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");
	}

	@When("User enter {string}")
	public void user_enter(String string) {
		WebElement element=driver.findElement(By.xpath("//input[@id='searchInput']"));
		element.sendKeys(string);
	}

	@When("User click the Search button")
	public void user_click_the_search_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User should be on {string} Page")
	public void user_should_be_on_page(String string) {
	    String title=driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}
}
