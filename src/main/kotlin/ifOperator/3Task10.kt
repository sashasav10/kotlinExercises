package ifOperator

fun main() {
    var x = readLine()!!.toInt()
    if (x < -2 || x > 2) println(2 * x)
    else println(-3 * x)
}