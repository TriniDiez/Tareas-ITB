import java.util.Scanner

/*
    Entrada:
    1) Nombre de casos de prova (Enter)
    2) Nombre de pisos de la piràmide (Enter)

    Sortida: xocolates necessàries per construir la piràmide (Enter)
*/

fun main() {
    // Crea un escàner per llegir les dades d'entrada.
    val scan = Scanner(System.`in`)

    // Desa el valor llegit (nombre de casos de prova) en una variable.
    val k : Int = scan.nextInt()

    // Repeteix el bucle tantes vegades com casos de prova.
    repeat (k){
        val num : Int = scan.nextInt()
        // Crea una variable per emmagatzemar el nombre de xocolates.
        var xocolates = 0

        // Calcula el nombre de xocolates.
        for (pis in 1..num) {
            xocolates = xocolates + (pis * pis)
        }

        // Imprimeix el nombre total de xocolates necessaris per fer la piràmide en cada cas.
        println(xocolates)
    }
    // Tanca l'escàner.
    scan.close()
}