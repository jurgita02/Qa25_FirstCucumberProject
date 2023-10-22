package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.LetTheCarWorkPage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @When("User clicks on Let the car work link")
    public void click_On_Let_The_Car_Work (){
        new LoginPage(driver).clickOnLetTheCarWork();
    }

    @And("User enters all needed data")
    public void enter_Valid_Data(){
        LetTheCarWorkPage carWorkPage = new LetTheCarWorkPage(driver);
        carWorkPage.enterValidData("Tel Aviv, Israel","Toyota","Camri","15");
        carWorkPage.enterFuel("Diesel");
        carWorkPage.enterSeatsClassRegistrationNrPrice("5","5","548-0072-55","150");
        carWorkPage.enterAboutText("The price is for a daily rental. The minimum order time is 3 days.");
    }


    @And ("User uploads car photos")
   public void upload_Car_photo(){
      String photoPath="C:/Tools/1a.jpg";
       new LetTheCarWorkPage(driver).uploadPhoto(photoPath);
   }

    @And ("User submits the form")
    public void submit(){
        new LetTheCarWorkPage(driver).submit();
    }
    @Then("User verifies success message is displayed")
    public void verify_success_message(){
        new LetTheCarWorkPage(driver).successMessageDisplay();
    }
}
