import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperOfen2000Test {

    @Test
    void testOfen() {
        //GIVEN

        assertThrows(OfenKaputtException.class, () -> {SuperOfen2000.backe("test-pizza");});
    }

}
