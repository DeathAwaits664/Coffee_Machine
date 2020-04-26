import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inp=scanner.next()[0]
    println(inp.isUpperCase()||(inp.isDigit()&&inp!='0'))
}