package Test;

import Project.Driver.Driver;
import Project.Driver.Option;
import Project.GlobalVariables.GlobalVariables;
import Project.Steps.LoginPageSteps;
import Project.Steps.DashboardPageSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest {

    @BeforeMethod
    public void before() {Driver.start(Option.CHROME);}

    @Test
    public void execute() {
        Driver.go(GlobalVariables.APP_URL);

        LoginPageSteps login = new LoginPageSteps();
        login.loginClick();
        login.login(GlobalVariables.EMAIL, GlobalVariables.PASSWORD);
        login.verifyLogIn();

        DashboardPageSteps Dashboard = new DashboardPageSteps();
        Dashboard.hoverComputerMenu();
        Dashboard.clickNoteBook();
        Dashboard.checkTitle();
        Dashboard.displaySize("9");
        Dashboard.checkItemsDisplayed(6);
        Dashboard.checkMemory("16 GB");
        Dashboard.checkItemsDisplayed(1);
        Dashboard.checkMemory("16 GB");
        Dashboard.addItemToShoppingCart(4);
        Dashboard.addItemToShoppingCart(5);
        Dashboard.addItemToShoppingCart(6);
        Dashboard.addItemToWishlist(2);
        Dashboard.addItemToWishlist(3);
        Dashboard.checkQtyCart("3");
        Dashboard.checkQtyWishList("2");

    }

    @AfterMethod
    public void after() {Driver.close();}
}
