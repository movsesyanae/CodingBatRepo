import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingBatTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void sleepInStaticVersion() {
        assertEquals(CodingBat.sleepInStaticVersion(false, false), true);
        assertEquals(CodingBat.sleepInStaticVersion(true, false), false);
        assertEquals(CodingBat.sleepInStaticVersion(false, true), true);
    }
}