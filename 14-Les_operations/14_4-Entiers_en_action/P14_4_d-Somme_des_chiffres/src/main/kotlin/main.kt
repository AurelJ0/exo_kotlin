fun main() {
    val N = readln().toList()
    var res: Int = 0
    for (i in N) {
        res += i.toString().toInt()
    }
    println(res)
}