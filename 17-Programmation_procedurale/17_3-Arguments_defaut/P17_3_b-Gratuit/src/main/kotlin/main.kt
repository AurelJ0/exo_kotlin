fun tip(bill: Int, percentage: Int=10): Int {
    val gratuity: Int = bill * percentage / 100
    return gratuity
}

fun main() {
    println(tip(100))
    println(tip(100, 5))
}