package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Aula_283 - <b>Record Class</b><br />
 * <b>assert</b> testa se <b>Test</b> isso acontece<br />
 * <b>assertTrue</b> = Testa se isso retorna true<br />
 * <b>assertEquals</b> = Testa se isso é igual a outra<br />
 */

class MangaTest {

    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Kimetsu no Yaiba", 24);
        manga2 = new Manga("Kimetsu no Yaiba", 24);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized() {
        assertEquals("Kimetsu no Yaiba", manga1.name());
        assertEquals(24, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectAreTheSame() {
        assertEquals(manga1, manga2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectAreTheSame() {
        assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void constructor_ThrowNullPointerException_WhenNameIsNull() {
        assertThrows(NullPointerException.class, () -> new Manga(null, 24));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga() {
        assertTrue(Manga.class.isRecord());
    }
}