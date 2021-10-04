package ifOperator

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    if(a<b&&a<c) println(b+c)
    else if (b<c) println(a+c)
    else println(a+b)
}