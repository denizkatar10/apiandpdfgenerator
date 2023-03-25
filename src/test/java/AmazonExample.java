import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gmibank.pages.AmazonHomePage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import org.junit.Assert;

public class AmazonExample {

    AmazonHomePage homepage = new AmazonHomePage();
    @Given("Go To Amazon")
    public void goToAmazon() {
        Driver.getDriver().get("www.amazon.com");
    }

    @Then("Click the sign in button")
    public void clickTheSignInButton() {
    homepage.sighInButton.click();
    }

    @Then("Send a username and passowrd")
    public void sendAUsernameAndPassowrd() {
        homepage.contunue.click();
        homepage.login.click();
        homepage.login.isDisplayed();
    }

    @Then("Validate Login is succesfull")
    public void validateLoginIsSuccesfull() {
        String expectedText = "Hello, Deniz";
        Assert.assertEquals(expectedText,homepage.Deniz.getText());
    }
}



for(int i = 0; i<=100;i++){
    System.out.println(i);
    i=i+2;
        }









