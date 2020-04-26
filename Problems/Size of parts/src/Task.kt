import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var fixed=0
    var reject=0
    var perfect=0
    repeat(count){
        when (scanner.nextInt()){
            -1 -> reject++
            0 ->perfect++
            1 ->fixed++
        }

    }
    println("$perfect $fixed $reject")
}