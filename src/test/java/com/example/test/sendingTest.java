package com.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

// page_url = https://beta.movv.co
public class sendingTest {

    MainPage mainPage = new MainPage();

    @FindBy(css = "a[class='tabBtn ic_air on']")
    public WebElement linkAirport;
// asdasd
    public void search () {
        mainPage.searchButton.click();

        
        
    }

    public sendingTest(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}