package cycle

fun main() {
    var n = readLine()!!.toInt()
    while (n > 0) {
        println(n % 10)
        n = n / 10
    }
}