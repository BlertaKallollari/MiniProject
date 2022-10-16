package Project.Steps;

import Project.Driver.Driver;
import Project.GlobalVariables.GlobalVariables;
import Project.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageSteps {

    private WebDriverWait driverWait = new WebDriverWait(Driver.getDriver(), 7);
    private LoginPage loginPage;

    public LoginPageSteps() {
        loginPage = new LoginPage();
    }

    public void loginClick() {
        loginPage.loginMenuButton.click();
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(LoginPage.IMAGE_ID)));
        System.out.println("Clicked the Login Menu bar");
    }

    public void verifyLogIn() {
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LoginPage.LOGIN_ACCOUNT_BTN_XPATH)));
        Assert.assertEquals(loginPage.welcomeLabel.getText(), GlobalVariables.LOGIN_RESULT);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LoginPage.IMAGE_ID)));
    }

    public void verifyLogOut() {
        if (loginPage.logoutLink.isDisplayed()) {
            loginPage.logoutLink.click();
        } else {
            System.out.println("Ju nuk mund te beni logout, sepse nuk keni nje account ");
        }
    }

    public void login(final String email, final String password) {
        loginPage.emailField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();
    }
}
