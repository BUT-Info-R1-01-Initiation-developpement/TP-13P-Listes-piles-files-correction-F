package tp13.activite.cd

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CompactDiscTest {

    @Test
    fun `test création CD valide`() {
        // given un nouveau CD
        val cd = CompactDisc(
            "Bob Dylan",
            "The Freewheelin'Bob Dylan",
            13,
            1963
        )
        // then
        assertEquals("Bob Dylan", cd.artiste)
        assertEquals("The Freewheelin'Bob Dylan", cd.titreAlbum)
        assertEquals(13, cd.nombreChansons)
        assertEquals(1963, cd.anneeSortie)
    }

    @Test
    fun `test création CD artiste invalide`() {
        assertThrows<IllegalArgumentException> {
            CompactDisc(
                " ",
                "The Freewheelin'Bob Dylan",
                13,
                1963
            )
            assertThrows<IllegalArgumentException> {
                CompactDisc(
                    "",
                    "The Freewheelin'Bob Dylan",
                    13,
                    1963
                )
            }
        }
    }

    @Test
    fun `test création CD album invalide`() {
        assertThrows<IllegalArgumentException> {
            CompactDisc(
                "Bob Dylan",
                "  ",
                13,
                1963
            )
            assertThrows<IllegalArgumentException> {
                CompactDisc(
                    "Bob Dylan",
                    "",
                    13,
                    1963
                )
            }
        }
    }

    @Test
    fun `test création CD nombre chansons invalide`() {
        assertThrows<IllegalArgumentException> {
            CompactDisc(
                "Bob Dylan",
                "The Freewheelin'Bob Dylan",
                0,
                1963
            )
            assertThrows<IllegalArgumentException> {
                CompactDisc(
                    "Bob Dylan",
                    "The Freewheelin'Bob Dylan",
                    -2,
                    1963
                )
            }
        }
    }

    @Test
    fun `test création CD année sortie invalide`() {
        assertThrows<IllegalArgumentException> {
            CompactDisc(
                "Bob Dylan",
                "The Freewheelin'Bob Dylan",
                13,
                1899
            )
            assertThrows<IllegalArgumentException> {
                CompactDisc(
                    "Bob Dylan",
                    "The Freewheelin'Bob Dylan",
                    -2,
                    2027
                )
            }
        }
    }

}