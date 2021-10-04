package inputOutput

import kotlin.math.abs

fun main (){
    val x1=readLine()!!.toFloat()
    val y1=readLine()!!.toFloat()
    val x2=readLine()!!.toFloat()
    val y2=readLine()!!.toFloat()
    val ab= abs(y2-y1)
    val bc= abs(x2-x1)
    val p=2*(ab+bc)
    val s=ab*bc
    println(p)
    println(s)
}