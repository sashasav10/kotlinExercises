package ifOperator

fun main() {
    var x = readLine()!!.toInt()
    if (x %4==0) {
        if(x%100==0&&x%400!=0) println(365)
        else  println(366)
    }
    else println(365)
}