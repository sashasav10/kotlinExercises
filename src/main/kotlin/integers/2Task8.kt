package integers

fun main() {
    var n=readLine()!!.toInt()
    n=n%3600/60
    println(n)
}