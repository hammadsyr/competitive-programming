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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    var max =  arr[0]
    var min =  arr[0]
    var result : Long = 0
    var maxResult :Long = 0
    var minResult :Long= 0
    for(i in 0..arr.lastIndex){
        if(max<arr[i]){
            max = arr[i]            
        } 

        if(min>arr[i]){
            min = arr[i]
        }
    }
    
    for(j in 0..arr.lastIndex){
        result+=arr[j]
    }

    minResult = result-max
    maxResult = result-min

    print("$minResult $maxResult")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
