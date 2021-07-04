import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
     val format = SimpleDateFormat("hh:mm:ssaa")
     val newDate = format.parse(s)

     var hour = newDate.hours
     var minute = newDate.minutes
     var second = newDate.seconds

    var hours = "" 
    var minutes = ""
    var seconds = ""
    
    if(hour<10)
        hours = "0$hour"
    else
        hours = hour.toString()
    if(minute<10)
        minutes = "0$minute"
    else
        minutes = minute.toString()
    if(second<10)
        seconds = "0$second"
    else
        seconds = second.toString()

     var finalDate = "$hours:$minutes:$seconds"
     return finalDate
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
    
}
