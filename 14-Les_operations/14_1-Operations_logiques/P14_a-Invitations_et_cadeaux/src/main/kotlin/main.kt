fun main() {
    val invitation = readlnOrNull().toBoolean() // read other values in the same way
    val gift = readlnOrNull().toBoolean()
    println(invitation && gift)
}

