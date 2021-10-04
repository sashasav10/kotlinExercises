package cycle

fun main() {
    var n = readLine()!!.toByte()
    var a1=1
    var a2=2
    var a3=3
    println(a1)
    println(a2)
    println(a3)
    for(i in 4..n+1){
        var a=a3
        a3=a3+a2-2*a1
        a1=a2
        a2=a
        println(a3)
    }

}