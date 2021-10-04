package inputOutput

fun main() {
    val R1 = readLine()!!.toFloat()
    val R2 = readLine()!!.toFloat()
    val S1 = 3.14 * R1 * R1
    val S2 = 3.14 * R2 * R2
    val S3 = S1 - S2
    println(S1)
    println(S2)
    println(S3)
}