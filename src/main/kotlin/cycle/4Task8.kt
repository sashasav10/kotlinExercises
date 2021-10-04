package cycle

fun main() {
    var n = readLine()!!.toInt()
    var s=1
    var k=1
    while(s<n){
        k++
        s=s+k
    }
    println(k)
    println(s)
}