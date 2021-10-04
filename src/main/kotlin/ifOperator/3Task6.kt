package ifOperator

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    if (a != b) {
        val sum=a+b
        a=sum
        b=sum
    } else {
        a=0
        b=0
    }
    println(a)
    println(b)
}