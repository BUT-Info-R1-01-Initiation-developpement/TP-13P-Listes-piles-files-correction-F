package tp13.activite.cd.withlinkedcds

import tp13.activite.cd.CompactDisc

/**
 * Classe décrivant une file de CompactDisc (CD)
 * Opérations en O(1) (utilisation liste chainée)
 */
class FileCD {

    private var tete: NoeudCD? = null
    private var queue: NoeudCD? = null
    private var taille = 0


    /**
     * @return le nombre d'éléments dans la file.
     */
    fun taille(): Int {
        return this.taille
    }

    /**
     * @return le dernier élément de la file.
     */
    fun queue(): CompactDisc {
        require(!this.estVide()) { "Aucun CD dans la file."}
        return this.queue!!.cd
    }

    /**
     * @return le premier élément de la file.
     */
    fun tete(): CompactDisc {
        require(!this.estVide()) { "Aucun CD dans la file."}
        return this.tete!!.cd
    }

    /**
     * @return true si la file est vide, false sinon.
     */
    fun estVide(): Boolean {
        return this.taille == 0
    }

    /**
     * Positionne en queue de file le [cd] passé en paramètre.
     *
     * @param cd le compact disc à ajouter à la file
     */
    fun enfile(cd: CompactDisc) {
        val noeudCD = NoeudCD(
            null,
            cd
        )
        if (this.estVide()) {
            this.tete = noeudCD
        } else {
            this.queue!!.suivant = noeudCD
        }
        this.queue = noeudCD
        this.taille++
    }

    /**
     * @return le premier élément de la file et le sort de la file.
     */
    fun desenfile(): CompactDisc {
        require(!this.estVide()) { "Aucun CD dans la file."}
        val oldTete = this.tete!!
        this.tete = oldTete.suivant
        if (this.tete == null) { // on a retiré le dernier élément
            this.queue = null
        }
        this.taille--
        return oldTete.cd
    }

    /**
    * Vide la file.
    */
    fun vide() {
        this.taille = 0
        this.tete = null
        this.queue = null
    }

}