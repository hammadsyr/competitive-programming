import java.math.BigInteger
import java.util.*

// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Int): Unit {
    var a = BigInteger.valueOf(1)
    for (i in 1..n) {
        a *= i.toBigInteger()
    }
    println(a)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    extraLongFactorials(n)
}
