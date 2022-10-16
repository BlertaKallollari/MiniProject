package Test;

import Project.Driver.Driver;
import Project.Driver.Option;
import Project.GlobalVariables.GlobalVariables;
import Project.Steps.LoginPageSteps;
import Project.Steps.MyAccountPageSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest {

    @BeforeMethod
    public void before () {Driver.start(Option.CHROME);}

    @Test
    public void execute (){
        Driver.go(GlobalVariables.APP_URL);
        LoginPageSteps login = new LoginPageSteps();
        login.loginClick();
        login.login(GlobalVariables.EMAIL, GlobalVariables.PASSWORD);

        MyAccountPageSteps MyAccount = new MyAccountPageSteps();
        MyAccount.myAccountClick();
        MyAccount.checkTitleAccount();
        MyAccount.radioButtonGenderVerify(GlobalVariables.GENDER);
        MyAccount.verifyBirthDay(GlobalVariables.BIRTH_DAY);
        MyAccount.verifyBirthMonth(GlobalVariables.BIRTH_MONTH);
        MyAccount.verifyBirthYear(GlobalVariables.BIRTH_YEAR);
        MyAccount.verifyFirstName(GlobalVariables.FIRSTNAME);
        MyAccount.verifyLastName(GlobalVariables.LASTNAME);
        MyAccount.verifyEmail(GlobalVariables.EMAIL);
        MyAccount.verifyCompany(GlobalVariables.COMPANY_NAME);

        login.verifyLogOut();
    }

    @AfterMethod
    public void after () {Driver.close();}
}
