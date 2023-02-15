package NewTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class NewTest {

    @Test
    void newTest() {
        open("https://github.com");
        System.out.println("Открылся github");
    }
}
