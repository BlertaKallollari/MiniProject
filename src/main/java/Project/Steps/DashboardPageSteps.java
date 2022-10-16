package Project.Steps;

import Project.Driver.Driver;
import Project.GlobalVariables.GlobalVariables;
import Project.Pages.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class DashboardPageSteps {

    private DashboardPage dashboardPage;
    private WebDriverWait driverWait = new WebDriverWait(Driver.getDriver(), 7);

    public DashboardPageSteps() {
        this.dashboardPage = new DashboardPage();
    }


    public void hoverComputerMenu() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(dashboardPage.computerMenu).perform();
    }

    public void clickNoteBook() {
        dashboardPage.notebookMenu.click();
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(DashboardPage.NOTEBOOK_MENU_XPATH)));
    }

    public void checkTitle() {
        String currentTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(currentTitle, GlobalVariables.TITTLE_NOTEBOOK_PAGE);
    }

    public void displaySize(String value) {
        final Select pageSize = new Select(dashboardPage.displayPageSize);
        pageSize.selectByVisibleText(value);
    }

    public void checkItemsDisplayed(final int expectedSize) {
        final int numberOfItems = dashboardPage.itemDisplay.findElements(By.className("item-box")).size();
        Assert.assertEquals(numberOfItems, expectedSize);
    }

    public void checkMemory(final String memory) {
        for (int i = 0; i < dashboardPage.labelButtons.size(); i++) {
            if (dashboardPage.labelButtons.get(i).getText().equalsIgnoreCase(memory)) {
                dashboardPage.checkBoxs.get(i).click();
                break;
            }
        }
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(DashboardPage.LOADING_SCREEN_LBL_CLASS)));
    }

    public void addItemToShoppingCart(final int itemNumber) {
        for (int i = 0; i < dashboardPage.addButtonsToCart.size(); i++) {
            if (i + 1 == itemNumber) {
                dashboardPage.addButtonsToCart.get(i).click();
                driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DashboardPage.SUCCESS_MSG_XPATH)));
                final String message = dashboardPage.succesMsg.getText();
                Assert.assertEquals(message, GlobalVariables.SHOPPING_CART_SUCCESS_MESSAGE);
                driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(DashboardPage.SUCCESS_MSG_XPATH)));
                break;
            }
        }
    }

    public void addItemToWishlist(final int itemNumber) {
        for (int i = 0; i < dashboardPage.addButtonsToWishList.size(); i++) {
            if (i + 1 == itemNumber) {
                dashboardPage.addButtonsToWishList.get(i).click();
                driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DashboardPage.SUCCESS_MSG_XPATH)));
                final String message = dashboardPage.succesMsg.getText();
                Assert.assertEquals(message, GlobalVariables.WISHLIST_SUCCESS_MESSAGE);
                driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(DashboardPage.SUCCESS_MSG_XPATH)));
                break;
            }
        }
    }

    public void checkQtyCart(final String qty) {
        final String text = dashboardPage.cartQty.getText();
        final String qtyNumber = text.substring(1, text.length() - 1);
        Assert.assertEquals(qtyNumber, qty);
    }

    public void checkQtyWishList(final String qty) {
        final String text = dashboardPage.wishListQty.getText();
        final String qtyNumber = text.substring(1, text.length() - 1);
        Assert.assertEquals(qtyNumber, qty);
    }

}
