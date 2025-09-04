import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void szyfrCezaraJezeliKlucz0() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("ABC",0));
    }
    @Test
    void szyfrCezaraJezeliKluczMniejszodDlugosciAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }

    @Test
    void szyfrCezaraJezeliKluczWiekszyNizDlugoscAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",81));
    }
    @Test
    void szyfrCezaraJezeliKluczUjemny() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("DEF",-3));
    }
    @Test
    void szyfrCezaraJezeliBezZawijaniaWierszyKlucz3() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }
    @Test
    void szyfrCezaraJezeliZZawijaniemWierszyKlucz3() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("XYZ",3));
    }
    @Test
    void szyfrCezaraAsciiJezeliKlucz0() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezaraAscii("ABC",0));
    }
    @Test
    void szyfrCezaraAsciiJezeliKluczMniejszodDlugosciAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezaraAscii("ABC",3));
    }

    @Test
    void szyfrCezaraAsciiJezeliKluczWiekszyNizDlugoscAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezaraAscii("ABC",81));
    }
    @Test
    void szyfrCezaraAsciiJezeliKluczUjemny() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezaraAscii("DEF",-3));
    }
    @Test
    void szyfrCezaraAsciiJezeliBezZawijaniaWierszyKlucz3() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezaraAscii("ABC",3));
    }
    @Test
    void szyfrCezaraAsciiJezeliZZawijaniemWierszyKlucz3() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezaraAscii("XYZ",3));
    }
}