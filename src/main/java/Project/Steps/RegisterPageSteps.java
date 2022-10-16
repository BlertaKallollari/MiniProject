package Project.Steps;

import Project.Driver.Driver;
import Project.GlobalVariables.GlobalVariables;
import Project.Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegisterPageSteps {

    private RegisterPage registerPage;
    private WebDriverWait driverWait = new WebDriverWait(Driver.getDriver(), 7);

    public RegisterPageSteps() {
        registerPage = new RegisterPage();
    }

    public void loginClick() {
        registerPage.loginMenuButton.click();
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(RegisterPage.IMAGE_ID)));
        System.out.println("Clicked the Login Menu bar");
    }

    public void registerClick() {
        registerPage.registerButton.click();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(RegisterPage.GENDER_BTN_CSS)));
        System.out.println("Clicked the Register button");
    }

    public void checkWelcomeLabel() {
        Assert.assertEquals(registerPage.welcomeLabel.getText(), GlobalVariables.WELCOME);
    }

    public void radioButtonGenderClick(final String value) {
        for (final WebElement el : registerPage.genderOptions) {
            if (el.getAttribute("value").equalsIgnoreCase(value)) {
                el.click();
                break;
            }
        }
    }

    public void fieldFirstName(String value) {
        registerPage.firstNameField.sendKeys(value);
    }

    public void fieldLastName(String value) {
        registerPage.lastNameField.sendKeys(value);
    }

    public void selectDay(final String valueDay) {
        final Select day = new Select(registerPage.dateOfBirthSelect);
        day.selectByVisibleText(valueDay);
    }

    public void selectMonth(final String valueMonth) {
        final Select month = new Select(registerPage.monthOfBirthSelect);
        month.selectByVisibleText(valueMonth);
    }

    public void selectYear(final String valueYear) {
        final Select year = new Select(registerPage.yearOfBirthSelect);
        year.selectByVisibleText(valueYear);
    }

    public void fieldEmail(String valueEmail) {
        registerPage.emailField.sendKeys(valueEmail);
    }

    public void fieldCompany(String valueCompany) {
        registerPage.companyFiled.sendKeys(valueCompany);
    }

    public void newsCheck() {
        if (!registerPage.newsChb.isSelected()) {
            registerPage.newsChb.click();
        }
    }

    public void fieldPass(String valuePass) {
        registerPage.passwordField.sendKeys(valuePass);
    }

    public void fieldConfirmPass(String valueConfPass) {
        registerPage.confirmPassField.sendKeys(valueConfPass);
    }

    public void registerAccountClick() {
        registerPage.registerAccountButton.click();
    }

    public void verifyResult() {
        Assert.assertEquals(registerPage.resultLabel.getText(), GlobalVariables.RESULT);
    }

    public void logOutClick() {
        registerPage.logOutLink.click();
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(RegisterPage.CONTINUE_BTN_XPATH)));
    }
}
