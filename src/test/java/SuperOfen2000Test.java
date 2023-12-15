import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperOfen2000Test {

    @Test
    void testOfen() {
        //GIVEN

        assertThrows(
                //THEN
                OfenKaputtException.class,
                //WHEN
                () -> SuperOfen2000.backe("Test-Pizza"));
    }

}
