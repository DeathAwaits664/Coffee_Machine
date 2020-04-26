import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum=0
    do {
        var scan=scanner.nextInt()
        sum+=scan
    }while (scan!=0)
    println(sum)
}