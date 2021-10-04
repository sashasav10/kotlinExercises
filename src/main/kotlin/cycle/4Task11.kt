package cycle

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    while (a!=0&&b!=0) {
        if(a>b)a=a%b
        else b=b%a
    }
    println(a+b)
}