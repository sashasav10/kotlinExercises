package inputOutput

import kotlin.math.sqrt

fun main (){
    val a=readLine()!!.toDouble()
    val b=readLine()!!.toDouble()
    val c= sqrt(a*a+b*b)
    val P= a+b+c
    println(c)
    println(P)
}