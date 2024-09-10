fun main() {
    val num = readln().toInt()

    if (num <= 4) {
        if (num == 1) {
            println("move up")
        }
        if (num == 2) {
            println("move down")
        }
        if (num == 3) {
            println("move left")
        }
        if (num == 4) {
            println("move right")
        }
    } else { println("error!") }
}
