package tp13.activite.b

/**
 * Version récursive de fibonacci n
 * Complexité : exponentielle !
 * Justifiez intuitivement ce qui explique cette complexité exponentielle.
 * N'hésite pas à lancer l'exécution de la fonction main avec le debugger en mettant un
 * point d'arrêt à l'entrée de la fonction.
 * ...
 */
fun fibonacciR(n: Int): Int {
    if (n <= 1) {
        return n
    }
    val fib = fibonacciR(n - 2) + fibonacciR(n - 1)
    return fib
}

/**
 * Version impérative de fibonacci n
 * Complexité ? ....
 */
fun fibonacciI(n: Int): Int {
    var fib = n
    if (n <= 1) {
        return fib
    }
    var fibNmoins2 = 0
    var fibNmoins1 = 1
    for (i in 2..n) {
        fib = fibNmoins2 + fibNmoins1
        fibNmoins2 = fibNmoins1
        fibNmoins1 = fib
    }
    return fib
}

/**
 * Version récursive de fibonacci n avec memoization avec MutableList
 * On utilise une liste pour stocker toutes les valeurs déjà calculées
 * Complexité ? ....
 */
fun fibonacciRM(n: Int, cache: MutableList<Int> = mutableListOf(0,1)): Int {
    // Commentez cette fonction pour en expliquer les étapes clés
    var fib = n
    if (cache.size > n) {
        fib = cache[n]
    } else {
        if (n > 1) {
            fib = fibonacciRM(n - 2, cache) + fibonacciRM(n - 1, cache)
        }
        cache.add(fib)
    }
    return fib
}



fun main() {
    val maxN = 15
    println("${String.format("%5s", "n")} | ${String.format("%5s","Rec")} | ${String.format("%5s","Imp")} | ${String.format("%10s","Rec. mem.")}")
    for(n in 0..maxN) {
        println("${String.format("%5d", n)} | ${String.format("%5d",fibonacciR(n))} | ${String.format("%5d",fibonacciI(n))} | ${String.format("%5d",fibonacciRM(n))}")
    }
}