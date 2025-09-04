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


@Test
    void testCzyLiczbaPierwszaJezeli1(){
        Assertions.assertFalse(Kalkulator.czyLiczbaPierwsza(1));
}
    @Test
    void testCzyLiczbaPierwszaJezeli2(){
        Assertions.assertTrue(Kalkulator.czyLiczbaPierwsza(2));
    }
    @Test
    void testCzyLiczbaPierwszaJezeliLiczbaParzystaWiekszaOd2(){
        Assertions.assertFalse(Kalkulator.czyLiczbaPierwsza(10));
    }
    @Test
    void testCzyLiczbaPierwszaJezeliPotega(){
        Assertions.assertFalse(Kalkulator.czyLiczbaPierwsza(25));
    }
    @Test
    void testCzyLiczbaPierwszaJezeliLiczbaPierwsza(){
        Assertions.assertTrue(Kalkulator.czyLiczbaPierwsza(17));
    }
}