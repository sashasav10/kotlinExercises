package inputOutput

import kotlin.math.sqrt

fun main (){
    val s=readLine()!!.toFloat()
    val r= sqrt(s/3.14)
    val d=2*r
    val l=2*3.14*r
    println(d)
    println(l)
}