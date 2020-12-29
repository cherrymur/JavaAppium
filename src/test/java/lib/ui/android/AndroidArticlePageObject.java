package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.ArticlePageObject;

public class AndroidArticlePageObject extends ArticlePageObject {
    static {
                TITLE = "id:org.wikipedia:id/view_page_title_text";
                FOOTER_ELEMENT = "xpath://*[@text='View page in browser']";
                OPTION_ADD_TO_MY_LIST_BUTTON = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                        "android.widget.FrameLayout/android.widget.FrameLayout/" +
                        "android.widget.FrameLayout/android.widget.FrameLayout/" +
                        "android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/" +
                        "android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/" +
                        "android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]";
                OPTION_GOTIT_BUTTON = "id:org.wikipedia:id/onboarding_button";
                OPTION_NAMEtitle_INPUT = "id:org.wikipedia:id/text_input";
                OPTION_OK_BUTTON = "id:android:id/button1";
                CLOSE_ARTICLE_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
    }
    public AndroidArticlePageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
