fun main(args: Array<String>) {
    printCount1 (11, 100)
    println("합계 = $count")
}

var count = 0

fun printCount1(from: Int,to: Int) {
    for (i in from..to) {
        count += i
    }
}

val TAB1 = "\t"
const val TAB2 = "\t"