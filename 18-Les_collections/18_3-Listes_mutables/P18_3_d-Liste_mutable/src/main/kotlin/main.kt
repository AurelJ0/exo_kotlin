fun main() {
    val nameCount = names(listOf("Vasya", "Olga", "Vasya", "Dima", "Masha", "Vasa", "Olga"))
    for (result in nameCount) {
        println(result)
    }
}

fun names(namesList: List<String>): List<String> {
    var count = 0
    val nameCount = mutableListOf<String>()
    val nameFrequency = mutableMapOf<String, Int>()
    for (name in namesList) {
        nameFrequency[name] = nameFrequency.getOrDefault(name, 0) + 1
    }

    for ((name, occurence) in nameFrequency) {
        count = occurence
        nameCount.add("The name $name is repeated $count times")
    }
    return nameCount
}
