import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val v1=scanner.next()[0].toChar()
    val v2=scanner.next()[0].toChar()
    val v3=scanner.next()[0].toChar()
    val v4=scanner.next()[0].toChar()
    println("${v1.isDigit()}\\${v2.isDigit()}\\${v3.isDigit()}\\${v4.isDigit()}")
}