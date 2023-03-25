package gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage {

    @FindBy(xpath = "//*[@class='nav-line-1 nav-progressive-content']")
    public WebElement sighIn;

    @FindBy(xpath = "(//*[@class='nav-action-inner'])[1]")
    public WebElement sighInButton;
    @FindBy(xpath = "//*[@class='a-button-input']")
    public WebElement contunue;
    @FindBy(xpath = "//*[@id='signInSubmit']")
    public WebElement login;
    @FindBy(xpath = "//*[text()='Hello, Deniz']")
    public WebElement Deniz;

}


{
    "firstname"=""
        }