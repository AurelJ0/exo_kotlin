fun main() {
    val howMany = readln().toInt()
    val variables = mutableListOf<Int>()
    repeat(howMany) {
        variables.add(readln().toInt())
    }
    val positiveCount = variables.count { it > 0 }
    println(positiveCount)
}
