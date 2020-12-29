package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import lib.Platform;

public abstract class ArticlePageObject extends MainPageObject {

    protected static String
            TITLE,
            FOOTER_ELEMENT,
            OPTION_ADD_TO_MY_LIST_BUTTON,
            OPTION_GOTIT_BUTTON,
            OPTION_NAMEtitle_INPUT,
            OPTION_OK_BUTTON,
            CLOSE_ARTICLE_BUTTON;


    public ArticlePageObject(AppiumDriver driver) {
        super(driver);
    }

    public WebElement waitForTitleElement() {
        return this.waitForElementPresent(
                TITLE,
                "Cannot find article title on page!",
                15);
    }

    public String getArticleTitle() {
        WebElement title_element = waitForTitleElement();
        if (Platform.getInstance().isAndroid()){
            return title_element.getAttribute("text");
        } else {
            return title_element.getAttribute("name");
        }
    }

    public void swipeToFooter() {
        if (Platform.getInstance().isIOS()) {
            this.swipeUPTitleElementAppear(
                    FOOTER_ELEMENT,
                    "Cannot find the end of article",
                    40);
        }
        else if (Platform.getInstance().isAndroid()) {
            this.swipeUpToFindElement(
                    FOOTER_ELEMENT,
                    "Cannot find the end of article",
                    40);
        }
    }

    public void addArticleToMyList(String name_of_folder)
    {
        this.waitForElementAndClick(
                OPTION_ADD_TO_MY_LIST_BUTTON,
                "We have a trouble to find the element Save",
                5);

        this.waitForElementAndClick(
                OPTION_GOTIT_BUTTON,
                "We have a trouble to find the element 'GOT IT'",
                5);

        this.waitForElementAndClear(
                OPTION_NAMEtitle_INPUT,
                "We have a trouble to find and clear the element 'My reading list'",
                5);

        this.waitForElementAndSendKeys(
                OPTION_NAMEtitle_INPUT,
                name_of_folder,
                "We have a trouble to fill the Name of list",
                5);

        this.waitForElementAndClick(
                OPTION_OK_BUTTON,
                "We have a trouble to find or press 'OK' button",
                5);
    }

    public void addArticlesToMySaved()
    {
        this.waitForElementAndClick(OPTION_ADD_TO_MY_LIST_BUTTON, "Cannot find option to add article" +
                " to my list", 5);
    }

    public void closeArticle() {
        this.waitForElementAndClick(
                CLOSE_ARTICLE_BUTTON,
                "We have a trouble to find the 'X' element",
                5);
    }

    public void assertTitleHasText(String article_title)
    {
        assertElementHasText(
                TITLE,
                article_title,
                "The article '" + article_title + "' is not opened");
    }

    public void assertArticleTitlePresent()
    {
        this.assertElementPresent(
                TITLE,
                "The article has no title");
    }
}
