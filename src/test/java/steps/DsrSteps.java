package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import utils.CommonMethods;
import utils.ConfigReader;

public class DsrSteps extends CommonMethods {

    @Given("user enters firstname")
    public void userEntersFirstname() {
        sendText(dsrPage.firstnameField, ConfigReader.getPropertyValue("firstname"));
    }

    @Given("user enters lastname")
    public void userEntersLastname() {
        sendText(dsrPage.lastnameField, ConfigReader.getPropertyValue("lastname"));
    }
    @Given("user enters email address")
    public void userEntersEmailAddress() {
        sendText(dsrPage.emailField,ConfigReader.getPropertyValue("email"));
    }
    @Given("user enters phone number")
    public void userEntersPhoneNumber() {
       sendText(dsrPage.phoneField, ConfigReader.getPropertyValue("phone"));
    }
    @Given("user select gender")
    public void userSelectGender() {
        click(dsrPage.genderOption);
    }
    @Given("user checks checkbox")
    public void userChecksCheckbox() {
    click(dsrPage.checkBox);
    }
    @Given("user clicks submit button")
    public void userClicksSubmitButton() throws InterruptedException {
        click(dsrPage.submitButton);
        Thread.sleep(2000);
        Alert al = driver.switchTo().alert();
        String expectedText = al.getText();
        System.out.println(expectedText);
        al.accept();
        String actualText = "{\"FirstName\":\"Ali\",\"LastName\":\"Kartal\",\"Email\":\"qa.kartal@gmail.com\",\"PhoneNumber\":\"905319475333\",\"Gender\":\"Male\",\"Agreement\":true}";
        Assert.assertEquals(actualText,expectedText);
    }
}
