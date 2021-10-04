package cycle

fun main() {
    var n = readLine()!!.toByte()
    var fact=1
    for(i in 1..n){
        fact=fact*i
    }
    println(fact)

}