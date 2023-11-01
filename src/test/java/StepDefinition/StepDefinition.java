package StepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    @Given("navigate")
    public void navigate (){
       WebDriver driver = new ChromeDriver();
        //navigate chrome
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

    }
}
