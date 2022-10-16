package Project.Pages;

import Project.Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    public static final String COMPUTER_MENU_XPATH = "//ul[@class='top-menu notmobile']/li//a[text()='Computers ']";
    public static final String NOTEBOOK_MENU_XPATH = "//ul[@class='top-menu notmobile']/li//ul/li[2]/a";
    public static final String DISPLAY_PAGE_SIZE_CSS = "select#products-pagesize";
    public static final String ITEM_DISPLAYS_CSS = "div[class='item-grid']";
    public static final String LABEL_MEMORY_XPATH = "//ul[@class='group product-spec-group'][2]//label";
    public static final String MEMORY_CHB_XPATH = "//ul[@class='group product-spec-group'][2]//input";
    public static final String ADD_TO_CARD_BTN_XPATH = "//button[@class='button-2 product-box-add-to-cart-button']";
    public static final String SUCCESS_MSG_XPATH = "//div[@class='bar-notification success']";
    public static final String ADD_TO_WISHLIST_BTN_XPATH = "//button[@class='button-2 add-to-wishlist-button']";
    public static final String CART_QTY_CSS = "span[class='cart-qty']";
    public static final String WISHLIST_QTY_CSS = "span[class='wishlist-qty']";
    public static final String LOADING_SCREEN_LBL_CLASS = "ajax-products-busy";

    public DashboardPage() {
        PageFactory.initElements((Driver.getDriver()), this);
    }

    @FindBy(xpath = COMPUTER_MENU_XPATH)
    public WebElement computerMenu;

    @FindBy(xpath = NOTEBOOK_MENU_XPATH)
    public WebElement notebookMenu;

    @FindBy(css = DISPLAY_PAGE_SIZE_CSS)
    public WebElement displayPageSize;

    @FindBy(css = ITEM_DISPLAYS_CSS)
    public WebElement itemDisplay;

    @FindBy(xpath = LABEL_MEMORY_XPATH)
    public List<WebElement> labelButtons;

    @FindBy(xpath = MEMORY_CHB_XPATH)
    public List<WebElement> checkBoxs;

    @FindBy(xpath = ADD_TO_CARD_BTN_XPATH)
    public List<WebElement> addButtonsToCart;

    @FindBy(xpath = SUCCESS_MSG_XPATH)
    public WebElement succesMsg;

    @FindBy(xpath = ADD_TO_WISHLIST_BTN_XPATH)
    public List<WebElement> addButtonsToWishList;

    @FindBy(css = CART_QTY_CSS)
    public WebElement cartQty;

    @FindBy(css = WISHLIST_QTY_CSS)
    public WebElement wishListQty;
}
