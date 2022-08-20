package ru.nebukina.ls3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
    public static void main(String[] args) throws InterruptedException {
        //2
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.kassir.ru/");
        driver1.findElement(By.id("city-select-button")).click();
        driver1.findElement(By.xpath("//a[.=\"Нижний Новгород\"]")).click();
        //На момент тестирования вылетала ошибка gateway time-out(в ручном режиме тоже)

        Thread.sleep(5000);
    }
}
