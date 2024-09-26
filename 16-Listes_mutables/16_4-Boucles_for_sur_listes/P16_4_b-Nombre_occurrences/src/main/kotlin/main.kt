fun main() {
    print("Entrez un nombre N : ")
    val n = readln().toInt()

    print("Entrez vos valeurs : ")
    val numbers = mutableListOf<Int>()
    for (i in 1..n) {
        val number = readln().toInt()
        numbers.add(number)
    }

    print("Entez un nomber M : ")
    val m = readln().toInt()

    var count = 0
    for (s in 0..numbers.size - 1) {
        if (numbers[s] == m) {
            count++
        }
    }
    println("le nombre d'occurence de m est : $count")
}
