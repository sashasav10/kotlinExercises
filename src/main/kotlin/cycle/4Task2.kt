package cycle

fun main() {
    var price = readLine()!!.toInt()
    for(i in 1..10){
        println(i*price)
    }
}