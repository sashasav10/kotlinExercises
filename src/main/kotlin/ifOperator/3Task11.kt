package ifOperator

fun main() {
    var x = readLine()!!.toInt()
    if (x <= 0) println(-x)
    else if (x >= 2) println(4)
    else println(x * x)
}