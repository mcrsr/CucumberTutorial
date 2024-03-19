package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

public class OrangeHRMSteps {

    WebDriver driver;

    @Given("user is on the login page screen")
    public void user_is_on_the_login_page_screen() {
        // WebDriverManager.chromedriver().setup();
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("headless");
        // driver = new ChromeDriver(options);
        // driver.manage().deleteAllCookies();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // driver.manage().window().maximize();
        // driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Hello World!");
    }
    @When("user enters the credentials {string} and {string}")
    public void user_enters_the_credentials_and(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("user is able to see the username at top right corner")
    public void user_is_able_to_see_the_username_at_top_right_corner() {
        Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed());
    }


    @When("user licks on the logout button")
    public void userLicksOnTheLogoutButton() {
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        driver.findElement(By.xpath("//*[@class='oxd-userdropdown-link' and text()='Logout']")).click();
    }

    @Then("he is able to see login screen again")
    public void heIsAbleToSeeLoginScreenAgain() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Login']")).isDisplayed());
    }
}
