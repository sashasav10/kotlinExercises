package inputOutput

import kotlin.math.abs

fun main (){
    val a=readLine()!!.toFloat()
    val b=readLine()!!.toFloat()
    val c=readLine()!!.toFloat()
    val ac= abs(a-c)
    val bc= abs(b-c)
    val s=ac+bc
    println(ac)
    println(bc)
    println(s)
}