import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\elyakhmanova\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://automated-testing.info");


        /*// Тест 1: Переход с главной страницы к списку обсуждаемых тем
        MainPage mainPage = new MainPage(driver);
        mainPage.clickTop();

        // Тест 2:
        AboutPage aboutPage = new AboutPage(driver);
        aboutPage.getHeadingText();*/
    }
}
