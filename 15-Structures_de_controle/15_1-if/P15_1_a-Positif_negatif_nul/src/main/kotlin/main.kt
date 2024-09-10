fun main() {
    val num = readln().toInt()

    println(if (num == 0) {
        "zero"
    } else if (num > 0) {
        "positive"
    } else {
        "negative"
    }
    )
}