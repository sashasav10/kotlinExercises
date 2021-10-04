package cycle

fun main() {
    var n = readLine()!!.toInt()
    var f1=1
    var f2=1
    while (n>f2) {
        var f=f2
        f2=f2+f1
        f1=f
    }
    if(f2==n)
    println("TRUE")
    else println("FALSE")
}