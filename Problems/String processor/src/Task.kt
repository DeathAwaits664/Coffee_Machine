import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val in1 = scanner.nextLine()
    val operQ = scanner.nextLine()
    val in2 = scanner.nextLine()

    when (operQ){
        "equals" -> println(in1 == in2)
        "plus" -> println(in1.plus(in2))
        "endsWith" -> println(in1.endsWith(in2))
        else -> println("Unknown operation")
    }

}