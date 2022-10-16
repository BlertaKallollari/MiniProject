package Project.Pages;

import Project.Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingCartPage {

    public static final String SHOPPING_CART_XPATH = "//a[@class='ico-cart']";
    public static final String GO_TO_CART_BUTTON_CSS = "button[class='button-1 cart-button']";
    public static final String UPDATE_SHOPPING_BUTTON_DISPLAYED_XPATH = "//button[@class='button-2 update-cart-button']";
    public static final String CONTINUE_SHOPPING_DISPLAYED_XPATH = "//button[@class='button-2 continue-shopping-button']";
    public static final String ESTIMATE_SHIPPING_BUTTON_DISPLAYED_XPATH = "//a[@class='estimate-shipping-button']";
    public static final String SUBTOTAL_PRICE_COLUMN_XPATH = "//td[@class='subtotal']//span[@class='product-subtotal']";
    public static final String TOTAL_VALUE_SHOPPING_CART_XPATH = "//table[@class='cart-total']//tr[@class='order-total']/td[@class='cart-total-right']//strong";
    public static final String DELETE_ITEM_SHOPPING_CART_XPATH = "//td[@class ='remove-from-cart']//button[@class='remove-btn']";

    public ShoppingCartPage() {
        PageFactory.initElements((Driver.getDriver()), this);
    }

    @FindBy(xpath = SHOPPING_CART_XPATH)
    public WebElement shoppingCart;

    @FindBy(css = GO_TO_CART_BUTTON_CSS)
    public WebElement goToCartBtn;

    @FindBy(xpath = UPDATE_SHOPPING_BUTTON_DISPLAYED_XPATH)
    public WebElement updateShoppingCart;

    @FindBy(xpath = ESTIMATE_SHIPPING_BUTTON_DISPLAYED_XPATH)
    public WebElement estimateShoppingCart;

    @FindBy(xpath = CONTINUE_SHOPPING_DISPLAYED_XPATH)
    public WebElement continueShipping;

    @FindBy(xpath = SUBTOTAL_PRICE_COLUMN_XPATH)
    public List<WebElement> subTotalPrice;

    @FindBy(xpath = TOTAL_VALUE_SHOPPING_CART_XPATH)
    public WebElement totalValue;

    @FindBy(xpath = DELETE_ITEM_SHOPPING_CART_XPATH)
    public List<WebElement> deleteItem;
}
