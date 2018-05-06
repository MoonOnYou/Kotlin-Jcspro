fun main(args: Array<String>) {
    println("합계 = ${printCount2(1,100)}")
}

fun printCount2(from: Int, to:Int): Int {
    var count = 0
    for (i in from..to) {count += i}
    return count

}