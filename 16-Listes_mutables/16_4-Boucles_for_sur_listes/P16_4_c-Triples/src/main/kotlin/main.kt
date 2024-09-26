fun main() {
    print("Entrez un nombre N : ")
    val n = readln().toInt()

    print("Entrez vos valeurs : ")
    val numbers = mutableListOf<Int>()
    for (i in 0 until n) {
        val number = readln().toInt()
        numbers.add(number)
    }

    var count = 0
    for(i in 0..numbers.size-2) {
        if (numbers[i + 1] == numbers[i] + 1 && numbers[i + 2] == numbers[i] + 2) {
            count++
        }
    }
    println(count)
}

