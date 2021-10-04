package ifOperator

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    if (a > b) {
        println(a)
        println(b)
    } else {
        println(b)
        println(a)
    }
}