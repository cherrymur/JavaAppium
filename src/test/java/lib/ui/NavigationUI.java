package lib.ui;

import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUI extends MainPageObject{
    protected static String
            MY_LIST_LINK,
            OPEN_NAVIGATION;

    public NavigationUI(RemoteWebDriver driver)
    {
        super(driver);
    }

    public void openNavigation()
    {
        if(Platform.getInstance().isMW())
        {
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find OPEN_NAVIGATION", 5);
        } else {
            System.out.println("Method openNavigation() does nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }
    public void openMyLists()
    {
        if (Platform.getInstance().isMW()) {
            this.tryClickElementWithFewAttempts(
                    MY_LIST_LINK,
                    "We have a trouble to find the 'My lists' element",
                    5
            );
        }
        this.waitForElementAndClick(
                MY_LIST_LINK,
                "We have a trouble to find the 'My lists' element",
                10);
    }


}
