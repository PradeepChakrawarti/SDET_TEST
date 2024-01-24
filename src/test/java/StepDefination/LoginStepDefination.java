package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
WebDriver driver;

@Given("Open the browser Enter the URL")
public void open_the_browser_Enter_the_URL() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "D:\\SDET 101\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
}

@Given("Make sure url is correct")
public void make_sure_url_is_correct() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.get("https://the-internet.herokuapp.com/login");
	Thread.sleep(1000);

}

@When("Enter user name")
public void enter_user_name() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.id("username")).sendKeys("tomsmith");
}

@When("Enter User password")
public void enter_User_password() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
   
}

@When("Click on login")
public void click_on_login() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//button[@class='radius']")).click();
}

@Then("User Successfully log in")
public void user_Successfully_log_in() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User succussfully lognedin");
 
}

@Then("Home page Should display")
public void home_page_Should_display() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User succussfully  is in Home page");
}

}
