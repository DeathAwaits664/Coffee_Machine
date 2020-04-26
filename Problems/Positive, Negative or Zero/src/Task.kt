import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val res = scanner.nextInt()

    println(if (res>0)"positive" else if (res<0) "negative" else "zero" )
    // write your code here
}