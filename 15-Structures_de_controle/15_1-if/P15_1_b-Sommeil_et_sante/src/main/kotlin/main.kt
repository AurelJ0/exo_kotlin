fun main() {
    val A = 6
    val B = 10
    val H = readln().toInt()

    if (H > B)
        println("Excess")
    else if (H < A)
        println("Deficiency")
    else
        println("Normal")
}
