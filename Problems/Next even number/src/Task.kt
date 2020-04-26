import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ini=scanner.nextInt()
    println(if(ini%2==0)ini+2 else ini+1)
}