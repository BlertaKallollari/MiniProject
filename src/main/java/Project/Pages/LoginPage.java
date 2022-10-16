package Project.Pages;

import Project.Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static final String EMAIL_FIELD_CSS = "input[id='Email']";
    public static final String LOGIN_BTN_XPATH = "//a[@class='ico-login']";
    public static final String PASSWORD_FIELD_XPATH = "//input[@id='Password']";
    public static final String LOGIN_ACCOUNT_BTN_XPATH = "//button[text()='Log in']";
    public static final String IMAGE_ID = "nivo-slider";
    public static final String LOGIN_RESULT_XPATH = "//*[text()='Welcome to our store']";
    public static final String LOGOUT_LINK ="//a[@class='ico-logout']";

    public LoginPage(){
        PageFactory.initElements((Driver.getDriver()), this);
    }

    @FindBy(xpath = LOGIN_BTN_XPATH)
    public WebElement loginMenuButton;

    @FindBy(css = EMAIL_FIELD_CSS)
    public WebElement emailField;

    @FindBy(xpath = PASSWORD_FIELD_XPATH)
    public WebElement passwordField;

    @FindBy(xpath = LOGIN_ACCOUNT_BTN_XPATH)
    public WebElement loginButton;

    @FindBy(xpath = LOGIN_RESULT_XPATH)
    public WebElement welcomeLabel;

    @FindBy(xpath = LOGOUT_LINK)
    public WebElement logoutLink;
}

