package tp13.activite.cd.withlinkedcds

import tp13.activite.cd.CompactDisc

/**
 * Classe décrivant un nœud encapsulant un Compact Disc (CD)
 *
 * @property suivant le nœud suivant
 * @property cd le CD référencé par le nœud
 */
class NoeudCD(
    var suivant: NoeudCD?,
    val cd: CompactDisc
)