import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val in1 = scanner.nextInt()
    val in2 = scanner.nextInt()
    val in3 = scanner.nextInt()
    val in4 = scanner.nextInt()
    val in5 = scanner.nextInt()
    val r1 = in1..in2
    val r2 = in3..in4
    println(in5 in r1||in5 in r2)
    // write your code here
}