import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val i = scanner.nextLine()
    val num = scanner.nextInt()
    println("Symbol # $num of the string \"$i\" is \'${i[num-1]}\' \n")
}