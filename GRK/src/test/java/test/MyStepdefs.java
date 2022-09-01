package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.Console;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;


public class MyStepdefs {


    public static WebDriver driver;



    @Given("Open the page")
    public void openThePage() throws Exception {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");

        driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://steelseries.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



    }


    @When("Accept the cookie")
    public void acceptTheCookie() throws Throwable {
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[2]/button[2]")).click();

       // driver.findElement(By.xpath("//body/div[1]/div[2]/div[2]/button[2]\")")).click();




    }
    @Then("The cookie accepted")
    public void theCookieAccepted() {
    }

    @When("Login")
    public void login() throws Throwable {
        driver.findElement(By.xpath("/html/body/header/div/nav[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"js-modal-page\"]/div/div/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys("dariusdraventest@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("MandarinTest@");
        //System.out.println("DariusDravenTest@1");



    }


}
