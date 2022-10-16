package Project.Steps;

import Project.Driver.Driver;
import Project.Pages.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShoppingCartPageSteps {

    private ShoppingCartPage shoppingCartPage;
    private WebDriverWait driverWait = new WebDriverWait(Driver.getDriver(), 7);

    public ShoppingCartPageSteps() {this.shoppingCartPage = new ShoppingCartPage();
    }

    public void hoverShoppingCartMenu() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(shoppingCartPage.shoppingCart).perform();
    }

    public void verifyGoToCartButton() {
        if (shoppingCartPage.goToCartBtn.isDisplayed()) {
            shoppingCartPage.goToCartBtn.click();
        } else {
            System.out.println("Buttoni Go to Cart nuk shfaqet");
        }
    }

    public void verifyTitle() {
        String currentTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(currentTitle, Driver.getTitle());
    }

    public void verifyButtonDisplayed() {
        Assert.assertTrue(shoppingCartPage.updateShoppingCart.isDisplayed(), "Update Button is not displayed");
        Assert.assertTrue(shoppingCartPage.continueShipping.isDisplayed(), "Continue Button is not displayed");
        Assert.assertTrue(shoppingCartPage.estimateShoppingCart.isDisplayed(), "Estimate Button is not displayed");
    }

    public void sumSubTotalPrice() {
        String valueTotal = shoppingCartPage.totalValue.getText().substring(1, shoppingCartPage.totalValue.getText().length() - 1).replace(",", "");
        double valueTotalPrice = Double.parseDouble(valueTotal);

        double sum = 0;
        for (final WebElement element : shoppingCartPage.subTotalPrice) {
            String value = element.getText().substring(1, element.getText().length() - 1).replace(",", "");
            double price = Double.parseDouble(value);
            sum = sum + price;
        }
        Assert.assertEquals(sum, valueTotalPrice);
    }

    public void removeItemToShoppingCart() {
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(ShoppingCartPage.GO_TO_CART_BUTTON_CSS)));
        int size = shoppingCartPage.deleteItem.size();
        while (size > 0) {
            shoppingCartPage.deleteItem.get(0).click();
            size--;
            if (size > 0) {
                int actualSize = shoppingCartPage.deleteItem.size();
                Assert.assertEquals(actualSize, size);
            }
        }
        Assert.assertEquals(size, 0);
    }
}
