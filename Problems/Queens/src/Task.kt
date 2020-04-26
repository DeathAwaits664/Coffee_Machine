import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()


    println(if (x1==x2)"YES" else if (y1==y2) "YES" else if (Math.abs(x2-x1)==Math.abs(y2-y1))"YES" else "NO")
}