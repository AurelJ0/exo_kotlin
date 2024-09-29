fun main() {
    println(solution(mutableListOf("Sometimes", "you", "have", "to", "shake", "up", "your", "life"), "shake").joinToString(" "))
}

fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    for (i in strings.indices) {
        if (strings[i] == str) {
            strings.removeAt(i)
            strings.add(i, "Banana")
        }
    }
    return strings
}

