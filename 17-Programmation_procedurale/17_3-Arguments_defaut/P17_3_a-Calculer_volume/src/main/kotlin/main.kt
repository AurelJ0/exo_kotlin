fun getVolume(l:Int, w:Int=1,h:Int=1): Int{
    val volume = l * w * h
    return volume
}

fun main() {
    println(getVolume(1))
}