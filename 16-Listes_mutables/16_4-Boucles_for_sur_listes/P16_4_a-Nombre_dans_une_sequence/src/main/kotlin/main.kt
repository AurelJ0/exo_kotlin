fun main() {
    print("Entrez une valeur N : ")
    val n = readln().toInt()

    print("Entrez vos valeurs : ")
    val numbers = mutableListOf<Int>()
    for (i in 1.. n) {
        val number = readln().toInt()
        numbers.add(number)
    }

    print("Entrez une valeur M : ")
    val m = readln().toInt()

    if (m in numbers) {
        println("YES")
    } else {
        println("NO")
    }
}
