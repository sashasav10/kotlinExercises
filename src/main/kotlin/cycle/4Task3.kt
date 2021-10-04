package cycle

fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var sum=0
    for(i in a..b){
        sum+=i
    }
    println(sum)
}