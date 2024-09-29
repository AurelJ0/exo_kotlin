fun main() {
    println(solution(listOf(3, 2, 15)))
}

fun solution(numbers: List<Int>): Int {
    var sum = 0
    for (i in numbers) {
        sum += i
    }
    return sum
}