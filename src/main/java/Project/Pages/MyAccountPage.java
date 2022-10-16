package Project.Pages;

import Project.Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage {

    public static final String MY_ACCOUNT_CSS= "a[class='ico-account']";
    public static final String GENDER_BTN_CSS = "input[name='Gender']";
    public static final String FIRSTNAME_FIELD_CSS = "input[id='FirstName']";
    public static final String LASTNAME_FIELD_CSS = "input[id='LastName']";
    public static final String DATE_OF_BIRTH_CMB = "//select[@name='DateOfBirthDay']";
    public static final String MONTH_CMB = "//select[@name='DateOfBirthMonth']";
    public static final String YEAR_CMB = "//select[@name='DateOfBirthYear']";
    public static final String EMAIL_FIELD = "input[id='Email']";
    public static final String COMPANY_FIELD = "input[id='Company']";

    public  MyAccountPage() {
        PageFactory.initElements((Driver.getDriver()), this);
    }

    @FindBy(css = MY_ACCOUNT_CSS)
    public WebElement accountLink;

    @FindBy(css = GENDER_BTN_CSS)
    public List<WebElement> genderOptions;

    @FindBy(css = FIRSTNAME_FIELD_CSS)
    public WebElement firstNameField;

    @FindBy(css = LASTNAME_FIELD_CSS)
    public WebElement lastNameField;

    @FindBy(xpath = DATE_OF_BIRTH_CMB)
    public WebElement dateOfBirthSelect;

    @FindBy(xpath = MONTH_CMB)
    public WebElement monthOfBirthSelect;

    @FindBy(xpath = YEAR_CMB)
    public WebElement yearOfBirthSelect;

    @FindBy(css = EMAIL_FIELD)
    public WebElement emailField;

    @FindBy(css = COMPANY_FIELD)
    public WebElement companyFiled;

}
