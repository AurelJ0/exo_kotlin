fun main() {
    println(solution(listOf(0, 1, 2, 3), listOf(4, 5, 6)).joinToString(" "))
}

fun solution(first: List<Int>, second: List<Int>): MutableList<Int> {
    val res = mutableListOf<Int>()
    res.addAll(first)
    res.addAll(second)

    return res
}
