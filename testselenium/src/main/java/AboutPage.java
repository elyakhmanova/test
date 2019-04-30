import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
    WebDriver driver;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Заголовок страницы "Информация про automated-testing.info"
    private By aboutHeading = By.xpath("//*[@id=\"ember1231\"]/div/div/section[1]/h2");

    //Получение текста заголовка
    public String getHeadingText(){
        return driver.findElement(aboutHeading).getText();
    }


}
