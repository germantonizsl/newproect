import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class CheckAddress {
    private final SelenideElement textBoxGet=$x("//h1[@class='style-scope ytd-watch-metadata']");



    public String getValue() {
        return textBoxGet.getText();
    }
}
