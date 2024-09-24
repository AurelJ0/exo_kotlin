fun main() {
    val input = readln().split(" ")
    for (char in input) {
        val previousChar = char[0] - 1
        print("$previousChar ")
    }
}