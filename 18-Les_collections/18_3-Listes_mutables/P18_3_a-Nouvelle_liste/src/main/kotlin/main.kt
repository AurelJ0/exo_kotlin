fun main() {
    println(solution(listOf(8, 11, 13, 14), 1).joinToString(" "))
}

fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val nouvelleListe = mutableListOf<Int>()
    for (i in numbers) {
        nouvelleListe.add(i)
    }
    nouvelleListe.add(number)
    return nouvelleListe
}
