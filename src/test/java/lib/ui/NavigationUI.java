package lib.ui;

import io.appium.java_client.AppiumDriver;

abstract public class NavigationUI extends MainPageObject{
    protected static String
            MY_LIST_LINK;

    public NavigationUI(AppiumDriver driver)
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
