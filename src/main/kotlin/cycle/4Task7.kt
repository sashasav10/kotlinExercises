package cycle

fun main() {
    var n = readLine()!!.toInt()
    var k = readLine()!!.toInt()
var ost=0
    while(n-k>=0){
        n=n-k
        ost++
    }
    println(ost)
    println(n)
}