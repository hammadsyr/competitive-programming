import java.util.*
import kotlin.collections.HashMap

// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String? {
    var finalResult: String? = null

    val numberIntoWords = HashMap<Int, String>()
    numberIntoWords[1] = "one"
    numberIntoWords[2] = "two"
    numberIntoWords[3] = "three"
    numberIntoWords[4] = "four"
    numberIntoWords[5] = "five"
    numberIntoWords[6] = "six"
    numberIntoWords[7] = "seven"
    numberIntoWords[8] = "eight"
    numberIntoWords[9] = "nine"
    numberIntoWords[10] = "ten"
    numberIntoWords[11] = "eleven"
    numberIntoWords[12] = "twelve"
    numberIntoWords[13] = "thirteen"
    numberIntoWords[14] = "fourteen"
    numberIntoWords[15] = "quarter"
    numberIntoWords[16] = "sixteen"
    numberIntoWords[17] = "seventeen"
    numberIntoWords[18] = "eighteen"
    numberIntoWords[19] = "nineteen"
    numberIntoWords[20] = "twenty"
    numberIntoWords[21] = "twenty one"
    numberIntoWords[22] = "twenty two"
    numberIntoWords[23] = "twenty three"
    numberIntoWords[24] = "twenty four"
    numberIntoWords[25] = "twenty five"
    numberIntoWords[26] = "twenty six"
    numberIntoWords[27] = "twenty seven"
    numberIntoWords[28] = "twenty eight"
    numberIntoWords[29] = "twenty nine"
    numberIntoWords[30] = "half"

    when {
        m == 0 -> {
            finalResult = "${numberIntoWords[h]} o' clock"
        }
        m in 1..30 -> {
            finalResult = if (m == 1) {
                "${numberIntoWords[m]} minute past ${numberIntoWords[h]}"
            } else if (m > 1 && m != 15 && m != 30) {
                "${numberIntoWords[m]} minutes past ${numberIntoWords[h]}"
            } else {
                "${numberIntoWords[m]} past ${numberIntoWords[h]}"
            }
        }
        m > 30 -> {
            finalResult = if (60 - m == 1) {
                "${numberIntoWords[60 - m]} minute to ${numberIntoWords[h+1]}"
            } else if (60 - m > 1 && 60 - m != 15) {
                "${numberIntoWords[60 - m]} minutes to ${numberIntoWords[h+1]}"
            } else {
                "${numberIntoWords[60 - m]} to ${numberIntoWords[h+1]}"
            }
        }
    }

    return finalResult
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().trim().toInt()

    val m = scan.nextLine().trim().toInt()

    val result = timeInWords(h, m)

    println(result)
}
