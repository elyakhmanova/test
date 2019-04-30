import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\elyakhmanova\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://automated-testing.info");
        mainPage = new MainPage (driver);

    }

    // Тест 1: Проверяем, что при нажатии на кнопку "Обсуждаемые" происходит переход на страницу https://automated-testing.info/top
    @Test
        public void goTop() {
        TopPage topPage = mainPage.clickTop();
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://automated-testing.info/top", url);

    }

    @Test
    public void goAbout(){
        AboutPage aboutPage = mainPage.aboutLink();
        String heading = aboutPage.getHeadingText();
        Assertions.assertEquals("Информация про automated-testing.info", heading);

    }

   @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
