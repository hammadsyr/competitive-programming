import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the maximizingXor function below.
fun maximizingXor(l: Int, r: Int): Int {
    var xor = mutableListOf<Int>()
    var a = l

    for (i in l..r) {
        for (j in a..r) {
            xor.add(i.xor(j))
        }
        a++
    }

    var max = xor[0]

    for (k in 0 until xor.lastIndex) {

        if (max < xor[k + 1]) {
            max = xor[k + 1]
        }
    }

    return max
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val l = scan.nextLine().trim().toInt()

    val r = scan.nextLine().trim().toInt()

    val result = maximizingXor(l, r)

    println(result)
}
