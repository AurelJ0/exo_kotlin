fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here
    var sum = 0
    if (numbers.size > 2) {
        val sumList = mutableListOf<Int>()
        for (i in numbers) {
            sum += i
        }
        numbers.add(sum)
    }


    // do not touch the lines below
    println(numbers.joinToString(" ") )
}