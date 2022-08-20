package ru.nebukina.ls3;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class SeleniumStart {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
        //1.Попытка регистрации ящика. Как выяснилось,Гугл в этом режиме начинает требовать ввода
        //телефона для подтверждения. При обычной ручной регистрации такого нет(
       driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
       String a = "Ivann";
       String b = "Ivannovv";
       driver.findElement(By.id("firstName")).sendKeys(a);
       driver.findElement(By.id("lastName")).sendKeys(b);
       Thread.sleep(2000);//гугл сам генерирует название ящика,поэтому ждем
                               // (не знаю как отследить появление там текста)
        String c = "GeekBrains22";
        driver.findElement(By.xpath("//input[@aria-label=\"Пароль\"]")).sendKeys(c);
        driver.findElement(By.xpath("//input[@aria-label=\"Подтвердить\"]")).sendKeys(c);
        driver.findElement(By.xpath("//span[.=\"Далее\"]")).click();

        Thread.sleep(5000);
       driver.quit();


    }
}
