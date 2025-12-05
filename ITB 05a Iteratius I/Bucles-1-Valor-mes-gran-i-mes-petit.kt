import java.util.Scanner

/*
    Entrada: seqüència de números enters, entre -100000 i 100000, que finalitza amb un zero, que no s´ha de processar.
    Sortida: número més gran i el més petit en una mateixa línia i separats per un espai en blanc.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val sc : Scanner = Scanner(System.`in`)

    // Emmagatzema el nombre en una variable.
    var nombre : Int = sc.nextInt()

    // Crea una variable pel nombre més gran.
    var nombreGran : Int = nombre

    // Crea una variable pel nombre més petit.
    var nombrePetit : Int = nombre

    // Itera pel bucle mentre el nombre no sigui 0.
    while (nombre != 0){
        if (nombre > nombreGran){
            nombreGran = nombre
        }

        if (nombre < nombrePetit){
            nombrePetit = nombre
        }
        nombre = sc.nextInt()
    }

    // Mostra el resultat (número més gran i més petit).
    println("$nombreGran $nombrePetit")

    // Tanca l'escàner.
    sc.close()
}
