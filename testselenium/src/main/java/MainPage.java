import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }



    //кнопка "Обсуждаемые"
    private By topButton = By.xpath("/html/body/section[3]/div/div[2]/div[3]/div/section/ul/li[2]/a");

    //ссылкa "Информация"
    private By aboutLink = By.xpath("//*[text()='ember6’]");

    //ссылка на раздел "Общие вопросы"
    private By obshieVoprosyLink = By.xpath("//*[@id=\"ember1117\"]");


    //метод клика на кнопку "Обсуждаемые"
    public TopPage clickTop(){
        driver.findElement(topButton).click();
        return new TopPage(driver);
    }

    //метод клика на ссылку "Информация"
    public AboutPage aboutLink(){
        driver.findElement(aboutLink).click();
        return new AboutPage(driver);
    }

    //Метод выбора раздела "Общие вопросы"
    public ObshieVoprosyPage obshieVoprosyLink(){
        driver.findElement(obshieVoprosyLink).click();
        return new ObshieVoprosyPage(driver);
    }

}