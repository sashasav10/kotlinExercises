package inputOutput

fun main (){
    val a=readLine()!!.toInt()
    val b=readLine()!!.toInt()
    val c=readLine()!!.toInt()
    println(a*b*c)
    println(2*(a*b+b*c+c*a))
}