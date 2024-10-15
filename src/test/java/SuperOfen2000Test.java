import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperOfen2000Test {

    @Test
    void backe() {
        try {
            SuperOfen2000.backe("Test Pizza");
            fail();
        }
        catch (OfenKaputtException exception) {
            //success
        }
    }

    @Test
    void backeTest() {
        assertThrows(OfenKaputtException.class, () -> SuperOfen2000.backe("Test-Pizza"));
    }
}
