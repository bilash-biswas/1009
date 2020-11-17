import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.next()
    var b = read.nextDouble()
    var c = read.nextDouble()
    println("TOTAL = R$ %.2f".format(b + 0.15 * c))
}
