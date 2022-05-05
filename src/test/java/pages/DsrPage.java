package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DsrPage extends CommonMethods {

    @FindBy(id= "1")
    public WebElement firstnameField;

    @FindBy(id = "2")
    public WebElement lastnameField;

    @FindBy(id = "3")
    public WebElement emailField;

    @FindBy(id = "4")
    public WebElement phoneField;

    @FindBy(xpath = "//input[@value='Male']")
    public WebElement genderOption;

    @FindBy(id = "5")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@id='99']")
    public WebElement submitButton;

    public DsrPage(){
        PageFactory.initElements(driver, this);
    }
}
