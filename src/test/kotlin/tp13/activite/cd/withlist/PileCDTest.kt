package tp13.activite.cd.withlist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import tp13.activite.cd.CompactDisc

class PileCDTest {

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
/*

    @Test
    fun `test nouvelle pile est vide`() {
        // given une nouvelle pile
        val pile = PileCD()
        // expect : une nouvelle pile est vide
        assertTrue(pile.estVide())
        assertEquals(0, pile.taille())
        assertThrows<IllegalArgumentException> {
            pile.sommet()
        }
    }

    @Test
    fun `test empilement`() {
        // given une nouvelle pile
        val pile = PileCD()
        // when on empile un cd
        pile.empile(cd1)
        // then
        assertFalse(pile.estVide())
        assertEquals(1, pile.taille())
        assertEquals(cd1, pile.sommet())
        // when on empile une fois de plus
        pile.empile(cd2)
        assertEquals(2, pile.taille())
        assertEquals(cd2, pile.sommet())
        // when on empile une fois de plus
        pile.empile(cd3)
        assertEquals(3, pile.taille())
        assertEquals(cd3, pile.sommet())
    }

    @Test
    fun `test depilement liste non vide`() {
        // given une nouvelle pile
        val pile = PileCD()
        pile.empile(cd1)
        pile.empile(cd2)
        pile.empile(cd3)
        // when on depile un cd
        var res = pile.depile()
        // then
        assertFalse(pile.estVide())
        assertEquals(2, pile.taille())
        assertEquals(cd3, res)
        assertEquals(cd2, pile.sommet())
        // when on depile un cd
        res = pile.depile()
        // then
        assertFalse(pile.estVide())
        assertEquals(1, pile.taille())
        assertEquals(cd2, res)
        assertEquals(cd1, pile.sommet())
        // when on depile un cd
        res = pile.depile()
        // then
        assertTrue(pile.estVide())
        assertEquals(0, pile.taille())
        assertEquals(cd1, res)
        assertThrows<IllegalArgumentException> {
            pile.sommet()
        }
    }

    @Test
    fun `test dépilement sur pile vide`() {
        val pile = PileCD()
        assertThrows<IllegalArgumentException> {
            pile.depile()
        }
    }

    @Test
    fun `test vidage de pile vide`() {
        // Given
        val pile = PileCD()
        // when
        pile.vide()
        // then
        assertTrue(pile.estVide())
        assertEquals(0, pile.taille())
        assertThrows<IllegalArgumentException> {
            pile.sommet()
        }
    }

    @Test
    fun `test vidage de pile non vide`() {
        // given
        val pile = PileCD()
        pile.empile(cd1)
        pile.empile(cd2)
        pile.empile(cd3)
        // when
        pile.vide()
        // then
        assertTrue(pile.estVide())
        assertEquals(0, pile.taille())
        assertThrows<IllegalArgumentException> {
            pile.sommet()
        }
    }
*/

}