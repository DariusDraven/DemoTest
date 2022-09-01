package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://store.epicgames.com/en-US/");

    }

}
