package suites;

import org.junit.runner.RunWith;
import tests.*;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ArticleTests.class,
        ChangeAppConditionTests.class,
        MyListsTests.class,
        SearchTests.class
})

public class TestSuite {

}
