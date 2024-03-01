import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class TestSelenide {
    @Test
    public void testSelenide(){
        Selenide.open("https://tinyurl.com/app");
    }
}
