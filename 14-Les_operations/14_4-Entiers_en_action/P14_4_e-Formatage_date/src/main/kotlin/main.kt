fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    val secondesJours = totalSeconds % 86400
    val heures = secondesJours / 3600
    val minutes = (secondesJours % 3600) / 60
    val secondes = secondesJours % 60
    println("$heures:$minutes:$secondes")
}