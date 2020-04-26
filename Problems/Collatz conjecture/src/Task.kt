import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var coll = scanner.nextInt()
    print("$coll ")
    while(coll!=1){
        if (coll%2==0){
            coll /= 2
        } else{coll = coll*3+1}
        print("$coll ")



    }


}