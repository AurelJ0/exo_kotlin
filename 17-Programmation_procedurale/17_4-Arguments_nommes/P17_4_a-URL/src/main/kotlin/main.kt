fun url(host: String = "localhost", port: Int = 443): String {
    return "https://$host:$port"
}

fun main() {
    println(url())
    println(url("192.168.1.1", 2623))
}