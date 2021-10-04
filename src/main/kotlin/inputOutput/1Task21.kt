package inputOutput

import kotlin.math.pow

fun main () {
    val x= readLine()!!.toFloat()
    val output= 4*(x-3).pow(6)-7*(x-3).pow(3)+2
    println(output)
}