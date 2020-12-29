package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class iOSSearchPageObject extends SearchPageObject {

    static {
        SEARCH_INIT_ELEMENT = "xpath://XCUTElementTypeSearchField[@name='Search Wikipedia']";
        SEARCH_INPUT = "xpath://XCUTElementTypeSearchField[@value='Search Wikipedia']";
        SEARCH_CANCEL_BUTTON = "id:Close";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://XCUTElementTypeSearchField[contains(@name,'{SUBSTRING}')]";
        SEARCH_RESULT_ELEMENT = "xpath://XCUTElementTypeLink";
        SEARCH_EMPTY_RESULT_ELEMENT = "xpath://XCUTElementTypeStaticText[@name=\"No results found\"]";
    }

    public iOSSearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
