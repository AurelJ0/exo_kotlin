fun checkSpeed(speed: Int, limit: Int = 60) {
    if (speed > limit)
        println("Exceeds the limit by ${speed - limit} kilometers per hour")
    else
        print("Within the limit")
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}