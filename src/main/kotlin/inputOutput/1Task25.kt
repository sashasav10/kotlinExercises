package inputOutput

fun main (){
    val v1 = readLine()!!.toFloat()
    val v2 = readLine()!!.toFloat()
    val s = readLine()!!.toFloat()
    val t = readLine()!!.toFloat()
    val length = t*(v1+v2)
    println(length+s)
}