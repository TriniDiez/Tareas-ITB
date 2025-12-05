import java.util.Scanner

/*
    Entrada: nombre, any 0 < N < 10000 (Integer)
    Sortida: SI si acaba amb nombres del 90 al 99 i NO en cas contrari
*/
fun main() {
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc = Scanner(System.`in`)

    // Enmagatzema l'any en una variable.
    val any : Int = sc.nextInt()

    // Converteix l'any en un string.
    var anyString = any.toString()

    // Es fixa per la cifra dels decimals.
    // Com que només ens interessa si acaba en 90–99, comprovem els dos últims dígits.
    if (anyString.length >= 2 && anyString.substring(anyString.length - 2).toInt() in 90..99) {
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    sc.close()
}
