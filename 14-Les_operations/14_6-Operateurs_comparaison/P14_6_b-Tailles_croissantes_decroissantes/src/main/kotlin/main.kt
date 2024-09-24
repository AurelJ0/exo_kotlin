fun main() {
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()

    var res = false

    if (h2 in h3..h1)
        res = true
    else if (h2 in h1..h3)
        res = true

    println(res)
}