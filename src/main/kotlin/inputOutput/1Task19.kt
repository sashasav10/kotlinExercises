package inputOutput

fun main (){
    var a=readLine()!!.toFloat()
    var b=readLine()!!.toFloat()
    var c=readLine()!!.toFloat()
    val x=a;
    a=c
    c=b
    b=x

    println(a)
    println(b)
    println(c)
}