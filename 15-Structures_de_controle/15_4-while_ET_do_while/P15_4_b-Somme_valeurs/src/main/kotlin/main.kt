fun main() {
    val sequence = mutableListOf<Int>()
    var res = 0
    do {
        sequence.add(readln().toInt())
        res +=sequence.last()
    } while (sequence.last() != 0)
    println(res)
}
