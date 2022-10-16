package Project.Steps;

import Project.Driver.Driver;
import Project.GlobalVariables.GlobalVariables;
import Project.Pages.MyAccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MyAccountPageSteps {

    private MyAccountPage myAccountPage;

    public MyAccountPageSteps() {
        this.myAccountPage = new MyAccountPage();
    }

    public void myAccountClick() {
        myAccountPage.accountLink.click();
    }

    public void checkTitleAccount() {
        String currentTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(currentTitle, GlobalVariables.TITTLE_ACCOUNT_PAGE);
    }

    public void radioButtonGenderVerify(final String expected) {
        for (final WebElement el : myAccountPage.genderOptions) {
            if (el.isSelected()) {
                final String value = el.getAttribute("value");
                Assert.assertEquals(value, expected);
                break;
            }
        }
    }

    public void verifyBirthDay(final String expected) {
        final Select day = new Select(myAccountPage.dateOfBirthSelect);
        final String value = day.getFirstSelectedOption().getText();
        Assert.assertEquals(value, expected);
    }

    public void verifyBirthMonth(final String expected) {
        final Select month = new Select(myAccountPage.monthOfBirthSelect);
        final String value = month.getFirstSelectedOption().getText();
        Assert.assertEquals(value, expected);
    }

    public void verifyBirthYear(final String expected) {
        final Select year = new Select(myAccountPage.yearOfBirthSelect);
        final String value = year.getFirstSelectedOption().getText();
        Assert.assertEquals(value, expected);
    }

    public void verifyFirstName(final String expected) {
        final String value = myAccountPage.firstNameField.getAttribute("value");
        Assert.assertEquals(value, expected);
    }

    public void verifyLastName(final String expected) {
        final String value = myAccountPage.lastNameField.getAttribute("value");
        Assert.assertEquals(value, expected);
    }

    public void verifyEmail(final String expected) {
        final String value = myAccountPage.emailField.getAttribute("value");
        Assert.assertEquals(value, expected);
    }

    public void verifyCompany(final String expected) {
        final String value = myAccountPage.companyFiled.getAttribute("value");
        Assert.assertEquals(value, expected);
    }
}
