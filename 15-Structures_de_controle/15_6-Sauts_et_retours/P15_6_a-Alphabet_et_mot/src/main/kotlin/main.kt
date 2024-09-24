fun main() {
    val word = readln().toSet()
    val alphabet = ('a'..'z').toSet()

    val missingLetters = alphabet - word

    println(missingLetters.joinToString(""))
}
