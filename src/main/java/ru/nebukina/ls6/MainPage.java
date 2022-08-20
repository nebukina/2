package ru.nebukina.ls6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage{
        public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "city-select-button")
    public WebElement citySelectButton;

    public void clickCitySelectButton(){
        citySelectButton.click();
    }

    @FindBy(xpath = ("//a[.=\"Нижний Новгород\"]"))
    public  WebElement selectNn;

    public void selectNnChoice(){
        selectNn.click();
    }

}
