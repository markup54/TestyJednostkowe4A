import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testDodajLiczbyJezeliDodawaneLiczbyCalkowite() {
        Assertions.assertEquals(3,Kalkulator.dodajLiczby(2,1));
    }

    @Test
    void testDodajLiczbyJezeliLiczbyDodawaneRzeczywiste(){
        Assertions.assertEquals(3.4,Kalkulator.dodajLiczby(2,1.4));
    }


    @Test
    void testPodzielJezeliLiczbyCalkowiteWynikCalkowity(){
        Assertions.assertEquals(3,Kalkulator.podziel(6,2));
    }

    @Test
    void testPodzielJezeliLiczbyCalkowiteWynikRzeczywisty(){
        Assertions.assertEquals(3.5,Kalkulator.podziel(7,2));
    }
}