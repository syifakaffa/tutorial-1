package id.ac.ui.cs.advprog.eshop;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EshopApplicationTests {

    @Test
    void testMainApplication() {
        assertDoesNotThrow(() -> EshopApplication.main(new String[]{}));
    }
}