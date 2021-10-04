package input.output

fun main (){
    val n=readLine()!!.toInt()
    val firstInteger=n/100
    val secondInteger=n/10%10
    val thirdInteger=n%10
    println("$secondInteger$firstInteger$thirdInteger")
}