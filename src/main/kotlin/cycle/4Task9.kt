package cycle

fun main() {
    var p = readLine()!!.toDouble()
    var sum=1000.0
    var k=0
    while(sum<1100){
        k++
        sum=sum*(1+p/100.0)
    }
    println(k)
}