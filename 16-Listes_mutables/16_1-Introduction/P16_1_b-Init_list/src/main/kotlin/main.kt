fun main() {
    val numbers = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 10 == 0)
            if (i == 100)
                numbers.add(100)
            else
                numbers.add(10)
        else if (i == 1)
            numbers.add(1)
        else
            numbers.add(0)
    }

        // do not touch the lines below
        println(numbers.joinToString())
}
