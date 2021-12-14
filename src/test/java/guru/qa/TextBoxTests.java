package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

//    @BeforeAll
//    static void beforeAll() {
//        Configuration.browserSize = "1920x1080";
//    }

    @Test
    void successTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Alex");
        $("#userEmail").setValue("emain@email.com");
        $("#currentAddress").setValue("Some address");
        $("#permanentAddress").setValue("Another address");
        $("#submit").scrollTo().click();

        $("#output").shouldBe(visible);
        $("#name").shouldHave(text("Alex"));
        $("#email").shouldHave(text("emain@email.com"));
        $("#output #currentAddress").shouldHave(text("Some address"));
        $("#output").$("#permanentAddress").shouldHave(text("Another address"));
    }
}
