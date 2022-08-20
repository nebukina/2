package ru.nebukina.ls5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KassirTest {
    WebDriver driver;
    WebDriverWait WebDriverWait;
    Actions actions;
    private static final String Kassir_URL = "https://kassir.ru/";

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser(){
        driver = new ChromeDriver();
        WebDriverWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        actions = new Actions(driver);
    }

    @Test
    void actionEventCard() throws InterruptedException {
        driver.get(Kassir_URL);
        driver.findElement(By.id("city-select-button")).click();
        driver.findElement(By.xpath("//a[.=\"Нижний Новгород\"]")).click();
        actions.moveToElement(driver.findElement(
                By.xpath("//div[@class = \"event-card__caption\"]//a[@title=\"StandUp Show\"]")))
                .build()
                .perform();
        WebDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class=\"poster sm:poster--sm\"]//a[@title=\"StandUp Show\"]")));
        Assertions.assertEquals(
                driver.findElement(By.xpath("//div[@class=\"poster sm:poster--sm\"]//a[@title=\"StandUp Show\"]")).isDisplayed(),true);

    }

    @AfterEach
    void closeBrowser(){
        driver.quit();
    }
}
