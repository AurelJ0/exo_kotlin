fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    if (inputList.size >= 2) {
        for (i in 0..inputList.size - 1) {
            if (inputList[i][i].toInt() > 0)
                println(inputList[i].first() + inputList[i].last())
        }
    }
}