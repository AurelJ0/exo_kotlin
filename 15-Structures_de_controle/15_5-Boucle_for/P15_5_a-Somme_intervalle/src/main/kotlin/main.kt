fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    var res = 0
    for (i in a..b) {
        res += i
    }
    println(res)
}