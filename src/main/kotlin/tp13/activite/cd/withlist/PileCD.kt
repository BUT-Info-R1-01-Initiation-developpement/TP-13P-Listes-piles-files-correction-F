package tp13.activite.cd.withlist

import tp13.activite.cd.CompactDisc

/**
 * Classe décrivant une pile de Compact Disks (CD).
 */
class PileCD {

    private val cds = mutableListOf<CompactDisc>()

    /**
     * Complexité O(1)
     * @return le nombre d'éléments dans la pile.
     */
    fun taille(): Int {
        return this.cds.size
    }

    /**
     * Complexité O(1)
     * @return le CD au sommet de la pile.
     */
    fun sommet(): CompactDisc {
        require(this.cds.isNotEmpty()) { "Aucun CD dans la pile."}
        return this.cds.last()
    }

    /**
     * Complexité O(1)
     * @return true si la liste est vide, false sinon
     */
    fun estVide(): Boolean {
        return this.cds.isEmpty()
    }

    /**
     * Ajoute le [cd] passé en paramètre en haut de la pile.
     * Complexité O(1)
     * @param cd le CD à ajouter à la pile.
     */
    fun empile(cd: CompactDisc) {
        this.cds.add(cd)
    }

    /**
     * Sort de la pile le CD actuellement au sommet de la pile.
     * Complexité O(1)
     *
     * @return le CD sorti du sommet de la pile.
     */
    fun depile(): CompactDisc {
        require(this.cds.isNotEmpty()) { "Aucun CD dans la pile."}
        return this.cds.removeLast()
    }

    /**
     * Vide la pile.
     * Complexité O(1)
     */
    fun vide() {
        this.cds.clear()
    }

}