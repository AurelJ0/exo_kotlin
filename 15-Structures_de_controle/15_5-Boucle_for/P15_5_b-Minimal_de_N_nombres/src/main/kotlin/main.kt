fun main() {
    val N = readln().toInt()
    val numbers = mutableListOf<Int>()
    for (i in 1..N) {
        numbers.add(readln().toInt())
    }
    println(numbers.minOrNull())
}
