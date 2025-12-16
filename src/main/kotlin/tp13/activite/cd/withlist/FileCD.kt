package tp13.activite.cd.withlist

import tp13.activite.cd.CompactDisc

/**
 * Classe décrivant une file de CompactDisc (CD)
 */
class FileCD {

    private val cds = mutableListOf<CompactDisc>()

    /**
     * @return le nombre d'éléments dans la file.
     */
    fun taille(): Int {
        return this.cds.size
    }

    /**
     * @return le dernier élément de la file.
     */
    fun queue(): CompactDisc {
        require(this.cds.isNotEmpty()) { "Aucun CD dans la file."}
        return this.cds.last()
    }

    /**
     * @return le premier élément de la file.
     */
    fun tete(): CompactDisc {
        require(this.cds.isNotEmpty()) { "Aucun CD dans la file."}
        return this.cds.first()
    }

    /**
     * @return true si la file est vide, false sinon.
     */
    fun estVide(): Boolean {
        return this.cds.isEmpty()
    }

    /**
     * Positionne en queue de file le [cd] passé en paramètre.
     *
     * @param cd le compact disc à ajouter à la file
     */
    fun enfile(cd: CompactDisc) {
        this.cds.add(cd)
    }

    /**
     * Complexité pire cas : O(n) car décalage de tous les éléments de la liste initiale
     * @return le premier élément de la file et le sort de la file.
     */
    fun desenfile(): CompactDisc {
        require(this.cds.isNotEmpty()) { "Aucun CD dans la file."}
        return this.cds.removeFirst()
    }

    /**
     * Vide la file.
     *
     */
    fun vide() {
        this.cds.clear()
    }

}