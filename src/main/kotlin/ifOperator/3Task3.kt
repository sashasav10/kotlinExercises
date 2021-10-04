package ifOperator

fun main() {
    val n = readLine()!!.toInt()
    if (n > 0)
        println(n + 1)
    else if (n < 0)println(n-2)
    else println(10)
}