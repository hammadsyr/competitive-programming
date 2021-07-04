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

// Complete the marcsCakewalk function below.
fun marcsCakewalk(calorie: Array<Int>): Long {
    var swap = 0 
    var result : Long = 0
    for(i in 0..calorie.lastIndex){

        for(j in 0..calorie.lastIndex-1){
            if(calorie[j]<calorie[j+1]){
                swap = calorie[j+1]
                calorie[j+1] = calorie[j]
                calorie[j] = swap
            }
        }
    }

    for(k in 0..calorie.lastIndex){
        result += Math.pow(2.toDouble(), k.toDouble()).toLong()*calorie[k].toLong()
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val calorie = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = marcsCakewalk(calorie)

    println(result)
}
