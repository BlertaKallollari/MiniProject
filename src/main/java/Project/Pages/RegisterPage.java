package Project.Pages;

import Project.Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage {

    public static final String LOGIN_BTN_XPATH = "//a[@class='ico-login']";
    public static final String WELCOME_LBL_XPATH = "//div[@class='page-title']";
    public static final String REGISTER_BTN_XPATH = "//button[text()='Register']";
    public static final String GENDER_BTN_CSS = "input[name='Gender']";
    public static final String FIRSTNAME_FIELD_CSS = "input[id='FirstName']";
    public static final String LASTNAME_FIELD_CSS = "input[id='LastName']";
    public static final String DATE_OF_BIRTH_CMB = "//select[@name='DateOfBirthDay']";
    public static final String MONTH_CMB = "//select[@name='DateOfBirthMonth']";
    public static final String YEAR_CMB = "//select[@name='DateOfBirthYear']";
    public static final String EMAIL_FIELD = "input[id='Email']";
    public static final String COMPANY_FIELD = "input[id='Company']";
    public static final String NEWS_CHB = "//input[@id='Newsletter']";
    public static final String PASSWORD_FIELD = "//input[@id='Password']";
    public static final String CONFIRM_PASSWORD_FIELD = "//input[@id='ConfirmPassword']";
    public static final String REGISTER_ACCOUNT_BTN = "//button[@id='register-button']";
    public static final String RESULT_TXT = "div[class='result']";
    public static final String LOGOUT_LINK = "//a[@class='ico-logout']";
    public static final String IMAGE_ID ="nivo-slider";
    public static final String CONTINUE_BTN_XPATH = "//button[text()='Continue']";

    public RegisterPage() {
        PageFactory.initElements((Driver.getDriver()), this);
    }

    @FindBy(xpath = LOGIN_BTN_XPATH)
    public WebElement loginMenuButton;

    @FindBy(xpath = WELCOME_LBL_XPATH)
    public WebElement welcomeLabel;

    @FindBy(xpath = REGISTER_BTN_XPATH)
    public WebElement registerButton;

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

    @FindBy(xpath = NEWS_CHB)
    public WebElement newsChb;

    @FindBy(xpath = PASSWORD_FIELD)
    public WebElement passwordField;

    @FindBy(xpath = CONFIRM_PASSWORD_FIELD)
    public WebElement confirmPassField;

    @FindBy(xpath = REGISTER_ACCOUNT_BTN)
    public WebElement registerAccountButton;

    @FindBy(css = RESULT_TXT)
    public WebElement resultLabel;

    @FindBy(xpath = LOGOUT_LINK)
    public WebElement logOutLink;

}

