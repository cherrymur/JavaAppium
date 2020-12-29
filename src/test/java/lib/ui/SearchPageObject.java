package lib.ui;

import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class SearchPageObject extends MainPageObject {

    protected static String // deleted final - we should can change it:)
        SEARCH_INIT_ELEMENT,
        SEARCH_INPUT,
        SEARCH_CANCEL_BUTTON,
        SEARCH_RESULT_BY_SUBSTRING_TPL,
        SEARCH_RESULT_ELEMENT,
        SEARCH_RESULT_ELEMENT_by_TITLE_AND_DESCRIPTION,
        SEARCH_EMPTY_RESULT_ELEMENT;

    public SearchPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }

    /*TEMPLATES METHODS */
    private static String getResultSearchElement(String substring)
    {
        return SEARCH_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}", substring);
    }

    private static String getResultSearchElementByTitleAndDescription(String substring_title, String substring_description)
    {
        return SEARCH_RESULT_ELEMENT_by_TITLE_AND_DESCRIPTION
                .replace("{TITLE}", substring_title)
                .replace("{DESCRIPTION}", substring_description);
    }
    /*TEMPLATES METHODS */

    public void initSearchInput()
    {
        this.waitForElementAndClick(
                SEARCH_INIT_ELEMENT,
                "Cannot find and click search init element",
                5);
        this.waitForElementPresent(
                SEARCH_INIT_ELEMENT,
                "Cannot find search input clicking search init element");
    }

    public void waitForCancelButtonToAppear()
    {
        this.waitForElementPresent(
                SEARCH_CANCEL_BUTTON,
                "Cannot find search cancel button!",
                5);
    }

    public void waitForCancelButtonToDisappear()
    {
        this.waitForElementNotPresent(
                SEARCH_CANCEL_BUTTON,
                "Search cancel button is still present!",
                5);
    }

    public void clickCancelSearch()
    {
        this.waitForElementAndClick(
                SEARCH_CANCEL_BUTTON,
                "Cannot find and click search cancel button",
                5);
    }

    public void typeSearchLine(String search_line)
    {
        this.waitForElementAndSendKeys(
                SEARCH_INPUT,
                search_line,
                "Cannot find and type into search input",
                5);
    }

    public void waitForSearchResults(String substring)
    {
        String search_result_xpath = getResultSearchElement(substring);
        this.waitForElementPresent(
                search_result_xpath,
                "Cannot find search result");
    }

    public void clickByArticleWithSubstring(String substring)
    {
        String search_result_xpath = getResultSearchElement(substring);
        this.waitForElementAndClick(
                search_result_xpath,
                "Cannot find and click search result with substring " + substring,
                10);
    }

    public int getAmountOfFoundArticles()
    {
        this.waitForElementPresent(
                SEARCH_RESULT_ELEMENT,
                "Cannot find anything by request ",
                15);

        return this.getAmountOfElements(SEARCH_RESULT_ELEMENT);
    }

    public void waitForEmptyResultsLabel()
    {
        this.waitForElementPresent(
                SEARCH_EMPTY_RESULT_ELEMENT,
                "Cannot find empty result element",
                15);
    }

    public void checkSearchInputInEachElement(String substring)
    {
        this.assertElementsHaveText(
                SEARCH_RESULT_ELEMENT,
                substring,
                substring + " is not in each element");
    }
    public void assertThereIsNoResultOfSearch()
    {
        this.assertElementNotPresent(
                SEARCH_RESULT_ELEMENT,
                "We supposed not to find any results");
    }

    public void waitForElementByTitleAndDescription(String title, String description)
    {
        String search_result_xpath = getResultSearchElementByTitleAndDescription(title, description);
        this.waitForElementPresent(
                search_result_xpath,
                "Cannot find search result with name " + title + " and description " + description);
    }
}
