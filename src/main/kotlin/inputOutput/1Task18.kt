package inputOutput

fun main (){
    var a=readLine()!!.toFloat()
    var b=readLine()!!.toFloat()
    val x=b;
    b=a
    a=x
    println(a)
    println(b)
}