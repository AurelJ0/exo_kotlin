fun main() {
    val n = readln().toInt()
    val gradesDigits = mutableListOf<Int>()
    var (A,B,C,D) = listOf(0,0,0,0)
    repeat(n) {
        gradesDigits.add(readln().toInt())
        when (gradesDigits.last()) {
            2 -> D++
            3 -> C++
            4 -> B++
            5 -> A++
        }
    }
    println("$D,$C,$B,$A")
}
