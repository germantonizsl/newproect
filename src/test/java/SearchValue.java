import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchValue {
    private final SelenideElement textBoxGet=$x("//input[@id=\"homepage_create_tinyurl_form_created_input\"]");

    public String getValue(){
         return textBoxGet.getValue();

    }
//textBoxGet.getAttribute("//input[@id=\"homepage_create_tinyurl_form_created_input\"]");
}
