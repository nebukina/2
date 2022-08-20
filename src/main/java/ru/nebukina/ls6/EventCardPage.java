package ru.nebukina.ls6;

import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventCardPage extends BasePage{

    public EventCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class = \"event-card__caption\"]//a[@title=\"StandUp Show\"]")
    public WebElement standUpCard;
    @FindBy(xpath = "//div[@class=\"poster sm:poster--sm\"]//a[@title=\"StandUp Show\"]")
    public WebElement getStandUpCardBuy;

    String xpathSuCBuy = "//div[@class=\"poster sm:poster--sm\"]//a[@title=\"StandUp Show\"]";

    public void  activeCard(){
                actions.moveToElement(standUpCard)
                .build()
                .perform();
    }

    public void activeCardBuy(){
        webDriverWait.until(ExpectedConditions.visibilityOf(getStandUpCardBuy));
        Assertions.assertEquals(
                driver.findElement(By.xpath(xpathSuCBuy).isDisplayed(),true));
    }




}
