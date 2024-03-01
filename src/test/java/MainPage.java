import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement textBoxInput=$x("//input[@type=\"text\"]");
    //private final SelenideElement textBoxGet=$x("//input[@id=\"homepage_create_tinyurl_form_created_input\"]");
    public MainPage(String Url){
        Selenide.open(Url);
    }
    public void clickOnSearch(String q){
        textBoxInput.setValue(q);
        textBoxInput.sendKeys(Keys.ENTER);

    }


    public void openWebSite(String url){
        Selenide.open(url);
    }
}
