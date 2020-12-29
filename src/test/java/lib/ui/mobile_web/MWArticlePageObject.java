package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWArticlePageObject extends ArticlePageObject {
    static {
                TITLE = "css:#content h1";
                FOOTER_ELEMENT = "css:footer']";
                OPTION_ADD_TO_MY_LIST_BUTTON = "css:#page-actions li#ca-watch button";
                CLOSE_ARTICLE_BUTTON = "id:Back";
    }
    public MWArticlePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
