package input.output.`2`

fun main (){
    val n=readLine()!!.toInt()
    val firstInteger=n/10
    val secondInteger=n%10
    println(firstInteger+secondInteger)
    println(firstInteger*secondInteger)
}