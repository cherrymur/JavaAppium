package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWArticlePageObject extends ArticlePageObject {
    static {
                TITLE = "css:#content h1";
                FOOTER_ELEMENT = "css:footer";
        //a[@title='Add this page to your watchlist']
                OPTION_ADD_TO_MY_LIST_BUTTON = "xpath://a[contains(@class, 'menu__item--page-actions-watch')]";
                OPTION_REMOVE_FROM_MY_LIST = "xpath://a[contains(@class, 'menu__item--page-actions-watch watched')]";
                CLOSE_ARTICLE_BUTTON = "id:Back";
    }
    public MWArticlePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
