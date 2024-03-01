import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleTest extends BaseTest {
    private final static String Base_Url = "https://tinyurl.com/app";
    private final static String B = "https://tinyurl.com/mpwcwdkm";

    private final static String Search_String = "https://www.youtube.com/watch?v=IGaAZWmqZEE";

    @Test
    public void checkTest() {
        MainPage mainPage = new MainPage(Base_Url);
        mainPage.clickOnSearch(Search_String);
        SearchValue searchValue = new SearchValue();
        String value = searchValue.getValue();
        MainPage mainPag = new MainPage(value);
        CheckAddress checkAddress=new CheckAddress();
        String val=checkAddress.getValue();
        Assert.assertEquals(val,"Автотесты с нуля Selenide Java",value);

    }

}
