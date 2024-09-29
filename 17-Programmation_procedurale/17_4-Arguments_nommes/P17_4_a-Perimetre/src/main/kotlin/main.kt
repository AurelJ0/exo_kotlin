fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = 0.0, y4: Double = 0.0): Double {
    // Calcul des distances entre les points
    val d1 = Math.hypot(x2 - x1, y2 - y1)
    val d2 = Math.hypot(x3 - x2, y3 - y2)
    val d3 = if (x4 != 0.0 || y4 != 0.0) Math.hypot(x4 - x3, y4 - y3) else Math.hypot(x1 - x3, y1 - y3)
    val d4 = if (x4 != 0.0 || y4 != 0.0) Math.hypot(x1 - x4, y1 - y4) else 0.0

    // Retour du périmètre total
    return d1 + d2 + d3 + d4
}

fun main() {
    // Exemple avec un triangle (3 sommets)
    println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0))  // Sortie attendue : 30.00

    // Exemple avec un quadrilatère (4 sommets)
    println(perimeter(0.0, 0.0, 12.0, 0.0, 12.0, 5.0, 0.0, 5.0))  // Sortie attendue : 34.00
}
