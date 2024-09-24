fun main() {
    val num = ('1'..'9').toSet()
    val inputDigitsAndChars = readln().toList()
    for (i in inputDigitsAndChars) {
        if (num.contains(i)) {
            println(i)
            break
        }
        else
            continue
    }
}
