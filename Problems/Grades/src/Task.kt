import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    var aas = 0
    var bbs = 0
    var ccs = 0
    var dds = 0
    repeat(input){
        when (scanner.nextInt()){
            2 ->{dds++}
            3 ->{ccs++}
            4 ->{bbs++}
            5 ->{aas++}
        }
    }
    println("$dds $ccs $bbs $aas")
}