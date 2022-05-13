package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class AndroidSelenideTests extends TestBase {

    @Test
    void searchTest() {
        open();
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0));

    }
}
