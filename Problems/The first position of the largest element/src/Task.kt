import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var inp = 0
    var max=-100001
    var maxPos=-100001
    var pos=0
    while (scanner.hasNext()){
        pos++
        inp = scanner.nextInt()
        if (inp>max) {
            max = inp
            maxPos = pos
        }





    }
    println("$max $maxPos")


}