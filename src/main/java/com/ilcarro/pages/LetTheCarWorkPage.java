package com.ilcarro.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LetTheCarWorkPage extends BasePage {

    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="pickUpPlace")
    WebElement pickUpPlace;

    @FindBy(id="make")
    WebElement make;

    @FindBy(id="model")
    WebElement model1;
    @FindBy(id="year")
    WebElement year1;
    @FindBy(css="div.pac-item")
    WebElement pacitem;
    public LetTheCarWorkPage enterValidData(String location, String manufacture,String model,String year ) {

        type(pickUpPlace,location);
        click(pacitem);
        type(make, manufacture);
        type(model1, model);
        type(year1, year);
        return this;
    }
@FindBy(id="fuel")
    WebElement fuel;
    public LetTheCarWorkPage enterFuel(String diesel) {
    Select select = new Select(fuel);
    select.selectByVisibleText(diesel);
        return this;
    }

    @FindBy(id="seats")
    WebElement seats1;

    @FindBy(id="class")
    WebElement class1;

    @FindBy(id="serialNumber")
    WebElement serialNumber;
    @FindBy(id="price")
    WebElement price1;


    public LetTheCarWorkPage enterSeatsClassRegistrationNrPrice(String seats, String carClass, String registration,
                                                           String price) {
        type(seats1, seats);
        type(class1, carClass);
        type(serialNumber, registration);
        type(price1, price);
        return this;
    }

    @FindBy(id="about")
    WebElement about;

    public LetTheCarWorkPage enterAboutText(String text) {
        about.sendKeys(text);
        return this;
    }

    @FindBy(id="photos")
    WebElement photo;
   public LetTheCarWorkPage uploadPhoto(String photoPath) {

     photo.sendKeys(photoPath);
       return this;
}

    @FindBy( xpath = "//button[@type='submit']")
    WebElement submitButton;
    public LetTheCarWorkPage submit() {

        click(submitButton);

        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement carAdded;
    public LetTheCarWorkPage successMessageDisplay() {
        assert isElementDisplayed(carAdded);
        return this;
    }
}
