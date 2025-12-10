package tp13.activite.cd

/**
 * Classe décrivant un Compact Disc.
 *
 * @property artiste l'artiste du CD.
 * @property titreAlbum le titre de l'album.
 * @property nombreChansons le nombre de chansons sur le CD.
 * @property anneeSortie l'année de sortie de l'album.
 */
data class CompactDisc(
    val artiste: String,
    val titreAlbum: String,
    val nombreChansons: Int,
    val anneeSortie: Int
)