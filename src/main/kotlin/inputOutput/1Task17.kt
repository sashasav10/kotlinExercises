package inputOutput

import kotlin.math.pow
import kotlin.math.sqrt


fun main (){
    val x1=readLine()!!.toFloat()
    val y1=readLine()!!.toFloat()
    val x2=readLine()!!.toFloat()
    val y2=readLine()!!.toFloat()
    val l= sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    println(l)
}