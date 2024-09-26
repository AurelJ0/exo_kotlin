// write your function here
fun isVowel(letter: Char):Boolean {
    val vowels = listOf<Char>('a','e','i','o','u')
    var res = false
    for (i in vowels) {
        if (i == letter) {
            res = true
        }
    }
    return res
}
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
