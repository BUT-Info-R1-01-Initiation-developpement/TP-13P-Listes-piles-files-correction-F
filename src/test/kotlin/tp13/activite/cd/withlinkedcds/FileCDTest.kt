package tp13.activite.cd.withlinkedcds

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import tp13.activite.cd.CompactDisc

class FileCDTest {

    val cd1 = CompactDisc(
        "Bob Dylan",
        "The Freewheelin'Bob Dylan",
        13,
        1963
    )

    val cd2 = CompactDisc(
        "Bob Dylan",
        "The Times They Are A-Changin'",
        10,
        1964
    )

    val cd3 = CompactDisc(
        "Bob Dylan",
        "Bringing It All Back Home",
        11,
        1965
    )

    @Test
    fun `test nouvelle file est vide`() {
        // given une nouvelle pile
        val file = FileCD()
        // expect : une nouvelle file est vide
        assertTrue(file.estVide())
        assertEquals(0, file.taille())
        assertThrows<IllegalArgumentException> {
            file.tete()
        }
        assertThrows<IllegalArgumentException> {
            file.queue()
        }
    }

    @Test
    fun `test enfilage`() {
        // given une nouvelle pile
        val file = FileCD()
        // when on emfile un cd
        file.enfile(cd1)
        // then
        assertFalse(file.estVide())
        assertEquals(1, file.taille())
        assertEquals(cd1, file.tete())
        assertEquals(cd1, file.queue())
        // when on emfile une fois de plus
        file.enfile(cd2)
        assertEquals(2, file.taille())
        assertEquals(cd1, file.tete())
        assertEquals(cd2, file.queue())
        // when on emfile une fois de plus
        file.enfile(cd3)
        assertEquals(3, file.taille())
        assertEquals(cd1, file.tete())
        assertEquals(cd3, file.queue())
    }

    @Test
    fun `test désenfilage liste non vide`() {
        // given une nouvelle pile
        val file = FileCD()
        file.enfile(cd1)
        file.enfile(cd2)
        file.enfile(cd3)
        // when on defile un cd
        var res = file.desenfile()
        // then
        assertFalse(file.estVide())
        assertEquals(2, file.taille())
        assertEquals(cd1, res)
        assertEquals(cd2, file.tete())
        assertEquals(cd3, file.queue())
        // when on defile un cd
        res = file.desenfile()
        // then
        assertFalse(file.estVide())
        assertEquals(1, file.taille())
        assertEquals(cd2, res)
        assertEquals(cd3, file.tete())
        assertEquals(cd3, file.queue())
        // when on defile un cd
        res = file.desenfile()
        // then
        assertTrue(file.estVide())
        assertEquals(0, file.taille())
        assertEquals(cd3, res)
        assertThrows<IllegalArgumentException> {
            file.tete()
        }
        assertThrows<IllegalArgumentException> {
            file.queue()
        }
    }

    @Test
    fun `test désenfilage sur file vide`() {
        val file = FileCD()
        assertThrows<IllegalArgumentException> {
            file.desenfile()
        }
    }

    @Test
    fun `test vidage de file vide`() {
        // Given
        val file = FileCD()
        // when
        file.vide()
        // then
        // expect : une nouvelle file est vide
        assertTrue(file.estVide())
        assertEquals(0, file.taille())
        assertThrows<IllegalArgumentException> {
            file.tete()
        }
        assertThrows<IllegalArgumentException> {
            file.queue()
        }
    }

    @Test
    fun `test vidage de file non vide`() {
        // given
        val file = FileCD()
        file.enfile(cd1)
        file.enfile(cd2)
        file.enfile(cd3)
        // when
        file.vide()
        // then
        // expect : une nouvelle file est vide
        assertTrue(file.estVide())
        assertEquals(0, file.taille())
        assertThrows<IllegalArgumentException> {
            file.tete()
        }
        assertThrows<IllegalArgumentException> {
            file.queue()
        }
    }

}