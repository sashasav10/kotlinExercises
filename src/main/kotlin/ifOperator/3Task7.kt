package ifOperator

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    if(a<b&&a<c) println(a)
    else if (b<a&&b<c) println(b)
    else println(a)
}