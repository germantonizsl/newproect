import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract class BaseTest {
    public void setup(){

        Configuration.browser="chrome";
        Configuration.webdriverLogsEnabled=true;//включен
        Configuration.browserSize="1920x1080";
        Configuration.headless=false;//будем ли мы видеть браузер


    }
    @BeforeTest
    public void init()
    {
        setup();
    }
    @AfterTest
    public void tearDown(){
        Selenide.closeWebDriver();
    }


}
