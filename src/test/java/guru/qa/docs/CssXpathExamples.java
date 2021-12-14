package guru.qa.docs;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]");
        $(by("data-testid", "email"));

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]");
        $("#email");
        $(byId("email"));
        $x("//*[@id='email']");
        $(byXpath("//*[@id='email']"));

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]");
        $(byName("email"));

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]");
        $(".login_form_input_box");
        $(".inputtext.login_form_input_box");
        $(byClassName("login_form_input_box"));
        $("input.inputtext.login_form_input_box");
        $(byXpath("//input[@class='login_form_input_box']"));

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box");

        // <div>Hello qa.guru</div>
        $(byText("Hello qa.guru"));
        $(withText("lo qa.gu"));

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("input#email.inputtext.login_form_input_box[data-testid=email]");

    }
}
