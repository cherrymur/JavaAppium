package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUI extends MainPageObject{
    protected static String
            MY_LIST_LINK;

    public NavigationUI(RemoteWebDriver driver)
    {
        super(driver);
    }

    public void openMyLists()
    {
        this.waitForElementAndClick(
                MY_LIST_LINK,
                "We have a trouble to find the 'My lists' element",
                10);
    }
}
