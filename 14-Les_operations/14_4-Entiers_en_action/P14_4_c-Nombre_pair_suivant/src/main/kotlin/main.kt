fun main() {
    val N = readln().toInt()

    println(if (N % 2 != 0) N + 1 else N + 2)
}