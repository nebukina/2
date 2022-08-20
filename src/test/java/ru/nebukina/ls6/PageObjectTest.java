package ru.nebukina.ls6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectTest {
    WebDriver driver;
    WebDriverWait WebDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver(){
        driver = new ChromeDriver();
        driver.get("https://kassir.ru/");
    }

    @Test
    public void standUpCard(){
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCitySelectButton();
        mainPage.selectNnChoice();
        EventCardPage eventCardPage = new EventCardPage(driver);
        eventCardPage.activeCard();
        eventCardPage.activeCard();

    }
    @AfterEach
    void closeBrowser(){
        driver.quit();
    }
}
