package Test;

import Project.Driver.Driver;
import Project.Driver.Option;
import Project.GlobalVariables.GlobalVariables;
import Project.Steps.LoginPageSteps;
import Project.Steps.ShoppingCartPageSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ShoppingCartTest {

    @BeforeMethod
    public void before() {Driver.start(Option.CHROME);}

    @Test
    public void execute() {
        Driver.go(GlobalVariables.APP_URL);

        LoginPageSteps login = new LoginPageSteps();
        login.loginClick();
        login.login(GlobalVariables.EMAIL, GlobalVariables.PASSWORD);
        login.verifyLogIn();

        ShoppingCartPageSteps ShoppingCart = new ShoppingCartPageSteps();
        ShoppingCart.hoverShoppingCartMenu();
        ShoppingCart.verifyGoToCartButton();
        ShoppingCart.verifyTitle();
        ShoppingCart.verifyButtonDisplayed();
        ShoppingCart.sumSubTotalPrice();
    }

    @AfterMethod
    public void after () { Driver.close(); }
}
