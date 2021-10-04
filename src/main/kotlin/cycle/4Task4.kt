package cycle

fun main() {
    var a = readLine()!!.toInt()
    var n = readLine()!!.toByte()
    var p=1
    for(i in 1..n){
        p=p*a
        println(p)
    }

}